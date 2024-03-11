import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class Esercizio2 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio2.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Inserisci il numero di km percorsi: ");
            double km = scanner.nextDouble();

            System.out.print("Inserisci il numero di litri di carburante consumati: ");
            double litri = scanner.nextDouble();

            if (litri == 0) {
                throw new ArithmeticException("Errore: Impossibile dividere per zero.");
            }

            double kmPerLitro = km / litri;
            System.out.println("Numero di km/litro percorsi: " + kmPerLitro);
        } catch (Exception e) {
            logger.error("Errore durante l'input: {}", e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
