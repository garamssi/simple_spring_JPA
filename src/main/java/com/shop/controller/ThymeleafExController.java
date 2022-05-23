package com.shop.controller;

import com.shop.dto.ItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

/**
 * @apiNote th:text를 이용한 상품 데이터 출력용 컨트롤러 클래스
 * */
@Controller
@RequestMapping(value = "/thymeleaf")
public class ThymeleafExController {

        @GetMapping(value = "/ex01")
        public String thymeleafExample01(Model model) {
                model.addAttribute("data", "타임리프 예제 입니다.");
                return "thymeleafEx/thymeleafEx01";
        }

        @GetMapping(value = "/ex02")
        public String thymeleafExample02(Model model) {
                ItemDto itemDto = new ItemDto();
                itemDto.setItemDetail("상품 상세 설명")
                        .setItemNm("테스트 상품1")
                        .setPrice(10000)
                        .setRegTime(LocalDateTime.now());


                model.addAttribute("itemDto", itemDto);

                return "thymeleafEx/thymeleafEx02";

        }

        @GetMapping(value = "/ex07")
        public String thymeleafExample07(){
                return "thymeleafEx/thymeleafEx07";
        }
}
