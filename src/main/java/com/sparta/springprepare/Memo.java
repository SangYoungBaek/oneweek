package com.sparta.springprepare;

import lombok.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor // 요구되는 필드들을 가지는 constructor
public class Memo {
    private final String username;
    private final String contents;

}
