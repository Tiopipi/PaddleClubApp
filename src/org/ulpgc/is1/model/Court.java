package org.ulpgc.is1.model;

import java.util.ArrayList;
import java.util.List;

public class Court {
    private List<Reservation> reservationList;
    private String name;
    private int price;
    private CourtType type;

    public Court(String name, int price, CourtType type) {
        reservationList = new ArrayList<>();
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public CourtType getType() {
        return type;
    }

    public void setType(CourtType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + price +
                ", type=" + type;
    }
}
