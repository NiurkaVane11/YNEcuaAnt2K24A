package YNBL;

public abstract class YNAlimento {
    protected String tipo;

    @Override
    public String toString() {
        if (tipo == null)
            tipo = " ";
        return tipo.toUpperCase();
    }
}
