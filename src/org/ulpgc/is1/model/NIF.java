package org.ulpgc.is1.model;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NIF {
    private String number;
    private static final String NIF_REGEX = "^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";

    public NIF(String number) {
        if (isValid(number)) {
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static boolean isValid(String nif) {
        if (nif == null) {
            return false;
        }
        Pattern pattern = Pattern.compile(NIF_REGEX);
        Matcher matcher = pattern.matcher(nif);
        return matcher.matches();
    }

    @Override
    public String toString() {
        return "NIF=" + number;
    }
}
