package esercizio3.entities;

import esercizio3.entities.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContoCorrente {
    private static final Logger logger = LoggerFactory.getLogger(ContoCorrente.class);

    String titolare;
    int nMovimenti;
    final int maxMovimenti = 50;
    double saldo;

    public ContoCorrente(String titolare, double saldo) {
        this.titolare = titolare;
        this.saldo = saldo;
        nMovimenti = 0;
    }

    public void preleva(double x) throws BancaException {
        if (nMovimenti < maxMovimenti)
            saldo = saldo - x;
        else
            saldo = saldo - x - 0.50;
        nMovimenti++;

        if (saldo < 0) {
            logger.error("Il conto è in rosso");
            throw new BancaException("Il conto è in rosso");
        }
    }

    public double restituisciSaldo() {
        return saldo;
    }
}
