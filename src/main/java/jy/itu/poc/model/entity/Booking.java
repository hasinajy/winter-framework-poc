package jy.itu.poc.model.entity;

import lombok.Data;

@Data
public class Booking {
    private long id;
    private Flight flight;
    private SystemUser user;
    private boolean isBusinessClass = false;
}
