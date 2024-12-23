package com.yunyongjun.mallapi.service;

import org.springframework.transaction.annotation.Transactional;
import com.yunyongjun.mallapi.dto.PageRequestDTO;
import com.yunyongjun.mallapi.dto.PageResponseDTO;
import com.yunyongjun.mallapi.dto.ProductDTO;

@Transactional
public interface ProductService {

  PageResponseDTO<ProductDTO> getList(PageRequestDTO pageRequestDTO); 

  Long register(ProductDTO productDTO);

  ProductDTO get(Long pno);

  void modify(ProductDTO productDTO);

  void remove(Long pno);

}
