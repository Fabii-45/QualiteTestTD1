package calcul;

import calcul.CalculImpl2;
import exception.ArgsEgAZeroException;
import exception.ArgsInfAZeroException;
import exception.NombreArgsNonValideException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculImpl2 {

    private CalculImpl2 calcul;

    @BeforeEach
    public void initialisation(){
        calcul = new CalculImpl2();
    }

    @Test
    public void testCalculerOK() throws ArgsInfAZeroException, ArgsEgAZeroException, NombreArgsNonValideException {
        double x = 2, y = 10, z = 3;
        Assertions.assertEquals(calcul.calculer(x,y,z), 2.581988897471611);
    }

    @Test
    public void testCalculerKOArgsInfAZero(){
        double x = -3, y = 10, z = 3;
        Assertions.assertThrows(ArgsInfAZeroException.class, () -> calcul.calculer(x,y,z));
    }

    @Test
    public void testCalculerKOArgsEgAZero(){
        double x = 0, y = 10, z = 3;
        Assertions.assertThrows(ArgsEgAZeroException.class, () -> calcul.calculer(x,y,z));
    }

    @Test
    public void testCalculerKONombreArgsNonValide(){
        double x = 4, y = 12;
        Assertions.assertThrows(NombreArgsNonValideException.class, () -> calcul.calculer(x,y));
    }
}
