package ru.danyabereg;

import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@Builder
@NoArgsConstructor
@Getter
@Setter
public class ProductEvent {
    private String name;
    private String title;
    private BigDecimal price;
    private Integer quantity;
    private Date date;
}
