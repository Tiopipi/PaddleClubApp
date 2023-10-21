package org.ulpgc.is1.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaddleManager {
    private List<Customer> customersList;
    private List<Court> courtsList;
    private List<Reservation> reservationList;

    public PaddleManager() {
        customersList = new ArrayList<>();
        courtsList = new ArrayList<>();
        reservationList = new ArrayList<>();
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

    public void removeCustomer(int index) {
        int i = 0;
        while (i < reservationList.size()) {
            if (reservationList.get(i).getCustomer().getName().equals(customersList.get(index).getName())) {
                reservationList.remove(i);
            }
            i++;
        }
        customersList.remove(index);
    }

    public int countCustomer() {
        return customersList.size();
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


    public void reserve(Customer customer, Court court){
        Reservation reservation = new Reservation(LocalDateTime.now(), customer, court);
        reservationList.add(reservation);
    }

    public void reserve(Customer customer, Court court, String equipment, String name, String surname){
        Reservation reservation = new Reservation(LocalDateTime.now(), customer, court);
        if (equipment == null) reservation.addUmpire(name, surname);
        else if ((name == null) && (surname == null)) {
            reservation.addEquipment(equipment);
        } else {
            reservation.addEquipment(equipment);
            reservation.addUmpire(name, surname);
        }
            reservationList.add(reservation);
    }



    public List<Reservation> getReservationList() {
        return reservationList;
    }
}
