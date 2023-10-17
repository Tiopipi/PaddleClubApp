package org.ulpgc.is1.model;

import java.util.Date;
import java.util.List;

public class Reservation {
    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private Customer customer;
    private Court court;
    private List<Extra> extraList;

    public Reservation(int id, Date date, Customer customer, Court court, List<Extra> extraList) {
        this.id = id;
        this.date = date;
        this.customer = customer;
        this.court = court;
        this.extraList = extraList;
    }

    public static int getNextId() {
        return NEXT_ID;
    }

    public static void setNextId(int nextId) {
        NEXT_ID = nextId;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Court getCourt() {
        return court;
    }

    public void setCourt(Court court) {
        this.court = court;
    }

    public List<Extra> getExtraList() {
        return extraList;
    }

    public void setExtraList(List<Extra> extraList) {
        this.extraList = extraList;
    }

    public int price(int index){
        return this.court.getPrice() + this.extraList.get(index).getPrice();
    }
}
