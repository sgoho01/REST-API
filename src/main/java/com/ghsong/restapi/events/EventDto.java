package com.ghsong.restapi.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class EventDto {

    @NotEmpty
    private String name;                                            // 이름
    @NotEmpty
    private String description;                                     // 설명
    @NotNull
    private LocalDateTime beginEnrollmentDateTime;                  // 이벤트 등록 시간
    @NotNull
    private LocalDateTime closeEnrollmentDateTime;                  // 이벤트 종료 시간
    @NotNull
    private LocalDateTime beginEventDateTime;                       // 이벤트 시작 일시
    @NotNull
    private LocalDateTime endEventDateTime;                         // 이벤트 종료 일시
    private String location;    // (optional) 없으면 온라인 모임      // 위치
    @Min(0)
    private int basePrice;  // (optional)                           // 등록비
    @Min(0)
    private int maxPrice;   // (optional)                           // max
    @Min(0)
    private int limitOfEnrollment;                                  // 최대 참가인원

}
