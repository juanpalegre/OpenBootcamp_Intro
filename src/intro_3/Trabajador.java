package intro_3;

public class Trabajador extends Persona{

    private int salario;

    public Trabajador(){}

    public Trabajador(int salario) {
        this.salario = salario;
    }

    public Trabajador(String nombre, int edad, String telefono, int salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "salario=" + salario +
                "} " + super.toString();
    }
}
