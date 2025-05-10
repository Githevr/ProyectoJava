/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
/**
 *
 * @author DESKTOP
 */
public class ColeccionesDemo {
    public static void main(String[] args) {

        
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        System.out.println("ArrayList (frutas): " + frutas);

        frutas.remove("Banana");
        System.out.println("Después de eliminar 'Banana': " + frutas);

        for (String fruta : frutas) {
            System.out.println("Fruta: " + fruta);
        }

        
        LinkedList<String> nombres = new LinkedList<>();
        nombres.add("Ana");
        nombres.add("Luis");
        nombres.addFirst("Carlos");
        System.out.println("\nLinkedList (nombres): " + nombres);

        nombres.removeLast();
        System.out.println("Después de eliminar el último: " + nombres);

        for (String nombre : nombres) {
            System.out.println("Nombre: " + nombre);
        }

        
        HashMap<String, Integer> edades = new HashMap<>();
        edades.put("Ana", 30);
        edades.put("Luis", 25);
        edades.put("Carlos", 40);
        System.out.println("\nHashMap (edades): " + edades);

        edades.remove("Luis");
        System.out.println("Después de eliminar a Luis: " + edades);

        if (edades.containsKey("Ana")) {
            System.out.println("La edad de Ana es: " + edades.get("Ana"));
        }

        for (String clave : edades.keySet()) {
            System.out.println(clave + " tiene " + edades.get(clave) + " años.");
        }
    }
}
