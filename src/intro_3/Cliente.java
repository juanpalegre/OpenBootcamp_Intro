package intro_3;

public class Cliente extends Persona{

    private int credito;

    public Cliente(){}

    public Cliente(int credito) {
        this.credito = credito;
    }

    public Cliente(String nombre, int edad, String telefono, int credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "credito=" + credito +
                "} " + super.toString();
    }
}
