package org.ulpgc.is1.model;

public class Member extends Customer{
    private int points;
    private Address address;

    public Member(String name, String surname, NIF nif, int points, String street, int number, int floor, String city) {
        super(name, surname, nif);
        this.points = points;
        setAddress(street, number, floor, city);
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(String street, int number, int floor, String city) {
        this.address = new Address(street, number, floor, city);
    }

}
