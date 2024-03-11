package esercizio3.entities;

import esercizio3.entities.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ContoOnLine extends ContoCorrente {
    private static final Logger logger = LoggerFactory.getLogger(ContoOnLine.class);

    double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxP) {
        super(titolare, saldo);
        this.maxPrelievo = maxP;
    }

    public void stampaSaldo() {
        System.out.println("Titolare:" + titolare + "-Saldo" + saldo + "-Num Movimenti:" + nMovimenti + "-Massimo movimenti:" + maxMovimenti + "Massimo prelievo possibile:" + maxPrelievo);
    }

    @Override
    public void preleva(double x) throws BancaException {
        if (x > maxPrelievo) {
            logger.error("Il prelievo non è disponibile");
            throw new BancaException("Il prelievo non è disponibile");
        }
        super.preleva(x);
    }
}
