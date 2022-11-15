
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class RetoFor {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero de tabla deseada");
        Scanner consola = new Scanner(System.in);
        int numero = consola.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println("Aqui esta la tabla del " + numero);
            System.out.println(numero * i);
        }

        }

    
}
