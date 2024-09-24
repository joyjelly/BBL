# 베이스 이미지로 JDK 17 사용
FROM openjdk:17-jdk-alpine

# 작업 디렉토리 설정
WORKDIR /app

# 빌드된 JAR 파일을 컨테이너에 복사
COPY ./build/libs/BBL-0.0.1-SNAPSHOT.jar /app/myapp.jar

# 애플리케이션 실행 포트 노출
EXPOSE 8080

# 애플리케이션 실행
CMD ["java", "-jar", "myapp.jar"]
