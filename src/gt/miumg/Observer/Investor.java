package gt.miumg.Observer;

import java.util.List;

public class Investor implements Observer{

    private String name;
    private List<String> interestedStocks;
    private float unsubscribeThreshold;

    public Investor(String name, List<String> interestedStocks, float unsubscribeThreshold) {
        this.name = name;
        this.interestedStocks = interestedStocks;
        this.unsubscribeThreshold = unsubscribeThreshold;
    }

    @Override
            public void update(String stock, float price, int volumen) {
                if (interestedStocks.contains(stock)) {
                    System.out.println("Inversionista " + name + ": El precio de " +stock+ " se actualizó a " + price + " con un volumen de " + volumen);
                    if (price < unsubscribeThreshold) {
                        System.out.println("Inversionista " + name + ": Se está desuscribiendo de " + stock + " ya que el precio está por debajo del umbral.");

                    }
        }
    }

}
