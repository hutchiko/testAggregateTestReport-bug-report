## Gradle issue reproducer

The new report aggregation plugin https://docs.gradle.org/current/userguide/test_report_aggregation_plugin.html
does not reproduce the same reporting behaviour on test failures as the existing single project test report. 

To reproduce the issue run:

```
./gradlew clean testAggregateTestReport 
```

Note that there is no aggregated report generated: 
```
find build/reports/tests -type f -name index.html | grep aggregated  
```

However there is a non aggregated report:
```
 find build/reports/tests -type f -name index.html  
```

Both an aggregated and non-aggregated report should be generated. These reports are most helpful when tests fail so 
it's vital that the aggregated report is still generated on test failure.