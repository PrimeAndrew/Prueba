import java.util.Scanner;

public class Cuadrado {
	static int n=0; 
	public static void main(String[] args) {
		
		n=leer("Ingrese n:");
		imprimir1();
		System.out.println();
		imprimir2();
		imprimir1();
	}
	public static int leer(String a){
		System.out.println(a);
		Scanner x = new Scanner(System.in);
		int r=x.nextInt();
		return r;
	}
	public static void imprimir1(){
		for(int i=0;i<n;i++){
			System.out.print(" . ");
		}
	}
	public static void imprimir2(){
		for(int j=0;j<n;j++){
			for(int i=0;i<n;i++){
				if (i==0  || i==(n-1)){
					System.out.print(" . ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
	

}
