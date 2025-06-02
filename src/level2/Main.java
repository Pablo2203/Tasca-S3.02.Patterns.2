package level2;

import level2.brokerAgency.BrokerAgency;
import level2.brokerAgent.BrokerAgent;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BrokerAgent brokerAgent = new BrokerAgent("Amazon", BigDecimal.valueOf(100.00));

        BrokerAgency observer1 = new BrokerAgency("Trade Republic");

        BrokerAgency observer2 = new BrokerAgency("eToro");

        brokerAgent.registerObserver(observer1);

        brokerAgent.registerObserver(observer2);

        System.out.println("----------------------------------");

        brokerAgent.setStockPrice(BigDecimal.valueOf(120.00));

        brokerAgent.notifyObservers();

        System.out.println("----------------------------------");

        brokerAgent.removeObserver(observer1);

        System.out.println("----------------------------------");

        brokerAgent.setStockPrice(BigDecimal.valueOf(90.00));

        brokerAgent.notifyObservers();

        System.out.println("----------------------------------");


        System.out.println("The historical price of " + brokerAgent.getStockName() + " is: " + brokerAgent.getHistorical("Amazon"));



    }
}

