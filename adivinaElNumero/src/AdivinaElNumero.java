import java.util.Scanner;

public class AdivinaElNumero {

    private Scanner entrada = new Scanner(System.in);
    private boolean juegoActivo = true;

    public void jugar() {

        System.out.println("Hola, ¿Cuál es tu nombre?");
        String nombreJugador = entrada.nextLine();
        System.out.printf("Bienvenido %s. Vamos a comenzar\n", nombreJugador);

        int min = 0;
        int max = 20;
        int numeroJuego = (int) (Math.random() * (max - min + 1) + min);
        System.out.println("El número aleatorio está entre " + min + " y " + max + ". ¡Adivina el número!");

        while (juegoActivo) {
            System.out.print("Ingresa tu número: ");
            int numeroUsuario = entrada.nextInt();

            if (numeroUsuario == numeroJuego) {
                System.out.println("¡Felicidades, has acertado!");
                juegoActivo = false; // Termina el juego si el usuario acierta
            } else {
                System.out.println("Lo siento, has perdido. Intenta nuevamente.");
            }
        }
    }

    public static void main(String[] args) {
        AdivinaElNumero juego = new AdivinaElNumero();
        juego.jugar();
    }
}
