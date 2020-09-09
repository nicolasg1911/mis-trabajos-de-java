import java.util.Scanner;
public class practica {
public static void main(String[] args){
	System.out.println("hpta, programar es muy dificil");
	String hpta ="que gonorrea";
	System.out.println(hpta);
	System.out.println("di algo");
	Scanner entrada= new Scanner (System.in);
	String x=entrada.next();
	System.out.println("por mk te voy a hackear");
	Scanner entrada2=new Scanner(System.in);
	
int porcentaje = 0;
	while (porcentaje<=100){
		System.out.println("hackeando dispositivo "+ porcentaje+"%");
		porcentaje+=10;
	}
	System.out.println("equipo hackeado con exito");
	System.out.println("escribe un numero entero");
	int parOimpar=entrada2.nextInt();
	int residuo=parOimpar%2;
	
	if (residuo==0){
		System.out.println("par");
	}
	else{
	System.out.println("impar");
	}
	
}

}