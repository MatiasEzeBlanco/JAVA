/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicajava;

import java.util.Scanner;

public class PracticaJava {
    
    public static void main(String[] args) {
        System.out.println("Determine el alto del rectangulo:");
        Scanner consola = new Scanner(System.in);
        var alto = Integer.parseInt(consola.nextLine());
        
        System.out.println("Determine el ancho del rectangulo:");
        var ancho = Integer.parseInt(consola.nextLine());
        
        var area = alto * ancho;
        var perimetro = (alto + ancho)* 2;
                
        System.out.println("El Area del triangulo es :" + area);
        System.out.println("El Perimetro es : "+ perimetro);
    }
    
}
