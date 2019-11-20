# TIL - @org.hibernate.annotations.DynamicUpdate

수정된 데이터만 사용해서 동적으로 UPDATE SQL 을 생성한다. 
Entity 클래스에 붙여서 사용.

데이터가 존재하는 필드만으로 INSERT SQL 을 동적으로 사용하는 @DynamicInsert 도 있다. 