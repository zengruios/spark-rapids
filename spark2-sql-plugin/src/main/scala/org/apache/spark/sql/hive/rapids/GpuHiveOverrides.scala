/*
 * Copyright (c) 2022, NVIDIA CORPORATION.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.spark.sql.hive.rapids

import com.nvidia.spark.RapidsUDF
import com.nvidia.spark.rapids.{ExprChecks, ExprMeta, ExprRule, GpuOverrides, RapidsConf, RepeatingParamCheck, TypeSig}
import com.nvidia.spark.rapids.GpuUserDefinedFunction.udfTypeSig

import org.apache.spark.sql.catalyst.expressions.Expression
import org.apache.spark.sql.hive.{HiveGenericUDF, HiveSimpleUDF}

object GpuHiveOverrides {
  def isSparkHiveAvailable: Boolean = {
    try {
      getClass().getClassLoader.loadClass("org.apache.spark.sql.hive.HiveSessionStateBuilder")
      getClass().getClassLoader.loadClass("org.apache.hadoop.hive.conf.HiveConf")
      true
    } catch {
      case _: ClassNotFoundException | _: NoClassDefFoundError => false
    }
  }

  /**
   * Builds the rules that are specific to spark-hive Catalyst nodes. This will return an empty
   * mapping if spark-hive is unavailable.
   */
  def exprs: Map[Class[_ <: Expression], ExprRule[_ <: Expression]] = {
    if (isSparkHiveAvailable) {
      // don't use the ShimLoader for Spark 2.x
      new HiveProviderImpl().getExprs
    } else {
      Map.empty
    }
  }
}
