package calcul;

import exception.ArgsEgAZeroException;
import exception.ArgsInfAZeroException;
import exception.NombreArgsNonValideException;

public class CalculImpl1 implements Calcul{


    @Override
    public double calculer(double... args) throws ArgsInfAZeroException, ArgsEgAZeroException, NombreArgsNonValideException {
        if(args.length==1) {
            if(args[0]==0){
                throw new ArgsEgAZeroException();
            } else if(args[0]<0){
                throw new ArgsInfAZeroException();
            } else {
                return Math.sqrt(1 / (Math.pow(args[0], 2) - 1));
            }
        } else {
            throw new NombreArgsNonValideException();
        }
    }
}
