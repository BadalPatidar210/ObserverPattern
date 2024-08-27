package ObserverPattern.Observable;
import ObserverPattern.Observer.NotificationAlertObserver;
import java.util.ArrayList;
import java.util.List;
public class IPhoneObservableImpl implements StocksObservable {
    public List<NotificationAlertObserver> observerList = new ArrayList<NotificationAlertObserver>();
    public int stocksCount  = 0;

    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    public void remove(NotificationAlertObserver observer){
        observerList.remove(observer);
    }

    public void notifySubscribers(){
        for(NotificationAlertObserver observer : observerList){
            observer.update();
        }
    }


    public void setStocksCount(int stocksCountAdded){
        if(stocksCount == 0){
            notifySubscribers();
        }
        stocksCount += stocksCountAdded;
    }

    public int getStockCount(){
        return stocksCount;
    }
}
