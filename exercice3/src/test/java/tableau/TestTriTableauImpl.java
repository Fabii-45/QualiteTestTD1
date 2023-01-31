package tableau;

import calcul.CalculImpl1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestTriTableauImpl extends TestTriTableau{
    @Override
    public TriTableau getInstanceTestTriTableau() {
        return new TriTableauImpl();
    }
}
