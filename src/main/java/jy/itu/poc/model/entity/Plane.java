package jy.itu.poc.model.entity;

import java.sql.Date;

import jy.itu.poc.model.dto.SeatDetails;
import lombok.Data;

@Data
public class Plane {
    private long id;
    private String model;
    private SeatDetails bSeat;
    private SeatDetails eSeat;
    private Date manufacturingDate;
    private String imgPath;
}
