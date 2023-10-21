package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Reservation {
    private static int NEXT_ID = 0;
    private final int id;
    private final LocalDate date;
    private Customer customer;
    private Court court;
    private List<Extra> extraList;

    public Reservation(LocalDate date, Customer customer, Court court) {
        this.id = NEXT_ID;
        NEXT_ID += 1;
        this.date = date;
        this.customer = customer;
        this.court = court;
        this.extraList = new ArrayList<>();
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

    public LocalDate getDate() {
        return date;
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

    public int price(){
        int i = 0;
        int totalCost = 0;
        if (this.extraList == null){
            return this.court.getPrice();
        } else {
            while (i < extraList.size()) {
                totalCost += extraList.get(i).getPrice();
                i++;
            }
            return this.court.getPrice() + totalCost;
        }
    }

    public void addEquipment( String name){
        Equipment equipment = new Equipment(10, name);
        extraList.add(equipment);
    }
    public void addUmpire( String name, String surname){
        Umpire umpire = new Umpire(20, name, surname);
        extraList.add(umpire);
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", date=" + date +
                ", customer=" + customer +
                ", court=" + court.getName() +
                ", price= " + this.price() +
                ", extra=" + extraList +
                '}';
    }

}
