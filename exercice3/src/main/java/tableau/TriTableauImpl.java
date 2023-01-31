package tableau;

import java.util.Arrays;

public class TriTableauImpl implements TriTableau{
    @Override
    public Integer[] trier(Integer[] t) {
        Arrays.sort(t);
        return t;
    }
}
