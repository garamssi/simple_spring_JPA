package com.shop.service;

import com.shop.entity.Member;
import com.shop.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

/**
 * final이나 @nonNull이 붙은 필드에 생성자를 생성해줍니다. 빈에 생성자가 1개이고
 * 생성자의 파라미터 타입이 빈으로 등록이 가능하다면 @Autowired 어노테이션 없이 의존성 주입이 가능합니다.
 * */
@RequiredArgsConstructor
public class MemberService {

        private final MemberRepository memberRepository;

        public Member saveMember(Member member) {
                validationDuplicateMember(member);
                return memberRepository.save(member);
        }

        private void validationDuplicateMember(Member member) {
                Member findMember = memberRepository.findByEmail(member.getEmail());
                if(findMember != null){
                        throw  new IllegalStateException("이미 가입된 회원입니다.");
                }
        }
}
