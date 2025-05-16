/*Desarrollar un programa que calcule el total de una compra en farmacia y
aplique un descuento si supera cierta cantidad. Este reto refuerza el uso
de operadores aritméticos, asignación, entrada por consola, e inferencia
de tipo con var.*/

import java.util.Scanner;
public class SimuladorFarmacia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre del medicamento: ");
        String nom_med = scanner.nextLine();

        System.out.println("Precio unitario: ");
        double pre_uni = scanner.nextDouble();

        System.out.println("Cantidad de piezas: ");
        int cant_piezas = scanner.nextInt();

        double totalSin = pre_uni * cant_piezas;

        //regresa true/false
        var aplicaDescuento  = totalSin>=500;

        //operador ternario
        //si aplicaDesc=true se multiplica, si no 0;
        double descuento = aplicaDescuento ? totalSin*.15 : 0;

        double total = totalSin-descuento;

        System.out.println("Medicamento: " + nom_med);
        System.out.println("Cantidad: " + cant_piezas);
        System.out.println("Precio Unitario: " + pre_uni);
        System.out.println("Total sin descuento: " + totalSin);
        System.out.println("¿Aplica descuento?: " + aplicaDescuento);
        System.out.println("Descuento: " + descuento);
        System.out.println("Total a pagar: " + total);


    }
}