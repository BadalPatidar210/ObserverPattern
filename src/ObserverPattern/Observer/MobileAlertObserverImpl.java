package ObserverPattern.Observer;

import ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String userName;
    StocksObservable observable;

    public MobileAlertObserverImpl(String userName, StocksObservable observable){
        this.userName = userName;
        this.observable = observable;
    }

    @Override
    public void update(){
        sendMsgOnMobile(userName, "Product is in stock hurry up");
    }

    public void sendMsgOnMobile(String userName, String message){
        System.out.println("Message sent to "+userName+" "+message);
    }
}