package org.ulpgc.is1.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaddleManager {
    private List<Customer> customersList;
    private List<Court> courtsList;
    private List<Reservation> reservationList;
    private List<Member> memberList;

    public PaddleManager() {
        customersList = new ArrayList<>();
        courtsList = new ArrayList<>();
        reservationList = new ArrayList<>();
        memberList = new ArrayList<>();
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

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public List<Member> getMemberList() {
        return memberList;
    }

    public void setMemberList(List<Member> memberList) {
        this.memberList = memberList;
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

    public void addMember(String name, String surname, NIF nif, int points, String street, int number, int postalCode, String city){
        Member member = new Member(name, surname, nif, points, street, number, postalCode, city);
    }

    public void removeMember(int index) {
        memberList.remove(index);
    }

    public int countCustomer() {
        return customersList.size();
    }
    public int countCourt() {
        return courtsList.size();
    }
    public int countMember() {
        return memberList.size();
    }
    public int countReservation() {
        return reservationList.size();
    }

    public void addCourt(String name, int price, CourtType type){
        Court court = new Court(name, price, type);
        if(!courtsList.contains(court)) courtsList.add(court);
    }

    public void removeCourt(int index) {
        int i = 0;
        while (i < reservationList.size()) {
            if (reservationList.get(i).getCourt().getName().equals(courtsList.get(index).getName())) {
                reservationList.remove(i);
            }
            i++;
        }
        courtsList.remove(index);
    }

    public Customer getCustomer(int index){
        return customersList.get(index);
    }

    public Court getCourt(int index){
        return courtsList.get(index);
    }

    public Reservation getReservation(int index){
        return reservationList.get(index);
    }

    public Member getMember(int index){
        return memberList.get(index);
    }


    public void reserve(int year, int month, int day,Customer customer, Court court){
        Reservation reservation = new Reservation(LocalDate.of(year, month, day), customer, court);
        if(!reservationList.contains(reservation)) reservationList.add(reservation);
    }

    public void reserve(int year, int month, int day, Customer customer, Court court, String equipment, String name, String surname){
        Reservation reservation = new Reservation(LocalDate.of(year, month, day), customer, court);
        if (equipment == null) reservation.addUmpire(name, surname);
        else if ((name == null) && (surname == null)) {
            reservation.addEquipment(equipment);
        } else {
            reservation.addEquipment(equipment);
            reservation.addUmpire(name, surname);
        }
        if(!reservationList.contains(reservation)) reservationList.add(reservation);
    }




}
