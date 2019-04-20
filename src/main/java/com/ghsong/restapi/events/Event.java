package com.ghsong.restapi.events;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Builder @AllArgsConstructor @NoArgsConstructor
@Getter @Setter @EqualsAndHashCode(of = "id")
@Entity
public class Event {

    @Id @GeneratedValue
    private Integer id;                                             // ID
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
    private boolean offline;
    private boolean free;
    @Enumerated(EnumType.STRING)
    private EventStatus eventStatus = EventStatus.DRAFT;

    public void update() {
        // Update free
        if (this.basePrice == 0 && this.maxPrice == 0) {
            this.free = true;
        } else {
            this.free = false;
        }

        // Update offline
        if (this.location == null || this.location.isBlank()) {
            this.offline = false;
        } else {
            this.offline = true;
        }
    }
}
