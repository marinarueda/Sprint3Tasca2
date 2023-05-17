package org.example;

public class AgenciaDeBorsa implements Observer {

    private String agencyName;

    public AgenciaDeBorsa(String agencyName) {
        this.agencyName = agencyName;
    }

    @Override
    public void stockPriceIncreased(int newPrice) {
        System.out.println("Agencia de bolsa " + agencyName + ": El precio de la acción ha subido a " + newPrice);
    }

    @Override
    public void stockPriceDecreased(int newPrice) {
        System.out.println("Agencia de bolsa " + agencyName + ": El precio de la acción ha bajado a " + newPrice);
    }


}



