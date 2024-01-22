/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog02_tarea;

/**
 *
 * @author Joseme
 */
public class PROG02_Ejerc6 {
    enum RazaPerro {
        Mastin, Terrier, Bulldog, Pekines, Caniche, Galgo
    }
    
    public static void main(String[] args) {
        // Crear variables del tipo enumerado y asignarles valores
        RazaPerro var1 = RazaPerro.Mastin;
        RazaPerro var2 = RazaPerro.Pekines;

        // Mostrar el resultado de comparar ambas variables
        System.out.println("Comparación de var1 y var2: " + var1.equals(var2));

        // Mostrar la posición de las variables en el enumerado
        System.out.println("Posición de var1 en el enumerado: " + var1.ordinal());
        System.out.println("Posición de var2 en el enumerado: " + var2.ordinal());

        // Mostrar la cantidad de valores en el enumerado
        System.out.println("Cantidad de valores en el enumerado: " + RazaPerro.values().length);
    }
}
