package YNFWK;

public class YNException extends Exception {
    String e;

    public YNException(String error, String clase, String metodo) {

        e = error;
        System.out.println("[ERROR APP --> LOG] " + clase + "." + metodo + " : " + e);
        System.out.println("Solo puede ingresar dos nombres");
    }

    @Override
    public String getMessage() {
        return e;
    }
}
