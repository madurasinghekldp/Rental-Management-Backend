package edu.millennium.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rental {
    private Long id;
    private Date rentalDate;
    private Date expectedReturnDate;
    private Date returnedDate;
    private Date dueDate;
    private Double totalCost;
    private Double fine;
    private Long customerId;
}
