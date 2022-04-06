import java.util.Scanner;

public class SumaVector {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Introduce un numero de elementos del vector "); //faltaba una n a println
        int n = tec.nextInt();
        int[] vec = new int[n];
        vec = llenar(n);
        int suma = sumar(vec); //aqui va vec y no tabla
        System.out.println("La suma es: " + suma); //faltan las comillas
    }
    private static int[] llenar(int n) {
        int[] tabla = new int[n];
        for(int i = 0; i < n; i++)
            tabla[i] = i * 10;
        return tabla;
    }
    public static int sumar(int[] tabla) {
        int suma = 0;
        int n = tabla.length;
        for(int i = 0; i < n; i++)
            suma += tabla[i];
        return suma;
    }
}
