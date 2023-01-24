package calcul;

import calcul.CalculImpl1;
import exception.ArgsEgAZeroException;
import exception.ArgsInfAZeroException;
import exception.NombreArgsNonValideException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculImpl1 {

    private CalculImpl1 calcul;

    @BeforeEach
    public void initialisation(){
        calcul = new CalculImpl1();
    }

    @Test
    public void testCalculerOK() throws ArgsInfAZeroException, ArgsEgAZeroException, NombreArgsNonValideException {
        double x = 2;
        Assertions.assertEquals(calcul.calculer(x), 0.5773502691896257);
    }

    @Test
    public void testCalculerKOArgsInfAZero(){
        double x = -1;
        Assertions.assertThrows(ArgsInfAZeroException.class, () -> calcul.calculer(x));
    }

    @Test
    public void testCalculerKOArgsEgAZero(){
        double x = 0;
        Assertions.assertThrows(ArgsEgAZeroException.class, () -> calcul.calculer(x));
    }

    @Test
    public void testCalculerKONombreArgsNonValide(){
        double x = 4, y = 12;
        Assertions.assertThrows(NombreArgsNonValideException.class, () -> calcul.calculer(x));
    }





}
