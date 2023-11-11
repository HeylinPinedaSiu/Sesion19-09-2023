import java.util.Scanner;

public class ArreglosBidimensionales {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        int matrizB[][] = {
            {1,2},
            {3,4}
        } ;
      
        System.out.print("Cantidad de filas: ");
        int cantFilas = lector.nextInt();
        System.out.print("Cantidad de columnas: ");
        int cantColumnas = lector.nextInt();
        int[][] matrizA = new int[cantFilas][cantColumnas];
        System.out.println("Ingrese los elementos de la matrizA");
      
      //Para las filas
        for (int i = 0; i < matrizA.length; i++) {

          //Para las columnas
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print("ArregloA[" + i + "," + j + "]=");
                matrizA[i][j] = lector.nextInt();
            }
        }
      
        System.out.println("Los datos en forma de matriz:");
      
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
