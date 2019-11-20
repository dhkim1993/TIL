# TIL - JPA Auditing

데이터를 insert하거나 update하는 경우 매번 시간 데이터를 입력하여 주어야 하는데 audit을 이용하면 자동으로 시간을 매핑하여 db에 넣어주게 됩니다.

## 사용법
### build.gradle에 의존성 추가


```
classpath "io.spring.gradle:dependency-management-plugin:1.0.4.RELEASE" 

ext['hibernate.version'] = '5.2.11.Final' 
```

LocalDate/LocalDateTime이 DB의 잘 저장되지 않는 이슈로 인해 SpringDataJpa가 사용하는 Hibernate의 버전만 5.2.11로 변경


ex

```java
@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class TimeEntity {

    @CreatedDate(updatable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;

}
```

### @MappedSuperclass
- JPA Entity 클래스들이 해당 추상클래스를 상속할 경우 createdDate, modifiedDate을 컬럼으로 인식 하도록 함
- 테이블로 매핑하지 않고, 자식 클래스(엔티티)에게 매핑정보를 상속하기 위한 어노테이션입니다.



### @EntityListeners(AuditingEntityListener.class)

- 해당 클래스에 Auditing 기능을 포함 시킴



### @CreatedDate

- Entity가 생성되어 저장될 때 시간이 자동 저장
- 이때 생성일은 update할 필요가 없으므로, updatable = false 속성을 추가합니다.



### @LastModifiedDate


- 조회한 Entity의 값을 변경할 때 시간이 자동 저장
