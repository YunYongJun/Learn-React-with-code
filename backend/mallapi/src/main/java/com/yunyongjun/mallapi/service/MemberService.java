package com.yunyongjun.mallapi.service;

import java.util.stream.Collectors;

import org.springframework.transaction.annotation.Transactional;
import com.yunyongjun.mallapi.domain.Member;
import com.yunyongjun.mallapi.dto.MemberDTO;
import com.yunyongjun.mallapi.dto.MemberModifyDTO;

@Transactional
public interface MemberService {
  
  MemberDTO getKakaoMember(String accessToken);

  void modifyMember(MemberModifyDTO memberModifyDTO);

  default MemberDTO entityToDTO(Member member) {

    MemberDTO dto = new MemberDTO(
      member.getEmail(), 
      member.getPw(), 
      member.getNickname(), 
      member.isSocial(), 
      member.getMemberRoleList().stream().map(memberRole -> memberRole.name()).collect(Collectors.toList()));

    return dto;
  }

}
