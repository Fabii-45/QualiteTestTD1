package tableau;

public class TestTriFusionTableauImpl extends TestTriTableau {
    @Override
    public TriTableau getInstanceTestTriTableau() {
        return new TriFusionTableauImpl();
    }
}
