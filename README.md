# spring-boot-aws-sqs-sample

[![Java CI with Maven](https://github.com/hendisantika/spring-boot-aws-sqs-sample/actions/workflows/maven.yml/badge.svg)](https://github.com/hendisantika/spring-boot-aws-sqs-sample/actions/workflows/maven.yml)
![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.2-6DB33F?logo=springboot)
![Maven](https://img.shields.io/badge/Maven-3.10.0-C71A36?logo=apachemaven)
![Dependabot](https://img.shields.io/badge/Dependabot-enabled-025E8C?logo=dependabot)

A simple Spring Boot application that **publishes** and **consumes** messages with
[Amazon SQS](https://aws.amazon.com/sqs/) using the AWS SDK for Java.

- On startup, an `ApplicationRunner` publishes 10 JSON messages to the queue (`Publisher`).
- A `@Scheduled` job polls the queue every 5 seconds, logs the message and deletes it (`Consumer`).

## Tech Stack

| Component        | Version                                  |
|------------------|------------------------------------------|
| Java (JDK)       | 25 (Temurin recommended)                 |
| Spring Boot      | 4.1.2                                    |
| Jackson          | 3.x (`tools.jackson.databind`)           |
| AWS SDK for Java | `com.amazonaws:aws-java-sdk-sqs` 1.12.x  |
| Lombok           | managed by Spring Boot                   |
| Build tool       | Maven Wrapper (`./mvnw`, Maven 3.10.0)   |

## Project Structure

```
src/main/java/id/my/hendisantika/springbootawssqssample
├── SpringBootAwsSqsSampleApplication.java   # main class + ApplicationRunner that publishes 10 messages
├── config
│   ├── SqsConfig.java                       # AmazonSQS client bean (region ap-southeast-1)
│   ├── Publisher.java                       # sends JSON messages to the queue
│   └── Consumer.java                        # polls & deletes messages every 5 seconds
└── model
    └── Message.java                         # message payload (id, content, createdAt)
```

## Prerequisites

1. **JDK 25** installed (`java -version` should print `25`).
2. An AWS account with an **SQS queue** in region `ap-southeast-1` (default queue name: `spring-boot-sqs-poc`).
3. An IAM user/key with at least `sqs:GetQueueUrl`, `sqs:SendMessage`, `sqs:ReceiveMessage` and `sqs:DeleteMessage`.

## Configuration

`src/main/resources/application.properties`:

```properties
spring.application.name=spring-boot-aws-sqs-sample
aws.access.key=${AWS_ACCESS_KEY:your_access_key}
aws.secret.key=${AWS_SECRET_KEY:your_secret_key}
aws.queueName=spring-boot-sqs-poc
```

Provide your credentials through **environment variables** — never commit real keys to the repository:

```shell
export AWS_ACCESS_KEY=<your-access-key>
export AWS_SECRET_KEY=<your-secret-key>
```

## Things todo list

1. Clone this repository: `git clone https://github.com/hendisantika/spring-boot-aws-sqs-sample.git`
2. Navigate to the folder: `cd spring-boot-aws-sqs-sample`
3. Set your AWS Access Key & AWS Secret Key (see [Configuration](#configuration))
4. Run the application: `./mvnw clean spring-boot:run`
5. Check your console:

```shell
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.1.2)

INFO  --- [spring-boot-aws-sqs-sample] [  restartedMain] .m.h.s.SpringBootAwsSqsSampleApplication : Starting SpringBootAwsSqsSampleApplication using Java 25 ...
INFO  --- [spring-boot-aws-sqs-sample] [  restartedMain] o.s.b.tomcat.TomcatWebServer             : Tomcat started on port 8080 (http) with context path '/'
INFO  --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"0","content":"message","createdAt":"..."}
INFO  --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"1","content":"message","createdAt":"..."}
INFO  --- [spring-boot-aws-sqs-sample] [   scheduling-1] i.m.h.s.config.Consumer                  : Read Message from queue: {"id":"2","content":"message","createdAt":"..."}
```

## Build & Test

```shell
./mvnw -B package        # compile, run tests and build the jar
java -jar target/spring-boot-aws-sqs-sample-0.0.1-SNAPSHOT.jar
```

> The `contextLoads` test starts the full application context with dummy credentials.
> `403 InvalidClientTokenId` errors in the test log are expected — the exceptions are caught and the test still passes.

## Continuous Integration

GitHub Actions workflow: [`.github/workflows/maven.yml`](.github/workflows/maven.yml)

- Triggers on push & pull request to `main`, plus manual `workflow_dispatch`.
- Builds and tests with **Temurin JDK 25** using the Maven Wrapper, with Maven dependency caching.
- Cancels superseded runs for the same branch (`concurrency`).
- Least-privilege token (`contents: read`); the **dependency graph submission** job only runs on push to `main`
  (with `contents: write`) so pull requests — including those from Dependabot — don't fail on a read-only token.

## Dependabot

Configuration: [`.github/dependabot.yml`](.github/dependabot.yml)

| Ecosystem        | Schedule                          | Grouping                                                                              | Commit prefix                     |
|------------------|-----------------------------------|---------------------------------------------------------------------------------------|-----------------------------------|
| `maven`          | daily 05:00 Asia/Jakarta          | `spring-boot`, `aws-sdk`, `maven-plugins`, plus `minor-and-patch` for everything else | `chore(deps)` / `chore(deps-dev)` |
| `github-actions` | daily 05:00 Asia/Jakarta          | all actions in one `github-actions` group                                              | `ci(deps)`                        |

The `maven` entry also keeps the Maven Wrapper (`.mvn/wrapper/maven-wrapper.properties`) up to date.
Pull requests are labelled (`dependencies` + `java` / `github_actions`) and assigned to `@hendisantika`.

## Notes on JDK 25

- Since JDK 23, annotation processors are no longer discovered automatically from the classpath, so
  Lombok and `spring-boot-configuration-processor` are declared explicitly in `maven-compiler-plugin`
  `annotationProcessorPaths`.
- Spring Boot 4 ships **Jackson 3**, so `Publisher` injects `tools.jackson.databind.ObjectMapper`
  instead of `com.fasterxml.jackson.databind.ObjectMapper`.
