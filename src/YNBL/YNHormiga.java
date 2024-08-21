package YNBL;

public abstract class YNHormiga implements IYNHormiga {
    protected String tipo;

    @Override
    public String toString() {
        if (tipo == null)
            tipo = " ";
        return tipo.toUpperCase();
    }
}
