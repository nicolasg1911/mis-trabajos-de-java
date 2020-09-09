import java.util.Scanner;
public class Pares{
	public static void main(String[] args){
		System.out.println("ingrese un numero");
		Scanner entrada1=new Scanner(System.in);
		int numeroUsuario=entrada1.nextInt();
		int sumaFinal=0;
		for(int i=0;i<numeroUsuario;i++){
			
			if(i % 2==0){
				System.out.println(i);
				sumaFinal=sumaFinal+i;
		
			}
		}
		
		System.out.println("la suma de numeros pares es: "+sumaFinal);
	}
}