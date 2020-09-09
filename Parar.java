import java.util.Scanner;
public class Parar{
	public static void main(String[] args){
		System.out.println("ibgrese una palabrea");
		Scanner escanerInicial=new Scanner(System.in);
		String palabraInicial=escanerInicial.next();
		String lower=palabraInicial.toLowerCase();
		System.out.println("usted ingreso: "+lower);
		boolean instruccion =lower.equals("parar");
		while(instruccion==false){
			System.out.println("ingrese una nueva palabra, o ingrese parar para detener el programa");
			Scanner escanerFinal=new Scanner(System.in);
			String nuevaPalabra=escanerFinal.next();
			lower=nuevaPalabra.toLowerCase();
			instruccion=lower.equals("parar");
		System.out.println("usted ingreso: "+nuevaPalabra);
		}
	}
}