FROM eclipse-temurin:8-jre
ARG JAR_FILE

## 创建目录，并使用它作为工作目录
RUN mkdir -p /demo

WORKDIR /demo

COPY ${JAR_FILE} app.jar

EXPOSE 7001

ENV JAVA_OPTS="-Xms512m -Xmx512m -Djava.security.egd=file:/dev/./urandom"

CMD java ${JAVA_OPTS} -jar app.jar