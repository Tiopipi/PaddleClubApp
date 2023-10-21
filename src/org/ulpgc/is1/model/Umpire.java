package org.ulpgc.is1.model;

public class Umpire extends Extra{
    private String name;
    private String surname;

    public Umpire(int price, String name, String surname) {
        setPrice(price);
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String getName() {
        return name + " " + surname;
    }

    @Override
    public String toString() {
        return "Umpire{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
