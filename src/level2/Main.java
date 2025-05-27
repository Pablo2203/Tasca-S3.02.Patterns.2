package level2;

import level2.brokerAgency.BrokerAgency;
import level2.brokerAgent.BrokerAgent;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BrokerAgent brokerAgent = new BrokerAgent("Amazon", BigDecimal.valueOf(100.00));

        BrokerAgency observer1 = new BrokerAgency("Trade Republic");

        brokerAgent.registerObserver(observer1);

        brokerAgent.setStockPrice(BigDecimal.valueOf(120.00));

        brokerAgent.notifyObservers();

        brokerAgent.setStockPrice(BigDecimal.valueOf(90.00));

        brokerAgent.notifyObservers();

        System.out.println("The historical price of " + brokerAgent.getStockName() + " is: " + brokerAgent.getHistorical("Amazon"));



    }
}

