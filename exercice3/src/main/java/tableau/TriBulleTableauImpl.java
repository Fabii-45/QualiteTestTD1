package tableau;

public class TriBulleTableauImpl implements TriTableau {
    public Integer[] trier(Integer[] t) {
        int n = t.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (t[j] > t[j + 1]) {
                    int temp = t[j];
                    t[j] = t[j + 1];
                    t[j + 1] = temp;
                }
            }
        }
        return t;
    }
}
