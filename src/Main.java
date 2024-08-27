import ObserverPattern.Observable.IPhoneObservableImpl;
import ObserverPattern.Observable.StocksObservable;
import ObserverPattern.Observer.EmailAlertObserverImpl;
import ObserverPattern.Observer.MobileAlertObserverImpl;
import ObserverPattern.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {

        StocksObservable iPhoneStockObservable = new IPhoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("badalpatidar210", iPhoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("shubhamcool72", iPhoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("prachibeautifool12", iPhoneStockObservable);

        iPhoneStockObservable.add(observer1);
        iPhoneStockObservable.add(observer2);
        iPhoneStockObservable.add(observer3);

        iPhoneStockObservable.setStocksCount(40);
        iPhoneStockObservable.setStocksCount(0);
        iPhoneStockObservable.setStocksCount(40);

    }
}