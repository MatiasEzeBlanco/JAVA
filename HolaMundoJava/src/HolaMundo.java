
import java.util.Scanner;

//Inicio del curso
public class HolaMundo {

    public static void main(String args[]) {
        System.out.println("Hola Mundo");
        Scanner consola = new Scanner(System.in);
                System.out.println("Escrbie el autor:");
                var autor = consola.nextLine();
                System.out.println("Escribe el titulo:");
                var titulo = consola.nextLine();
                System.out.println(titulo + " " + "fue escrito por" + " " + autor);
    }
}