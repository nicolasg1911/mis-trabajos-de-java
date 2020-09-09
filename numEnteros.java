import java.util.Scanner;
public class numEnteros{
	public static void main(String[] args){
		System.out.println("ingrese la cantidad de numeros ");//salida de texto de instrucción
		Scanner numEscaner=new Scanner(System.in);
		double cantidadNum=numEscaner.nextDouble();//entrada numerica (cantidad de numeros a ingresar)
		double numIngresado=0; //variable a ingresar
		double suma=0; //variable acumulativa (operación)
		int menor0=0;//variable acumulativa
		int igual0=0; //variable acumulativa
		int mayor0=0;//variable acumulativa
		
		for (int i=1;i<=cantidadNum;i++){
			System.out.println("ingrese numero #"+i);//salida de texto de instrucción
			numIngresado=numEscaner.nextDouble();
			suma=suma+numIngresado;
			if(numIngresado==0){
				igual0++;
			}
			if(numIngresado<0){
				menor0++;
				}
			if(numIngresado>0){
					mayor0++;
				}
		}
		if(cantidadNum==0){
			cantidadNum=1;
		}
		System.out.println("la media es: "+(suma/cantidadNum));//salida numerica de resultado 
		System.out.println("hay "+menor0+" numero(s) menor(es) a 0");//salida numerica de resultado 
		System.out.println("hay "+mayor0+" numero(s) mayor(es) a 0");//salida numerica de resultado 
		System.out.println("hay "+igual0+" numero(s) igual(es) a 0");//salida numerica de resultado 
	}
}
/*ejemplos a usar: 
cantidad de numeros: ej1: 3    ej2:4
numeros ingresados:  ej1: -1,0,2    ej2:-1,0,2,3
*/