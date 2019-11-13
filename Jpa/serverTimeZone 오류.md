# TIL - JPA Study 
### 2019.11.13 Wen

요즘 boot 와 jpa 를 공부중이다. 오늘은 어제 하루종일 해결안되서 스트레스 받은 문제가 있었는데 갑자기 오늘 어제 해본방법으로 다시해봤는데 갑자기 오류없이 클린떠서 당황.. 그 오류에 대해 기록을 남길려고한다. 구글링해서 별의별 방법 다해봤는데 이 방법만 되는거같다.

### 오류 : The server time zone value ‘KST’ is unrecognized or represents more than one time zone. You must configure either the server or JDBC driver (via the serverTimezone configuration property) to use a more specifc time zone value if you want to utilize time zone support.

`jdbc:mysql://ip:port/TestDB?characterEncoding=UTF-8&amp;serverTimezone=UTC
`
<br><br>
application.properties `spring.datasource.url=jdbc:mysql://localhost:3306/pratice_jpa?serverTimezone=UTC
`<br>
디비이름 뒤에 서버타임존 UTC만 붙여서 해봤는데 클린빌드 되었다.