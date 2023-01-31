package tableau;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public abstract class TestTriTableau {

    private TriTableau triTableau;

    Integer[] tableau = {5, 42, 12, 1, 3};
    Integer[] resultat = {1, 3, 5, 12, 42};

    public abstract TriTableau getInstanceTestTriTableau();

    public void TriTableauImpl(){
        this.triTableau = this.getInstanceTestTriTableau();

    }

    @BeforeEach
    public void initialisation(){
        triTableau = new TriTableauImpl();
    }

    @Test
    public void testTriTableauOK(){
        Assertions.assertArrayEquals(triTableau.trier(tableau),resultat);
    }

}
