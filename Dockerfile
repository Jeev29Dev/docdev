from eclipse-temurin:17
copy target/apps.jar apps.jar
cmd ["java","-jar","apps.jar"]