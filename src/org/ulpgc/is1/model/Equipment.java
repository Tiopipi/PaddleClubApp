package org.ulpgc.is1.model;

public class Equipment extends Extra{
    private String name;

    public Equipment(int price, String name) {
        setPrice(price);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "name='" + name + '\'' +
                '}';
    }
}
