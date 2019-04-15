package com.ghsong.restapi.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class EventDto {

    private String name;                                            // 이름
    private String description;                                     // 설명
    private LocalDateTime beginEnrollmentDateTime;                  // 이벤트 등록 시간
    private LocalDateTime closeEnrollmentDateTime;                  // 이벤트 종료 시간
    private LocalDateTime beginEventDateTime;                       // 이벤트 시작 일시
    private LocalDateTime endEventDateTime;                         // 이벤트 종료 일시
    private String location;    // (optional) 없으면 온라인 모임      // 위치
    private int basePrice;  // (optional)                           // 등록비
    private int maxPrice;   // (optional)                           // max
    private int limitOfEnrollment;                                  // 최대 참가인원

}
