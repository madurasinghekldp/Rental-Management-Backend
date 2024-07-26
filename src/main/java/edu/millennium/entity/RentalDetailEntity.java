package edu.millennium.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="rentalDetail")
public class RentalDetailEntity {
    @Id
    private Long rentalId;
    private Double totalItemCost;
    private Integer qty;
    private Long itemId;

}
