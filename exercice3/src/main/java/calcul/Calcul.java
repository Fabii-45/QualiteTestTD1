package calcul;

import exception.ArgsEgAZeroException;
import exception.ArgsInfAZeroException;
import exception.NombreArgsNonValideException;

public interface Calcul {

    double calculer(double... args) throws ArgsInfAZeroException, ArgsEgAZeroException, NombreArgsNonValideException;
}
