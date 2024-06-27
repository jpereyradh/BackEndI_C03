# Usar una imagen base de Java 17
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado en el contenedor
COPY target/ClinicaOdontologica-0.0.1-SNAPSHOT.jar app.jar

# Exponer el puerto que utiliza la aplicación
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]