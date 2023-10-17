package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaddleManager {
    private List<Customer> customersList;
    private List<Court> courtsList;

    public PaddleManager() {
        customersList = new ArrayList<>();
        courtsList = new ArrayList<>();
    }

    public List<Customer> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customer> customersList) {
        this.customersList = customersList;
    }

    public List<Court> getCourtsList() {
        return courtsList;
    }

    public void setCourtsList(List<Court> courtsList) {
        this.courtsList = courtsList;
    }

    public void addCustomer(String name, String surname, NIF nif){
        Customer customer = new Customer(name, surname, nif);
        if(!customersList.contains(customer)) customersList.add(customer);
    }

    public void addCourt(String name, int price, CourtType type){
        Court court = new Court(name, price, type);
        if(!courtsList.contains(court)) courtsList.add(court);
    }

    public Customer getCustomer(int index){
        return customersList.get(index);
    }

    public Court getCourt(int index){
        return courtsList.get(index);
    }

    public void reserve(Customer customer, Court court, List<Extra> extraList){
        Reservation reservation = new Reservation(LocalDateTime.now(), customer, court, extraList);
        System.out.println("Su reserva ha sido realizada con éxito");
    }
}
