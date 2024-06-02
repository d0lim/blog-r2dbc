FROM azul/zulu-openjdk:17 as build
WORKDIR /workspace/app

COPY gradle gradle
COPY gradlew .
COPY build.gradle.kts .
COPY settings.gradle.kts .
COPY src src

RUN ./gradlew build -xtest

FROM azul/zulu-openjdk:17
VOLUME /tmp
COPY --from=build /workspace/app/build/libs/*.jar .
ENTRYPOINT ["java", "-jar", "web-jdbc-0.0.1-SNAPSHOT.jar"]