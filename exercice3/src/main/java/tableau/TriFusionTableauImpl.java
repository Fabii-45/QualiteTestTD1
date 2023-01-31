package tableau;

import java.util.Arrays;

public class TriFusionTableauImpl implements TriTableau{
    @Override
    public Integer[] trier(Integer[] t) {
        if (t.length <= 1) return t;

        int mid = t.length / 2;
        Integer[] left = Arrays.copyOfRange(t, 0, mid);
        Integer[] right = Arrays.copyOfRange(t, mid, t.length);

        left = trier(left);
        right = trier(right);

        return fusionner(left, right);
    }

    private Integer[] fusionner(Integer[] left, Integer[] right) {
        Integer[] result = new Integer[left.length + right.length];

        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }
}
