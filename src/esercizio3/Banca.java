package esercizio3;

import esercizio3.entities.ContoCorrente;
import esercizio3.entities.ContoOnLine;
import esercizio3.entities.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Banca {
    private static final Logger logger = LoggerFactory.getLogger(Banca.class);

    public static void main(String[] args) {
        ContoCorrente conto1 = new ContoCorrente("Grossi Mario", 20000.0);
        System.out.println("Saldo conto:" + conto1.restituisciSaldo());
        try {
            conto1.preleva(1750.5);
            System.out.println("Saldo conto:" + conto1.restituisciSaldo());
        } catch (BancaException e) {
            logger.error("Errore durante il prelievo: {}", e.getMessage());
            e.printStackTrace();
        }

        ContoOnLine conto2 = new ContoOnLine("Rossi Luigi", 50350.0, 1500);
        conto2.stampaSaldo();
        try {
            conto2.preleva(2000);
            conto2.stampaSaldo();
        } catch (BancaException e) {
            logger.error("Errore durante il prelievo: {}", e.getMessage());
            e.printStackTrace();
        }
    }
}
