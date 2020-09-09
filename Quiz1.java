import java.util.Scanner;
public class Quiz1{
	public static void main(String[] args){
	int numEntrance;
	int numberCount=0;
	int product=1;
	boolean division=false;
	Scanner entrance=new Scanner(System.in);
	System.out.println("ingrese un numero entero positivo, o ingrese un numero negativo para finalizar programa");
	numEntrance=entrance.nextInt();
	while(numEntrance>=0){
		product=product*numEntrance;
		numberCount=numberCount+1;
		if(numEntrance%5==0){
			division=true;
		}	
		System.out.println("ingrese siguiente numero");
		numEntrance=entrance.nextInt();
	}
	System.out.println("se ingresaron "+numberCount+" numero(s)");
	System.out.println("la multiplicación de los numeros ingresados es: "+product);
	if(division==true){
	System.out.println("hay al menos 1 numero divisible por 5");
	}
	}
}