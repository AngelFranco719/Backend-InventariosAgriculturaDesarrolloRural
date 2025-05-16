FROM eclipse-temurin:24-jdk-alpine@sha256:d729416b123cd50d4a70122328ae17d38adced6fa767062d0c0f134e5843deab
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]