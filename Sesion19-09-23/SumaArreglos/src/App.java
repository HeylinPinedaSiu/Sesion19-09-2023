import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.print("Cantidad de notas:");
        int cantidadNotas = lector.nextInt();

        while (cantidadNotas <= 0) {
            System.out.println("No puede ingresar valores menores o iguales a cero");
            System.out.print("Cantidad de notas:");
            cantidadNotas = lector.nextInt();
        }

        int[] notas = new int[cantidadNotas];
        String[] nombresEstudiantes = new String[cantidadNotas];
        int sumaNotas = 0;
        System.out.println("Ingrese nombre y nota de cada estudiante del grupo: ");
        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Estudiante[" + (i+1) + "] = ");
            lector.nextLine();  //  \n
            nombresEstudiantes[i] = lector.nextLine();
            
            System.out.print("Nota[" + (i+1) + "] = ");
            notas[i] = lector.nextInt();
            sumaNotas += notas[i];
        }
        
        System.out.println(":::::::::::::::::::::::::::::::::::::");
        System.out.println("Nombre completo\t\t\tNota");
        for (int i = 0; i < nombresEstudiantes.length; i++) {
            System.out.println(nombresEstudiantes[i] + "\t\t\t" + notas[i]);
        }
        
        System.out.println(":::::::::::::::::::::::::::::::::::::");
        System.out.println("El promedio de las notas es " + (double)sumaNotas/cantidadNotas);
        lector.close();
    }    
}
