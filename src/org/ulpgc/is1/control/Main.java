package org.ulpgc.is1.control;

import org.ulpgc.is1.model.CourtType;
import org.ulpgc.is1.model.NIF;
import org.ulpgc.is1.model.PaddleManager;

public class Main {
    public static void innit(PaddleManager paddleManager){
        paddleManager.addCustomer("Pablo", "Escobar", new NIF("46253476Q"));
        paddleManager.addCustomer("Manolo", "Hernández", new NIF("12SD34TT4"));
        paddleManager.addCourt("Rápida", 40, CourtType.fastCourt);
        paddleManager.addCourt("Lenta", 35, CourtType.slowCourt);

    }
    public static void main(String[] args) {
        PaddleManager paddleManager = new PaddleManager();
        innit(paddleManager);
        System.out.println(paddleManager.getCustomer(0).getNif());
        System.out.println(paddleManager.getCustomer(1).getNif());
        System.out.println(paddleManager.getCustomer(0));
        System.out.println(paddleManager.getCustomer(1));
        System.out.println(paddleManager.getCourt(1));
        //paddleManager.reserve(paddleManager.getCustomer(0), paddleManager.getCourt(1), paddleManager.getCustomersList().get(0).getReservationList().get(0).getExtraList());

    }

}
