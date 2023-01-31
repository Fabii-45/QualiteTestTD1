package tableau;

public class TestTriBulleTableauImpl extends TestTriTableau{
    @Override
    public TriTableau getInstanceTestTriTableau() {
        return new TriBulleTableauImpl();
    }
}
