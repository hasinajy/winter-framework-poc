package jy.itu.poc.model.entity;

import java.sql.Timestamp;

import jy.itu.poc.model.dto.DiscountDetails;
import lombok.Data;

@Data
public class Flight {
    private long id;
    private City departureCity;
    private City destinationCity;
    private Plane plane;
    private Timestamp departureTime;
    private DiscountDetails bDiscount;
    private DiscountDetails eDiscount;
}
