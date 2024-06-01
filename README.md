# spring-boot-aws-sqs-sample

### Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-aws-sqs-sample.git`
2. Navigate to the folder: `cd spring-boot-aws-sqs-sample`
3. Set your AWS Access Key & AWS Secret Key
4. Run the application: `mvn clean spring-boot:run`
5. Check your console:

```shell
/Users/hendisantika/.sdkman/candidates/java/21.0.1-tem/bin/java -XX:TieredStopAtLevel=1 -Dspring.output.ansi.enabled=always -Dcom.sun.management.jmxremote -Dspring.jmx.enabled=true -Dspring.liveBeansView.mbeanDomain -Dspring.application.admin.enabled=true -Dmanagement.endpoints.jmx.exposure.include=* -javaagent:/Users/hendisantika/Applications/IntelliJ IDEA Ultimate.app/Contents/lib/idea_rt.jar=60033:/Users/hendisantika/Applications/IntelliJ IDEA Ultimate.app/Contents/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/hendisantika/IdeaProjects/spring-boot-aws-sqs-sample/target/classes:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-web/3.3.0/spring-boot-starter-web-3.3.0.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter/3.3.0/spring-boot-starter-3.3.0.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-logging/3.3.0/spring-boot-starter-logging-3.3.0.jar:/Users/hendisantika/.m2/repository/ch/qos/logback/logback-classic/1.5.6/logback-classic-1.5.6.jar:/Users/hendisantika/.m2/repository/ch/qos/logback/logback-core/1.5.6/logback-core-1.5.6.jar:/Users/hendisantika/.m2/repository/org/apache/logging/log4j/log4j-to-slf4j/2.23.1/log4j-to-slf4j-2.23.1.jar:/Users/hendisantika/.m2/repository/org/apache/logging/log4j/log4j-api/2.23.1/log4j-api-2.23.1.jar:/Users/hendisantika/.m2/repository/org/slf4j/jul-to-slf4j/2.0.13/jul-to-slf4j-2.0.13.jar:/Users/hendisantika/.m2/repository/jakarta/annotation/jakarta.annotation-api/2.1.1/jakarta.annotation-api-2.1.1.jar:/Users/hendisantika/.m2/repository/org/yaml/snakeyaml/2.2/snakeyaml-2.2.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-json/3.3.0/spring-boot-starter-json-3.3.0.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/core/jackson-databind/2.17.1/jackson-databind-2.17.1.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/core/jackson-annotations/2.17.1/jackson-annotations-2.17.1.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/core/jackson-core/2.17.1/jackson-core-2.17.1.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jdk8/2.17.1/jackson-datatype-jdk8-2.17.1.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/datatype/jackson-datatype-jsr310/2.17.1/jackson-datatype-jsr310-2.17.1.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/module/jackson-module-parameter-names/2.17.1/jackson-module-parameter-names-2.17.1.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-starter-tomcat/3.3.0/spring-boot-starter-tomcat-3.3.0.jar:/Users/hendisantika/.m2/repository/org/apache/tomcat/embed/tomcat-embed-core/10.1.24/tomcat-embed-core-10.1.24.jar:/Users/hendisantika/.m2/repository/org/apache/tomcat/embed/tomcat-embed-el/10.1.24/tomcat-embed-el-10.1.24.jar:/Users/hendisantika/.m2/repository/org/apache/tomcat/embed/tomcat-embed-websocket/10.1.24/tomcat-embed-websocket-10.1.24.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-web/6.1.8/spring-web-6.1.8.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-beans/6.1.8/spring-beans-6.1.8.jar:/Users/hendisantika/.m2/repository/io/micrometer/micrometer-observation/1.13.0/micrometer-observation-1.13.0.jar:/Users/hendisantika/.m2/repository/io/micrometer/micrometer-commons/1.13.0/micrometer-commons-1.13.0.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-webmvc/6.1.8/spring-webmvc-6.1.8.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-aop/6.1.8/spring-aop-6.1.8.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-context/6.1.8/spring-context-6.1.8.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-expression/6.1.8/spring-expression-6.1.8.jar:/Users/hendisantika/.m2/repository/com/amazonaws/aws-java-sdk-sqs/1.12.732/aws-java-sdk-sqs-1.12.732.jar:/Users/hendisantika/.m2/repository/com/amazonaws/aws-java-sdk-core/1.12.732/aws-java-sdk-core-1.12.732.jar:/Users/hendisantika/.m2/repository/commons-logging/commons-logging/1.1.3/commons-logging-1.1.3.jar:/Users/hendisantika/.m2/repository/commons-codec/commons-codec/1.16.1/commons-codec-1.16.1.jar:/Users/hendisantika/.m2/repository/org/apache/httpcomponents/httpclient/4.5.13/httpclient-4.5.13.jar:/Users/hendisantika/.m2/repository/org/apache/httpcomponents/httpcore/4.4.16/httpcore-4.4.16.jar:/Users/hendisantika/.m2/repository/com/fasterxml/jackson/dataformat/jackson-dataformat-cbor/2.17.1/jackson-dataformat-cbor-2.17.1.jar:/Users/hendisantika/.m2/repository/joda-time/joda-time/2.12.7/joda-time-2.12.7.jar:/Users/hendisantika/.m2/repository/com/amazonaws/jmespath-java/1.12.732/jmespath-java-1.12.732.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-devtools/3.3.0/spring-boot-devtools-3.3.0.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot/3.3.0/spring-boot-3.3.0.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-autoconfigure/3.3.0/spring-boot-autoconfigure-3.3.0.jar:/Users/hendisantika/.m2/repository/org/springframework/boot/spring-boot-configuration-processor/3.3.0/spring-boot-configuration-processor-3.3.0.jar:/Users/hendisantika/.m2/repository/org/projectlombok/lombok/1.18.32/lombok-1.18.32.jar:/Users/hendisantika/.m2/repository/org/slf4j/slf4j-api/2.0.13/slf4j-api-2.0.13.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-core/6.1.8/spring-core-6.1.8.jar:/Users/hendisantika/.m2/repository/org/springframework/spring-jcl/6.1.8/spring-jcl-6.1.8.jar id.my.hendisantika.springbootawssqssample.SpringBootAwsSqsSampleApplication
Standard Commons Logging discovery in action with spring-jcl: please remove commons-logging.jar from classpath in order to avoid potential conflicts
Standard Commons Logging discovery in action with spring-jcl: please remove commons-logging.jar from classpath in order to avoid potential conflicts
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.3.0)

2024-06-01T18:55:13.939+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] .m.h.s.SpringBootAwsSqsSampleApplication : Starting SpringBootAwsSqsSampleApplication using Java 21.0.1 with PID 91491 (/Users/hendisantika/IdeaProjects/spring-boot-aws-sqs-sample/target/classes started by hendisantika in /Users/hendisantika/IdeaProjects/spring-boot-aws-sqs-sample)
2024-06-01T18:55:13.940+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] .m.h.s.SpringBootAwsSqsSampleApplication : No active profile set, falling back to 1 default profile: "default"
2024-06-01T18:55:13.956+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : Devtools property defaults active! Set 'spring.devtools.add-properties' to 'false' to disable
2024-06-01T18:55:13.956+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] .e.DevToolsPropertyDefaultsPostProcessor : For additional web related logging consider setting the 'logging.level.web' property to 'DEBUG'
2024-06-01T18:55:14.247+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port 8080 (http)
2024-06-01T18:55:14.250+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2024-06-01T18:55:14.250+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.24]
2024-06-01T18:55:14.266+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2024-06-01T18:55:14.266+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 310 ms
Standard Commons Logging discovery in action with spring-jcl: please remove commons-logging.jar from classpath in order to avoid potential conflicts
2024-06-01T18:55:14.515+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] o.s.b.d.a.OptionalLiveReloadServer       : LiveReload server is running on port 35729
2024-06-01T18:55:14.525+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
2024-06-01T18:55:14.529+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [  restartedMain] .m.h.s.SpringBootAwsSqsSampleApplication : Started SpringBootAwsSqsSampleApplication in 0.706 seconds (process running for 0.943)
2024-06-01T18:55:14.887+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"someValue":"SomeRandomValue"}
2024-06-01T18:55:20.016+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"someValue":"SomeRandomValue"}
2024-06-01T18:55:25.248+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"someValue":"SomeRandomValue"}
2024-06-01T18:55:30.369+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"someValue":"SomeRandomValue"}
2024-06-01T18:55:35.484+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"someValue":"SomeRandomValue"}
2024-06-01T18:55:40.608+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"someValue":"SomeRandomValue"}
2024-06-01T18:55:45.721+07:00  INFO 91491 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"someValue":"SomeRandomValue"}
2024-06-01T19:12:31.350+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"2","content":"message","createdAt":"2024-06-01T11:55:24.731+00:00"}
2024-06-01T19:12:32.595+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"3","content":"message","createdAt":"2024-06-01T11:55:24.807+00:00"}
2024-06-01T19:12:33.844+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"6","content":"message","createdAt":"2024-06-01T11:55:25.050+00:00"}
2024-06-01T19:12:35.045+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"7","content":"message","createdAt":"2024-06-01T11:55:25.122+00:00"}
2024-06-01T19:12:36.219+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"9","content":"message","createdAt":"2024-06-01T11:55:25.277+00:00"}
2024-06-01T19:12:39.356+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"someValue":"SomeRandomValue"}
2024-06-01T19:12:40.618+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"4","content":"message","createdAt":"2024-06-01T11:54:00.634+00:00"}
2024-06-01T19:12:42.281+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"someValue":"SomeRandomValue"}
2024-06-01T19:12:43.924+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"2","content":"message","createdAt":"2024-06-01T11:54:19.621+00:00"}
2024-06-01T19:12:45.827+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"4","content":"message","createdAt":"2024-06-01T11:55:24.902+00:00"}
2024-06-01T19:12:47.083+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"7","content":"message","createdAt":"2024-06-01T11:54:00.836+00:00"}
2024-06-01T19:12:48.967+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"0","content":"message","createdAt":"2024-06-01T12:08:54.911+00:00"}
2024-06-01T19:12:50.849+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"7","content":"message","createdAt":"2024-06-01T12:08:57.903+00:00"}
2024-06-01T19:12:52.078+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"1","content":"message","createdAt":"2024-06-01T11:55:24.660+00:00"}
2024-06-01T19:12:53.718+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"8","content":"message","createdAt":"2024-06-01T11:55:25.194+00:00"}
2024-06-01T19:12:54.982+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"3","content":"message","createdAt":"2024-06-01T12:08:56.179+00:00"}
2024-06-01T19:12:56.269+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"5","content":"message","createdAt":"2024-06-01T12:08:57.183+00:00"}
2024-06-01T19:12:57.515+07:00  INFO 91746 --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"6","content":"message","createdAt":"2024-06-01T12:08:57.450+00:00"}

```
