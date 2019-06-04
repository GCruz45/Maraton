import java.util.*;

public class Hanoi {
    static int A = 0;
    static int B = 0;
    static int C = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        A = n;
        System.out.println(A + "/" + B + "/" + C);
        solveHanoi(n, 1, 2, 3);  //1:origen  2:auxiliar 3:destino
    }


    //Método Torres de Hanoi Recursivo
    public static void solveHanoi(int n, int origin, int aux, int ziel) {
        if (n == 1) {
            moveDisk(origin, aux, ziel);
        } else {
            solveHanoi(n - 1, origin, ziel, aux);
            moveDisk(origin, aux, ziel);
            solveHanoi(n - 1, aux, origin, ziel);
        }
    }

    private static void moveDisk(int origin, int aux, int ziel){
        if (origin == 1) {
            A--;
            if (ziel == 3) {
                C++;
            } else {
                B++;
            }
        } else if (aux == 1) {
            B--;
            if (ziel == 3) {
                C++;
            } else {
                A++;
            }
        } else {
            C--;
            if (origin == 3) {
                A++;
            } else {
                B++;
            }
        }
        System.out.println(A + "/" + B + "/" + C);
    }
}
