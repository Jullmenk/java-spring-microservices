# Use uma imagem base com o OpenJDK
FROM openjdk:21-jdk-slim

# Defina o diretório de trabalho dentro do container
WORKDIR /app

# Copie o arquivo JAR da aplicação para dentro do container
COPY target/billing-service-0.0.1-SNAPSHOT.jar /app.jar


# Exponha a porta que a aplicação Spring Boot vai rodar
EXPOSE 4001
EXPOSE 9001

# Comando para rodar a aplicação
ENTRYPOINT ["java", "-jar", "/app.jar"]
