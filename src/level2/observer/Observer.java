package level2.observer;
import java.math.BigDecimal;

public interface Observer {
        void update(Observer observer,String stockName, BigDecimal stockPrice);
    }


