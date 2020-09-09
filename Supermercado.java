import java.util.Scanner;
public class Supermercado{
public static void main(String[] args){
	System.out.println("ingrese cantidad de productos");
		Scanner entrada1=new Scanner(System.in);
		int items=entrada1.nextInt();
		double sumaFinal=0;
		for(int i=1;i<=items;i++){
			System.out.println("ingrese el precio del producto "+i);
			double precio=entrada1.nextInt();
			sumaFinal=sumaFinal+precio;
			
			
		}
		System.out.println("el valor total a pagar es: "+sumaFinal);
		
}
}