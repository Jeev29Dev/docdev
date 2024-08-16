from eclipse-temurin:21
copy target/apps.jar apps.jar
cmd ["java","-jar","apps.jar"]