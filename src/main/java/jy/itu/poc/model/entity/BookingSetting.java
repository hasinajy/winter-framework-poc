package jy.itu.poc.model.entity;

import lombok.Data;

@Data
public class BookingSettings {
    private int bookingTimeLimit = 4;
    private int cancellationTimeLimit = 24;
}
