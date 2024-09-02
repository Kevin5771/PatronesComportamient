package gt.miumg.Observer;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stock googleStock = new Stock("Google", 1000.0f, 10000);
        Stock appleStock = new Stock("Apple", 150.0f, 5000);

        // Crear inversionistas con diferentes intereses
        List<String> investor1Interests = List.of("Google", "Apple");
        Investor investor1 = new Investor("Alice", investor1Interests, 940.0f);

        List<String> investor2Interests = List.of("Apple");
        Investor investor2 = new Investor("Bob", investor2Interests, 160.0f);

        googleStock.registerObserver(investor1);
        googleStock.registerObserver(investor2);
        appleStock.registerObserver(investor1);
        appleStock.registerObserver(investor2);

        // Simular cambios en el mercado
        googleStock.setPrice(980.0f); // Ambos inversionistas recibirán notificación
        appleStock.setPrice(135.0f);  // Ambos inversionistas recibirán notificación

        // Simular un cambio de volumen
        googleStock.setVolumen(12000);

        // Cambio que provoca la desuscripción
        googleStock.setPrice(940.0f);

    }
}
