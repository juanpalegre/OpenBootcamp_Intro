package intro_3;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Juan", 34, "1234556");
        System.out.println(persona.toString());
        System.out.println("Feliz cumple!");
        persona.setEdad(35);
        System.out.println(persona);

        Cliente cliente = new Cliente("Pedro", 23, "1232142", 5000);
        System.out.println(cliente);

        Trabajador trabajador = new Trabajador("Maria", 44, "1231244", 2000);
        System.out.println(trabajador);

    }

}
