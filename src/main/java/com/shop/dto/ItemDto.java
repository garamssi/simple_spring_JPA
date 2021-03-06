package com.shop.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;


/**
 * th:text를 이용한 상품 데이터 출력용 Dto 클래스
 * */
@Getter
@Setter
@Accessors(chain=true)
public class ItemDto {

        private Long id;

        private String itemNm;

        private Integer price;

        private String itemDetail;

        private String sellStatCd;

        private LocalDateTime regTime;

        private LocalDateTime updateTime;

}
