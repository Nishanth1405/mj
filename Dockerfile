FROM eclipse-temurin:17
COPY  target/mj.jar mj.jar
CMD [ "java","-jar","mj.jar" ]