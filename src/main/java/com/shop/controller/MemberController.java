package com.shop.controller;

import com.shop.dto.MemberFormDto;
import com.shop.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/members")
@Controller

/**
 * final이나 @nonNull이 붙은 필드에 생성자를 생성해줍니다. 빈에 생성자가 1개이고
 * 생성자의 파라미터 타입이 빈으로 등록이 가능하다면 @Autowired 어노테이션 없이 의존성 주입이 가능합니다.
 * */
@RequiredArgsConstructor
public class MemberController {

        private final MemberService memberService;

        @GetMapping(value = "/new")
        public String memberForm(Model model) {
                model.addAttribute("memberFormDto", new MemberFormDto());
                return "member/memberForm";
        }

}
