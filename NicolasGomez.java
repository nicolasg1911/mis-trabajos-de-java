import java.util.Scanner;
public class NicolasGomez{
	public static int encontrarElMayor(int [] numeros){
		Scanner entry= new Scanner(System.in);
		int comparison=0;
		for(int i=0;i<numeros.length;i++){
			if(numeros[i]>comparison){
			comparison=numeros[i];
			}
		}
		return comparison;//salida de resultado
		
	}
}