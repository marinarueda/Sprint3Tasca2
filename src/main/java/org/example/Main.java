package org.example;


public class Main {
    public static void main(String[] args) {

        // Creamos agente de bolsa
        AgenteBolsa agente1 = new AgenteBolsa("Agente 1");


        // Creamos las agencias de bolsa
        AgenciaDeBorsa agencia1 = new AgenciaDeBorsa("Agencia 1");
        AgenciaDeBorsa agencia2 = new AgenciaDeBorsa("Agencia 2");
        AgenciaDeBorsa agencia3 = new AgenciaDeBorsa("Agencia 3");

        // Añadimos las agencias de bolsa como observadores del agente de bolsa
        agente1.addObserver(agencia1);
        agente1.addObserver(agencia2);
        agente1.addObserver(agencia3);

        // Simulamos cambios en el precio de la acción
        agente1.setStockPrice(100);
        agente1.setStockPrice(120);
        agente1.setStockPrice(90);

        // Removemos una de las agencias de bolsa como observador
        agente1.removeObserver(agencia1);


    }

}





