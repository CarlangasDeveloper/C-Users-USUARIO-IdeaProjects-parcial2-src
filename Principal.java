import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Telefono telefonoUno = new Telefono("Iphone 11 Pro max", "Telefono gama alta", 3399999, 100, "iPhone", 256, true, "Blanco", 6.5);
        Telefono telefonoDos = new Telefono("Iphone 12 Pro max", "Telefono gama muy alta", 4399999, 50, "iPhone", 256, false, "Azul", 6.7);
        Telefono telefonoTres = new Telefono("Iphone 13 Pro max", "Telefono gama demasiado alta", 5800000, 80, "iPhone", 256, false, "Rojo", 6.1);
        Telefono telefonoCuatro = new Telefono("Samsung Galaxy 10 plus", "Telefono gama media", 1500000, 15, "Samsung", 512, true, "Negro", 6.5);

        telefonoUno.mostrarInfo();
        System.out.println("\n");
        telefonoDos.mostrarInfo();
        System.out.println("\n");
        telefonoTres.mostrarInfo();
        System.out.println("\n");
        telefonoCuatro.mostrarInfo();
    }
}
