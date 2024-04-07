import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Esta Linea envia el mensaje de bienvenida al Juego
        System.out.println("Juego del Número secreto");

//Declara las variables a usar
        int numeroGenerado;
        int numeroUsuario;
        int intentos = 0;
        int maximoIntentos = 5;

//Crea la clases para el ingreso de los datos
        Scanner lector = new Scanner(System.in);
        Random rand = new Random();

//Crea un numero aleatorio del 1 al 10
        numeroGenerado = rand.nextInt(10) + 1;

//Solicita el ingreso del numero al usuario
        while (intentos < maximoIntentos) {
            System.out.println("Digite Un numero del 1 al 10");
            numeroUsuario = lector.nextInt();
            intentos++;

//Mensaje condicion acierto
            String mensajeAcierto = "¡Número Correcto! ¡Adivinaste en " + intentos + " intentos!";

// Evalúa si el número ingresado es correcto
            if (numeroUsuario == numeroGenerado) {
                if (intentos == maximoIntentos) {
                    System.out.println("Lo siento no acertaste el numero, vuelva a jugar");
                }
                else {
                    System.out.println(mensajeAcierto);
                }
            break;
            } else if (numeroUsuario < numeroGenerado) {
                System.out.println("Vuelve a intentarlo, el numero es mayor");
            } else {
                System.out.println("Vuelve a intentarlo, el numero es menor");
            }
        }

    }
}