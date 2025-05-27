package level2.brokerAgency;

import level2.observer.Observer;

import java.math.BigDecimal;

public class BrokerAgency implements Observer {
    private String brokerAgencyName;

    public BrokerAgency(String brokerName) {
        this.brokerAgencyName = brokerName;
    }

    @Override
    public void update(Observer observer, String stockName, BigDecimal stockPrice) {
        System.out.println("Hello " + brokerAgencyName + "! New price has been placed on " + stockName);
    }

    @Override
    public String toString() {
        return brokerAgencyName;
    }
}
