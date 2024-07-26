package edu.millennium.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RentalDetail {
    private Double totalItemCost;
    private Integer qty;
    private Long itemId;
    private Long rentalId;
}
