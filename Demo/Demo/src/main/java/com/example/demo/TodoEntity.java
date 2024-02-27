package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoEntity {
  private String id;        // 오브젝트 id
  private String userId;    // 오브젝트 생성한 사용자 id
  private String title;     // Todo 제목 ( ex 운동하기 )
  private boolean done;     // Todo 완료한 경우 checked
}
