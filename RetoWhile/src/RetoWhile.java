
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
public class RetoWhile {

    public static void main(String[] args) {
        System.out.println("Ingrese 'stop' para detener el codigo");
        Scanner consola = new Scanner(System.in);
        var stop = consola.nextLine();

        while (!"stop".equals(stop)) {
            System.out.println("Porfavor ingrese stop");
            stop = consola.nextLine();
        }

    }

}
