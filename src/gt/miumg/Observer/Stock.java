package gt.miumg.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Stock implements Subject{

    private List<Observer> observers;
    private String name;
    private float price;
    private int Volumen;


    public Stock(String name, float initialprice, int volumen) {
        this.name = name;
        this.price = initialprice;
        this.Volumen = volumen;
        this.observers = new ArrayList<Observer>();
    }
    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }
    public float getPrice() {
        return price;
    }
    public void setVolumen(int volumen) {
        this.Volumen = volumen;
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (Observer o : observers) {
            executor.execute(()->o.update(name,price,Volumen));
        }
        executor.shutdown();
    }
}
