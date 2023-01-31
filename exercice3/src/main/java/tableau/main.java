package tableau;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        TriTableauImpl tab = new TriTableauImpl();
        Integer[] tableau = {5, 42, 12, 1, 3};

        TriBulleTableauImpl tabBulle = new TriBulleTableauImpl();
        TriFusionTableauImpl tabFusion = new TriFusionTableauImpl();

        System.out.println(Arrays.toString(tab.trier(tableau)));
        System.out.println(Arrays.toString(tabBulle.trier(tableau)));
        System.out.println(Arrays.toString(tabFusion.trier(tableau)));

    }
}
