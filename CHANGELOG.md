# Change log
Generated on 2022-08-05

## Release 22.08

### Features
|||
|:---|:---|
|[#5222](https://github.com/NVIDIA/spark-rapids/issues/5222)|[FEA] Support function array_except |
|[#5228](https://github.com/NVIDIA/spark-rapids/issues/5228)|[FEA] Support array_union|
|[#5188](https://github.com/NVIDIA/spark-rapids/issues/5188)|[FEA] Support arrays_overlap|
|[#4932](https://github.com/NVIDIA/spark-rapids/issues/4932)|[FEA] Support ArrayIntersect on at least Arrays of String|
|[#4005](https://github.com/NVIDIA/spark-rapids/issues/4005)|[FEA] Support First() in windowing context with Integer type|
|[#5061](https://github.com/NVIDIA/spark-rapids/issues/5061)|[FEA] Support last in windowing context for Integer type.|
|[#6059](https://github.com/NVIDIA/spark-rapids/issues/6059)|[FEA] Add SQL table to Qualification's app-details view|
|[#5617](https://github.com/NVIDIA/spark-rapids/issues/5617)|[FEA] Qualification tool support parsing expressions (part 1)|
|[#4719](https://github.com/NVIDIA/spark-rapids/issues/4719)|[FEA] GpuStringSplit: Add support for line and string anchors in regular expressions|
|[#5502](https://github.com/NVIDIA/spark-rapids/issues/5502)|[FEA] Qualification tool should use SQL ID of each Application ID like profiling tool|
|[#5524](https://github.com/NVIDIA/spark-rapids/issues/5524)|[FEA] Automatically adjust spark.rapids.sql.format.parquet.multiThreadedRead.numThreads to the same as spark.executor.cores|
|[#4817](https://github.com/NVIDIA/spark-rapids/issues/4817)|[FEA] Support Iceberg batch reads|
|[#5510](https://github.com/NVIDIA/spark-rapids/issues/5510)|[FEA] Support Iceberg for data INSERT, DELETE operations|
|[#5890](https://github.com/NVIDIA/spark-rapids/issues/5890)|[FEA] Mount the alluxio buckets/paths on the fly when the query is being executed|
|[#6018](https://github.com/NVIDIA/spark-rapids/issues/6018)|[FEA] Support Spark 3.2.2 |
|[#5417](https://github.com/NVIDIA/spark-rapids/issues/5417)|[FEA] Fully support reading parquet binary as string|
|[#4283](https://github.com/NVIDIA/spark-rapids/issues/4283)|[FEA] Implement regexp_extract_all on GPU for idx > 0|
|[#4353](https://github.com/NVIDIA/spark-rapids/issues/4353)|[FEA] Implement regexp_extract_all on GPU for idx = 0|
|[#5813](https://github.com/NVIDIA/spark-rapids/issues/5813)|[FEA] Set sql.json.read.double.enabled and sql.csv.read.double.enabled to `true` by default|
|[#4720](https://github.com/NVIDIA/spark-rapids/issues/4720)|[FEA] GpuStringSplit: Add support for limit = 0 and limit =1|
|[#5953](https://github.com/NVIDIA/spark-rapids/issues/5953)|[FEA] Support Rocky Linux release|
|[#5204](https://github.com/NVIDIA/spark-rapids/issues/5204)|[FEA] Support Key vectors for `GetMapValue` and `ElementAt` for maps.|
|[#4323](https://github.com/NVIDIA/spark-rapids/issues/4323)|[FEA] Profiling tool add option to filter based on filesystem date|
|[#5846](https://github.com/NVIDIA/spark-rapids/issues/5846)|[FEA] Support null characters in regular expressions|
|[#5904](https://github.com/NVIDIA/spark-rapids/issues/5904)|[FEA] Add support for negated POSIX character classes in regular expressions|
|[#5702](https://github.com/NVIDIA/spark-rapids/issues/5702)|[FEA] Set spark.rapids.sql.explain=NOT_ON_GPU by default|
|[#5867](https://github.com/NVIDIA/spark-rapids/issues/5867)|[FEA] Add shim for Spark 3.3.1|
|[#5628](https://github.com/NVIDIA/spark-rapids/issues/5628)|[FEA] Enable Application detailed view in Qualification UI|
|[#5831](https://github.com/NVIDIA/spark-rapids/issues/5831)|[FEA] Update default speedup factors used for qualification tool|
|[#4519](https://github.com/NVIDIA/spark-rapids/issues/4519)|[FEA] Add regular expression support for Form Feed, Alert, and Escape control characters|
|[#4040](https://github.com/NVIDIA/spark-rapids/issues/4040)|[FEA] Support spark.sql.parquet.binaryAsString=true|
|[#5797](https://github.com/NVIDIA/spark-rapids/issues/5797)|[FEA] Support RoundCeil and RoundFloor when scale is zero|
|[#4468](https://github.com/NVIDIA/spark-rapids/issues/4468)|[FEA] Support repetition quantifiers `?` and `*` with regexp_replace|
|[#5679](https://github.com/NVIDIA/spark-rapids/issues/5679)|[FEA] Support MMyyyy date/timestamp format|
|[#4413](https://github.com/NVIDIA/spark-rapids/issues/4413)|[FEA] Add support for POSIX characters in regular expressions|
|[#4289](https://github.com/NVIDIA/spark-rapids/issues/4289)|[FEA] Regexp: Add support for word and non-word boundaries in regexp pattern|
|[#4517](https://github.com/NVIDIA/spark-rapids/issues/4517)|[FEA] Add support for word boundaries `\b` and `\B` in regular expressions|

### Performance
|||
|:---|:---|
|[#6060](https://github.com/NVIDIA/spark-rapids/issues/6060)|[FEA] Add experimental multi-threaded BypassMergeSortShuffleWriter|
|[#5636](https://github.com/NVIDIA/spark-rapids/issues/5636)|[FEA] Update GeneratedInternalRowToCudfRowIterator for string transitions|
|[#5633](https://github.com/NVIDIA/spark-rapids/issues/5633)|[FEA] Enable Strings as a supported type for GpuColumnarToRow transitions|
|[#5634](https://github.com/NVIDIA/spark-rapids/issues/5634)|[FEA] Update CudfUnsafeRow to include size estimates for strings and implementation for getUTF8String|
|[#5635](https://github.com/NVIDIA/spark-rapids/issues/5635)|[FEA] Update AcceleratedColumnarToRowIterator to support strings|
|[#5453](https://github.com/NVIDIA/spark-rapids/issues/5453)|[FEA] Support runtime filters for BatchScanExec|
|[#5075](https://github.com/NVIDIA/spark-rapids/issues/5075)|Performance can be very slow when reading just a few columns out of many on parquet|
|[#5624](https://github.com/NVIDIA/spark-rapids/issues/5624)|[FEA] Let CPU handle Delta table's metadata related queries|
|[#4837](https://github.com/NVIDIA/spark-rapids/issues/4837)|[FEA] Optimize JSON reading of floating-point values|

### Bugs Fixed
|||
|:---|:---|
|[#6220](https://github.com/NVIDIA/spark-rapids/issues/6220)|[BUG] Host buffer leak occurred when executing `count` with Avro multi-threaded reader |
|[#6160](https://github.com/NVIDIA/spark-rapids/issues/6160)|[BUG] When Hive table's actual data has varchar, but the DDL is string, then query fails to do varchar to string conversion|
|[#6183](https://github.com/NVIDIA/spark-rapids/issues/6183)|[BUG] Qualification UI uses single precision floating point|
|[#6005](https://github.com/NVIDIA/spark-rapids/issues/6005)|[BUG] When old Hive partition has different schema than new partition& Hive Schema, read old partition fails with "Found no metadata for schema index"|
|[#6158](https://github.com/NVIDIA/spark-rapids/issues/6158)|[BUG] AQE being used on Databricks even when its disabled|
|[#6179](https://github.com/NVIDIA/spark-rapids/issues/6179)|[BUG] Qualfication tool per sql output --num-output-rows option broken|
|[#6157](https://github.com/NVIDIA/spark-rapids/issues/6157)|[BUG] Pandas UDF hang in Databricks|
|[#6167](https://github.com/NVIDIA/spark-rapids/issues/6167)|[BUG] iceberg_test failed in nightly|
|[#6128](https://github.com/NVIDIA/spark-rapids/issues/6128)|[BUG] Can not ansi cast decimal type to long type while fetching decimal column from data table|
|[#6029](https://github.com/NVIDIA/spark-rapids/issues/6029)|[BUG] Query failed if reading a Hive partition table with partition key column is a Boolean data type, and if spark.rapids.alluxio.pathsToReplace is set|
|[#6054](https://github.com/NVIDIA/spark-rapids/issues/6054)|[BUG] Test Parquet nested unsigned int: uint8, uint16, uint32 FAILED in spark 320+|
|[#6086](https://github.com/NVIDIA/spark-rapids/issues/6086)|[BUG] `checkValue` does not work in `RapidsConf`|
|[#6127](https://github.com/NVIDIA/spark-rapids/issues/6127)|[BUG] regex_test failed in nightly|
|[#6026](https://github.com/NVIDIA/spark-rapids/issues/6026)|[BUG] Failed to cast value `false` to `BooleanType` for partition column `k1`|
|[#5984](https://github.com/NVIDIA/spark-rapids/issues/5984)|[BUG] DATABRICKS: NullPointerException: format is null  in 22.08 (works fine with 22.06)|
|[#6089](https://github.com/NVIDIA/spark-rapids/issues/6089)|[BUG] orc_test is failing on Spark 3.2+|
|[#5892](https://github.com/NVIDIA/spark-rapids/issues/5892)|[BUG] When using Alluxio+Spark RAPIDS, if the S3 bucket is not mounted, then query will return nothing|
|[#6056](https://github.com/NVIDIA/spark-rapids/issues/6056)|[BUG] zstd integration tests failed for orc on Cloudera|
|[#5957](https://github.com/NVIDIA/spark-rapids/issues/5957)|[BUG] Exception calling `collect()` when partitioning using  with arrays with null values using `array_union(...)`|
|[#6017](https://github.com/NVIDIA/spark-rapids/issues/6017)|[BUG] test_parquet_read_round_trip hanging forever in spark 32x standalone mode|
|[#6035](https://github.com/NVIDIA/spark-rapids/issues/6035)|[BUG] cache tests throws ClassCastException on Databricks|
|[#6032](https://github.com/NVIDIA/spark-rapids/issues/6032)|[BUG] Part of the plan is not columnar class org.apache.spark.sql.execution.ProjectExec failure|
|[#6028](https://github.com/NVIDIA/spark-rapids/issues/6028)|[BUG] regexp_test is failing in nightly tests|
|[#3677](https://github.com/NVIDIA/spark-rapids/issues/3677)|[BUG] PCBS does not fully follow the pattern for public classes|
|[#6022](https://github.com/NVIDIA/spark-rapids/issues/6022)|[BUG] test_iceberg_fallback_not_unsafe_row failed in databricks 10.4 runtime|
|[#109](https://github.com/NVIDIA/spark-rapids/issues/109)|[BUG] GPU degreees function does not overflow|
|[#5959](https://github.com/NVIDIA/spark-rapids/issues/5959)|[BUG] test_parquet_read_encryption fails|
|[#5493](https://github.com/NVIDIA/spark-rapids/issues/5493)|[BUG] test_parquet_read_merge_schema failed w/ TITAN V|
|[#5521](https://github.com/NVIDIA/spark-rapids/issues/5521)|[BUG] Investigate regexp failures with unicode input|
|[#5629](https://github.com/NVIDIA/spark-rapids/issues/5629)|[BUG] regexp unicode tests require LANG=en_US.UTF-8 to pass|
|[#5448](https://github.com/NVIDIA/spark-rapids/issues/5448)|[BUG] partitioned writes require single batches and sorting, causing gpu OOM in some cases|
|[#6003](https://github.com/NVIDIA/spark-rapids/issues/6003)|[BUG] join_test failed in integration tests|
|[#5979](https://github.com/NVIDIA/spark-rapids/issues/5979)|[BUG] executors shutdown intermittently during integrations test parallel run|
|[#5948](https://github.com/NVIDIA/spark-rapids/issues/5948)|[BUG] GPU ORC reading fails when positional schema is enabled and more columns are required.|
|[#5909](https://github.com/NVIDIA/spark-rapids/issues/5909)|[BUG] Null characters do not work in regular expression character classes|
|[#5956](https://github.com/NVIDIA/spark-rapids/issues/5956)|[BUG] Warnings in build for GpuRegExpUtils with group_index|
|[#4676](https://github.com/NVIDIA/spark-rapids/issues/4676)|[BUG] Research associating MemoryCleaner to Spark's ShutdownHookManager|
|[#5854](https://github.com/NVIDIA/spark-rapids/issues/5854)|[BUG] Memory leaked in some test cases|
|[#5937](https://github.com/NVIDIA/spark-rapids/issues/5937)|[BUG] test_get_map_value_string_col_keys_ansi_fail in databricks321 runtime|
|[#5891](https://github.com/NVIDIA/spark-rapids/issues/5891)|[BUG] GpuShuffleCoalesce op time metric doesn't include concat batch time|
|[#5896](https://github.com/NVIDIA/spark-rapids/issues/5896)|[BUG] Profiling tool on taking a really long time for integration tests|
|[#5939](https://github.com/NVIDIA/spark-rapids/issues/5939)|[BUG] Qualification tool UI. Read Schema column is broken|
|[#5711](https://github.com/NVIDIA/spark-rapids/issues/5711)|[BUG] regexp: Build fails on CI when more characters added to fuzzer but not locally|
|[#5929](https://github.com/NVIDIA/spark-rapids/issues/5929)|[BUG] test_sorted_groupby_first_last failed in nightly tests|
|[#5914](https://github.com/NVIDIA/spark-rapids/issues/5914)|[BUG] test_parquet_compress_read_round_trip tests failed in spark320+|
|[#5859](https://github.com/NVIDIA/spark-rapids/issues/5859)|[BUG] Qualification tools csv order is not in sync|
|[#5648](https://github.com/NVIDIA/spark-rapids/issues/5648)|[BUG] compile-time references to classes potentially unavailable at run time|
|[#5838](https://github.com/NVIDIA/spark-rapids/issues/5838)|[BUG] Qualification ui output goes to wrong folder|
|[#5855](https://github.com/NVIDIA/spark-rapids/issues/5855)|[BUG] MortgageSparkSuite.scala set spark.rapids.sql.explain as true, which is invalid|
|[#5630](https://github.com/NVIDIA/spark-rapids/issues/5630)|[BUG] Qualification UI cannot render long strings|
|[#5732](https://github.com/NVIDIA/spark-rapids/issues/5732)|[BUG] fix estimated speed-up for not-applicable apps in Qualification results|
|[#5788](https://github.com/NVIDIA/spark-rapids/issues/5788)|[BUG] Qualification UI Sanitize template content|
|[#5836](https://github.com/NVIDIA/spark-rapids/issues/5836)|[BUG] string_test.py::test_re_replace_repetition failed IT |
|[#5837](https://github.com/NVIDIA/spark-rapids/issues/5837)|[BUG] test_parquet_read_round_trip_binary_as_string failures on YARN and Dataproc|
|[#5726](https://github.com/NVIDIA/spark-rapids/issues/5726)|[BUG] CastChecks.sparkIntegralSig has BINARY in it twice|
|[#5775](https://github.com/NVIDIA/spark-rapids/issues/5775)|[BUG] TimestampSuite is run on Spark 3.3.0 only|
|[#5678](https://github.com/NVIDIA/spark-rapids/issues/5678)|[BUG] Inconsistency between the time zone in the fallback reason and the actual time zone checked in RapidsMeta.checkTImeZoneId|
|[#5688](https://github.com/NVIDIA/spark-rapids/issues/5688)|[BUG] AnsiCast is merged into Cast in Spark 340, failing the 340 build|
|[#5480](https://github.com/NVIDIA/spark-rapids/issues/5480)|[BUG] Some arithmetic tests are failing on Spark 3.4.0|
|[#5777](https://github.com/NVIDIA/spark-rapids/issues/5777)|[BUG] repeated runs of `mvn package` without `clean` lead to missing spark-rapids-jni-version-info.properties in dist jar|
|[#5456](https://github.com/NVIDIA/spark-rapids/issues/5456)|[BUG] Handle regexp_replace inconsistency from https://issues.apache.org/jira/browse/SPARK-39107|
|[#5683](https://github.com/NVIDIA/spark-rapids/issues/5683)|[BUG] test_cast_neg_to_decimal_err failed in recent 22.08 tests|
|[#5525](https://github.com/NVIDIA/spark-rapids/issues/5525)|[BUG] Investigate more edge cases in regexp support|
|[#5744](https://github.com/NVIDIA/spark-rapids/issues/5744)|[BUG] Compile failure with Spark 3.2.2|
|[#5707](https://github.com/NVIDIA/spark-rapids/issues/5707)|[BUG] Fix shim-related bugs |

### PRs
|||
|:---|:---|
|[#6225](https://github.com/NVIDIA/spark-rapids/pull/6225)|Fix count() in avro failed when reader_types is coalescing|
|[#6216](https://github.com/NVIDIA/spark-rapids/pull/6216)|[Doc] Update 22.08 documentation|
|[#6223](https://github.com/NVIDIA/spark-rapids/pull/6223)|Temporary fix for test_array_intersect failures on Spark 3.3.0|
|[#6221](https://github.com/NVIDIA/spark-rapids/pull/6221)|Release host buffers when Avro read schema is empty|
|[#6132](https://github.com/NVIDIA/spark-rapids/pull/6132)|[DOC]update outofdate mortgage notebooks and update docs for xgboost161 jar[skip ci]|
|[#6188](https://github.com/NVIDIA/spark-rapids/pull/6188)|Allow ORC conversion from VARCHAR to STRING|
|[#6013](https://github.com/NVIDIA/spark-rapids/pull/6013)|Add fixed issues to regex fuzzer|
|[#5958](https://github.com/NVIDIA/spark-rapids/pull/5958)|Add set based operations for arrays: `array_intersect`, `array_union`, `array_except`, and `arrays_overlap` for running on GPU|
|[#6189](https://github.com/NVIDIA/spark-rapids/pull/6189)|Qualification UI change floating precision [skip ci]|
|[#6063](https://github.com/NVIDIA/spark-rapids/pull/6063)|Fix Parquet schema evolution when missing column is in a nested type|
|[#6159](https://github.com/NVIDIA/spark-rapids/pull/6159)|Workaround for Databricks using AQE even when disabled|
|[#6181](https://github.com/NVIDIA/spark-rapids/pull/6181)|Fix the qualification tool per sql number output rows option|
|[#6166](https://github.com/NVIDIA/spark-rapids/pull/6166)|Update the configs used to choose the Python runner for flat-map Pandas UDF|
|[#6169](https://github.com/NVIDIA/spark-rapids/pull/6169)|Fix IcebergProvider classname in unshim exceptions|
|[#6103](https://github.com/NVIDIA/spark-rapids/pull/6103)|Fix crash when casting decimals to long|
|[#6071](https://github.com/NVIDIA/spark-rapids/pull/6071)|Update `test_add_overflow_with_ansi_enabled` and `test_subtraction_overflow_with_ansi_enabled` to check the exception type for Integral case.|
|[#6136](https://github.com/NVIDIA/spark-rapids/pull/6136)|Fix Alluxio inferring partitions for BooleanType with Hive|
|[#6027](https://github.com/NVIDIA/spark-rapids/pull/6027)|Re-enable "transpile complex regex 2" scala test|
|[#6140](https://github.com/NVIDIA/spark-rapids/pull/6140)|Update profile names in unit tests docs [skip ci]|
|[#6141](https://github.com/NVIDIA/spark-rapids/pull/6141)|Fixes threaded shuffle writer test mocks for spark 3.3.0+|
|[#6147](https://github.com/NVIDIA/spark-rapids/pull/6147)|Revert "Temporarily disable Parquet unsigned int test in ParquetScanS…|
|[#6133](https://github.com/NVIDIA/spark-rapids/pull/6133)|[DOC]update getting started guide doc for aws-emr670 release[skip ci]|
|[#6007](https://github.com/NVIDIA/spark-rapids/pull/6007)|Add doc for parsing expressions in qualification tool [skip ci]|
|[#6125](https://github.com/NVIDIA/spark-rapids/pull/6125)|Add SQL table to Qualification's app-details view [skip ci]|
|[#6116](https://github.com/NVIDIA/spark-rapids/pull/6116)|Fix: check validity before setting the default value|
|[#6120](https://github.com/NVIDIA/spark-rapids/pull/6120)|Qualification Tool add test for SQL Description escaping commas for csv|
|[#6106](https://github.com/NVIDIA/spark-rapids/pull/6106)|Qualification tool: Parse expressions in WindowExec|
|[#6040](https://github.com/NVIDIA/spark-rapids/pull/6040)|Enable anchors in regexp string split|
|[#6052](https://github.com/NVIDIA/spark-rapids/pull/6052)|Multi-threaded shuffle writer for RapidsShuffleManager|
|[#5998](https://github.com/NVIDIA/spark-rapids/pull/5998)|Enable Strings as a supported type for GpuColumnarToRow transitions|
|[#6092](https://github.com/NVIDIA/spark-rapids/pull/6092)|Qualification tool output recommendations on a per sql query basis|
|[#6104](https://github.com/NVIDIA/spark-rapids/pull/6104)|Revert to only supporting Apache Iceberg 0.13.x|
|[#6111](https://github.com/NVIDIA/spark-rapids/pull/6111)|Fix missed gnupg2 in ucx example dockerfiles [skip ci]|
|[#6107](https://github.com/NVIDIA/spark-rapids/pull/6107)|Disable snapshot shims build in 22.08|
|[#6016](https://github.com/NVIDIA/spark-rapids/pull/6016)|Automatically adjust `spark.rapids.sql.multiThreadedRead.numThreads`  to the same as `spark.executor.cores`|
|[#6098](https://github.com/NVIDIA/spark-rapids/pull/6098)|Support Apache Iceberg 0.14.0|
|[#6097](https://github.com/NVIDIA/spark-rapids/pull/6097)|Fix 3.3 shim to include castTo handling AnyTimestampType and minor spacing|
|[#6057](https://github.com/NVIDIA/spark-rapids/pull/6057)|Tag `GpuWindow` child expressions for GPU execution|
|[#6090](https://github.com/NVIDIA/spark-rapids/pull/6090)|Add missing is_spark_321cdh import in orc_test|
|[#6048](https://github.com/NVIDIA/spark-rapids/pull/6048)|Port whole parsePartitions method from Spark3.3 to Gpu side|
|[#5941](https://github.com/NVIDIA/spark-rapids/pull/5941)|GPU accelerate Apache Iceberg reads|
|[#5925](https://github.com/NVIDIA/spark-rapids/pull/5925)|Add Alluxio auto mount feature|
|[#6004](https://github.com/NVIDIA/spark-rapids/pull/6004)|Check the existence of alluxio path|
|[#6082](https://github.com/NVIDIA/spark-rapids/pull/6082)|Enable auto-merge from branch-22.08 to branch-22.10 [skip ci]|
|[#6058](https://github.com/NVIDIA/spark-rapids/pull/6058)|Disable zstd orc tests in cdh|
|[#6078](https://github.com/NVIDIA/spark-rapids/pull/6078)|Temporarily disable Parquet unsigned int test in ParquetScanSuite|
|[#6049](https://github.com/NVIDIA/spark-rapids/pull/6049)|Fix test hang caused by parquet hadoop test jar log4j file|
|[#6042](https://github.com/NVIDIA/spark-rapids/pull/6042)|Qualification tool:  Parse expressions in Aggregates and Sort execs.|
|[#6041](https://github.com/NVIDIA/spark-rapids/pull/6041)|Improve check for UTF-8 in integration tests by testing from the JVM|
|[#5970](https://github.com/NVIDIA/spark-rapids/pull/5970)|Address feedback in "Improve regular expression error messages" PR|
|[#6000](https://github.com/NVIDIA/spark-rapids/pull/6000)|Support nth_value, first and last in window context|
|[#6031](https://github.com/NVIDIA/spark-rapids/pull/6031)|Update spark322shim dependency to released lib|
|[#6033](https://github.com/NVIDIA/spark-rapids/pull/6033)|Refactor: Fix PCBS does not fully follow the pattern for public classes|
|[#6019](https://github.com/NVIDIA/spark-rapids/pull/6019)|Update the interval division to throw same type exceptions as Spark|
|[#6030](https://github.com/NVIDIA/spark-rapids/pull/6030)|Cleans up some of the redundant code in proxy/internal RAPIDS Shuffle Managers|
|[#5988](https://github.com/NVIDIA/spark-rapids/pull/5988)|[FEA] Add a progress bar in Qualification tool when it is running|
|[#6020](https://github.com/NVIDIA/spark-rapids/pull/6020)|Unify test modes in databricks test script|
|[#6025](https://github.com/NVIDIA/spark-rapids/pull/6025)|Skip Iceberg tests on Databricks|
|[#5983](https://github.com/NVIDIA/spark-rapids/pull/5983)|Adding AUTO native parquet support and legacy tests|
|[#6010](https://github.com/NVIDIA/spark-rapids/pull/6010)|Update docs to better explain limitations of Dataset support|
|[#5996](https://github.com/NVIDIA/spark-rapids/pull/5996)|Fix GPU degrees function does not overflow|
|[#5994](https://github.com/NVIDIA/spark-rapids/pull/5994)|Skip Parquet encryption read tests if Parquet version is less than 1.12|
|[#5776](https://github.com/NVIDIA/spark-rapids/pull/5776)|Enable regular expression support based on whether UTF-8 is in the current locale|
|[#6009](https://github.com/NVIDIA/spark-rapids/pull/6009)|Fix issue where spark-tests was producing an unintended error code|
|[#5903](https://github.com/NVIDIA/spark-rapids/pull/5903)|Avoid requiring single batch when using out-of-core sort|
|[#6008](https://github.com/NVIDIA/spark-rapids/pull/6008)|Rename test modes in spark-tests.sh [skip ci]|
|[#5991](https://github.com/NVIDIA/spark-rapids/pull/5991)|Enable zstd integration tests for parquet and orc|
|[#5997](https://github.com/NVIDIA/spark-rapids/pull/5997)|support testing parquet encryption|
|[#5968](https://github.com/NVIDIA/spark-rapids/pull/5968)|Add support for regexp_extract_all on GPU|
|[#5995](https://github.com/NVIDIA/spark-rapids/pull/5995)|Fix a minor potential issue when rebatching for GpuArrowEvalPythonExec|
|[#5960](https://github.com/NVIDIA/spark-rapids/pull/5960)|Set up the framework of type casting for ORC reading|
|[#5987](https://github.com/NVIDIA/spark-rapids/pull/5987)|Document how to check if finalized plan on GPU from user code / REPLs [skip ci]|
|[#5982](https://github.com/NVIDIA/spark-rapids/pull/5982)|Use the new native parquet footer API instead of the old one|
|[#5972](https://github.com/NVIDIA/spark-rapids/pull/5972)|[DOC] add app-details to qualification tools doc [skip ci]|
|[#5976](https://github.com/NVIDIA/spark-rapids/pull/5976)|Enable null in regex character classes|
|[#5974](https://github.com/NVIDIA/spark-rapids/pull/5974)|Remove scaladoc warning |
|[#5912](https://github.com/NVIDIA/spark-rapids/pull/5912)|Fall back to CPU for Delta Lake metadata queries|
|[#5955](https://github.com/NVIDIA/spark-rapids/pull/5955)|Fix fake memory leaks in some test cases|
|[#5915](https://github.com/NVIDIA/spark-rapids/pull/5915)|Make the error message of changing decimal type the same as Spark's|
|[#5971](https://github.com/NVIDIA/spark-rapids/pull/5971)|Append new authorized user to blossom-ci whitelist [skip ci]|
|[#5967](https://github.com/NVIDIA/spark-rapids/pull/5967)|[Doc]In Databricks doc, disable DPP config[skip ci]|
|[#5871](https://github.com/NVIDIA/spark-rapids/pull/5871)|Improve regular expression error messages|
|[#5952](https://github.com/NVIDIA/spark-rapids/pull/5952)|Qualification tool: Parse expressions in ProjectExec|
|[#5961](https://github.com/NVIDIA/spark-rapids/pull/5961)|Don't set spark.sql.ansi.strictIndexOperator to false for array subscript test|
|[#5935](https://github.com/NVIDIA/spark-rapids/pull/5935)|Enable reading double values on GPU when reading CSV and JSON|
|[#5950](https://github.com/NVIDIA/spark-rapids/pull/5950)|Fix GpuShuffleCoalesce op time metric doesn't include concat batch time|
|[#5932](https://github.com/NVIDIA/spark-rapids/pull/5932)|Add string split support for limit = 0 and limit =1 |
|[#5951](https://github.com/NVIDIA/spark-rapids/pull/5951)|Fix issue with Profiling tool taking a long time due to finding stage ids that maps to sql nodes|
|[#5954](https://github.com/NVIDIA/spark-rapids/pull/5954)|Add IT dockerfile for rockylinux8 [skip ci]|
|[#5949](https://github.com/NVIDIA/spark-rapids/pull/5949)|Update `GpuAdd` and `GpuSubtract` to throw same type exception as Spark|
|[#5878](https://github.com/NVIDIA/spark-rapids/pull/5878)|Fix misleading documentation for `approx_percentile` and some other functions|
|[#5913](https://github.com/NVIDIA/spark-rapids/pull/5913)|Update gcp cluster init option [skip ci]|
|[#5940](https://github.com/NVIDIA/spark-rapids/pull/5940)|Qualification tool UI. fix Read-Schema column broken [skip ci]|
|[#5938](https://github.com/NVIDIA/spark-rapids/pull/5938)|Fix leaks in the test cases of CachedBatchWriterSuite|
|[#5934](https://github.com/NVIDIA/spark-rapids/pull/5934)|Add underscore to regexp fuzzer|
|[#5936](https://github.com/NVIDIA/spark-rapids/pull/5936)|[BUG] Fix databricks test report location|
|[#5883](https://github.com/NVIDIA/spark-rapids/pull/5883)|Add support for `element_at` and `GetMapValue`|
|[#5918](https://github.com/NVIDIA/spark-rapids/pull/5918)|Filter profiling tool based on start time. |
|[#5926](https://github.com/NVIDIA/spark-rapids/pull/5926)|Collect databricks test report|
|[#5924](https://github.com/NVIDIA/spark-rapids/pull/5924)|Changes made to the Audit process for prioritizing the commits [skip-ci]|
|[#5834](https://github.com/NVIDIA/spark-rapids/pull/5834)|Add support for null characters in regular expressions|
|[#5930](https://github.com/NVIDIA/spark-rapids/pull/5930)|Make first/last test for sorted deterministic|
|[#5917](https://github.com/NVIDIA/spark-rapids/pull/5917)|Improve sort removal heuristic for sort aggregate|
|[#5916](https://github.com/NVIDIA/spark-rapids/pull/5916)|Revert "Enable testing zstd for spark releases 3.2.0 and later (#5898)"|
|[#5686](https://github.com/NVIDIA/spark-rapids/pull/5686)|Add `GpuMapConcat` support for nested-type values|
|[#5905](https://github.com/NVIDIA/spark-rapids/pull/5905)|Add support for negated POSIX character classes `\P`|
|[#5898](https://github.com/NVIDIA/spark-rapids/pull/5898)|Enable testing parquet with zstd for spark releases 3.2.0 and later|
|[#5900](https://github.com/NVIDIA/spark-rapids/pull/5900)|Optimize some common if/else cases|
|[#5869](https://github.com/NVIDIA/spark-rapids/pull/5869)|Qualification: fix sorting and add unit-tests script|
|[#5819](https://github.com/NVIDIA/spark-rapids/pull/5819)|Modify the default value of spark.rapids.sql.explain as NOT_ON_GPU|
|[#5723](https://github.com/NVIDIA/spark-rapids/pull/5723)|Dynamically load hive and avro using reflection to avoid potential class not found exception|
|[#5886](https://github.com/NVIDIA/spark-rapids/pull/5886)|Avoid serializing plan in GpuCoalesceBatches, GpuHashAggregateExec, and GpuTopN|
|[#5897](https://github.com/NVIDIA/spark-rapids/pull/5897)|GpuBatchScanExec partitions should be marked transient|
|[#5894](https://github.com/NVIDIA/spark-rapids/pull/5894)|[Doc]fix a typo with double "("[skip ci] |
|[#5880](https://github.com/NVIDIA/spark-rapids/pull/5880)|Qualification tool: Parse expressions in FilterExec|
|[#5885](https://github.com/NVIDIA/spark-rapids/pull/5885)|[Doc] Fix alluxio doc link issue[skip ci]|
|[#5879](https://github.com/NVIDIA/spark-rapids/pull/5879)|Avoid duplicate sanitization step when reading JSON floats|
|[#5877](https://github.com/NVIDIA/spark-rapids/pull/5877)|Add Apache Spark 3.3.1-SNAPSHOT Shims|
|[#5783](https://github.com/NVIDIA/spark-rapids/pull/5783)|`assertMinValueOverflow` should throw same type of exception as Spark|
|[#5875](https://github.com/NVIDIA/spark-rapids/pull/5875)|Qualification ui output goes to wrong folder|
|[#5870](https://github.com/NVIDIA/spark-rapids/pull/5870)|Use a common thread pool across formats for multithreaded reads|
|[#5868](https://github.com/NVIDIA/spark-rapids/pull/5868)|Profiling tool add wholestagecodegen to execs mapping, sql to stage info and job end time|
|[#5873](https://github.com/NVIDIA/spark-rapids/pull/5873)|Correct the value of spark.rapids.sql.explain|
|[#5695](https://github.com/NVIDIA/spark-rapids/pull/5695)|Verify DPP over LIKE ANY/ALL expression|
|[#5856](https://github.com/NVIDIA/spark-rapids/pull/5856)|Update unit test doc|
|[#5866](https://github.com/NVIDIA/spark-rapids/pull/5866)|Fix CsvScanForIntervalSuite leak issues|
|[#5810](https://github.com/NVIDIA/spark-rapids/pull/5810)|Qualification UI - add application details view|
|[#5860](https://github.com/NVIDIA/spark-rapids/pull/5860)|[Doc]Add Spark3.3 support in doc[skip ci]|
|[#5858](https://github.com/NVIDIA/spark-rapids/pull/5858)|Remove SNAPSHOT support from Spark 3.3.0 shim|
|[#5857](https://github.com/NVIDIA/spark-rapids/pull/5857)|Remove user sperlingxx[skip ci]|
|[#5841](https://github.com/NVIDIA/spark-rapids/pull/5841)|Enable regexp empty string short circuit on shim version 3.1.3|
|[#5853](https://github.com/NVIDIA/spark-rapids/pull/5853)|Fix auto merge conflict 5850|
|[#5845](https://github.com/NVIDIA/spark-rapids/pull/5845)|Update Parquet binaryAsString integration to use a static parquet file|
|[#5842](https://github.com/NVIDIA/spark-rapids/pull/5842)|Update default speedup factors for qualification tool|
|[#5829](https://github.com/NVIDIA/spark-rapids/pull/5829)|Add regexp support for Alert, and Escape control characters|
|[#5833](https://github.com/NVIDIA/spark-rapids/pull/5833)|Add test for GpuCast canonicalization with timezone |
|[#5822](https://github.com/NVIDIA/spark-rapids/pull/5822)|Configure log4j version 2.x for test cases|
|[#5830](https://github.com/NVIDIA/spark-rapids/pull/5830)|Enable the `spark.sql.parquet.binaryAsString=true` configuration option on the GPU|
|[#5805](https://github.com/NVIDIA/spark-rapids/pull/5805)|[Issue 5726] Removing duplicate BINARY keyword|
|[#5828](https://github.com/NVIDIA/spark-rapids/pull/5828)|Update tools module to latest Hadoop version|
|[#5809](https://github.com/NVIDIA/spark-rapids/pull/5809)|Disable Spark 3.4.0 premerge for 22.08 and enable for 22.10 |
|[#5767](https://github.com/NVIDIA/spark-rapids/pull/5767)|Fix the time zone check issue|
|[#5814](https://github.com/NVIDIA/spark-rapids/pull/5814)|Fix auto merge conflict 5812 [skip ci]|
|[#5804](https://github.com/NVIDIA/spark-rapids/pull/5804)|Support RoundCeil and RoundFloor when scale is zero|
|[#5696](https://github.com/NVIDIA/spark-rapids/pull/5696)|Support Parquet field IDs|
|[#5749](https://github.com/NVIDIA/spark-rapids/pull/5749)|Add shims for `AnsiCast`|
|[#5780](https://github.com/NVIDIA/spark-rapids/pull/5780)|Append new authorized user to blossom-ci whitelist [skip ci]|
|[#5350](https://github.com/NVIDIA/spark-rapids/pull/5350)|Halt Spark executor when encountering unrecoverable CUDA errors|
|[#5779](https://github.com/NVIDIA/spark-rapids/pull/5779)|Fix repeated runs mvn package without clean lead to missing spark-rapids spark-rapids-jni-version-info.properties in dist jar|
|[#5800](https://github.com/NVIDIA/spark-rapids/pull/5800)|Fix auto merge conflict 5799|
|[#5794](https://github.com/NVIDIA/spark-rapids/pull/5794)|Fix auto merge conflict 5789|
|[#5740](https://github.com/NVIDIA/spark-rapids/pull/5740)|Handle regexp_replace inconsistency with empty strings and zero-repetition patterns|
|[#5790](https://github.com/NVIDIA/spark-rapids/pull/5790)|Fix auto merge conflict 5789|
|[#5690](https://github.com/NVIDIA/spark-rapids/pull/5690)|Update the error checking of `test_cast_neg_to_decimal_err`|
|[#5774](https://github.com/NVIDIA/spark-rapids/pull/5774)|Fix merge conflict with branch-22.06|
|[#5768](https://github.com/NVIDIA/spark-rapids/pull/5768)|Support MMyyyy date/timestamp format|
|[#5692](https://github.com/NVIDIA/spark-rapids/pull/5692)|Add support for POSIX predefined character classes|
|[#5762](https://github.com/NVIDIA/spark-rapids/pull/5762)|Fix auto merge conflict 5759|
|[#5754](https://github.com/NVIDIA/spark-rapids/pull/5754)|Fix auto merge conflict 5752|
|[#5450](https://github.com/NVIDIA/spark-rapids/pull/5450)|Handle `?`, `*`, `{0,}` and `{0,n}` based repetitions in regexp_replace on the GPU|
|[#5479](https://github.com/NVIDIA/spark-rapids/pull/5479)|Add support for word boundaries `\b` and `\B`|
|[#5745](https://github.com/NVIDIA/spark-rapids/pull/5745)|Move `RapidsErrorUtils` to `org.apache.spark.sql.shims` package|
|[#5610](https://github.com/NVIDIA/spark-rapids/pull/5610)|Fall back to CPU for unsupported regular expression edge cases with end of line/string anchors and newlines|
|[#5725](https://github.com/NVIDIA/spark-rapids/pull/5725)|Fix auto merge conflict 5724|
|[#5687](https://github.com/NVIDIA/spark-rapids/pull/5687)|Minor: Clean up GpuConcat|
|[#5710](https://github.com/NVIDIA/spark-rapids/pull/5710)|Fix auto merge conflict 5709|
|[#5708](https://github.com/NVIDIA/spark-rapids/pull/5708)|Fix shim-related bugs|
|[#5700](https://github.com/NVIDIA/spark-rapids/pull/5700)|Fix auto merge conflict 5699|
|[#5675](https://github.com/NVIDIA/spark-rapids/pull/5675)|Update the error messages for the failing arithmetic tests.|
|[#5689](https://github.com/NVIDIA/spark-rapids/pull/5689)|Disable 340 for premerge and nightly|
|[#5603](https://github.com/NVIDIA/spark-rapids/pull/5603)|Skip unshim and dedup of external spark-rapids-jni and jucx|
|[#5472](https://github.com/NVIDIA/spark-rapids/pull/5472)|Add shims for Spark 3.4.0|
|[#5647](https://github.com/NVIDIA/spark-rapids/pull/5647)|Init version 22.08.0-SNAPSHOT|

## Release 22.06

### Features
|||
|:---|:---|
|[#5451](https://github.com/NVIDIA/spark-rapids/issues/5451)|[FEA] Update Spark2 explain code for 22.06|
|[#5261](https://github.com/NVIDIA/spark-rapids/issues/5261)|[FEA] Create MIG with Cgroups on YARN Dataproc scripts|
|[#5476](https://github.com/NVIDIA/spark-rapids/issues/5476)|[FEA] extend concat on arrays to all nested types.|
|[#5113](https://github.com/NVIDIA/spark-rapids/issues/5113)|[FEA] ANSI mode: Support CAST between types|
|[#5112](https://github.com/NVIDIA/spark-rapids/issues/5112)|[FEA] ANSI mode: allow casting between numeric type and timestamp type|
|[#5323](https://github.com/NVIDIA/spark-rapids/issues/5323)|[FEA] Enable floating point by default|
|[#4518](https://github.com/NVIDIA/spark-rapids/issues/4518)|[FEA] Add support for escaped unicode hex in regular expressions|
|[#5405](https://github.com/NVIDIA/spark-rapids/issues/5405)|[FEA] Support map_concat function|
|[#5547](https://github.com/NVIDIA/spark-rapids/issues/5547)|[FEA] Regexp: Can we transpile `\W` and `\D` to Java's definition so we can support on GPU?|
|[#5512](https://github.com/NVIDIA/spark-rapids/issues/5512)|[FEA] Qualification tool, hook up final output and output execs table|
|[#5507](https://github.com/NVIDIA/spark-rapids/issues/5507)|[FEA] Support GpuRaiseError|
|[#5325](https://github.com/NVIDIA/spark-rapids/issues/5325)|[FEA] Support spark.sql.mapKeyDedupPolicy=LAST_WIN for `TransformKeys`|
|[#3682](https://github.com/NVIDIA/spark-rapids/issues/3682)|[FEA] Use conventional jar layout in dist jar if there is only one input shim|
|[#1556](https://github.com/NVIDIA/spark-rapids/issues/1556)|[FEA] Implement ANSI mode tests for string to timestamp functions|
|[#4425](https://github.com/NVIDIA/spark-rapids/issues/4425)|[FEA] Support line anchor `$` and string anchors `\z` and `\Z` in regexp_replace|
|[#5176](https://github.com/NVIDIA/spark-rapids/issues/5176)|[FEA] Qualification tool UI|
|[#5111](https://github.com/NVIDIA/spark-rapids/issues/5111)|[FEA] ANSI mode: CAST between ANSI intervals and IntegralType|
|[#4605](https://github.com/NVIDIA/spark-rapids/issues/4605)|[FEA] Add regular expression support for new character classes introduced in Java 8|
|[#5273](https://github.com/NVIDIA/spark-rapids/issues/5273)|[FEA] Support map_filter|
|[#1557](https://github.com/NVIDIA/spark-rapids/issues/1557)|[FEA] Enable ANSI mode for CAST string to date|
|[#5446](https://github.com/NVIDIA/spark-rapids/issues/5446)|[FEA] Remove hasNans check for array_contains|
|[#5445](https://github.com/NVIDIA/spark-rapids/issues/5445)|[FEA] Support reading Int as Byte/Short/Date from parquet |
|[#5449](https://github.com/NVIDIA/spark-rapids/issues/5449)|[FEA] QualificationTool. Add speedup information to AppSummaryInfo|
|[#5322](https://github.com/NVIDIA/spark-rapids/issues/5322)|[FEA] remove hasNans for Pivot|
|[#4800](https://github.com/NVIDIA/spark-rapids/issues/4800)|[FEA] Enable support for more regular expressions with \A and \Z|
|[#5404](https://github.com/NVIDIA/spark-rapids/issues/5404)|[FEA] Add Shim for the Spark version shipped with Cloudera CDH 7.1.7|
|[#5226](https://github.com/NVIDIA/spark-rapids/issues/5226)|[FEA] Support array_repeat|
|[#5229](https://github.com/NVIDIA/spark-rapids/issues/5229)|[FEA] Support arrays_zip|
|[#5119](https://github.com/NVIDIA/spark-rapids/issues/5119)|[FEA] Support ANSI mode for SQL functions/operators|
|[#4532](https://github.com/NVIDIA/spark-rapids/issues/4532)|[FEA] Re-enable support for `\Z` in regular expressions|
|[#3985](https://github.com/NVIDIA/spark-rapids/issues/3985)|[FEA] UDF-Compiler: Translation of simple predicate UDF should allow predicate pushdown|
|[#5034](https://github.com/NVIDIA/spark-rapids/issues/5034)|[FEA] Implement ExistenceJoin for BroadcastNestedLoopJoin Exec|
|[#4533](https://github.com/NVIDIA/spark-rapids/issues/4533)|[FEA] Re-enable support for `$` in regular expressions|
|[#5263](https://github.com/NVIDIA/spark-rapids/issues/5263)|[FEA] Write out operator mapping from plugin to CSV file for use in qualification tool|
|[#5095](https://github.com/NVIDIA/spark-rapids/issues/5095)|[FEA] Support collect_set on struct in reduction context|
|[#4811](https://github.com/NVIDIA/spark-rapids/issues/4811)|[FEA] Support ANSI intervals for Cast and Sample|
|[#2062](https://github.com/NVIDIA/spark-rapids/issues/2062)|[FEA] support collect aggregations|
|[#5060](https://github.com/NVIDIA/spark-rapids/issues/5060)|[FEA] Support Count on Struct of [ Struct of [String, Map(String,String)], Array(String), Map(String,String) ]|
|[#4528](https://github.com/NVIDIA/spark-rapids/issues/4528)|[FEA] Add support for regular expressions containing `\s` and `\S`|
|[#4557](https://github.com/NVIDIA/spark-rapids/issues/4557)|[FEA] Add support for regexp_replace with back-references|

### Performance
|||
|:---|:---|
|[#5148](https://github.com/NVIDIA/spark-rapids/issues/5148)|Add the MULTI-THREADED reading support for avro|
|[#5304](https://github.com/NVIDIA/spark-rapids/issues/5304)|[FEA] Optimize remote Avro reading for a PartitionFile|
|[#5257](https://github.com/NVIDIA/spark-rapids/issues/5257)|[FEA][Audit] - [SPARK-34863][SQL] Support complex types for Parquet vectorized reader|
|[#5149](https://github.com/NVIDIA/spark-rapids/issues/5149)|Add the COALESCING reading support for avro|

### Bugs Fixed
|||
|:---|:---|
|[#5769](https://github.com/NVIDIA/spark-rapids/issues/5769)|[BUG] arithmetic ops tests failing on Spark 3.3.0|
|[#5785](https://github.com/NVIDIA/spark-rapids/issues/5785)|[BUG] Tests module build failed in OrcEncryptionSuite for 321cdh|
|[#5765](https://github.com/NVIDIA/spark-rapids/issues/5765)|[BUG] Container decimal overflow when casting float/double to decimal |
|[#5246](https://github.com/NVIDIA/spark-rapids/issues/5246)|Verify Parquet columnar encryption is handled safely|
|[#5770](https://github.com/NVIDIA/spark-rapids/issues/5770)|[BUG] test_buckets failed|
|[#5733](https://github.com/NVIDIA/spark-rapids/issues/5733)|[BUG] Integration test test_orc_write_encryption_fallback fail|
|[#5719](https://github.com/NVIDIA/spark-rapids/issues/5719)|[BUG] test_cast_float_to_timestamp_ansi_for_nan_inf failed in spark330|
|[#5739](https://github.com/NVIDIA/spark-rapids/issues/5739)|[BUG] Spark 3.3 build failure - QueryExecutionErrors package scope changed|
|[#5670](https://github.com/NVIDIA/spark-rapids/issues/5670)|[BUG] Job failed when parsing "java.lang.reflect.InvocationTargetException: org.apache.spark.sql.catalyst.parser.ParseException:" |
|[#4860](https://github.com/NVIDIA/spark-rapids/issues/4860)|[BUG] GPU writing ORC columns statistics|
|[#5717](https://github.com/NVIDIA/spark-rapids/issues/5717)|[BUG] `div_by_zero` test is failing on Spark 330 on 22.06|
|[#5632](https://github.com/NVIDIA/spark-rapids/issues/5632)|[BUG] udf_cudf tests failed: EOFException DataInputStream.readInt(DataInputStream.java:392)|
|[#5672](https://github.com/NVIDIA/spark-rapids/issues/5672)|[BUG] Read exception occurs when clipped schema is empty|
|[#5694](https://github.com/NVIDIA/spark-rapids/issues/5694)|[BUG] Inconsistent behavior with Spark when reading a non-existent column from Parquet|
|[#5562](https://github.com/NVIDIA/spark-rapids/issues/5562)|[BUG] read ORC file with various file schemas|
|[#5654](https://github.com/NVIDIA/spark-rapids/issues/5654)|[BUG] Transpiler produces regex pattern that cuDF cannot compile|
|[#5655](https://github.com/NVIDIA/spark-rapids/issues/5655)|[BUG] Regular expression pattern `[&&1]` produces incorrect results on GPU|
|[#4862](https://github.com/NVIDIA/spark-rapids/issues/4862)|[FEA] Add support for regular expressions containing octal digits inside character classes , eg`[\0177]`|
|[#5615](https://github.com/NVIDIA/spark-rapids/issues/5615)|[BUG] GpuBatchScanExec only reports output row metrics|
|[#4505](https://github.com/NVIDIA/spark-rapids/issues/4505)|[BUG] RegExp parse fails to parse character ranges containing escaped characters|
|[#4865](https://github.com/NVIDIA/spark-rapids/issues/4865)|[BUG] Add support for regular expressions containing hexadecimal digits inside character classes, eg `[\x7f]`|
|[#5513](https://github.com/NVIDIA/spark-rapids/issues/5513)|[BUG] NoClassDefFoundError with caller classloader off in GpuShuffleCoalesceIterator in local-cluster|
|[#5530](https://github.com/NVIDIA/spark-rapids/issues/5530)|[BUG] regexp: `\d`, `\w` inconsistencies with non-latin unicode input|
|[#5594](https://github.com/NVIDIA/spark-rapids/issues/5594)|[BUG] 3.3 test_div_overflow_exception_when_ansi test failures|
|[#5596](https://github.com/NVIDIA/spark-rapids/issues/5596)|[BUG] Shim service provider failure when using jar built with -DallowConventionalDistJar|
|[#5582](https://github.com/NVIDIA/spark-rapids/issues/5582)|[BUG] Nightly CI failed with : 'dist/target/rapids-4-spark_2.12-22.06.0-SNAPSHOT.jar' not exists|
|[#5577](https://github.com/NVIDIA/spark-rapids/issues/5577)|[BUG] test_cast_neg_to_decimal_err failing in databricks|
|[#5557](https://github.com/NVIDIA/spark-rapids/issues/5557)|[BUG] dist jar does not contain reduced pom, creates an unnecessary jar|
|[#5474](https://github.com/NVIDIA/spark-rapids/issues/5474)|[BUG] Spark 3.2.1 arithmetic_ops_test failures|
|[#5497](https://github.com/NVIDIA/spark-rapids/issues/5497)|[BUG] 3 tests in `IntervalSuite` are faling on 330|
|[#5544](https://github.com/NVIDIA/spark-rapids/issues/5544)|[BUG] GpuCreateMap needs to set hasSideEffects in some cases|
|[#5469](https://github.com/NVIDIA/spark-rapids/issues/5469)|[BUG] NPE during serialization for shuffle in array-aggregation-with-limit query|
|[#5496](https://github.com/NVIDIA/spark-rapids/issues/5496)|[BUG] `avg literals bools` is failing on 330|
|[#5511](https://github.com/NVIDIA/spark-rapids/issues/5511)|[BUG] orc_test failures on 321cdh|
|[#5439](https://github.com/NVIDIA/spark-rapids/issues/5439)|[BUG] Encrypted Parquet writes are being replaced with a GPU unencrypted write|
|[#5108](https://github.com/NVIDIA/spark-rapids/issues/5108)|[BUG] GpuArrayExists  encounters a CudfException on an input partition consisting of just empty lists  |
|[#5492](https://github.com/NVIDIA/spark-rapids/issues/5492)|[BUG] com.nvidia.spark.rapids.RegexCharacterClass cannot be cast to com.nvidia.spark.rapids.RegexCharacterClassComponent|
|[#4818](https://github.com/NVIDIA/spark-rapids/issues/4818)|[BUG] ASYNC: the spill store needs to synchronize on spills against the allocating stream|
|[#5481](https://github.com/NVIDIA/spark-rapids/issues/5481)|[BUG] test_parquet_check_schema_compatibility failed in databricks runtimes|
|[#5482](https://github.com/NVIDIA/spark-rapids/issues/5482)|[BUG] test_cast_string_date_invalid_ansi_before_320 failed in databricks runtime|
|[#5457](https://github.com/NVIDIA/spark-rapids/issues/5457)|[BUG] 330 AnsiCastOpSuite Unit tests failed 22 cases|
|[#5098](https://github.com/NVIDIA/spark-rapids/issues/5098)|[BUG] Harden calls to `RapidsBuffer.free`|
|[#5464](https://github.com/NVIDIA/spark-rapids/issues/5464)|[BUG] Query failure with java.lang.AssertionError when using partitioned Iceberg tables|
|[#4746](https://github.com/NVIDIA/spark-rapids/issues/4746)|[FEA] Add support for regular expressions containing octal digits in range `\200` to `377`|
|[#5200](https://github.com/NVIDIA/spark-rapids/issues/5200)|[BUG] More detailed logs to show which parquet file and which data type has mismatch.|
|[#4866](https://github.com/NVIDIA/spark-rapids/issues/4866)|[BUG] Add support for regular expressions containing hexadecimal digits greater than `0x7f`|
|[#5140](https://github.com/NVIDIA/spark-rapids/issues/5140)|[BUG] NPE on array_max of transformed empty array|
|[#5444](https://github.com/NVIDIA/spark-rapids/issues/5444)|[BUG] build failed on Databricks|
|[#5357](https://github.com/NVIDIA/spark-rapids/issues/5357)|[BUG] Spark 3.3 cache_test test_passing_gpuExpr_as_Expr[failures|
|[#5429](https://github.com/NVIDIA/spark-rapids/issues/5429)|[BUG] test_cache_expand_exec fails on Spark 3.3|
|[#5312](https://github.com/NVIDIA/spark-rapids/issues/5312)|[BUG] The coalesced AVRO file may contain different sync markers if the sync marker varies in the avro files being coalesced.|
|[#5415](https://github.com/NVIDIA/spark-rapids/issues/5415)|[BUG] Regular Expressions: matching the dot `.` doesn't fully exclude all unicode line terminator characters|
|[#5413](https://github.com/NVIDIA/spark-rapids/issues/5413)|[BUG] Databricks 321 build fails -  not found: type OrcShims320untilAllBase|
|[#5286](https://github.com/NVIDIA/spark-rapids/issues/5286)|[BUG] assert failed test_struct_self_join and test_computation_in_grpby_columns|
|[#5351](https://github.com/NVIDIA/spark-rapids/issues/5351)|[BUG] Build fails for Spark 3.3 due to extra arguments to mapKeyNotExistError|
|[#5260](https://github.com/NVIDIA/spark-rapids/issues/5260)|[BUG] map_test failures on Spark 3.3.0|
|[#5189](https://github.com/NVIDIA/spark-rapids/issues/5189)|[BUG] Reading from iceberg table will fail.|
|[#5130](https://github.com/NVIDIA/spark-rapids/issues/5130)|[BUG] string_split does not respect spark.rapids.sql.regexp.enabled config|
|[#5267](https://github.com/NVIDIA/spark-rapids/issues/5267)|[BUG] markdown link check failed issue|
|[#5295](https://github.com/NVIDIA/spark-rapids/issues/5295)|[BUG] Build fails for Spark 3.3 due to extra arguments to `mapKeyNotExistError`|
|[#5264](https://github.com/NVIDIA/spark-rapids/issues/5264)|[BUG] Delete unused generic type.|
|[#5275](https://github.com/NVIDIA/spark-rapids/issues/5275)|[BUG] rlike cannot run on GPU because invalid or unsupported escape character ']' near index 14|
|[#5278](https://github.com/NVIDIA/spark-rapids/issues/5278)|[BUG] build 311cdh failed: unable to find valid certification path to requested target|
|[#5211](https://github.com/NVIDIA/spark-rapids/issues/5211)|[BUG] csv_test:test_basic_csv_read FAILED |
|[#5244](https://github.com/NVIDIA/spark-rapids/issues/5244)|[BUG] Spark 3.3 integration test failures logic_test.py::test_logical_with_side_effect|
|[#5041](https://github.com/NVIDIA/spark-rapids/issues/5041)|[BUG] Implement hasSideEffects for all expressions that have side-effects|
|[#4980](https://github.com/NVIDIA/spark-rapids/issues/4980)|[BUG] window_function_test FAILED on PASCAL GPU|
|[#5240](https://github.com/NVIDIA/spark-rapids/issues/5240)|[BUG] EGX integration test_collect_list_reductions failures|
|[#5242](https://github.com/NVIDIA/spark-rapids/issues/5242)|[BUG] Executor falls back to cudaMalloc if the pool can't be initialized|
|[#5215](https://github.com/NVIDIA/spark-rapids/issues/5215)|[BUG] Coalescing reading is not working for v2 parquet/orc datasource|
|[#5104](https://github.com/NVIDIA/spark-rapids/issues/5104)|[BUG] Unconditional warning in UDF Plugin "The compiler is disabled by default"|
|[#5099](https://github.com/NVIDIA/spark-rapids/issues/5099)|[BUG] Profiling tool should not sum gettingResultTime|
|[#5182](https://github.com/NVIDIA/spark-rapids/issues/5182)|[BUG] Spark 3.3 integration tests arithmetic_ops_test.py::test_div_overflow_exception_when_ansi failures|
|[#5147](https://github.com/NVIDIA/spark-rapids/issues/5147)|[BUG] object LZ4Compressor is not a member of package ai.rapids.cudf.nvcomp|
|[#4695](https://github.com/NVIDIA/spark-rapids/issues/4695)|[BUG] Segfault with UCX and ASYNC allocator|
|[#5138](https://github.com/NVIDIA/spark-rapids/issues/5138)|[BUG] xgboost job failed if we enable PCBS|
|[#5135](https://github.com/NVIDIA/spark-rapids/issues/5135)|[BUG] GpuRegExExtract is not align with RegExExtract|
|[#5084](https://github.com/NVIDIA/spark-rapids/issues/5084)|[BUG] GpuWriteTaskStatsTracker complains for all writes in local mode|
|[#5123](https://github.com/NVIDIA/spark-rapids/issues/5123)|[BUG] Compile error for Spark330 because of VectorizedColumnReader constructor added a new parameter.|
|[#5133](https://github.com/NVIDIA/spark-rapids/issues/5133)|[BUG] Compile error for Spark330 because of Spark changed the method signature: QueryExecutionErrors.mapKeyNotExistError|
|[#4959](https://github.com/NVIDIA/spark-rapids/issues/4959)|[BUG] Test case in OpcodeSuite failed on Spark 3.3.0|

### PRs
|||
|:---|:---|
|[#5863](https://github.com/NVIDIA/spark-rapids/pull/5863)|Update 22.06 changelog to include new commits [skip ci]|
|[#5861](https://github.com/NVIDIA/spark-rapids/pull/5861)|[Doc]Add Spark3.3 support in doc for 22.06 branch[skip ci]|
|[#5851](https://github.com/NVIDIA/spark-rapids/pull/5851)|Update 22.06 changelog to include new commits [skip ci]|
|[#5848](https://github.com/NVIDIA/spark-rapids/pull/5848)|Update spark330shim to use released lib|
|[#5840](https://github.com/NVIDIA/spark-rapids/pull/5840)|[DOC] Updated RapidsConf to reflect the default value of `spark.rapids.sql.improvedFloatOps.enabled` [skip ci]|
|[#5816](https://github.com/NVIDIA/spark-rapids/pull/5816)|Update 22.06.0 changelog to latest [skip ci]|
|[#5795](https://github.com/NVIDIA/spark-rapids/pull/5795)|Update FAQ to include local jar deployment via extraClassPath [skip ci]|
|[#5802](https://github.com/NVIDIA/spark-rapids/pull/5802)|Update spark-rapids-jni.version to release 22.06.0|
|[#5798](https://github.com/NVIDIA/spark-rapids/pull/5798)|Fall back to CPU for RoundCeil and RoundFloor expressions|
|[#5791](https://github.com/NVIDIA/spark-rapids/pull/5791)|Remove ORC encryption test from 321cdh|
|[#5766](https://github.com/NVIDIA/spark-rapids/pull/5766)|Fix the overflow of container type when casting floats to decimal|
|[#5786](https://github.com/NVIDIA/spark-rapids/pull/5786)|Fix rounds over decimal in Spark 330+|
|[#5761](https://github.com/NVIDIA/spark-rapids/pull/5761)|Throw an exception when attempting to read columnar encrypted Parquet files on the GPU|
|[#5784](https://github.com/NVIDIA/spark-rapids/pull/5784)|Update the error string for test_cast_neg_to_decimal_err on 330|
|[#5781](https://github.com/NVIDIA/spark-rapids/pull/5781)|Correct the exception string for test_mod_pmod_by_zero on Spark 3.3.0|
|[#5764](https://github.com/NVIDIA/spark-rapids/pull/5764)|Add test for encrypted ORC write|
|[#5760](https://github.com/NVIDIA/spark-rapids/pull/5760)|Enable avrotest in nightly tests [skip ci]|
|[#5746](https://github.com/NVIDIA/spark-rapids/pull/5746)|Init 22.06 changelog [skip ci]|
|[#5716](https://github.com/NVIDIA/spark-rapids/pull/5716)|Disable Avro support when spark-avro classes not loadable by Shim classloader|
|[#5737](https://github.com/NVIDIA/spark-rapids/pull/5737)|Remove the ORC encryption tests|
|[#5753](https://github.com/NVIDIA/spark-rapids/pull/5753)|[DOC] Update regexp compatibility for 22.06 [skip ci]|
|[#5738](https://github.com/NVIDIA/spark-rapids/pull/5738)|Update Spark2 explain code for 22.06|
|[#5731](https://github.com/NVIDIA/spark-rapids/pull/5731)|Throw SparkDateTimeException for InvalidInput while casting in ANSI mode|
|[#5742](https://github.com/NVIDIA/spark-rapids/pull/5742)|Spark-3.3 build fix - Move QueryExecutionErrors to sql package|
|[#5641](https://github.com/NVIDIA/spark-rapids/pull/5641)|[Doc]Update 22.06 documentation[skip ci]|
|[#5701](https://github.com/NVIDIA/spark-rapids/pull/5701)|Update docs for qualification tool to reflect recommendations and UI [skip ci]|
|[#5283](https://github.com/NVIDIA/spark-rapids/pull/5283)|Add documentation for MIG on Dataproc [skip ci]|
|[#5728](https://github.com/NVIDIA/spark-rapids/pull/5728)|Qualification tool: Add test for stage failures|
|[#5681](https://github.com/NVIDIA/spark-rapids/pull/5681)|Branch 22.06 nvcomp notice binary [skip ci]|
|[#5713](https://github.com/NVIDIA/spark-rapids/pull/5713)|Fix GpuCast losing the timezoneId during canonicalization|
|[#5715](https://github.com/NVIDIA/spark-rapids/pull/5715)|Update GPU ORC statistics write support|
|[#5718](https://github.com/NVIDIA/spark-rapids/pull/5718)|Update the error message for div_by_zero test|
|[#5604](https://github.com/NVIDIA/spark-rapids/pull/5604)|ORC encrypted write should fallback to CPU|
|[#5674](https://github.com/NVIDIA/spark-rapids/pull/5674)|Fix reading ORC/PARQUET over empty clipped schema|
|[#5676](https://github.com/NVIDIA/spark-rapids/pull/5676)|Fix ORC reading over different schemas|
|[#5693](https://github.com/NVIDIA/spark-rapids/pull/5693)|Temporarily allow 3.3.1 for 3.3.0 shims.|
|[#5591](https://github.com/NVIDIA/spark-rapids/pull/5591)|Enable regular expressions by default|
|[#5664](https://github.com/NVIDIA/spark-rapids/pull/5664)|Fix edge case where one side of regexp choice ends in duplicate string anchors |
|[#5542](https://github.com/NVIDIA/spark-rapids/pull/5542)|Support arrays of arrays and structs for concat on arrays|
|[#5677](https://github.com/NVIDIA/spark-rapids/pull/5677)|Qualification tool Enable UI by default|
|[#5575](https://github.com/NVIDIA/spark-rapids/pull/5575)|Regexp: Transpile `\D`, `\W` to Java's definitions|
|[#5668](https://github.com/NVIDIA/spark-rapids/pull/5668)|Add user as CI owner [skip ci]|
|[#5627](https://github.com/NVIDIA/spark-rapids/pull/5627)|Install locales and generate en_US.UTF-8|
|[#5514](https://github.com/NVIDIA/spark-rapids/pull/5514)|ANSI mode: allow casting between numeric type and timestamp type|
|[#5600](https://github.com/NVIDIA/spark-rapids/pull/5600)|Qualification tool UI cosmetics and CSV output changes|
|[#5658](https://github.com/NVIDIA/spark-rapids/pull/5658)|Fallback to CPU when `&&` found in character class|
|[#5644](https://github.com/NVIDIA/spark-rapids/pull/5644)|Qualification tool: Enable UDF reporting in potential problems|
|[#5645](https://github.com/NVIDIA/spark-rapids/pull/5645)|Add support for octal digits in character classes|
|[#5643](https://github.com/NVIDIA/spark-rapids/pull/5643)|Fix missing GpuBatchScanExec metrics in SQL UI|
|[#5441](https://github.com/NVIDIA/spark-rapids/pull/5441)|Enable optional float confs and update docs mentioning them|
|[#5532](https://github.com/NVIDIA/spark-rapids/pull/5532)|Support hex digits in character classes and escaped characters in character class ranges|
|[#5625](https://github.com/NVIDIA/spark-rapids/pull/5625)|[DOC]update links for 2206 release[skip ci]|
|[#5623](https://github.com/NVIDIA/spark-rapids/pull/5623)|Handle duplicates in negated character classes|
|[#5533](https://github.com/NVIDIA/spark-rapids/pull/5533)|Support `GpuMapConcat` |
|[#5614](https://github.com/NVIDIA/spark-rapids/pull/5614)|Move HostConcatResultUtil out of unshimmed classes|
|[#5612](https://github.com/NVIDIA/spark-rapids/pull/5612)|Qualification tool: update SQL Df value used and look at jobs in SQL|
|[#5526](https://github.com/NVIDIA/spark-rapids/pull/5526)|Fix whitespace `\s` and `\S` tests|
|[#5541](https://github.com/NVIDIA/spark-rapids/pull/5541)|Regexp: Transpile `\d`, `\w` to Java's definitions|
|[#5598](https://github.com/NVIDIA/spark-rapids/pull/5598)|Qualification tool: Update RunningQualificationApp tests|
|[#5601](https://github.com/NVIDIA/spark-rapids/pull/5601)|Update test_div_overflow_exception_when_ansi test for Spark-3.3|
|[#5588](https://github.com/NVIDIA/spark-rapids/pull/5588)|Update Databricks build scripts|
|[#5599](https://github.com/NVIDIA/spark-rapids/pull/5599)|Move ShimServiceProvider file re-init/truncate|
|[#5531](https://github.com/NVIDIA/spark-rapids/pull/5531)|Filter rows with null keys when coalescing due to reaching cuDF row limits|
|[#5550](https://github.com/NVIDIA/spark-rapids/pull/5550)|Qualification tool hook up final output based on per exec analysis|
|[#5540](https://github.com/NVIDIA/spark-rapids/pull/5540)|Support RaiseError|
|[#5505](https://github.com/NVIDIA/spark-rapids/pull/5505)|Support spark.sql.mapKeyDedupPolicy=LAST_WIN for TransformKeys|
|[#5583](https://github.com/NVIDIA/spark-rapids/pull/5583)|Disable spark snapshot shims build for pre-merge|
|[#5584](https://github.com/NVIDIA/spark-rapids/pull/5584)|Enable automerge from branch-22.06 to 22.08 [skip ci]|
|[#5581](https://github.com/NVIDIA/spark-rapids/pull/5581)|nightly CI to install and deploy cuda11 classifier dist jar [skip ci]|
|[#5579](https://github.com/NVIDIA/spark-rapids/pull/5579)|Update test_cast_neg_to_decimal_err to work with Databricks 10.4 where exception is different|
|[#5578](https://github.com/NVIDIA/spark-rapids/pull/5578)|Fix unfiltered partitions being used to create GpuBatchScanExec RDD|
|[#5560](https://github.com/NVIDIA/spark-rapids/pull/5560)|Minor: Clean up the tests of `concat_list`|
|[#5528](https://github.com/NVIDIA/spark-rapids/pull/5528)|Enable build and test with JDK11|
|[#5571](https://github.com/NVIDIA/spark-rapids/pull/5571)|Update array_min and array_max to use new cudf operations|
|[#5558](https://github.com/NVIDIA/spark-rapids/pull/5558)|Fix target file for update from extra-resources in dist module|
|[#5556](https://github.com/NVIDIA/spark-rapids/pull/5556)|Move FsInput creation into AvroFileReader|
|[#5483](https://github.com/NVIDIA/spark-rapids/pull/5483)|Don't distinguish between types of `ArithmeticException` for Spark 3.2.x|
|[#5539](https://github.com/NVIDIA/spark-rapids/pull/5539)|Fix IntervalSuite cases failure|
|[#5421](https://github.com/NVIDIA/spark-rapids/pull/5421)|Support multi-threaded reading for avro|
|[#5538](https://github.com/NVIDIA/spark-rapids/pull/5538)|Add tests for string to timestamp functions in ANSI mode|
|[#5546](https://github.com/NVIDIA/spark-rapids/pull/5546)|Set hasSideEffects correctly for GpuCreateMap|
|[#5529](https://github.com/NVIDIA/spark-rapids/pull/5529)|Fix failing bool agg test in Spark 3.3|
|[#5500](https://github.com/NVIDIA/spark-rapids/pull/5500)|Fallback parquet reading with merged schema and native footer reader|
|[#5534](https://github.com/NVIDIA/spark-rapids/pull/5534)|MVN_OPT to last, as it is empty in most cases|
|[#5523](https://github.com/NVIDIA/spark-rapids/pull/5523)|Enable forcePositionEvolution for 321cdh|
|[#5501](https://github.com/NVIDIA/spark-rapids/pull/5501)|Build against specified spark-rapids-jni snapshot jar [skip ci]|
|[#5489](https://github.com/NVIDIA/spark-rapids/pull/5489)|Fallback to the CPU if Parquet encryption keys are set|
|[#5527](https://github.com/NVIDIA/spark-rapids/pull/5527)|Fix bug with character class immediately following a string anchor|
|[#5506](https://github.com/NVIDIA/spark-rapids/pull/5506)|Fix ClassCastException in regular expression transpiler|
|[#5519](https://github.com/NVIDIA/spark-rapids/pull/5519)|Address feedback in "string anchors regexp replace" PR|
|[#5520](https://github.com/NVIDIA/spark-rapids/pull/5520)|[DOC] Remove Spark from our naming of Tools [skip ci]|
|[#5491](https://github.com/NVIDIA/spark-rapids/pull/5491)|Enables `$`, `\z`, and `\Z` in `REGEXP_REPLACE` on the GPU|
|[#5470](https://github.com/NVIDIA/spark-rapids/pull/5470)|Qualification tool support UI code generation|
|[#5353](https://github.com/NVIDIA/spark-rapids/pull/5353)|Supports casting between ANSI interval types and integral types|
|[#5487](https://github.com/NVIDIA/spark-rapids/pull/5487)|Add limited support for captured vars and athrow|
|[#5499](https://github.com/NVIDIA/spark-rapids/pull/5499)|[DOC]update doc for emr6.6[skip ci]|
|[#5485](https://github.com/NVIDIA/spark-rapids/pull/5485)|Add cudaStreamSynchronize when a new device buffer is added to the spill framework|
|[#5477](https://github.com/NVIDIA/spark-rapids/pull/5477)|Add support for `\h`, `\H`, `\v`, `\V`, and `\R` character classes|
|[#5490](https://github.com/NVIDIA/spark-rapids/pull/5490)|Qualification tool: Update speedup factor for few operators|
|[#5494](https://github.com/NVIDIA/spark-rapids/pull/5494)|Fix databrick Shim to support Ansi mode when casting from string to date|
|[#5498](https://github.com/NVIDIA/spark-rapids/pull/5498)|Enable 330 unit tests for nightly|
|[#5504](https://github.com/NVIDIA/spark-rapids/pull/5504)|Fix printing of split information when dumping debug data|
|[#5486](https://github.com/NVIDIA/spark-rapids/pull/5486)|Fix regression in AnsiCastOpSuite with Spark 3.3.0|
|[#5436](https://github.com/NVIDIA/spark-rapids/pull/5436)|Support `map_filter` operator|
|[#5471](https://github.com/NVIDIA/spark-rapids/pull/5471)|Add implicit `safeFree` for `RapidsBuffer`|
|[#5465](https://github.com/NVIDIA/spark-rapids/pull/5465)|Fix query planning issue when Iceberg is used with DPP and AQE|
|[#5459](https://github.com/NVIDIA/spark-rapids/pull/5459)|Add test cases for casting string to date in ANSI mode|
|[#5443](https://github.com/NVIDIA/spark-rapids/pull/5443)|Add support for regular expressions containing octal digits greater than `\200`|
|[#5468](https://github.com/NVIDIA/spark-rapids/pull/5468)|Qualification tool: Add support for join, pandas, aggregate execs|
|[#5473](https://github.com/NVIDIA/spark-rapids/pull/5473)|Remove hasNan check over array_contains|
|[#5434](https://github.com/NVIDIA/spark-rapids/pull/5434)|Check schema compatibility when building parquet readers|
|[#5442](https://github.com/NVIDIA/spark-rapids/pull/5442)|Add support for regular expressions containing hexadecimal digits greater than `0x7f`|
|[#5466](https://github.com/NVIDIA/spark-rapids/pull/5466)|[Doc] Change the picture of the query plan to text format. [skip ci]|
|[#5310](https://github.com/NVIDIA/spark-rapids/pull/5310)|Use C++ to parse and filter parquet footers.|
|[#5454](https://github.com/NVIDIA/spark-rapids/pull/5454)|QualificationTool. Add speedup information to AppSummaryInfo|
|[#5455](https://github.com/NVIDIA/spark-rapids/pull/5455)|Moved ShimCurrentBatchIterator so it's visible to db312 and db321|
|[#5354](https://github.com/NVIDIA/spark-rapids/pull/5354)|Plugin should throw same arithmetic exceptions as Spark part1|
|[#5440](https://github.com/NVIDIA/spark-rapids/pull/5440)|Qualification tool support for read and write execs and more, add mapping stage times to sql execs|
|[#5431](https://github.com/NVIDIA/spark-rapids/pull/5431)|[DOC] Update the ubuntu repo key [skip ci]|
|[#5425](https://github.com/NVIDIA/spark-rapids/pull/5425)|Handle readBatch changes for Spark 3.3.0|
|[#5438](https://github.com/NVIDIA/spark-rapids/pull/5438)|Add tests for all-null data for array_max|
|[#5428](https://github.com/NVIDIA/spark-rapids/pull/5428)|Make the sync marker uniform for the Avro coalescing reader|
|[#5432](https://github.com/NVIDIA/spark-rapids/pull/5432)|Test case insensitive reading for Parquet and CSV|
|[#5433](https://github.com/NVIDIA/spark-rapids/pull/5433)|[DOC] Removed mention of 30x from shims.md [skip ci]|
|[#5424](https://github.com/NVIDIA/spark-rapids/pull/5424)|Exclude all unicode line terminator characters from matching dot|
|[#5426](https://github.com/NVIDIA/spark-rapids/pull/5426)|Qualification tool: Parsing Execs to get the ExecInfo #2|
|[#5427](https://github.com/NVIDIA/spark-rapids/pull/5427)|Workaround to fix cuda repo key rotation in ubuntu images [skip ci]|
|[#5419](https://github.com/NVIDIA/spark-rapids/pull/5419)|Append my id to blossom-ci whitelist [skip ci]|
|[#5422](https://github.com/NVIDIA/spark-rapids/pull/5422)|xfail tests for spark 3.3.0 due to changes in readBatch|
|[#5420](https://github.com/NVIDIA/spark-rapids/pull/5420)|Qualification tool: Parsing Execs to get the ExecInfo #1 |
|[#5418](https://github.com/NVIDIA/spark-rapids/pull/5418)|Add GpuEqualToNoNans and update GpuPivotFirst to use to handle PivotFirst with NaN support enabled on GPU|
|[#5306](https://github.com/NVIDIA/spark-rapids/pull/5306)|Support coalescing reading for avro|
|[#5410](https://github.com/NVIDIA/spark-rapids/pull/5410)|Update docs for removal of 311cdh|
|[#5414](https://github.com/NVIDIA/spark-rapids/pull/5414)|Add 320+-noncdh to Databricks to fix 321db build|
|[#5349](https://github.com/NVIDIA/spark-rapids/pull/5349)|Enable some repetitions for `\A` and `\Z`|
|[#5346](https://github.com/NVIDIA/spark-rapids/pull/5346)|ADD 321cdh shim to rapids and remove 311cdh shim|
|[#5408](https://github.com/NVIDIA/spark-rapids/pull/5408)|[DOC] Add rebase mode notes for databricks doc [skip ci]|
|[#5348](https://github.com/NVIDIA/spark-rapids/pull/5348)|Qualification tool: Skip GPU event logs|
|[#5400](https://github.com/NVIDIA/spark-rapids/pull/5400)|Restore test_computation_in_grpby_columns and test_struct_self_join|
|[#5399](https://github.com/NVIDIA/spark-rapids/pull/5399)|Update New Issue template to recommend a Discussion or Question [skip ci]|
|[#5293](https://github.com/NVIDIA/spark-rapids/pull/5293)|Support array_repeat|
|[#5359](https://github.com/NVIDIA/spark-rapids/pull/5359)|Qualification tool base plan parsing infrastructure|
|[#5360](https://github.com/NVIDIA/spark-rapids/pull/5360)|Revert "skip failing tests for Spark 3.3.0 (#5313)"|
|[#5326](https://github.com/NVIDIA/spark-rapids/pull/5326)|Update GCP doc and scripts [skip ci]|
|[#5352](https://github.com/NVIDIA/spark-rapids/pull/5352)|Fix spark330 build due to mapKeyNotExistError changed|
|[#5317](https://github.com/NVIDIA/spark-rapids/pull/5317)|Support arrays_zip|
|[#5316](https://github.com/NVIDIA/spark-rapids/pull/5316)|Support ANSI mode for `ToUnixTimestamp, UnixTimestamp, GetTimestamp, DateAddInterval`|
|[#5319](https://github.com/NVIDIA/spark-rapids/pull/5319)|Re-enable support for `\Z` in regular expressions on the GPU|
|[#5315](https://github.com/NVIDIA/spark-rapids/pull/5315)|Simplify conditional catalyst expressions generated by udf-compiler|
|[#5301](https://github.com/NVIDIA/spark-rapids/pull/5301)|Support existence join type for broadcast nested loop join|
|[#5313](https://github.com/NVIDIA/spark-rapids/pull/5313)|skip failing tests for Spark 3.3.0|
|[#5311](https://github.com/NVIDIA/spark-rapids/pull/5311)|Add information about the discussion board to the README and FAQ [skip ci]|
|[#5308](https://github.com/NVIDIA/spark-rapids/pull/5308)|Remove unused ColumnViewUtil|
|[#5289](https://github.com/NVIDIA/spark-rapids/pull/5289)|Re-enable dollar ($) line anchor in regular expressions in find mode |
|[#5274](https://github.com/NVIDIA/spark-rapids/pull/5274)|Perform explicit UnsafeRow projection in ColumnarToRow transition|
|[#5297](https://github.com/NVIDIA/spark-rapids/pull/5297)|GpuStringSplit now honors the`spark.rapids.sql.regexp.enabled` configuration option|
|[#5307](https://github.com/NVIDIA/spark-rapids/pull/5307)|Remove compatibility guide reference to issue #4060|
|[#5298](https://github.com/NVIDIA/spark-rapids/pull/5298)|Qualification tool: Operator mapping from plugin to CSV file|
|[#5266](https://github.com/NVIDIA/spark-rapids/pull/5266)|Update Outdated GCP getting started guide[skip ci]|
|[#5300](https://github.com/NVIDIA/spark-rapids/pull/5300)|Fix DIST_JAR PATH in coverage-report [skip ci]|
|[#5290](https://github.com/NVIDIA/spark-rapids/pull/5290)|Add documentation about reporting security issues [skip ci]|
|[#5277](https://github.com/NVIDIA/spark-rapids/pull/5277)|Support multiple datatypes in `TypeSig.withPsNote()`|
|[#5296](https://github.com/NVIDIA/spark-rapids/pull/5296)|Fix spark330 build due to removal of isElementAt parameter from mapKeyNotExistError|
|[#5291](https://github.com/NVIDIA/spark-rapids/pull/5291)|fix dead links in shims.md [skip ci]|
|[#5276](https://github.com/NVIDIA/spark-rapids/pull/5276)|fix markdown check issue[skip ci]|
|[#5270](https://github.com/NVIDIA/spark-rapids/pull/5270)|Include dependency of common jar in tools jar|
|[#5265](https://github.com/NVIDIA/spark-rapids/pull/5265)|Remove unused generic types|
|[#5288](https://github.com/NVIDIA/spark-rapids/pull/5288)|Temporarily xfail tests to restore premerge builds|
|[#5287](https://github.com/NVIDIA/spark-rapids/pull/5287)|Fix nightly scripts to deploy w/ classifier correctly [skip ci]|
|[#5134](https://github.com/NVIDIA/spark-rapids/pull/5134)|Support division on ANSI interval types|
|[#5279](https://github.com/NVIDIA/spark-rapids/pull/5279)|Add test case for ANSI pmod and ANSI Remainder|
|[#5284](https://github.com/NVIDIA/spark-rapids/pull/5284)|Enable support for escaping the right square bracket|
|[#5280](https://github.com/NVIDIA/spark-rapids/pull/5280)|[BUG] Fix incorrect plugin nightly deployment and release [skip ci]|
|[#5249](https://github.com/NVIDIA/spark-rapids/pull/5249)|Use a bundled spark-rapids-jni dependency instead of external cudf dependency|
|[#5268](https://github.com/NVIDIA/spark-rapids/pull/5268)|[BUG] When ASYNC is enabled GDS needs to handle cudaMalloced bounce buffers|
|[#5230](https://github.com/NVIDIA/spark-rapids/pull/5230)|Update csv float tests to reflect changes in precision in cuDF|
|[#5001](https://github.com/NVIDIA/spark-rapids/pull/5001)|Add fuzzing test for JSON reader|
|[#5155](https://github.com/NVIDIA/spark-rapids/pull/5155)|Support casting between day-time interval and string|
|[#5247](https://github.com/NVIDIA/spark-rapids/pull/5247)|Fix test failure caused by change in Spark 3.3 exception|
|[#5254](https://github.com/NVIDIA/spark-rapids/pull/5254)|Fix the integration test of collect_list_reduction|
|[#5243](https://github.com/NVIDIA/spark-rapids/pull/5243)|Throw again after logging that RMM could not intialize|
|[#5105](https://github.com/NVIDIA/spark-rapids/pull/5105)|Support multiplication on ANSI interval types|
|[#5171](https://github.com/NVIDIA/spark-rapids/pull/5171)|Fix the bug COALESCING reading does not work for v2 parquet/orc datasource|
|[#5157](https://github.com/NVIDIA/spark-rapids/pull/5157)|Update the log warning of UDF compiler|
|[#5213](https://github.com/NVIDIA/spark-rapids/pull/5213)|Support sample on ANSI interval types|
|[#5218](https://github.com/NVIDIA/spark-rapids/pull/5218)|XFAIL tests that are failing due to issue 5211|
|[#5202](https://github.com/NVIDIA/spark-rapids/pull/5202)|Profiling tool: Remove gettingResultTime from stages & jobs aggregation|
|[#5201](https://github.com/NVIDIA/spark-rapids/pull/5201)|Fix merge conflict from branch-22.04|
|[#5195](https://github.com/NVIDIA/spark-rapids/pull/5195)|Refactor Spark33XShims to avoid code duplication|
|[#5185](https://github.com/NVIDIA/spark-rapids/pull/5185)|Fix test failure with Spark 3.3 by looking for less specific error message|
|[#4992](https://github.com/NVIDIA/spark-rapids/pull/4992)|Support Collect-like Reduction Aggregations|
|[#5193](https://github.com/NVIDIA/spark-rapids/pull/5193)|Fix auto merge conflict 5192 [skip ci]|
|[#5020](https://github.com/NVIDIA/spark-rapids/pull/5020)|Support arithmetic operators on ANSI interval types|
|[#5174](https://github.com/NVIDIA/spark-rapids/pull/5174)|Fix auto merge conflict 5173 [skip ci]|
|[#5168](https://github.com/NVIDIA/spark-rapids/pull/5168)|Fix auto merge conflict 5166|
|[#5151](https://github.com/NVIDIA/spark-rapids/pull/5151)|Remove NvcompLZ4CompressionCodec single-buffer APIs|
|[#5132](https://github.com/NVIDIA/spark-rapids/pull/5132)|Add  `count` support for all types|
|[#5141](https://github.com/NVIDIA/spark-rapids/pull/5141)|Upgrade to UCX 1.12.1 for 22.06|
|[#5143](https://github.com/NVIDIA/spark-rapids/pull/5143)|Fix merge conflict with branch-22.04|
|[#5144](https://github.com/NVIDIA/spark-rapids/pull/5144)|Adapt to storage-partitioned join additions in SPARK-37377|
|[#5139](https://github.com/NVIDIA/spark-rapids/pull/5139)|Make mvn-verify check name more descriptive [skip ci]|
|[#5136](https://github.com/NVIDIA/spark-rapids/pull/5136)|Fix GpuRegExExtract about inconsistent to Spark |
|[#5107](https://github.com/NVIDIA/spark-rapids/pull/5107)|Fix GpuFileFormatDataWriter failing to stat file after commit|
|[#5124](https://github.com/NVIDIA/spark-rapids/pull/5124)|Fix ShimVectorizedColumnReader construction for recent Spark 3.3.0 changes|
|[#5047](https://github.com/NVIDIA/spark-rapids/pull/5047)|Change Cast.toString as "cast" instead of "ansi_cast" under ANSI mode|
|[#5089](https://github.com/NVIDIA/spark-rapids/pull/5089)|Enable regular expressions containing `\s` and `\S`|
|[#5087](https://github.com/NVIDIA/spark-rapids/pull/5087)|Add support for regexp_replace with back-references|
|[#5110](https://github.com/NVIDIA/spark-rapids/pull/5110)|Appending my id (mattahrens) to the blossom-ci whitelist [skip ci]|
|[#5090](https://github.com/NVIDIA/spark-rapids/pull/5090)|Add nvtx ranges around pre, agg, and post steps in hash aggregate|
|[#5092](https://github.com/NVIDIA/spark-rapids/pull/5092)|Remove single-buffer compression codec APIs|
|[#5093](https://github.com/NVIDIA/spark-rapids/pull/5093)|Fix leak when GDS buffer store closes|
|[#5067](https://github.com/NVIDIA/spark-rapids/pull/5067)|Premerge databricks CI autotrigger [skip ci]|
|[#5083](https://github.com/NVIDIA/spark-rapids/pull/5083)|Remove EMRShimVersion|
|[#5076](https://github.com/NVIDIA/spark-rapids/pull/5076)|Unshim cache serializer and other 311+-all code|
|[#5074](https://github.com/NVIDIA/spark-rapids/pull/5074)|Make ASYNC the default allocator for 22.06|
|[#5073](https://github.com/NVIDIA/spark-rapids/pull/5073)|Add in nvtx ranges for parquet filterBlocks|
|[#5077](https://github.com/NVIDIA/spark-rapids/pull/5077)|Change Scala style continuation indentation to be 2 spaces to match guide [skip ci]|
|[#5070](https://github.com/NVIDIA/spark-rapids/pull/5070)|Fix merge from 22.04 to 22.06|
|[#5046](https://github.com/NVIDIA/spark-rapids/pull/5046)|Init 22.06.0-SNAPSHOT|
|[#5059](https://github.com/NVIDIA/spark-rapids/pull/5059)|Fix merge from 22.04 to 22.06|
|[#5036](https://github.com/NVIDIA/spark-rapids/pull/5036)|Unshim many expressions|
|[#4993](https://github.com/NVIDIA/spark-rapids/pull/4993)|PCBS and Parquet support ANSI year month interval type|
|[#5031](https://github.com/NVIDIA/spark-rapids/pull/5031)|Unshim many SparkShim interfaces|
|[#5027](https://github.com/NVIDIA/spark-rapids/pull/5027)|Fix merge of branch-22.04 to branch-22.06|
|[#5022](https://github.com/NVIDIA/spark-rapids/pull/5022)|Unshim many Pandas execs|
|[#5013](https://github.com/NVIDIA/spark-rapids/pull/5013)|Unshim GpuRowBasedScalaUDF|
|[#5012](https://github.com/NVIDIA/spark-rapids/pull/5012)|Unshim GpuOrcScan and GpuParquetScan|
|[#5010](https://github.com/NVIDIA/spark-rapids/pull/5010)|Unshim GpuSumDefaults|
|[#5007](https://github.com/NVIDIA/spark-rapids/pull/5007)|Remove schema utils, case class copying, file partition, and legacy statistical aggregate shims|
|[#4999](https://github.com/NVIDIA/spark-rapids/pull/4999)|Enable automerge from branch-22.04 to branch-22.06 [skip ci]|

## Release 22.04

### Features
|||
|:---|:---|
|[#4734](https://github.com/NVIDIA/spark-rapids/issues/4734)|[FEA] Support approx_percentile in reduction context|
|[#1922](https://github.com/NVIDIA/spark-rapids/issues/1922)|[FEA] Support ORC forced positional evolution|
|[#123](https://github.com/NVIDIA/spark-rapids/issues/123)|[FEA] add in support for dayfirst formats in the CSV parser|
|[#4863](https://github.com/NVIDIA/spark-rapids/issues/4863)|[FEA] Improve timestamp support in JSON and CSV readers|
|[#4935](https://github.com/NVIDIA/spark-rapids/issues/4935)|[FEA] Support reading Avro: primitive types|
|[#4915](https://github.com/NVIDIA/spark-rapids/issues/4915)|[FEA] Drop support for Spark 3.0.1, 3.0.2, 3.0.3, Databricks 7.3 ML LTS|
|[#4815](https://github.com/NVIDIA/spark-rapids/issues/4815)|[FEA] Support org.apache.spark.sql.catalyst.expressions.ArrayExists|
|[#3245](https://github.com/NVIDIA/spark-rapids/issues/3245)|[FEA] GpuGetMapValue should support all valid value data types and non-complex key types|
|[#4914](https://github.com/NVIDIA/spark-rapids/issues/4914)|[FEA] Support for Databricks 10.4 ML LTS|
|[#4945](https://github.com/NVIDIA/spark-rapids/issues/4945)|[FEA] Support filter and comparisons on ANSI day time interval type|
|[#4004](https://github.com/NVIDIA/spark-rapids/issues/4004)|[FEA] Add support for percent_rank|
|[#1111](https://github.com/NVIDIA/spark-rapids/issues/1111)|[FEA] support `spark.sql.legacy.timeParserPolicy` when parsing CSV files|
|[#4849](https://github.com/NVIDIA/spark-rapids/issues/4849)|[FEA] Support parsing dates in JSON reader|
|[#4789](https://github.com/NVIDIA/spark-rapids/issues/4789)|[FEA] Add Spark 3.1.4 shim|
|[#4646](https://github.com/NVIDIA/spark-rapids/issues/4646)|[FEA] Make JSON parsing of `NaN` and `Infinity` values fully compatible with Spark|
|[#4824](https://github.com/NVIDIA/spark-rapids/issues/4824)|[FEA] Support reading decimals from JSON and CSV|
|[#4814](https://github.com/NVIDIA/spark-rapids/issues/4814)|[FEA] Support element_at with non-literal index|
|[#4816](https://github.com/NVIDIA/spark-rapids/issues/4816)|[FEA] Support org.apache.spark.sql.catalyst.expressions.GetArrayStructFields|
|[#3542](https://github.com/NVIDIA/spark-rapids/issues/3542)|[FEA] Support str_to_map function|
|[#4721](https://github.com/NVIDIA/spark-rapids/issues/4721)|[FEA] Support regular expression delimiters for `str_to_map`|
|[#4791](https://github.com/NVIDIA/spark-rapids/issues/4791)|Update Spark 3.1.3 to be released|
|[#4712](https://github.com/NVIDIA/spark-rapids/issues/4712)|[FEA] Allow <WindowExec> to partition on Decimal 128 when running on the GPU|
|[#4762](https://github.com/NVIDIA/spark-rapids/issues/4762)|[FEA] Improve support for reading JSON integer types|
|[#4696](https://github.com/NVIDIA/spark-rapids/issues/4696)|[FEA] Support casting map to string|
|[#1572](https://github.com/NVIDIA/spark-rapids/issues/1572)|[FEA] Add in decimal support for pmod, remainder and divide|
|[#4763](https://github.com/NVIDIA/spark-rapids/issues/4763)|[FEA] Improve support for reading JSON boolean types|
|[#4003](https://github.com/NVIDIA/spark-rapids/issues/4003)|[FEA] Add regular expression support to GPU implementation of StringSplit|
|[#4626](https://github.com/NVIDIA/spark-rapids/issues/4626)|[FEA] <WindowExec> cannot run on GPU because unsupported data types in 'partitionSpec'|
|[#33](https://github.com/NVIDIA/spark-rapids/issues/33)|[FEA] hypot SQL function|
|[#4515](https://github.com/NVIDIA/spark-rapids/issues/4515)|[FEA] Set RMM async allocator as default|

### Performance
|||
|:---|:---|
|[#3026](https://github.com/NVIDIA/spark-rapids/issues/3026)|[FEA] [Audit]: Set the list of read columns in the task configuration to reduce reading of ORC data|
|[#4895](https://github.com/NVIDIA/spark-rapids/issues/4895)|Add support for structs in GpuScalarSubquery |
|[#4393](https://github.com/NVIDIA/spark-rapids/issues/4393)|[BUG] Columnar to Columnar transfers are very slow|
|[#589](https://github.com/NVIDIA/spark-rapids/issues/589)|[FEA] Support ExistenceJoin|
|[#4784](https://github.com/NVIDIA/spark-rapids/issues/4784)|[FEA] Improve copying decimal data from CPU columnar data |
|[#4685](https://github.com/NVIDIA/spark-rapids/issues/4685)|[FEA] Avoid regexp cost in string_split for escaped characters|
|[#4777](https://github.com/NVIDIA/spark-rapids/issues/4777)|Remove input upcast in GpuExtractChunk32|
|[#4722](https://github.com/NVIDIA/spark-rapids/issues/4722)|Optimize DECIMAL128 average aggregations|
|[#4645](https://github.com/NVIDIA/spark-rapids/issues/4645)|[FEA] Investigate ASYNC allocator performance with additional queries|
|[#4539](https://github.com/NVIDIA/spark-rapids/issues/4539)|[FEA] semaphore optimization in shuffled hash join|
|[#2441](https://github.com/NVIDIA/spark-rapids/issues/2441)|[FEA] Use AST for filter in join APIs|

### Bugs Fixed
|||
|:---|:---|
|[#5233](https://github.com/NVIDIA/spark-rapids/issues/5233)|[BUG] rapids-tools v22.04.0 release jar reports maven dependency issue :  rapids-4-spark-common_2.12:jar:22.04.0 NOT FOUND|
|[#5183](https://github.com/NVIDIA/spark-rapids/issues/5183)|[BUG] UCX EGX integration test array_test.py::test_array_exists failures|
|[#5180](https://github.com/NVIDIA/spark-rapids/issues/5180)|[BUG] create_map failed with java.lang.IllegalStateException: This is not supported yet|
|[#5181](https://github.com/NVIDIA/spark-rapids/issues/5181)|[BUG] Dataproc tests failing when trying to detect for accelerated row conversions|
|[#5154](https://github.com/NVIDIA/spark-rapids/issues/5154)|[BUG] build failed in databricks 10.4 runtime (updated recently)|
|[#5159](https://github.com/NVIDIA/spark-rapids/issues/5159)|[BUG] Approx percentile query fails with UnsupportedOperationException|
|[#5164](https://github.com/NVIDIA/spark-rapids/issues/5164)|[BUG] Databricks 9.1ML failed with "java.lang.NoSuchMethodError: org.apache.spark.sql.execution.metric.SQLMetrics$.createSizeMetric"|
|[#5125](https://github.com/NVIDIA/spark-rapids/issues/5125)|[BUG] GpuCast.hasSideEffects does not check if child expression has side effects|
|[#5091](https://github.com/NVIDIA/spark-rapids/issues/5091)|[BUG] Profiling tool fails process custom task accumulators of type CollectionAccumulator|
|[#5050](https://github.com/NVIDIA/spark-rapids/issues/5050)|[BUG] Release build of v22.04.0 FAILED on "Execution attach-javadoc failed: NullPointerException" with maven option '-P source-javadoc'|
|[#5035](https://github.com/NVIDIA/spark-rapids/issues/5035)|[BUG] Different CSV parsing behavior between 22.04 and 22.02|
|[#5065](https://github.com/NVIDIA/spark-rapids/issues/5065)|[BUG] spark330+ build error due to SPARK-37463|
|[#5019](https://github.com/NVIDIA/spark-rapids/issues/5019)|[BUG] udf compiler failed to translate UDF in spark-shell |
|[#5048](https://github.com/NVIDIA/spark-rapids/issues/5048)|[BUG] OOM for q18 of TPC-DS benchmark testing on Spark2a|
|[#5038](https://github.com/NVIDIA/spark-rapids/issues/5038)|[BUG] When spark.rapids.sql.regexp.enabled is on in 22.04 snapshot jars, Reading a Delta table in Databricks may cause driver error|
|[#5023](https://github.com/NVIDIA/spark-rapids/issues/5023)|[BUG] When+sequence could trigger "Illegal sequence boundaries" error|
|[#5021](https://github.com/NVIDIA/spark-rapids/issues/5021)|[BUG] test_cache_reverse_order failed|
|[#5003](https://github.com/NVIDIA/spark-rapids/issues/5003)|[BUG] Cloudera 3.1.1 tests fail due to ClouderaShimVersion|
|[#4960](https://github.com/NVIDIA/spark-rapids/issues/4960)|[BUG] Spark 3.3 IT cache_test:test_passing_gpuExpr_as_Expr failure|
|[#4913](https://github.com/NVIDIA/spark-rapids/issues/4913)|[BUG] Fall back to the CPU if we see a scale on Ceil or Floor|
|[#4806](https://github.com/NVIDIA/spark-rapids/issues/4806)|[BUG] When running xgboost training, if PCBS is enabled, it fails with java.lang.AssertionError|
|[#4542](https://github.com/NVIDIA/spark-rapids/issues/4542)|[BUG] test_write_round_trip failed Maximum pool size exceeded |
|[#4911](https://github.com/NVIDIA/spark-rapids/issues/4911)|[BUG][Audit] [SPARK-38314] - Fail to read parquet files after writing the hidden file metadata|
|[#4936](https://github.com/NVIDIA/spark-rapids/issues/4936)|[BUG] databricks nightly window_function_test failures|
|[#4931](https://github.com/NVIDIA/spark-rapids/issues/4931)|[BUG] Spark 3.3 IT test cache_test.py::test_passing_gpuExpr_as_Expr  fails with IllegalArgumentException|
|[#4710](https://github.com/NVIDIA/spark-rapids/issues/4710)|[BUG] cudaErrorIllegalAddress for q95 (3TB) on GCP with ASYNC allocator|
|[#4918](https://github.com/NVIDIA/spark-rapids/issues/4918)|[BUG] databricks nightly build failed|
|[#4826](https://github.com/NVIDIA/spark-rapids/issues/4826)|[BUG] cache_test failures when testing with 128-bit decimal|
|[#4855](https://github.com/NVIDIA/spark-rapids/issues/4855)|[BUG] Shim tests in sql-plugin module are not running|
|[#4487](https://github.com/NVIDIA/spark-rapids/issues/4487)|[BUG] regexp_find hangs with some patterns|
|[#4486](https://github.com/NVIDIA/spark-rapids/issues/4486)|[BUG] Regular expressions with hex digits not working as expected|
|[#4879](https://github.com/NVIDIA/spark-rapids/issues/4879)|[BUG] [SPARK-38237][SQL] ClusteredDistribution clustering keys break build with wrong arguments|
|[#4883](https://github.com/NVIDIA/spark-rapids/issues/4883)|[BUG] row-based_udf_test.py::test_hive_empty_* fail nightly tests|
|[#4876](https://github.com/NVIDIA/spark-rapids/issues/4876)|[BUG] Nightly build failed on Databricks with "pip: No such file or directory"|
|[#4739](https://github.com/NVIDIA/spark-rapids/issues/4739)|[BUG] Plugin will crash with query > 100 columns on pascal GPU|
|[#4840](https://github.com/NVIDIA/spark-rapids/issues/4840)|[BUG] test_dpp_via_aggregate_subquery_aqe_off failed with table already exists|
|[#4841](https://github.com/NVIDIA/spark-rapids/issues/4841)|[BUG] test_compress_write_round_trip failed on Spark 3.3|
|[#4668](https://github.com/NVIDIA/spark-rapids/issues/4668)|[FEA][Audit] - [SPARK-37750][SQL] ANSI mode: optionally return null result if element not exists in array/map|
|[#3971](https://github.com/NVIDIA/spark-rapids/issues/3971)|[BUG] udf-examples dependencies are incorrect|
|[#4022](https://github.com/NVIDIA/spark-rapids/issues/4022)|[BUG] Ensure shims.v2.ParquetCachedBatchSerializer and similar classes are at most package-private  |
|[#4526](https://github.com/NVIDIA/spark-rapids/issues/4526)|[BUG] Short circuit AND/OR in ANSI mode|
|[#4787](https://github.com/NVIDIA/spark-rapids/issues/4787)|[BUG] Dataproc notebook IT test failure - NoSuchMethodError: org.apache.spark.network.util.ByteUnit.toBytes|
|[#4704](https://github.com/NVIDIA/spark-rapids/issues/4704)|[BUG] Update the premerge and nightly tests after moving the UDF example to external repository|
|[#4795](https://github.com/NVIDIA/spark-rapids/issues/4795)|[BUG] Read ORC does not ignoreCorruptFiles|
|[#4802](https://github.com/NVIDIA/spark-rapids/issues/4802)|[BUG] GPU CSV read does not honor ignoreCorruptFiles or ignoreMissingFiles|
|[#4803](https://github.com/NVIDIA/spark-rapids/issues/4803)|[BUG] GPU JSON read does not honor ignoreCorruptFiles or ignoreMissingFiles|
|[#1986](https://github.com/NVIDIA/spark-rapids/issues/1986)|[BUG] CSV reading null inconsistent between spark.rapids.sql.format.csv.enabled=true&false|
|[#126](https://github.com/NVIDIA/spark-rapids/issues/126)|[BUG] CSV parsing large number values overflow|
|[#4759](https://github.com/NVIDIA/spark-rapids/issues/4759)|[BUG] Profiling tool can miss datasources when they are GPU reads|
|[#4798](https://github.com/NVIDIA/spark-rapids/issues/4798)|[BUG] Integration test builds failing with worker_id not found|
|[#4727](https://github.com/NVIDIA/spark-rapids/issues/4727)|[BUG] Read Parquet does not ignoreCorruptFiles|
|[#4744](https://github.com/NVIDIA/spark-rapids/issues/4744)|[BUG] test_groupby_std_variance_partial_replace_fallback failed|
|[#4761](https://github.com/NVIDIA/spark-rapids/issues/4761)|[BUG] test_simple_partitioned_read failed on Spark 3.3|
|[#2071](https://github.com/NVIDIA/spark-rapids/issues/2071)|[BUG] parsing invalid boolean CSV values return true instead of null|
|[#4749](https://github.com/NVIDIA/spark-rapids/issues/4749)|[BUG] test_write_empty_parquet_round_trip failed|
|[#4730](https://github.com/NVIDIA/spark-rapids/issues/4730)|[BUG] python UDF tests are leaking|
|[#4290](https://github.com/NVIDIA/spark-rapids/issues/4290)|[BUG] Investigate q32 and q67 for decimals potential regression|
|[#4409](https://github.com/NVIDIA/spark-rapids/issues/4409)|[BUG] Possible race condition in regular expression support for octal digits|
|[#4728](https://github.com/NVIDIA/spark-rapids/issues/4728)|[BUG] test_mixed_compress_read orc_test.py failures|
|[#4736](https://github.com/NVIDIA/spark-rapids/issues/4736)|[BUG] buildall --profile=321 fails on missing spark301 rapids-4-spark-sql dependency |
|[#4702](https://github.com/NVIDIA/spark-rapids/issues/4702)|[BUG] cache_test.py failed w/ cache.serializer in spark 3.3.0|
|[#4031](https://github.com/NVIDIA/spark-rapids/issues/4031)|[BUG] Spark 3.3.0 test failure: NoSuchMethodError org.apache.orc.TypeDescription.getAttributeValue|
|[#4664](https://github.com/NVIDIA/spark-rapids/issues/4664)|[BUG] MortgageAdaptiveSparkSuite failed with duplicate buffer exception|
|[#4564](https://github.com/NVIDIA/spark-rapids/issues/4564)|[BUG] map_test ansi failed in spark330|
|[#119](https://github.com/NVIDIA/spark-rapids/issues/119)|[BUG] LIKE does not work if null chars are in the string|
|[#124](https://github.com/NVIDIA/spark-rapids/issues/124)|[BUG] CSV/JSON Parsing some float values results in overflow|
|[#4045](https://github.com/NVIDIA/spark-rapids/issues/4045)|[BUG] q93 failed in this week's NDS runs|
|[#4488](https://github.com/NVIDIA/spark-rapids/issues/4488)|[BUG] isCastingStringToNegDecimalScaleSupported seems set wrong for some Spark versions|

### PRs
|||
|:---|:---|
|[#5251](https://github.com/NVIDIA/spark-rapids/pull/5251)|Update 22.04 changelog to latest [skip ci]|
|[#5232](https://github.com/NVIDIA/spark-rapids/pull/5232)|Fix issue in GpuArrayExists where a parent view outlived the child|
|[#5239](https://github.com/NVIDIA/spark-rapids/pull/5239)|Fix tools depending on the common jar|
|[#5205](https://github.com/NVIDIA/spark-rapids/pull/5205)|Update 22.04 changelog to latest [skip ci]|
|[#5190](https://github.com/NVIDIA/spark-rapids/pull/5190)|Fix column->row conversion GPU check:|
|[#5184](https://github.com/NVIDIA/spark-rapids/pull/5184)|Fix CPU fallback for Map lookup|
|[#5191](https://github.com/NVIDIA/spark-rapids/pull/5191)|Update version-def to use released cudfjni 22.04.0 [skip ci]|
|[#5167](https://github.com/NVIDIA/spark-rapids/pull/5167)|Update cudfjni version to released 22.04.0|
|[#5169](https://github.com/NVIDIA/spark-rapids/pull/5169)|Terminate test earlier if pytest ENV issue [skip ci]|
|[#5160](https://github.com/NVIDIA/spark-rapids/pull/5160)|Fix approximate percentile reduction UnsupportedOperationException|
|[#5165](https://github.com/NVIDIA/spark-rapids/pull/5165)|Update Databricks 10.4 for changes to the QueryStageExec and ClusteredDistribution|
|[#4997](https://github.com/NVIDIA/spark-rapids/pull/4997)|Update docs for the 22.04 release[skip ci]|
|[#5146](https://github.com/NVIDIA/spark-rapids/pull/5146)|Support env var INTEGRATION_TEST_VERSION to override shim version|
|[#5103](https://github.com/NVIDIA/spark-rapids/pull/5103)|Init 22.04 changelog [skip ci]|
|[#5122](https://github.com/NVIDIA/spark-rapids/pull/5122)|Disable GPU accelerated row-column transpose for Pascal GPUs:|
|[#5127](https://github.com/NVIDIA/spark-rapids/pull/5127)|GpuCast.hasSideEffects now checks to see if the child expression has side-effects|
|[#5118](https://github.com/NVIDIA/spark-rapids/pull/5118)|On task failure catch some CUDA exceptions and kill executor|
|[#5069](https://github.com/NVIDIA/spark-rapids/pull/5069)|Update for the public release [skip ci]|
|[#5097](https://github.com/NVIDIA/spark-rapids/pull/5097)|Implement hasSideEffects for GpuGetArrayItem, GpuElementAt, GpuGetMapValue, GpuUnaryMinus, and GpuAbs|
|[#5079](https://github.com/NVIDIA/spark-rapids/pull/5079)|Disable spark snapshot shims pre-merge build in 22.04|
|[#5094](https://github.com/NVIDIA/spark-rapids/pull/5094)|Fix profiling tool reading collectionAccumulator|
|[#5078](https://github.com/NVIDIA/spark-rapids/pull/5078)|Disable JSON and CSV floating-point reads by default|
|[#4961](https://github.com/NVIDIA/spark-rapids/pull/4961)|Support approx_percentile in reduction context|
|[#5062](https://github.com/NVIDIA/spark-rapids/pull/5062)|Update Spark 2.x explain API with changes in 22.04|
|[#5066](https://github.com/NVIDIA/spark-rapids/pull/5066)|Add getOrcSchemaString for OrcShims|
|[#5030](https://github.com/NVIDIA/spark-rapids/pull/5030)|Fix regression from 21.12 where udfs defined in repl no longer worked|
|[#5051](https://github.com/NVIDIA/spark-rapids/pull/5051)|Revert "Replace ParquetFileReader.readFooter with open() and getFooter "|
|[#5052](https://github.com/NVIDIA/spark-rapids/pull/5052)|Work around incompatibility between Databricks Delta loads and GpuRegExpExtract|
|[#4972](https://github.com/NVIDIA/spark-rapids/pull/4972)|Add support for ORC forced positional evolution|
|[#5042](https://github.com/NVIDIA/spark-rapids/pull/5042)|Implement hasSideEffects for GpuSequence|
|[#5040](https://github.com/NVIDIA/spark-rapids/pull/5040)|Fix missing imports for 321db shim|
|[#5033](https://github.com/NVIDIA/spark-rapids/pull/5033)|Removed limit from the test|
|[#4938](https://github.com/NVIDIA/spark-rapids/pull/4938)|Improve compatibility when reading timestamps from JSON and CSV sources|
|[#5026](https://github.com/NVIDIA/spark-rapids/pull/5026)|Update RoCE doc URL [skip ci]|
|[#4976](https://github.com/NVIDIA/spark-rapids/pull/4976)|Replace ParquetFileReader.readFooter with open() and getFooter|
|[#4989](https://github.com/NVIDIA/spark-rapids/pull/4989)|Use conf.useCompression config to decide if we should be compressing the cache|
|[#4956](https://github.com/NVIDIA/spark-rapids/pull/4956)|Add avro reader support|
|[#5009](https://github.com/NVIDIA/spark-rapids/pull/5009)|Remove references of `shims` folder in docs [skip ci]|
|[#5004](https://github.com/NVIDIA/spark-rapids/pull/5004)|Add ClouderaShimVersion to unshimmed files|
|[#4971](https://github.com/NVIDIA/spark-rapids/pull/4971)|Fall back to the CPU for non-zero scale on Ceil or Floor functions|
|[#4996](https://github.com/NVIDIA/spark-rapids/pull/4996)|Fix collect_set on struct type|
|[#4998](https://github.com/NVIDIA/spark-rapids/pull/4998)|Added the id back for struct children to make them unique|
|[#4995](https://github.com/NVIDIA/spark-rapids/pull/4995)|Include 321db shim in distribution build [skip ci]|
|[#4981](https://github.com/NVIDIA/spark-rapids/pull/4981)|Update doc for CSV reading interval|
|[#4973](https://github.com/NVIDIA/spark-rapids/pull/4973)|Implement support for ArrayExists expression|
|[#4988](https://github.com/NVIDIA/spark-rapids/pull/4988)|Remove support for Spark 3.0.x|
|[#4955](https://github.com/NVIDIA/spark-rapids/pull/4955)|Add UDT support to ParquetCachedBatchSerializer (CPU)|
|[#4994](https://github.com/NVIDIA/spark-rapids/pull/4994)|Add databricks 10.4 build in pre-merge|
|[#4990](https://github.com/NVIDIA/spark-rapids/pull/4990)|Remove 30X permerge support for version 22.04 and above [skip ci]|
|[#4958](https://github.com/NVIDIA/spark-rapids/pull/4958)|Add independent mvn verify check [skip ci]|
|[#4933](https://github.com/NVIDIA/spark-rapids/pull/4933)|Set OrcConf.INCLUDE_COLUMNS for ORC reading|
|[#4944](https://github.com/NVIDIA/spark-rapids/pull/4944)|Support for non-string key-types for `GetMapValue` and `element_at()`|
|[#4974](https://github.com/NVIDIA/spark-rapids/pull/4974)|Add shim for Databricks 10.4|
|[#4907](https://github.com/NVIDIA/spark-rapids/pull/4907)|Add markdown check action|
|[#4977](https://github.com/NVIDIA/spark-rapids/pull/4977)|Add missing 314 to buildall script|
|[#4927](https://github.com/NVIDIA/spark-rapids/pull/4927)|Support reading ANSI day time interval type from CSV source|
|[#4965](https://github.com/NVIDIA/spark-rapids/pull/4965)|Documentation: add example python api call for ExplainPlan.explainPotentialGpuPlan [skip ci]|
|[#4957](https://github.com/NVIDIA/spark-rapids/pull/4957)|Document agg pushdown on ORC file limitation [skip ci]|
|[#4946](https://github.com/NVIDIA/spark-rapids/pull/4946)|Support predictors on ANSI day time interval type|
|[#4952](https://github.com/NVIDIA/spark-rapids/pull/4952)|Have a fixed GPU memory size for integration tests|
|[#4954](https://github.com/NVIDIA/spark-rapids/pull/4954)|Fix of failing to read parquet files after writing the hidden file metadata in|
|[#4953](https://github.com/NVIDIA/spark-rapids/pull/4953)|Add Decimal 128 as a supported type in partition by for databricks running window|
|[#4941](https://github.com/NVIDIA/spark-rapids/pull/4941)|Use new list reduction API to improve performance|
|[#4926](https://github.com/NVIDIA/spark-rapids/pull/4926)|Support `DayTimeIntervalType` in `ParquetCachedBatchSerializer`|
|[#4947](https://github.com/NVIDIA/spark-rapids/pull/4947)|Fallback to ARENA if ASYNC configured and driver < 11.5.0|
|[#4934](https://github.com/NVIDIA/spark-rapids/pull/4934)|Replace MetadataAttribute with FileSourceMetadataAttribute to follow the update in Spark for 3.3.0+|
|[#4942](https://github.com/NVIDIA/spark-rapids/pull/4942)|Fix window rank integration tests on|
|[#4928](https://github.com/NVIDIA/spark-rapids/pull/4928)|Disable regular expressions on GPU by default|
|[#4923](https://github.com/NVIDIA/spark-rapids/pull/4923)|Support GpuScalarSubquery on nested types|
|[#4924](https://github.com/NVIDIA/spark-rapids/pull/4924)|Implement `percent_rank()` on GPU|
|[#4853](https://github.com/NVIDIA/spark-rapids/pull/4853)|Improve date support in JSON and CSV readers|
|[#4930](https://github.com/NVIDIA/spark-rapids/pull/4930)|Add in support for sorting arrays with structs in sort_array|
|[#4861](https://github.com/NVIDIA/spark-rapids/pull/4861)|Add Apache Spark 3.1.4-SNAPSHOT Shims|
|[#4925](https://github.com/NVIDIA/spark-rapids/pull/4925)|Remove unused Spark322PlusShims|
|[#4921](https://github.com/NVIDIA/spark-rapids/pull/4921)|Add DatabricksShimVersion to unshimmed class list|
|[#4917](https://github.com/NVIDIA/spark-rapids/pull/4917)|Default some configs to protect against cluster settings in integration tests|
|[#4922](https://github.com/NVIDIA/spark-rapids/pull/4922)|Add support for decimal 128 for db and spark 320+|
|[#4919](https://github.com/NVIDIA/spark-rapids/pull/4919)|Case-insensitive PR title check [skip ci]|
|[#4796](https://github.com/NVIDIA/spark-rapids/pull/4796)|Implement ExistenceJoin Iterator using an auxiliary left semijoin |
|[#4857](https://github.com/NVIDIA/spark-rapids/pull/4857)|Transition to v2 shims [Databricks]|
|[#4899](https://github.com/NVIDIA/spark-rapids/pull/4899)|Fixed Decimal 128 bug in ParquetCachedBatchSerializer|
|[#4810](https://github.com/NVIDIA/spark-rapids/pull/4810)|Support ANSI intervals to/from Parquet|
|[#4909](https://github.com/NVIDIA/spark-rapids/pull/4909)|Make ARENA the default allocator for 22.04|
|[#4856](https://github.com/NVIDIA/spark-rapids/pull/4856)|Enable shim tests in sql-plugin module|
|[#4880](https://github.com/NVIDIA/spark-rapids/pull/4880)|Bump hadoop-client dependency to 3.1.4|
|[#4825](https://github.com/NVIDIA/spark-rapids/pull/4825)|Initial support for reading decimal types from JSON and CSV|
|[#4859](https://github.com/NVIDIA/spark-rapids/pull/4859)|Fallback to CPU when Spark pushes down Aggregates (Min/Max/Count) for ORC|
|[#4872](https://github.com/NVIDIA/spark-rapids/pull/4872)|Speed up copying decimal column from parquet buffer to GPU buffer|
|[#4904](https://github.com/NVIDIA/spark-rapids/pull/4904)|Relocate Hive UDF Classes|
|[#4871](https://github.com/NVIDIA/spark-rapids/pull/4871)|Minor changes to print revision differences when building shims|
|[#4882](https://github.com/NVIDIA/spark-rapids/pull/4882)|Disable write/read Parquet when Parquet field IDs are used|
|[#4858](https://github.com/NVIDIA/spark-rapids/pull/4858)|Support non-literal index for `GpuElementAt` and `GpuGetArrayItem`|
|[#4875](https://github.com/NVIDIA/spark-rapids/pull/4875)|Support running `GetArrayStructFields` on GPU|
|[#4885](https://github.com/NVIDIA/spark-rapids/pull/4885)|Enable fuzz testing for Regular Expression repetitions and move remaining edge cases to CPU|
|[#4869](https://github.com/NVIDIA/spark-rapids/pull/4869)|Support for hexadecimal digits in regular expressions on the GPU|
|[#4854](https://github.com/NVIDIA/spark-rapids/pull/4854)|Avoid regexp_cost with stringSplit on the GPU using transpilation|
|[#4888](https://github.com/NVIDIA/spark-rapids/pull/4888)|Clean up leak detection code|
|[#4901](https://github.com/NVIDIA/spark-rapids/pull/4901)|fix a broken link in CONTRIBUTING.md[skip ci]|
|[#4891](https://github.com/NVIDIA/spark-rapids/pull/4891)|update getting started doc because aws-emr 6.5.0 released[skip ci]|
|[#4881](https://github.com/NVIDIA/spark-rapids/pull/4881)|Fix compilation error caused by ClusteredDistribution parameters|
|[#4890](https://github.com/NVIDIA/spark-rapids/pull/4890)|Integration-test tests jar for hive UDF tests|
|[#4878](https://github.com/NVIDIA/spark-rapids/pull/4878)|Set conda/mamba default to Python version to 3.8 [skip ci]|
|[#4874](https://github.com/NVIDIA/spark-rapids/pull/4874)|Fix spark-tests syntax issue [skip ci]|
|[#4850](https://github.com/NVIDIA/spark-rapids/pull/4850)|Also check cuda runtime version when using the ASYNC allocator|
|[#4851](https://github.com/NVIDIA/spark-rapids/pull/4851)|Add worker ID to temporary table names in tests|
|[#4847](https://github.com/NVIDIA/spark-rapids/pull/4847)|Fix test_compress_write_round_trip failure on Spark 3.3|
|[#4848](https://github.com/NVIDIA/spark-rapids/pull/4848)|Profile tool: fix printing of task failed reason|
|[#4636](https://github.com/NVIDIA/spark-rapids/pull/4636)|Support `str_to_map`|
|[#4835](https://github.com/NVIDIA/spark-rapids/pull/4835)|Trim parquet_write_test to reduce integration test runtime|
|[#4819](https://github.com/NVIDIA/spark-rapids/pull/4819)|Throw exception if casting from double to datetime |
|[#4838](https://github.com/NVIDIA/spark-rapids/pull/4838)|Trim cache tests to improve integration test time|
|[#4839](https://github.com/NVIDIA/spark-rapids/pull/4839)|Optionally return null if element not exists map/array|
|[#4822](https://github.com/NVIDIA/spark-rapids/pull/4822)|Push decimal workarounds to cuDF|
|[#4619](https://github.com/NVIDIA/spark-rapids/pull/4619)|Move the udf-examples module to the external repository spark-rapids-examples|
|[#4844](https://github.com/NVIDIA/spark-rapids/pull/4844)|Update spark313 dep to released one|
|[#4827](https://github.com/NVIDIA/spark-rapids/pull/4827)|Make InternalExclusiveModeGpuDiscoveryPlugin and ExplainPlanImpl as protected class.|
|[#4836](https://github.com/NVIDIA/spark-rapids/pull/4836)|Support WindowExec partitioning by Decimal 128 on the GPU|
|[#4760](https://github.com/NVIDIA/spark-rapids/pull/4760)|Short circuit AND/OR in ANSI mode|
|[#4829](https://github.com/NVIDIA/spark-rapids/pull/4829)|Make bloopInstall version configurable in buildall|
|[#4823](https://github.com/NVIDIA/spark-rapids/pull/4823)|Reduce redundancy of decimal testing|
|[#4715](https://github.com/NVIDIA/spark-rapids/pull/4715)|Patterns such (3?)+ should now fall back to CPU|
|[#4809](https://github.com/NVIDIA/spark-rapids/pull/4809)|Add ignoreCorruptFiles for ORC readers|
|[#4790](https://github.com/NVIDIA/spark-rapids/pull/4790)|Improve JSON and CSV parsing of integer values|
|[#4812](https://github.com/NVIDIA/spark-rapids/pull/4812)|Default integration test configs to allow negative decimal scale|
|[#4805](https://github.com/NVIDIA/spark-rapids/pull/4805)|Avoid output cast by using unsigned type output for GpuExtractChunk32|
|[#4804](https://github.com/NVIDIA/spark-rapids/pull/4804)|Profiling tool can miss datasources when they are GPU reads|
|[#4797](https://github.com/NVIDIA/spark-rapids/pull/4797)|Do not check for metadata during schema comparison|
|[#4785](https://github.com/NVIDIA/spark-rapids/pull/4785)|Support casting Map to String|
|[#4794](https://github.com/NVIDIA/spark-rapids/pull/4794)|Decimal-128 support for mod and pmod|
|[#4799](https://github.com/NVIDIA/spark-rapids/pull/4799)|Fix failure to generate worker_id when xdist is not present|
|[#4742](https://github.com/NVIDIA/spark-rapids/pull/4742)|Add ignoreCorruptFiles feature for Parquet reader|
|[#4792](https://github.com/NVIDIA/spark-rapids/pull/4792)|Ensure GpuM2 merge aggregation does not produce a null mean or m2|
|[#4770](https://github.com/NVIDIA/spark-rapids/pull/4770)|Improve columnarCopy for HostColumnarToGpu|
|[#4776](https://github.com/NVIDIA/spark-rapids/pull/4776)|Improve aggregation performance of average on DECIMAL128 columns|
|[#4786](https://github.com/NVIDIA/spark-rapids/pull/4786)|Add shims to compare ORC TypeDescription|
|[#4780](https://github.com/NVIDIA/spark-rapids/pull/4780)|Improve JSON and CSV support for boolean values|
|[#4778](https://github.com/NVIDIA/spark-rapids/pull/4778)|Decrease chance of random collisions in test temporary paths|
|[#4782](https://github.com/NVIDIA/spark-rapids/pull/4782)|Check in host leak detection code|
|[#4781](https://github.com/NVIDIA/spark-rapids/pull/4781)|Add Spark properties table to profiling tool output|
|[#4714](https://github.com/NVIDIA/spark-rapids/pull/4714)|Add regular expression support to string_split|
|[#4754](https://github.com/NVIDIA/spark-rapids/pull/4754)|Close SpillableBatch to avoid leaks|
|[#4758](https://github.com/NVIDIA/spark-rapids/pull/4758)|Fix merge conflict with branch-22.02 [skip ci]|
|[#4694](https://github.com/NVIDIA/spark-rapids/pull/4694)|Add clarifications and details to integration-tests README [skip ci]|
|[#4740](https://github.com/NVIDIA/spark-rapids/pull/4740)|Enable regular expressions on GPU by default|
|[#4735](https://github.com/NVIDIA/spark-rapids/pull/4735)|Re-enables partial regex support for octal digits on the GPU|
|[#4737](https://github.com/NVIDIA/spark-rapids/pull/4737)|Check for a null compression codec when creating ORC OutStream|
|[#4738](https://github.com/NVIDIA/spark-rapids/pull/4738)|Change resume-from to aggregator in buildall [skip ci]|
|[#4698](https://github.com/NVIDIA/spark-rapids/pull/4698)|Add tests for few json options|
|[#4731](https://github.com/NVIDIA/spark-rapids/pull/4731)|Trim join tests to improve runtime of tests|
|[#4732](https://github.com/NVIDIA/spark-rapids/pull/4732)|Fix failing serializer tests on Spark 3.3.0|
|[#4709](https://github.com/NVIDIA/spark-rapids/pull/4709)|Update centos 8 dockerfile to handle EOL issue [skip ci]|
|[#4724](https://github.com/NVIDIA/spark-rapids/pull/4724)|Debug dump to Parquet support for DECIMAL128 columns|
|[#4688](https://github.com/NVIDIA/spark-rapids/pull/4688)|Optimize DECIMAL128 sum aggregations|
|[#4692](https://github.com/NVIDIA/spark-rapids/pull/4692)|Add FAQ entry to discuss executor task concurrency configuration [skip ci]|
|[#4588](https://github.com/NVIDIA/spark-rapids/pull/4588)|Optimize semaphore acquisition in GpuShuffledHashJoinExec|
|[#4697](https://github.com/NVIDIA/spark-rapids/pull/4697)|Add preliminary test and test framework changes for ExistanceJoin|
|[#4716](https://github.com/NVIDIA/spark-rapids/pull/4716)|`GpuStringSplit` should return an array on not-null elements|
|[#4611](https://github.com/NVIDIA/spark-rapids/pull/4611)|Support BitLength and OctetLength|
|[#4408](https://github.com/NVIDIA/spark-rapids/pull/4408)|Use the ORC version that corresponds to the Spark version|
|[#4686](https://github.com/NVIDIA/spark-rapids/pull/4686)|Fall back to CPU for queries referencing hidden metadata columns|
|[#4669](https://github.com/NVIDIA/spark-rapids/pull/4669)|Prevent deadlock between RapidsBufferStore and RapidsBufferBase on close|
|[#4707](https://github.com/NVIDIA/spark-rapids/pull/4707)|Fix auto merge conflict 4705 [skip ci]|
|[#4690](https://github.com/NVIDIA/spark-rapids/pull/4690)|Fix map_test ANSI failure in Spark 3.3.0|
|[#4681](https://github.com/NVIDIA/spark-rapids/pull/4681)|Reimplement check for non-regexp strings using RegexParser|
|[#4683](https://github.com/NVIDIA/spark-rapids/pull/4683)|Fix documentation link, clarify documentation [skip ci]|
|[#4677](https://github.com/NVIDIA/spark-rapids/pull/4677)|Make Collect, first and last as deterministic aggregate functions for Spark-3.3|
|[#4682](https://github.com/NVIDIA/spark-rapids/pull/4682)|Enable test for LIKE with embedded null character|
|[#4673](https://github.com/NVIDIA/spark-rapids/pull/4673)|Allow GpuWindowExec to partition on structs|
|[#4637](https://github.com/NVIDIA/spark-rapids/pull/4637)|Improve support for reading CSV and JSON floating-point values|
|[#4629](https://github.com/NVIDIA/spark-rapids/pull/4629)|Remove shims module|
|[#4648](https://github.com/NVIDIA/spark-rapids/pull/4648)|Append new authorized user to blossom-ci safelist|
|[#4623](https://github.com/NVIDIA/spark-rapids/pull/4623)|Fallback to CPU when aggregate push down used for parquet|
|[#4606](https://github.com/NVIDIA/spark-rapids/pull/4606)|Set default RMM pool to ASYNC for cuda 11.2+|
|[#4531](https://github.com/NVIDIA/spark-rapids/pull/4531)|Use libcudf mixed joins for conditional hash semi and anti joins|
|[#4624](https://github.com/NVIDIA/spark-rapids/pull/4624)|Enable integration test results report on Jenkins [skip ci]|
|[#4597](https://github.com/NVIDIA/spark-rapids/pull/4597)|Update plugin version to 22.04.0-SNAPSHOT|
|[#4592](https://github.com/NVIDIA/spark-rapids/pull/4592)|Adds SQL function HYPOT using the GPU|
|[#4504](https://github.com/NVIDIA/spark-rapids/pull/4504)|Implement AST-based regular expression fuzz tests|
|[#4560](https://github.com/NVIDIA/spark-rapids/pull/4560)|Make shims.v2.ParquetCachedBatchSerializer as protected|

## Release 22.02

### Features
|||
|:---|:---|
|[#4305](https://github.com/NVIDIA/spark-rapids/issues/4305)|[FEA] write nvidia tool wrappers to allow old YARN versions to work with MIG|
|[#4410](https://github.com/NVIDIA/spark-rapids/issues/4410)|[FEA] ReplicateRows - Support ReplicateRows for decimal 128 type|
|[#4360](https://github.com/NVIDIA/spark-rapids/issues/4360)|[FEA] Add explain api for Spark 2.X|
|[#3541](https://github.com/NVIDIA/spark-rapids/issues/3541)|[FEA] Support max on single-level struct in aggregation context|
|[#4238](https://github.com/NVIDIA/spark-rapids/issues/4238)|[FEA] Add a Spark 3.X Explain only mode to the plugin|
|[#3952](https://github.com/NVIDIA/spark-rapids/issues/3952)|[Audit] [FEA][SPARK-32986][SQL] Add bucketed scan info in query plan of data source v1|
|[#4412](https://github.com/NVIDIA/spark-rapids/issues/4412)|[FEA] Improve support for \A, \Z, and \z in regular expressions|
|[#3979](https://github.com/NVIDIA/spark-rapids/issues/3979)|[FEA] Improvements for  CPU(Row) based UDF|
|[#4467](https://github.com/NVIDIA/spark-rapids/issues/4467)|[FEA] Add support for regular expression with repeated digits (`\d+`, `\d*`, `\d?`)|
|[#4439](https://github.com/NVIDIA/spark-rapids/issues/4439)|[FEA] Enable GPU broadcast exchange reuse for DPP when AQE enabled|
|[#3512](https://github.com/NVIDIA/spark-rapids/issues/3512)|[FEA] Support org.apache.spark.sql.catalyst.expressions.Sequence|
|[#3475](https://github.com/NVIDIA/spark-rapids/issues/3475)|[FEA] Spark 3.2.0 reads Parquet unsigned int64(UINT64) as Decimal(20,0) but CUDF does not support it |
|[#4091](https://github.com/NVIDIA/spark-rapids/issues/4091)|[FEA] regexp_replace: Improve support for ^ and $|
|[#4104](https://github.com/NVIDIA/spark-rapids/issues/4104)|[FEA] Support org.apache.spark.sql.catalyst.expressions.ReplicateRows|
|[#4027](https://github.com/NVIDIA/spark-rapids/issues/4027)|[FEA]  Support SubqueryBroadcast on GPU to enable exchange reuse during DPP|
|[#4284](https://github.com/NVIDIA/spark-rapids/issues/4284)|[FEA] Support idx = 0 in GpuRegExpExtract|
|[#4002](https://github.com/NVIDIA/spark-rapids/issues/4002)|[FEA] Implement regexp_extract on GPU|
|[#3221](https://github.com/NVIDIA/spark-rapids/issues/3221)|[FEA] Support GpuFirst and GpuLast on nested types under reduction aggregations|
|[#3944](https://github.com/NVIDIA/spark-rapids/issues/3944)|[FEA] Full support for sum with overflow on Decimal 128|
|[#4028](https://github.com/NVIDIA/spark-rapids/issues/4028)|[FEA] support GpuCast from non-nested ArrayType to StringType|
|[#3250](https://github.com/NVIDIA/spark-rapids/issues/3250)|[FEA] Make CreateMap duplicate key handling compatible with Spark and enable CreateMap by default|
|[#4170](https://github.com/NVIDIA/spark-rapids/issues/4170)|[FEA] Make regular expression behavior with `$` and `\r` consistent with CPU|
|[#4001](https://github.com/NVIDIA/spark-rapids/issues/4001)|[FEA] Add regexp support to regexp_replace|
|[#3962](https://github.com/NVIDIA/spark-rapids/issues/3962)|[FEA] Support null characters in regular expressions in RLIKE|
|[#3797](https://github.com/NVIDIA/spark-rapids/issues/3797)|[FEA] Make RLike support consistent with Apache Spark|

### Performance
|||
|:---|:---|
|[#4392](https://github.com/NVIDIA/spark-rapids/issues/4392)|[FEA] could the parquet scan code avoid acquiring the semaphore for an empty batch?|
|[#679](https://github.com/NVIDIA/spark-rapids/issues/679)|[FEA] move some deserialization code out of the scope of the gpu-semaphore to increase cpu concurrent|
|[#4350](https://github.com/NVIDIA/spark-rapids/issues/4350)|[FEA] Optimize the all-true and all-false cases in GPU `If` and `CaseWhen` |
|[#4309](https://github.com/NVIDIA/spark-rapids/issues/4309)|[FEA] Leverage cudf conditional nested loop join to implement semi/anti hash join with condition|
|[#4395](https://github.com/NVIDIA/spark-rapids/issues/4395)|[FEA] acquire the semaphore after concatToHost in GpuShuffleCoalesceIterator|
|[#4134](https://github.com/NVIDIA/spark-rapids/issues/4134)|[FEA] Allow `EliminateJoinToEmptyRelation` in `GpuBroadcastExchangeExec` |
|[#4189](https://github.com/NVIDIA/spark-rapids/issues/4189)|[FEA] understand why between is so expensive|

### Bugs Fixed
|||
|:---|:---|
|[#4725](https://github.com/NVIDIA/spark-rapids/issues/4725)|[DOC] Broken links in guide doc|
|[#4675](https://github.com/NVIDIA/spark-rapids/issues/4675)|[BUG] Jenkins integration build timed out at 10 hours|
|[#4665](https://github.com/NVIDIA/spark-rapids/issues/4665)|[BUG] Spark321Shims.getParquetFilters failed with NoSuchMethodError|
|[#4635](https://github.com/NVIDIA/spark-rapids/issues/4635)|[BUG] nvidia-smi wrapper script ignores ENABLE_NON_MIG_GPUS=1 on a heterogeneous multi-GPU machine|
|[#4500](https://github.com/NVIDIA/spark-rapids/issues/4500)|[BUG] Build failures against Spark 3.2.1 rc1 and make 3.2.1 non snapshot|
|[#4631](https://github.com/NVIDIA/spark-rapids/issues/4631)|[BUG] Release build with mvn option `-P source-javadoc` FAILED|
|[#4625](https://github.com/NVIDIA/spark-rapids/issues/4625)|[BUG] NDS query 5 fails with AdaptiveSparkPlanExec assertion|
|[#4632](https://github.com/NVIDIA/spark-rapids/issues/4632)|[BUG] Build failing for Spark 3.3.0 due to deprecated method warnings|
|[#4599](https://github.com/NVIDIA/spark-rapids/issues/4599)|[BUG] test_group_apply_udf and test_group_apply_udf_more_types hangs on Databricks 9.1|
|[#4600](https://github.com/NVIDIA/spark-rapids/issues/4600)|[BUG] crash if we have a decimal128 in a struct in an array |
|[#4581](https://github.com/NVIDIA/spark-rapids/issues/4581)|[BUG] Build error "GpuOverrides.scala:924: wrong number of arguments" on DB9.1.x spark-3.1.2 |
|[#4593](https://github.com/NVIDIA/spark-rapids/issues/4593)|[BUG] dup GpuHashJoin.diff case-folding issue|
|[#4559](https://github.com/NVIDIA/spark-rapids/issues/4559)|[BUG] regexp_replace with replacement string containing `\` can produce incorrect results|
|[#4503](https://github.com/NVIDIA/spark-rapids/issues/4503)|[BUG] regexp_replace with back references produces incorrect results on GPU|
|[#4567](https://github.com/NVIDIA/spark-rapids/issues/4567)|[BUG] Profile tool hangs in compare mode|
|[#4315](https://github.com/NVIDIA/spark-rapids/issues/4315)|[BUG] test_hash_reduction_decimal_overflow_sum[30] failed OOM in integration tests|
|[#4551](https://github.com/NVIDIA/spark-rapids/issues/4551)|[BUG] protobuf-java version changed to 3.x|
|[#4499](https://github.com/NVIDIA/spark-rapids/issues/4499)|[BUG]GpuSequence blows up when nulls exist in any of the inputs (start, stop, step)|
|[#4454](https://github.com/NVIDIA/spark-rapids/issues/4454)|[BUG] Shade warnings when building the tools artifact|
|[#4541](https://github.com/NVIDIA/spark-rapids/issues/4541)|[BUG] Column vector leak in conditionals_test.py|
|[#4514](https://github.com/NVIDIA/spark-rapids/issues/4514)|[BUG] test_hash_reduction_pivot_without_nans failed|
|[#4521](https://github.com/NVIDIA/spark-rapids/issues/4521)|[BUG] Inconsistencies in handling of newline characters and string and line anchors|
|[#4548](https://github.com/NVIDIA/spark-rapids/issues/4548)|[BUG] ai.rapids.cudf.CudaException: an illegal instruction was encountered in databricks 9.1|
|[#4475](https://github.com/NVIDIA/spark-rapids/issues/4475)|[BUG] `\D` and `\W` match newline in Spark but not in cuDF|
|[#1866](https://github.com/NVIDIA/spark-rapids/issues/1866)|[BUG] GpuFileFormatWriter does not close the data writer|
|[#4524](https://github.com/NVIDIA/spark-rapids/issues/4524)|[BUG] RegExp transpiler fails to detect some choice expressions that cuDF cannot compile|
|[#3226](https://github.com/NVIDIA/spark-rapids/issues/3226)|[BUG]OOM happened when do cube operations|
|[#2504](https://github.com/NVIDIA/spark-rapids/issues/2504)|[BUG] OOM when running NDS queries with UCX and GDS|
|[#4273](https://github.com/NVIDIA/spark-rapids/issues/4273)|[BUG] Rounding past the size that can be stored in a type produces incorrect results|
|[#4060](https://github.com/NVIDIA/spark-rapids/issues/4060)|[BUG] test_hash_groupby_approx_percentile_long_repeated_keys failed intermittently|
|[#4039](https://github.com/NVIDIA/spark-rapids/issues/4039)|[BUG] Spark 3.3.0 IT Array test failures|
|[#3849](https://github.com/NVIDIA/spark-rapids/issues/3849)|[BUG] In ANSI mode we can fail in cases Spark would not due to conditionals|
|[#4445](https://github.com/NVIDIA/spark-rapids/issues/4445)|[BUG] mvn clean prints an error message on a clean dir|
|[#4421](https://github.com/NVIDIA/spark-rapids/issues/4421)|[BUG] the driver is trying to load CUDA with latest 22.02 |
|[#4455](https://github.com/NVIDIA/spark-rapids/issues/4455)|[BUG] join_test.py::test_struct_self_join[IGNORE_ORDER({'local': True})] failed in spark330|
|[#4442](https://github.com/NVIDIA/spark-rapids/issues/4442)|[BUG] mvn build FAILED with option `-P noSnapshotsWithDatabricks`|
|[#4281](https://github.com/NVIDIA/spark-rapids/issues/4281)|[BUG] q9 regression between 21.10 and 21.12|
|[#4280](https://github.com/NVIDIA/spark-rapids/issues/4280)|[BUG] q88 regression between 21.10 and 21.12|
|[#4422](https://github.com/NVIDIA/spark-rapids/issues/4422)|[BUG] Host column vectors are being leaked during tests|
|[#4446](https://github.com/NVIDIA/spark-rapids/issues/4446)|[BUG] GpuCast crashes when casting from Array with unsupportable child type|
|[#4432](https://github.com/NVIDIA/spark-rapids/issues/4432)|[BUG] nightly build 3.3.0 failed: HashClusteredDistribution is not a member of org.apache.spark.sql.catalyst.plans.physical|
|[#4443](https://github.com/NVIDIA/spark-rapids/issues/4443)|[BUG] SPARK-37705 breaks parquet filters from Spark 3.3.0 and Spark 3.2.2 onwards|
|[#4316](https://github.com/NVIDIA/spark-rapids/issues/4316)|[BUG] Exception: Unable to find py4j, your SPARK_HOME may not be configured correctly intermittently|
|[#4378](https://github.com/NVIDIA/spark-rapids/issues/4378)|[BUG] udf_test udf_cudf_test failed require_minimum_pandas_version check in spark 320+|
|[#4423](https://github.com/NVIDIA/spark-rapids/issues/4423)|[BUG] Build is failing due to FileScanRDD changes in Spark 3.3.0-SNAPSHOT|
|[#4401](https://github.com/NVIDIA/spark-rapids/issues/4401)|[BUG]array_test.py::test_array_contains failures|
|[#4403](https://github.com/NVIDIA/spark-rapids/issues/4403)|[BUG] NDS query 72 logs codegen fallback exception and produces incorrect results|
|[#4386](https://github.com/NVIDIA/spark-rapids/issues/4386)|[BUG] conditionals_test.py FAILED with side_effects_cast[Integer/Long] on Databricks 9.1 Runtime|
|[#3934](https://github.com/NVIDIA/spark-rapids/issues/3934)|[BUG] Dependencies of published integration tests jar are missing|
|[#4341](https://github.com/NVIDIA/spark-rapids/issues/4341)|[BUG] GpuCast.scala:nnn warning: discarding unmoored doc comment|
|[#4356](https://github.com/NVIDIA/spark-rapids/issues/4356)|[BUG] nightly spark303 deploy pulling spark301 aggregator|
|[#4347](https://github.com/NVIDIA/spark-rapids/issues/4347)|[BUG] Dist jar pom lists aggregator jar as dependency|
|[#4176](https://github.com/NVIDIA/spark-rapids/issues/4176)|[BUG] ParseDateTimeSuite UT failed|
|[#4292](https://github.com/NVIDIA/spark-rapids/issues/4292)|[BUG] no meaningful message is surfaced to maven when binary-dedupe fails|
|[#4351](https://github.com/NVIDIA/spark-rapids/issues/4351)|[BUG] Tests FAILED On SPARK-3.2.0, com.nvidia.spark.rapids.SerializedTableColumn cannot be cast to com.nvidia.spark.rapids.GpuColumnVector|
|[#4346](https://github.com/NVIDIA/spark-rapids/issues/4346)|[BUG] q73 decimal was twice as slow in weekly results|
|[#4334](https://github.com/NVIDIA/spark-rapids/issues/4334)|[BUG] GpuColumnarToRowExec will always be tagged False for exportColumnarRdd after Spark311 |
|[#4339](https://github.com/NVIDIA/spark-rapids/issues/4339)|The parameter `dataType` is not necessary in `resolveColumnVector` method.|
|[#4275](https://github.com/NVIDIA/spark-rapids/issues/4275)|[BUG] Row-based Hive UDF will fail if arguments contain a foldable expression.|
|[#4229](https://github.com/NVIDIA/spark-rapids/issues/4229)|[BUG] regexp_replace `[^a]` has different behavior between CPU and GPU for multiline strings|
|[#4294](https://github.com/NVIDIA/spark-rapids/issues/4294)|[BUG] parquet_write_test.py::test_ts_write_fails_datetime_exception failed in spark 3.1.1 and 3.1.2|
|[#4205](https://github.com/NVIDIA/spark-rapids/issues/4205)|[BUG] Get different results when casting from timestamp to string|
|[#4277](https://github.com/NVIDIA/spark-rapids/issues/4277)|[BUG] cudf_udf nightly cudf import rmm failed|
|[#4246](https://github.com/NVIDIA/spark-rapids/issues/4246)|[BUG] Regression in CastOpSuite due to cuDF change in parsing NaN|
|[#4243](https://github.com/NVIDIA/spark-rapids/issues/4243)|[BUG] test_regexp_replace_null_pattern_fallback[ALLOW_NON_GPU(ProjectExec,RegExpReplace)] failed in databricks|
|[#4244](https://github.com/NVIDIA/spark-rapids/issues/4244)|[BUG] Cast from string to float using hand-picked values failed|
|[#4227](https://github.com/NVIDIA/spark-rapids/issues/4227)|[BUG] RAPIDS Shuffle Manager doesn't fallback given encryption settings|
|[#3374](https://github.com/NVIDIA/spark-rapids/issues/3374)|[BUG] minor deprecation warnings in a 3.2 shim build|
|[#3613](https://github.com/NVIDIA/spark-rapids/issues/3613)|[BUG] release312db profile pulls in 311until320-apache|
|[#4213](https://github.com/NVIDIA/spark-rapids/issues/4213)|[BUG] unused method with a misleading outdated comment in ShimLoader |
|[#3609](https://github.com/NVIDIA/spark-rapids/issues/3609)|[BUG] GpuShuffleExchangeExec in v2 shims has inconsistent packaging|
|[#4127](https://github.com/NVIDIA/spark-rapids/issues/4127)|[BUG] CUDF 22.02 nightly test failure|

### PRs
|||
|:---|:---|
|[#4773](https://github.com/NVIDIA/spark-rapids/pull/4773)|Update 22.02 changelog to latest [skip ci]|
|[#4771](https://github.com/NVIDIA/spark-rapids/pull/4771)|revert cudf api links from legacy to stable[skip ci]|
|[#4767](https://github.com/NVIDIA/spark-rapids/pull/4767)|Update 22.02 changelog to latest [skip ci]|
|[#4750](https://github.com/NVIDIA/spark-rapids/pull/4750)|Updated doc for decimal support|
|[#4757](https://github.com/NVIDIA/spark-rapids/pull/4757)|Update qualification tool to remove DECIMAL 128 as potential problem|
|[#4755](https://github.com/NVIDIA/spark-rapids/pull/4755)|Fix databricks doc for limitations.[skip ci]|
|[#4751](https://github.com/NVIDIA/spark-rapids/pull/4751)|Fix broken hyperlinks in documentation [skip ci]|
|[#4706](https://github.com/NVIDIA/spark-rapids/pull/4706)|Update 22.02 changelog to latest [skip ci]|
|[#4700](https://github.com/NVIDIA/spark-rapids/pull/4700)|Update cudfjni version to released 22.02.0|
|[#4701](https://github.com/NVIDIA/spark-rapids/pull/4701)|Decrease nighlty tests upper limitation to 7 [skip ci]|
|[#4639](https://github.com/NVIDIA/spark-rapids/pull/4639)|Update changelog for 22.02 and archive info of some older releases [skip ci]|
|[#4572](https://github.com/NVIDIA/spark-rapids/pull/4572)|Add download page for 22.02 [skip ci]|
|[#4672](https://github.com/NVIDIA/spark-rapids/pull/4672)|Revert "Disable 311cdh build due to missing dependency (#4659)"|
|[#4662](https://github.com/NVIDIA/spark-rapids/pull/4662)|Update the deploy script [skip ci]|
|[#4657](https://github.com/NVIDIA/spark-rapids/pull/4657)|Upmerge spark2 directory to the latest 22.02 changes|
|[#4659](https://github.com/NVIDIA/spark-rapids/pull/4659)|Disable 311cdh build by default because of a missing dependency|
|[#4508](https://github.com/NVIDIA/spark-rapids/pull/4508)|Fix Spark 3.2.1 build failures and make it non-snapshot|
|[#4652](https://github.com/NVIDIA/spark-rapids/pull/4652)|Remove non-deterministic test order in nightly [skip ci]|
|[#4643](https://github.com/NVIDIA/spark-rapids/pull/4643)|Add profile release301 when mvn help:evaluate|
|[#4630](https://github.com/NVIDIA/spark-rapids/pull/4630)|Fix the incomplete capture of SubqueryBroadcast |
|[#4633](https://github.com/NVIDIA/spark-rapids/pull/4633)|Suppress newTaskTempFile method warnings for Spark 3.3.0 build|
|[#4618](https://github.com/NVIDIA/spark-rapids/pull/4618)|[DB31x] Pick the correct Python runner for flatmap-group Pandas UDF|
|[#4622](https://github.com/NVIDIA/spark-rapids/pull/4622)|Fallback to CPU when encoding is not supported for JSON reader|
|[#4470](https://github.com/NVIDIA/spark-rapids/pull/4470)|Add in HashPartitioning support for decimal 128|
|[#4535](https://github.com/NVIDIA/spark-rapids/pull/4535)|Revert "Disable orc write by default because of https://issues.apache.org/jira/browse/ORC-1075 (#4471)"|
|[#4583](https://github.com/NVIDIA/spark-rapids/pull/4583)|Avoid unapply on PromotePrecision|
|[#4573](https://github.com/NVIDIA/spark-rapids/pull/4573)|Correct version from 21.12 to 22.02[skip ci]|
|[#4575](https://github.com/NVIDIA/spark-rapids/pull/4575)|Correct and update links in UDF doc[skip ci]|
|[#4501](https://github.com/NVIDIA/spark-rapids/pull/4501)|Switch and/or to use new cudf binops to improve performance|
|[#4594](https://github.com/NVIDIA/spark-rapids/pull/4594)|Resolve case-folding issue [skip ci]|
|[#4585](https://github.com/NVIDIA/spark-rapids/pull/4585)|Spark2 module upmerge, deploy script, and updates for Jenkins|
|[#4589](https://github.com/NVIDIA/spark-rapids/pull/4589)|Increase premerge databricks IDLE_TIMEOUT to 4 hours [skip ci]|
|[#4485](https://github.com/NVIDIA/spark-rapids/pull/4485)|Add json reader support|
|[#4556](https://github.com/NVIDIA/spark-rapids/pull/4556)|regexp_replace with back-references should fall back to CPU|
|[#4569](https://github.com/NVIDIA/spark-rapids/pull/4569)|Fix infinite loop with Profiling tool compare mode and app with no sql ids|
|[#4529](https://github.com/NVIDIA/spark-rapids/pull/4529)|Add support for Spark 2.x Explain Api|
|[#4577](https://github.com/NVIDIA/spark-rapids/pull/4577)|Revert "Fix CVE-2021-22569 (#4545)"|
|[#4520](https://github.com/NVIDIA/spark-rapids/pull/4520)|GpuSequence refactor|
|[#4570](https://github.com/NVIDIA/spark-rapids/pull/4570)|A few quick fixes to try to reduce max memory usage in the tests|
|[#4477](https://github.com/NVIDIA/spark-rapids/pull/4477)|Use libcudf mixed joins for conditional hash joins|
|[#4566](https://github.com/NVIDIA/spark-rapids/pull/4566)|remove scala-library from combined tools jar|
|[#4552](https://github.com/NVIDIA/spark-rapids/pull/4552)|Fix resource leak in GpuCaseWhen|
|[#4553](https://github.com/NVIDIA/spark-rapids/pull/4553)|Reenable test_hash_reduction_pivot_without_nans|
|[#4530](https://github.com/NVIDIA/spark-rapids/pull/4530)|Fix correctness issues in regexp and add `\r` and `\n` to fuzz tests|
|[#4549](https://github.com/NVIDIA/spark-rapids/pull/4549)|Fix typos in integration tests README [skip ci]|
|[#4545](https://github.com/NVIDIA/spark-rapids/pull/4545)|Fix CVE-2021-22569|
|[#4543](https://github.com/NVIDIA/spark-rapids/pull/4543)|Enable auto-merge from branch-22.02 to branch-22.04 [skip ci]|
|[#4540](https://github.com/NVIDIA/spark-rapids/pull/4540)|Remove user kuhushukla|
|[#4434](https://github.com/NVIDIA/spark-rapids/pull/4434)|Support max on single-level struct in aggregation context|
|[#4534](https://github.com/NVIDIA/spark-rapids/pull/4534)|Temporarily disable integration test - test_hash_reduction_pivot_without_nans|
|[#4322](https://github.com/NVIDIA/spark-rapids/pull/4322)|Add an explain only mode to the plugin|
|[#4497](https://github.com/NVIDIA/spark-rapids/pull/4497)|Make better use of pinned memory pool|
|[#4512](https://github.com/NVIDIA/spark-rapids/pull/4512)|remove hadoop version requirement[skip ci]|
|[#4527](https://github.com/NVIDIA/spark-rapids/pull/4527)|Fall back to CPU for regular expressions containing \D or \W|
|[#4525](https://github.com/NVIDIA/spark-rapids/pull/4525)|Properly close data writer in GpuFileFormatWriter|
|[#4502](https://github.com/NVIDIA/spark-rapids/pull/4502)|Removed the redundant test for element_at and fixed the failing one|
|[#4523](https://github.com/NVIDIA/spark-rapids/pull/4523)|Add more integration tests for decimal 128|
|[#3762](https://github.com/NVIDIA/spark-rapids/pull/3762)|Call the right method to convert table from row major <=> col major|
|[#4482](https://github.com/NVIDIA/spark-rapids/pull/4482)|Simplified the construction of zero scalar in GpuUnaryMinus|
|[#4510](https://github.com/NVIDIA/spark-rapids/pull/4510)|Update copyright in NOTICE [skip ci]|
|[#4484](https://github.com/NVIDIA/spark-rapids/pull/4484)|Update GpuFileFormatWriter to stay in sync with recent Spark changes, but still not support writing Hive bucketed table on GPU.|
|[#4492](https://github.com/NVIDIA/spark-rapids/pull/4492)|Fall back to CPU for regular expressions containing hex digits|
|[#4495](https://github.com/NVIDIA/spark-rapids/pull/4495)|Enable approx_percentile by default|
|[#4420](https://github.com/NVIDIA/spark-rapids/pull/4420)|Fix up incorrect results of rounding past the max digits of data type|
|[#4483](https://github.com/NVIDIA/spark-rapids/pull/4483)|Update test case of reading nested unsigned parquet file|
|[#4490](https://github.com/NVIDIA/spark-rapids/pull/4490)|Remove warning about RMM default allocator|
|[#4461](https://github.com/NVIDIA/spark-rapids/pull/4461)|[Audit] Add bucketed scan info in query plan of data source v1|
|[#4489](https://github.com/NVIDIA/spark-rapids/pull/4489)|Add arrays of decimal128 to join tests|
|[#4476](https://github.com/NVIDIA/spark-rapids/pull/4476)|Don't acquire the semaphore for empty input while scanning|
|[#4424](https://github.com/NVIDIA/spark-rapids/pull/4424)|Improve support for regular expression string anchors `\A`, `\Z`, and `\z`|
|[#4491](https://github.com/NVIDIA/spark-rapids/pull/4491)|Skip the test for spark versions 3.1.1, 3.1.2 and 3.2.0 only|
|[#4459](https://github.com/NVIDIA/spark-rapids/pull/4459)|Use merge sort for struct types in non-key columns|
|[#4494](https://github.com/NVIDIA/spark-rapids/pull/4494)|Append new authorized user to blossom-ci whitelist [skip ci]|
|[#4400](https://github.com/NVIDIA/spark-rapids/pull/4400)|Enable approx percentile tests|
|[#4471](https://github.com/NVIDIA/spark-rapids/pull/4471)|Disable orc write by default because of https://issues.apache.org/jira/browse/ORC-1075|
|[#4462](https://github.com/NVIDIA/spark-rapids/pull/4462)|Rename DECIMAL_128_FULL and rework usage of TypeSig.gpuNumeric|
|[#4479](https://github.com/NVIDIA/spark-rapids/pull/4479)|Change signoff check image to slim-buster [skip ci]|
|[#4464](https://github.com/NVIDIA/spark-rapids/pull/4464)|Throw SparkArrayIndexOutOfBoundsException for Spark 3.3.0+|
|[#4469](https://github.com/NVIDIA/spark-rapids/pull/4469)|Support repetition of \d and \D in regexp functions|
|[#4472](https://github.com/NVIDIA/spark-rapids/pull/4472)|Modify docs for 22.02 to address issue-4319[skip ci]|
|[#4440](https://github.com/NVIDIA/spark-rapids/pull/4440)|Enable GPU broadcast exchange reuse for DPP when AQE enabled|
|[#4376](https://github.com/NVIDIA/spark-rapids/pull/4376)|Add sequence support|
|[#4460](https://github.com/NVIDIA/spark-rapids/pull/4460)|Abstract the text based PartitionReader|
|[#4383](https://github.com/NVIDIA/spark-rapids/pull/4383)|Fix correctness issue with CASE WHEN with expressions that have side-effects|
|[#4465](https://github.com/NVIDIA/spark-rapids/pull/4465)|Refactor for shims 320+|
|[#4463](https://github.com/NVIDIA/spark-rapids/pull/4463)|Avoid replacing a hash join if build side is unsupported by the join type|
|[#4456](https://github.com/NVIDIA/spark-rapids/pull/4456)|Fix build issues: 1 clean non-exists target dirs; 2 remove duplicated plugin|
|[#4416](https://github.com/NVIDIA/spark-rapids/pull/4416)|Unshim join execs|
|[#4172](https://github.com/NVIDIA/spark-rapids/pull/4172)|Support String to Decimal 128|
|[#4458](https://github.com/NVIDIA/spark-rapids/pull/4458)|Exclude some metadata operators when checking GPU replacement|
|[#4451](https://github.com/NVIDIA/spark-rapids/pull/4451)|Some metrics improvements and timeline reporting|
|[#4435](https://github.com/NVIDIA/spark-rapids/pull/4435)|Disable add profile src execution by default to make the build log clean|
|[#4436](https://github.com/NVIDIA/spark-rapids/pull/4436)|Print error log to stderr output|
|[#4155](https://github.com/NVIDIA/spark-rapids/pull/4155)|Add partial support for line begin and end anchors in regexp_replace|
|[#4428](https://github.com/NVIDIA/spark-rapids/pull/4428)|Exhaustively iterate ColumnarToRow iterator to avoid leaks|
|[#4430](https://github.com/NVIDIA/spark-rapids/pull/4430)|update pca example link in ml-integration.md[skip ci]|
|[#4452](https://github.com/NVIDIA/spark-rapids/pull/4452)|Limit parallelism of nightly tests [skip ci]|
|[#4449](https://github.com/NVIDIA/spark-rapids/pull/4449)|Add recursive type checking and fallback tests for casting array with unsupported element types to string|
|[#4437](https://github.com/NVIDIA/spark-rapids/pull/4437)|Change logInfo to logWarning|
|[#4447](https://github.com/NVIDIA/spark-rapids/pull/4447)|Fix 330 build error and add 322 shims layer|
|[#4417](https://github.com/NVIDIA/spark-rapids/pull/4417)|Fix an Intellij debug issue|
|[#4431](https://github.com/NVIDIA/spark-rapids/pull/4431)|Add DateType support for AST expressions|
|[#4433](https://github.com/NVIDIA/spark-rapids/pull/4433)|Import the right pandas from conda [skip ci]|
|[#4419](https://github.com/NVIDIA/spark-rapids/pull/4419)|Import the right pandas from conda|
|[#4427](https://github.com/NVIDIA/spark-rapids/pull/4427)|Update getFileScanRDD shim for recent changes in Spark 3.3.0|
|[#4397](https://github.com/NVIDIA/spark-rapids/pull/4397)|Ignore cufile.log|
|[#4388](https://github.com/NVIDIA/spark-rapids/pull/4388)|Add support for ReplicateRows|
|[#4399](https://github.com/NVIDIA/spark-rapids/pull/4399)|Update docs for Profiling and Qualification tool to change wording|
|[#4407](https://github.com/NVIDIA/spark-rapids/pull/4407)|Fix GpuSubqueryBroadcast on multi-fields relation|
|[#4396](https://github.com/NVIDIA/spark-rapids/pull/4396)|GpuShuffleCoalesceIterator acquire semaphore after host concat|
|[#4361](https://github.com/NVIDIA/spark-rapids/pull/4361)|Accommodate altered semantics of `cudf::lists::contains()`|
|[#4394](https://github.com/NVIDIA/spark-rapids/pull/4394)|Use correct column name in GpuIf test|
|[#4385](https://github.com/NVIDIA/spark-rapids/pull/4385)|Add missing GpuSubqueryBroadcast replacement rule for spark31x |
|[#4387](https://github.com/NVIDIA/spark-rapids/pull/4387)|Fix auto merge conflict 4384[skip ci]|
|[#4374](https://github.com/NVIDIA/spark-rapids/pull/4374)|Fix the IT module depends on the tests module|
|[#4365](https://github.com/NVIDIA/spark-rapids/pull/4365)|Not publishing integration_tests jar to Maven Central [skip ci]|
|[#4358](https://github.com/NVIDIA/spark-rapids/pull/4358)|Update GpuIf to support expressions with side effects|
|[#4382](https://github.com/NVIDIA/spark-rapids/pull/4382)|Remove unused scallop dependency from integration_tests|
|[#4364](https://github.com/NVIDIA/spark-rapids/pull/4364)|Replace Scala document with Scala comment for inner functions|
|[#4373](https://github.com/NVIDIA/spark-rapids/pull/4373)|Add pytest tags for nightly test parallel run [skip ci]|
|[#4150](https://github.com/NVIDIA/spark-rapids/pull/4150)|Support GpuSubqueryBroadcast for DPP|
|[#4372](https://github.com/NVIDIA/spark-rapids/pull/4372)|Move casting to string tests from array_test.py and struct_test.py to cast_test.py|
|[#4371](https://github.com/NVIDIA/spark-rapids/pull/4371)|Fix typo in skipTestsFor330 calculation [skip ci]|
|[#4355](https://github.com/NVIDIA/spark-rapids/pull/4355)|Dedicated deploy-file with reduced pom in nightly build [skip ci]|
|[#4352](https://github.com/NVIDIA/spark-rapids/pull/4352)|Revert "Ignore failing string to timestamp tests temporarily (#4197)"|
|[#4359](https://github.com/NVIDIA/spark-rapids/pull/4359)|Audit - SPARK-37268 - Remove unused variable in GpuFileScanRDD [Databricks]|
|[#4327](https://github.com/NVIDIA/spark-rapids/pull/4327)|Print meaningful message when calling scripts in maven|
|[#4354](https://github.com/NVIDIA/spark-rapids/pull/4354)|Fix regression in AQE optimizations|
|[#4343](https://github.com/NVIDIA/spark-rapids/pull/4343)|Fix issue with binding to hash agg columns with computation|
|[#4285](https://github.com/NVIDIA/spark-rapids/pull/4285)|Add support for regexp_extract on the GPU|
|[#4349](https://github.com/NVIDIA/spark-rapids/pull/4349)|Fix PYTHONPATH in pre-merge|
|[#4269](https://github.com/NVIDIA/spark-rapids/pull/4269)|The option for the nightly script not deploying jars [skip ci]|
|[#4335](https://github.com/NVIDIA/spark-rapids/pull/4335)|Fix the issue of exporting Column RDD|
|[#4336](https://github.com/NVIDIA/spark-rapids/pull/4336)|Split expensive pytest files in cases level [skip ci]|
|[#4328](https://github.com/NVIDIA/spark-rapids/pull/4328)|Change the explanation of why the operator will not work on GPU|
|[#4338](https://github.com/NVIDIA/spark-rapids/pull/4338)|Use scala Int.box instead of Integer constructors |
|[#4340](https://github.com/NVIDIA/spark-rapids/pull/4340)|Remove the unnecessary parameter `dataType` in `resolveColumnVector` method|
|[#4256](https://github.com/NVIDIA/spark-rapids/pull/4256)|Allow returning an EmptyHashedRelation when a broadcast result is empty|
|[#4333](https://github.com/NVIDIA/spark-rapids/pull/4333)|Add tests about writing empty table to ORC/PAQUET|
|[#4337](https://github.com/NVIDIA/spark-rapids/pull/4337)|Support GpuFirst and GpuLast on nested types under reduction aggregations|
|[#4331](https://github.com/NVIDIA/spark-rapids/pull/4331)|Fix parquet options builder calls|
|[#4310](https://github.com/NVIDIA/spark-rapids/pull/4310)|Fix typo in shim class name|
|[#4326](https://github.com/NVIDIA/spark-rapids/pull/4326)|Fix 4315 decrease concurrentGpuTasks to avoid sum test OOM|
|[#4266](https://github.com/NVIDIA/spark-rapids/pull/4266)|Check revisions for all shim jars while build all|
|[#4282](https://github.com/NVIDIA/spark-rapids/pull/4282)|Use data type to create an inspector for a foldable GPU expression.|
|[#3144](https://github.com/NVIDIA/spark-rapids/pull/3144)|Optimize AQE with Spark 3.2+ to avoid redundant transitions|
|[#4317](https://github.com/NVIDIA/spark-rapids/pull/4317)|[BUG] Update nightly test script to dynamically set mem_fraction [skip ci]|
|[#4206](https://github.com/NVIDIA/spark-rapids/pull/4206)|Porting GpuRowToColumnar converters to InternalColumnarRDDConverter|
|[#4272](https://github.com/NVIDIA/spark-rapids/pull/4272)|Full support for SUM overflow detection on decimal|
|[#4255](https://github.com/NVIDIA/spark-rapids/pull/4255)|Make regexp pattern `[^a]` consistent with Spark for multiline strings|
|[#4306](https://github.com/NVIDIA/spark-rapids/pull/4306)|Revert commonizing the int96ParquetRebase* functions |
|[#4299](https://github.com/NVIDIA/spark-rapids/pull/4299)|Fix auto merge conflict 4298 [skip ci]|
|[#4159](https://github.com/NVIDIA/spark-rapids/pull/4159)|Optimize sample perf|
|[#4235](https://github.com/NVIDIA/spark-rapids/pull/4235)|Commonize v2 shim|
|[#4274](https://github.com/NVIDIA/spark-rapids/pull/4274)|Add tests for timestamps that overflowed before.|
|[#4271](https://github.com/NVIDIA/spark-rapids/pull/4271)|Skip test_regexp_replace_null_pattern_fallback on Spark 3.1.1 and later|
|[#4278](https://github.com/NVIDIA/spark-rapids/pull/4278)|Use mamba for cudf conda install [skip ci]|
|[#4270](https://github.com/NVIDIA/spark-rapids/pull/4270)|Document exponent differences when casting floating point to string [skip ci]|
|[#4268](https://github.com/NVIDIA/spark-rapids/pull/4268)|Fix merge conflict with branch-21.12|
|[#4093](https://github.com/NVIDIA/spark-rapids/pull/4093)|Add tests for regexp() and regexp_like()|
|[#4259](https://github.com/NVIDIA/spark-rapids/pull/4259)|fix regression in cast from string to float that caused signed NaN to be considered valid|
|[#4241](https://github.com/NVIDIA/spark-rapids/pull/4241)|fix bug in parsing regex character classes that start with `^` and contain an unescaped `]`|
|[#4224](https://github.com/NVIDIA/spark-rapids/pull/4224)|Support row-based Hive UDFs|
|[#4221](https://github.com/NVIDIA/spark-rapids/pull/4221)|GpuCast from ArrayType to StringType|
|[#4007](https://github.com/NVIDIA/spark-rapids/pull/4007)|Implement duplicate key handling for GpuCreateMap|
|[#4251](https://github.com/NVIDIA/spark-rapids/pull/4251)|Skip test_regexp_replace_null_pattern_fallback on Databricks|
|[#4247](https://github.com/NVIDIA/spark-rapids/pull/4247)|Disable failing CastOpSuite test|
|[#4239](https://github.com/NVIDIA/spark-rapids/pull/4239)|Make EOL anchor behavior match CPU for strings ending with newline|
|[#4153](https://github.com/NVIDIA/spark-rapids/pull/4153)|Regexp: Only transpile once per expression rather than once per batch|
|[#4230](https://github.com/NVIDIA/spark-rapids/pull/4230)|Change to build tools module with all the versions by default|
|[#4223](https://github.com/NVIDIA/spark-rapids/pull/4223)|Fixes a minor deprecation warning|
|[#4215](https://github.com/NVIDIA/spark-rapids/pull/4215)|Rebalance testing load|
|[#4214](https://github.com/NVIDIA/spark-rapids/pull/4214)|Fix pre_merge ci_2 [skip ci]|
|[#4212](https://github.com/NVIDIA/spark-rapids/pull/4212)|Remove an unused method with its outdated comment|
|[#4211](https://github.com/NVIDIA/spark-rapids/pull/4211)|Update test_floor_ceil_overflow to be more lenient on exception type|
|[#4203](https://github.com/NVIDIA/spark-rapids/pull/4203)|Move all the GpuShuffleExchangeExec shim v2 classes to org.apache.spark|
|[#4193](https://github.com/NVIDIA/spark-rapids/pull/4193)|Rename 311until320-apache to 311until320-noncdh|
|[#4197](https://github.com/NVIDIA/spark-rapids/pull/4197)|Ignore failing string to timestamp tests temporarily|
|[#4160](https://github.com/NVIDIA/spark-rapids/pull/4160)|Fix merge issues for branch 22.02|
|[#4081](https://github.com/NVIDIA/spark-rapids/pull/4081)|Convert String to DecimalType without casting to FloatType|
|[#4132](https://github.com/NVIDIA/spark-rapids/pull/4132)|Fix auto merge conflict 4131 [skip ci]|
|[#4099](https://github.com/NVIDIA/spark-rapids/pull/4099)|[REVIEW] Init version 22.02.0|
|[#4113](https://github.com/NVIDIA/spark-rapids/pull/4113)|Fix pre-merge CI 2 conditions [skip ci]|

## Older Releases
Changelog of older releases can be found at [docs/archives](/docs/archives)
