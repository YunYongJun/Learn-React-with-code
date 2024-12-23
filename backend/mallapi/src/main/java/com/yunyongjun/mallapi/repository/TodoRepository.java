package com.yunyongjun.mallapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.yunyongjun.mallapi.domain.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long>{
  
}