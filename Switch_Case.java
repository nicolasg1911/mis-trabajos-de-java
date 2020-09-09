import java.util.Random;
public class Switch_Case{
	public static void main (String[] args){
		Random aleatorio=new Random();
		int numero=aleatorio.nextInt(3)+1;
	switch(numero){
		case 1:
		System.out.println("esto sale si es 1");
		break;
		case 2:
		System.out.println("esto sale si es 2");
		break;
		case 3:
		System.out.println("esto sale si es 3");
		break;
		
	}	
	}
}