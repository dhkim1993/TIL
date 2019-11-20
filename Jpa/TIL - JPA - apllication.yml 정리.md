# TIL - JPA : apllication.yml 정리

### 2019.11.19 Tue

```
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/pratice_jpa?serverTimezone=UTC&characterEncoding=UTF-8
    username: root
    password: rlaehdeod!23
  jpa:
    database-platform: org.hibernate.dialect.MySQL5InnoDBDialect
    open-in-view: true
    show-sql: true
    properties:
      hibernate:
        format_sql: true
        ddl-auto: create
  mvc:
    hiddenmethod:
      filter:
        enabled: true

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

- **mysql connect** <br>
	`spring:datasource:driver-class-name: com.mysql.cj.jdbc.Driver`<br>
	`spring:datasource:url: jdbc:mysql://localhost:3306/pratice_jpa?serverTimezone=UTC&characterEncoding=UTF-8`<br>
	`spring:datasource:username: root`<br>
	`spring:datasource:password: 123123123`<br>

- **JPA 데이터베이스 플랫폼을 지정**
`spring:jpa:database-platform: org.hibernate.dialect.MySQL5InnoDBDialect`

- **아직잘모름**<br>
`spring:jpa:open-in-view: true`<br>

- **IDEA 콘솔에 sql 보여줌**<br>
`spring:jpa:show-sql: true`<br>

- **sql을 가독성좋게 만들어줌**<br>
`spring:jpa:properties:hibernate:format_sql: true`<br>


- **스키마 자동생성** <br>
`spring:jpa:properties:hibernate:ddl-auto: create`<br><br>
**HBM2DDL 주의사항!**<br>
운영서버에서 create, create-drop, update 처럼 DDL을 수정하는 옵션은 절대 사용하면 안됨! 오직 개발 서버나 개발 단계에서만 사용야함! 이 옵션들은 운영중인 디비의 테이블이나 컬럼을 삭제 할 수 있음!<br><br>
**개발환경에 따른 추천 전략**
	- 개발 초기단계는 create or update
	- 초기화 상태로 자동화된 테스트를 진행하는 개발자 환경과 CI 서버는 create or create-drop
	- 테스트 서버는 update or validate
	- 스테이징과 운영서버는 validate or none


	|옵션 |설명|
	|---|---|
	|create|기존 테이블을 삭제하고 새로 생성. DROP + CREATE|
	|create-drop|create 속성에 추가로 어플리케이션을 종료할 때 생성한 DDL 을 제거한다. DROP + CREATE + DROP|
	|update|데이터베이스 테이블과 엔티티 매핑 정보를 비교해서 변경 사항만 수정한다.|
	|validate|데이터베이스 테이블과 엔티티 매핑정보를 비교해서 차이가 있으면 경고를 남기고 어플리 케이션을 실행하지 않는다. 이 설정은 DDL을 수정하지 않는다.|
	|none|자동 생성 기능을 사용하지 않으려면 hibernate.hbm2ddl.auto 속성 자체를 삭제하거나 유효하지 않는  옵션 값을 주면된다. (none 은 유효값이 아님)|
	<br>


- **restful http 메소드 중 put, delete 로 controller 에서 매핑할 수 있게하는 코드**<br>
`spring:mvc:hiddenmethod:filter:enabled: true`<br>

- **로그출력**<br>
`logging:level:org:hibernate:SQL: DEBUG`
`logging:level:org:hibernate:type:descriptor:sql:BasicBinder: TRACE`


