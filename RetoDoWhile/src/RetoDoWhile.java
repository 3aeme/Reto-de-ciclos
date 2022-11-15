
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class RetoDoWhile {

    public static void main(String[] args) {
        System.out.println("Ingrese un numero, para detener el ciclo debe ser mayor a 500");
        Scanner consola = new Scanner(System.in);
        int numero = consola.nextInt();
        do {
            System.out.println("Para detener el codigo ingrese un numero mayor a 500");
            numero = consola.nextInt();
            
            } while (numero < 500);
        }
    
}
