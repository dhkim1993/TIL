# JPA application.yml

```
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/pratice_jpa?serverTimezone=UTC&characterEncoding=UTF-8
    username: root
    password: rlaehdeod!23
 jpa:
    database-platform: org.hibernate.dialect.MySQL5InnoDBDialect
    open-in-view: false
    show-sql: true
    hibernate:
      format_sql: true
      ddl-auto: create
logging:
  level:
    org:
      hibernate:
        SQL: DEBUG
        type:
          descriptor:
            sql:
              BasicBinder: TRACE

```

H2 안쓰고 mysql 연동했을시 코드

## properties

```
pring.datasource.username=root
spring.datasource.password=rlaehdeod!23
spring.datasource.url=jdbc:mysql://localhost:3306/pratice_jpa?serverTimezone=UTC
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=create
spring.jpa.properties.hibernate.format_sql=true

```