import java.util.Scanner;
import java.util.Random;//importar la opción de generar datos aleatorios
public class Loops{
	public static void main(String[] args){
		Random aleatorio=new Random();//creación del generador aleatorio
		System.out.println("dado lanzado");
		int dado =aleatorio.nextInt(6)+1;//generará un número de 0 a 5 y luego sumará 1 a este
		System.out.println(dado);
		while(dado!=5){
			System.out.println("reintentando:");
			Random dado2= new Random();
			dado=dado2.nextInt(6)+1;
			System.out.println(dado);
			
		}
		System.out.println("felicidades");
		System.out.println("ingrese mes actual:");
		Scanner mes=new Scanner(System.in);
		String mesDelA=mes.next();
		System.out.println("ingrese dia del mes:");
		Scanner dia=new Scanner(System.in);
		int diasDelMes=dia.nextInt();
		String lower =mesDelA.toLowerCase();
		boolean cantidad1=lower.equals("enero");
		boolean cantidad2=lower.equals("marzo");
		boolean cantidad3=lower.equals("mayo");
		boolean cantidad4=lower.equals("julio");
		boolean cantidad5=lower.equals("agosto");
		boolean cantidad6=lower.equals("octubre");
		boolean cantidad7=lower.equals("diciembre");
		boolean cantidad8=lower.equals("febrero");
		if(cantidad1==true || cantidad2==true || cantidad3==true || cantidad4==true ||cantidad5==true || cantidad6==true || cantidad7==true){
			int mesCompleto=31-diasDelMes;
			System.out.println("quedan "+mesCompleto+" dias");
			while(diasDelMes<31){
				diasDelMes++;
				System.out.println(diasDelMes+" de "+ mesDelA);
			}
		}
		else{
				if(cantidad8==true){
				int mesCompleto=28-diasDelMes;
				System.out.println("quedan "+mesCompleto+" dias");
				while(diasDelMes<28){
				diasDelMes++;
				System.out.println(diasDelMes+" de "+ mesDelA);	
				}
				}
				else{
				int mesCompleto=30-diasDelMes;
				System.out.println("quedan "+mesCompleto+" dias");
				while(diasDelMes<30){
				diasDelMes++;
				System.out.println(diasDelMes+" de "+ mesDelA);
				}
				}
				
		
			}
		System.out.println("ingrese un numero entre 0 y 5");
		Scanner numeroEleccion=new Scanner(System.in);
		
	for (int i=numeroEleccion.nextInt();i<=5;i++){
		System.out.println("i es: "+i);
	}
	}
}