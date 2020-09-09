import java.util.Scanner;
public class condicionales{
	public static void main(String[] args){
		Scanner nombre=new Scanner(System.in);
		String nomIngresado=nombre.next();
		if(nomIngresado.equals("nicolas")){
			System.out.println("ingresa la contraseña");
			Scanner numIngresado=new Scanner(System.in);
			int numero=numIngresado.nextInt();
			if(numero==1911){
			System.out.println("bienvenido "+nomIngresado);
			}
			else{
				System.out.println("acceso denegado");
			}
		Scanner parOImpar=new Scanner(System.in);
	System.out.println("ingrese un numero entero");
	int numParOImpar=parOImpar.nextInt();
	if(numParOImpar%2==0){
	System.out.println("par");
	}
	else{
		System.out.println("impar");
	}
		}
			else{
				System.out.println("acceso denegado");
			}
			Scanner decimal=new Scanner(System.in);
	System.out.println("ingresa un decimal");
	double decimal2=decimal.nextDouble();//arroja una excepcion
		}
	
	
		
		
	}