package com.psh10066.refactoring._14_lazy_elements._34_collapse_hierarchy;

import java.time.LocalDateTime;
import java.util.List;

public class Reservation {

    // Pull Members Down 리팩토링을 통해 하위 클래스로 필드를 옮기고 상위 클래스를 없애는 쪽으로 리팩토링을 진행할 수 있다.
    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private List<String> members;

    private String owner;

    private boolean paid;
}
