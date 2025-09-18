import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de términos de la serie Fibonacci: ");
        int n = sc.nextInt();

        System.out.println("\nSerie Fibonacci usando arreglo bidimensional (recursivo):");
        FibonaciMetodo1 metodo1 = new FibonaciMetodo1();
        metodo1.imprimirFibonacciArreglo(n);

        System.out.println("\nSerie Fibonacci usando 3 variables (recursivo):");
        FibonaciMetodo2 metodo2 = new FibonaciMetodo2();
        metodo2.imprimirFibonacciTresVars(n);
    }
}

// FORMA/MANERA METODO YO Q SE  1 :   USANDO UN ARREGLO BIDIMENCIONAL Y RECURSIVIDAD
class FibonaciMetodo1 {
    public void imprimirFibonacciArreglo(int n) {
        int[][] fibMatrix = new int[n][2];
        llenarFibonacciRec(n, fibMatrix, 0);
        for (int i = 0; i < n; i++) {
            System.out.print(fibMatrix[i][0] + " ");
        }
        System.out.println();
    }

    private void llenarFibonacciRec(int n, int[][] arr, int idx) {
        if (idx >= n) return;
        if (idx == 0) {
            arr[idx][0] = 0;
            arr[idx][1] = 1;
        } else {
            arr[idx][0] = arr[idx - 1][1];
            arr[idx][1] = arr[idx - 1][0] + arr[idx - 1][1];
        }
        llenarFibonacciRec(n, arr, idx + 1);
    }
}

//2 DA FORMA ESTA ES LA MAS FACIL Y LA MAS SENSILLA PERO PS ME GUSTA MAS CON ARREGLOS EKSIDE  3VARIABLES Y RECURSIVIDAD
class FibonaciMetodo2 {
    public void imprimirFibonacciTresVars(int n) {
        imprimirRec(n, 0, 0, 1);
        System.out.println();
    }

    private void imprimirRec(int n, int idx, int a, int b) {
        if (idx >= n) return;
        System.out.print(a + " ");
        imprimirRec(n, idx + 1, b, a + b);
    }
}