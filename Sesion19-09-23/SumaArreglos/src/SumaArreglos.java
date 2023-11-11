import java.util.Scanner;

public class SumaArreglos {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los arreglos");
        int tamano = lector.nextInt();
      
        //Validar que el tamaño no sea menor o igual a cero
      
        while (tamano <= 0) {
            System.out.println("El tamaño de los arreglos no puede ser menor o igual a cero");
            System.out.println("Ingrese el tamaño de los arreglos");
            tamano = lector.nextInt();
        }
      
        //Declarar los arreglos
        int[] arregloA = new int[tamano];
        int[] arregloB = new int[tamano];
        int[] arregloSuma = new int[tamano];
      
        //Pedir los elementos de los arreglos al usuario
        System.out.println("Elementos del arreglo A");
        for (int i = 0; i < arregloA.length; i++) {
            System.out.print("Elemento[" + (i+1) + "] = ");
            arregloA[i] = lector.nextInt();
        }
        System.out.println("Elementos del arreglo B");
        for (int i = 0; i < arregloB.length; i++) {
            System.out.print("Elemento[" + (i+1) + "] = ");
            arregloB[i] = lector.nextInt();
        }
      
        //Sumar ambos arreglos, elemento a elemento
        for (int i = 0; i < arregloSuma.length; i++) {
            arregloSuma[i] = arregloA[i] + arregloB[i];
        }
      
        //Mostrar resultados
        System.out.println("Elementos del Arreglo A");
        System.out.print("ArregloA=[");
        for (int i = 0; i < arregloSuma.length; i++) {
            System.out.print(arregloA[i] + ",");
        }
      
        System.out.print("]\n");
        System.out.println("Elementos del Arreglo B");
        System.out.print("ArregloB=[");
        for (int i = 0; i < arregloSuma.length; i++) {
            System.out.print(arregloB[i] + ",");
        }
      
        System.out.print("]\n");
        System.out.println("Elementos del ArregloSuma");
        System.out.print("ArregloSuma=[");
        for (int i = 0; i < arregloSuma.length; i++) {
            System.out.print(arregloSuma[i] + ",");
        }
        System.out.print("]\n");
    }
}
