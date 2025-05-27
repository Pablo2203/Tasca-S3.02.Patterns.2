package level2.brokerAgent;

import level2.observer.Observer;
import level2.subject.Subject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrokerAgent implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private Map<String, List<BigDecimal>> historical = new HashMap<>();
    private String stockName;
    private BigDecimal stockPrice;
    private Observer observer;

    public BrokerAgent(String stockName, BigDecimal stockPrice) {
        this.stockName = stockName;
        this.stockPrice = stockPrice;
        addHistorical(stockName, stockPrice);

    }

    public String getStockName() {
        return stockName;
    }

    public void setStockPrice(BigDecimal stockPrice) {
        this.stockPrice = stockPrice;
        addHistorical(this.stockName, stockPrice);

    }

    public void addHistorical(String stockName, BigDecimal stockPrice){
        historical.putIfAbsent(stockName, new ArrayList<BigDecimal>());
        historical.get(stockName).add(stockPrice);

    }

    public List<BigDecimal> getHistorical(String stockName) {
        return historical.get(stockName);
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("New Observer registered");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer removed");
    }

    @Override
    public void notifyObservers() {
        List<BigDecimal> priceHistory = historical.get(stockName);

        if (priceHistory == null || priceHistory.size() < 2) {
            return;
        }

        BigDecimal previousPrice = priceHistory.get(priceHistory.size() - 2);

        if (stockPrice.compareTo(previousPrice) > 0) {
            System.out.println("ALERT: The price has increased. New price: " + stockPrice +
                    ", Previous price: " + previousPrice);
        } else if (stockPrice.compareTo(previousPrice) < 0) {
            System.out.println("ALERT: The price has decreased. New price: " + stockPrice +
                    ", Previous price: " + previousPrice);
        } else {
            return;
        }

        for (Observer ob : observers) {
            ob.update(this.observer, this.stockName, this.stockPrice);
        }
    }
}

