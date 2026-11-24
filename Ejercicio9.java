import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respuesta, cantidad = 0;
        int suma = 0;

        while (true) {
            System.out.print("Respuesta del 1 al 5 (0 termina): ");
            respuesta = sc.nextInt();

            if (respuesta == 0) {
                break;
            }

            if (respuesta >= 1 && respuesta <= 5) {
                suma += respuesta;
                cantidad++;
            }
        }

        System.out.println("Total de respuestas: " + cantidad);

        if (cantidad > 0) {
            System.out.println("Promedio: " + (double) suma / cantidad);
        } else {
            System.out.println("No hay respuestas validas");
        }

        sc.close();
    }
}