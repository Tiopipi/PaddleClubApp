package org.ulpgc.is1.model;

import java.util.Objects;

public class NIF {
    private String number;

    public NIF(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static boolean isValid(String nif){
        String NIF_letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        String number = nif.substring(0, nif.length()-1);
        boolean valid;
        valid = nif.charAt(nif.length()-1) == NIF_letters.charAt(Integer.parseInt(number) % 23);
        return valid;

    }

    public static void main(String[] args) {
        System.out.println(isValid("45351203X"));
    }


}
