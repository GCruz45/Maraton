import java.util.*;
public class Hanoi {
	static int origen=0;
    static int auxiliar=0;
    static int destino=0;
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Numero de discos: ");
        n = sc.nextInt();
        origen=n;
        solveHanoi(n,origen,auxiliar,destino);  //1:origen  2:auxiliar 3:destino
    }


//Método Torres de Hanoi Recursivo
public static void solveHanoi(int n, int origin,  int aux, int ziel){
  if(n==1) {
	  origin-=1;
	  ziel++;
	  System.out.println(origen+"/"+auxiliar+"/"+destino);  
  }else{
     solveHanoi(n-1, origin, ziel, aux);
     origin-=1;
     ziel++;
     System.out.println(origen+"/"+auxiliar+"/"+destino);
     solveHanoi(n-1, aux, origin, ziel);
   }
 }
}
