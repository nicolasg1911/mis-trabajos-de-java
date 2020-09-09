import java.util.Scanner;
public class Quiz2{
	public static void main(String[] args){
		int[] numeros = {2, 3, 5, 11, 1, 4, 4, 14, 7, 4};
		System.out.println("el mayor numero es: "+n(numeros));//salida de resultado
		
	}
}


	public static int encontrarElMayor(int [] n){
		
		int comparison=0;
		for(int i=0;i<n.length;i++){
			if(n[i]>comparison){
			comparison=n[i];
			}
		}
		return comparison;//salida de resultado
	}
	