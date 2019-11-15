# TIL - HTTP :  HiddenHttpMethodFilter
### 2019.11.14 Thu

간단하게 boot,gradle 로 jpa 공부하며 api 만들던중 restful 하게 핸들링 하고싶어서 찾아보니 `HiddenHttpMethodFilter` 이런게 있었다.<br>
지금까지 실질적으로 많이 쓴건  get, post 였다.(`@GetMapping`, `@PostMapping`)<br>
하지만 hidden 태그와 Spring HiddenHttpMethodFilter를 통해 @PutMapping, @DeleteMapping 을 사용할수 있다.<br>

ex

### application.yml
```java
spring:
  mvc:
    hiddenmethod:
      filter:
        enabled: true
```

### .html

```java
<form id="delete-form" th:action="@{'/post/'+${boardDto.id}}" method="post">
        <input type="hidden" name="_method" value="delete" />
        <button id="delete-btn">삭제</button>
</form>
    
    
<form th:action="@{'/post/modify/' + ${boardDto.id}}" method="post">
    <input type="hidden" name="_method" value="put"/>
    <input type="hidden" name="id" th:value="${boardDto.id}"/>
</form>
```

이런식으로 form method 는 post <br>
input type = hidden<br>
name = _method<br>
value = put or delete<br>

submit 하면 컨트롤러에서 put, delete 로 매핑된다.

```java
@PutMapping("/post/modify/{no}")
public String modify(BoardDto boardDto) {
    boardService.savePost(boardDto);
    return “redirect:/“;
}
@DeleteMapping(“/post/{no}”)
public String delete(@PathVariable(“no”) Long no) {
    boardService.deletePost(no);
    return “redirect:/“;
}
```