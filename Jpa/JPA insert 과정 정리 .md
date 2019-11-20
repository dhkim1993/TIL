# JPA insert 과정 정리 
아무것도없는 엄청 간단한 예제이다. 정리 그냥 해봤다. 

-  localhost:8080 GET 요청 
-  getBoardList() 호출

```java
@GetMapping("/")
    public String list(Model model){
        List<BoardDto> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
        return "board/list.html";
    }
```


```java
package com.example.demo.service;

import com.example.demo.domain.entity.BoardEntity;
import com.example.demo.domain.repository.BoardRepository;
import com.example.demo.dto.BoardDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimdonghyun on 13/11/2019.
 */
@Service
@AllArgsConstructor
public class BoardService {
    private BoardRepository boardRepository;

    @Transactional
    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
    }
    @Transactional
    public List<BoardDto> getBoardList(){
        List<BoardEntity> boardEntities = boardRepository.findAll();
        List<BoardDto> boardDtoList = new ArrayList<>();

        for(BoardEntity boardEntity : boardEntities){
            BoardDto boardDto = BoardDto.builder()
                    .id(boardEntity.getId())
                    .title(boardEntity.getTitle())
                    .content(boardEntity.getTitle())
                    .writer(boardEntity.getWriter())
                    .createdDate(boardEntity.getCreatedDate())
                    .build();
            boardDtoList.add(boardDto);
        }
        return boardDtoList;
    }


}

```


-  <BoardEntity>타입 List를 만들고 JPA 내장 메소드인 findAll() 로 모든 정보 가져옴.<br>
`List<BoardEntity> boardEntities = boardRepository.findAll();`

- ArrayList 생성<br>
`List<BoardDto> boardDtoList = new ArrayList<>();`

- for문으로 boardEntities 에 있는 정보들을 Dto 로 build()해서 ArrayList에 저장 해서 return

다시 컨트롤러로와서 

- model에 담아서 list.html 로 보냄

```html
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" th:href="@{/css/board.css}">
</head>
<body>
    <!-- th:insert 는 include 와 같다 -->
    <div th:insert="common/header.html" id="header"></div>

    <!-- @{} 는 어플리케이션이 설치된 경로를 기준으로 하는 상대경로다 -->
    <a th:href="@{/post}">k글쓰기</a>
    <table>
        <thead>
        <tr>
            <th class="one wide">번호</th>
            <th class="ten wide">글제목</th>
            <th class="two wide">작성자</th>
            <th class="three wide">작성일</th>
        </tr>
        </thead>

        <tbody>
        <!-- CONTENTS !-->
        <tr th:each="board : ${boardList}">
            <td>
                <span th:text="${board.id}"></span>
            </td>
            <td>
                <a th:href="@{'/post/' + ${board.id}}">
                    <span th:text="${board.title}"></span>
                </a>
            </td>
            <td>
                <span th:text="${board.writer}"></span>
            </td>
            <td>
                <span th:text="${#temporals.format(board.createdDate, 'yyyy-MM-dd HH:mm')}"></span>
            </td>
        </tr>
        </tbody>
    </table>
    <div th:insert="common/footer.html" id="footer"></div>
</body>
</html>

```

- 디비에 데이터가 있으면 보여주고 없으면 그냥 form 만 보여짐
- 글쓰기 버튼을 눌러 write.html 로 넘어간후 form 을 채워 submit 하면 controller 로 post 메소드로 매핑됨

```java
public String write(BoardDto boardDto){
        boardService.savePost(boardDto);
        return "redirect:/";
    }
```

- service에 savePost 호출시 submit됬던 Dto 객체를 파라미터로 넘김

```java
@Transactional
    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
    }
```

- Jpa 내장메소드 save로 Entity 객채와 Long 타입 Id를 파라미터로 넘김 to Entity()로 객체받아온후 save();

```java
public BoardEntity toEntity(){
        BoardEntity build = BoardEntity.builder()
                .id(id)
                .title(title)
                .writer(writer)
                .content(content)
                .build();

        return build;
    }

```

- 마지막으로 redirect 로 이렇게 처리과정 정리.