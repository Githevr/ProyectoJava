/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author DESKTOP
 */
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(); // Usa la clase de la actividad 1
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            int a = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el segundo número: ");
            int b = Integer.parseInt(scanner.nextLine());

            int resultado = calc.sumar(a, b);
            System.out.println("Resultado: " + resultado);
        } catch (NumberFormatException e) {
            System.out.println(" Error: Debes ingresar solo números enteros.");
        } catch (Exception e) {
            System.out.println(" Ocurrió un error inesperado.");
        }
    }
}
