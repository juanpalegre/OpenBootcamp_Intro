package intro_2;

public class EstructurasDeControl {

    public static void main(String[] args) {

        int miNumero = 3;
        positivoONegativo(miNumero);
        mostrarElementos(miNumero);
        ejecutarUnaVez();
        mostrarElementosConFor(miNumero);
        estacionesDelAño(miNumero);

    }

    public static void positivoONegativo(int a){
        if (a < 0){
            System.out.println("el numero es negativo");
        }else if (a > 0){
            System.out.println("el numero es positivo");
        }else {
            System.out.println("El numero es igual a 0");
        }
    }

    public static void mostrarElementos(int a){
        while (a <= 3){
            System.out.println(a);
            a++;
        }
    }

    public static void ejecutarUnaVez(){
        int numero = 3;
        do {
            System.out.println(numero);
            numero++;
        }while (numero <= 3);
    }

    public static void mostrarElementosConFor(int a){
        for (int i = 0 ; i < a ; i++){
            System.out.println(i);
        }
    }

    public static void estacionesDelAño(int a){
        switch (a){
            case 1:
                System.out.println("Estamos en otoño!");
                break;
            case 2:
                System.out.println("Estamos en invierno!");
            case 3:
                System.out.println("Estamos en primavera!");
                break;
            case 4:
                System.out.println("Estamos en verano!");
                break;
            default:
                System.out.println("Tené en cuenta que las estaciones van del uno al cuatro ;)");
        }
    }

}
