package com.yunyongjun.mallapi.service;

import com.yunyongjun.mallapi.dto.TodoDTO;
import com.yunyongjun.mallapi.dto.PageRequestDTO;
import com.yunyongjun.mallapi.dto.PageResponseDTO;

public interface TodoService {
  
  Long register(TodoDTO todoDTO);

  TodoDTO get(Long tno);

  void modify(TodoDTO todoDTO);

  void remove(Long tno);

  PageResponseDTO<TodoDTO> list(PageRequestDTO pageRequestDTO);

}
