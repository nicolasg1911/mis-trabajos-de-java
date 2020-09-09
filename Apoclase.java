import java.util.Scanner;
public class Apoclase{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String texto=sc.next();
	int caracteres=texto.length();
	if(caracteres<50){
		System.out.println("el texto tiene: " + caracteres+ " caracteres");
	}
	String lower=texto.toLowerCase();

boolean vocal1= lower.contains("a");
boolean vocal2= lower.contains("e");
boolean vocal3= lower.contains("i");
boolean vocal4= lower.contains("o");
boolean vocal5= lower.contains("u");
boolean consonante1=lower.contains("ñ");
boolean consonante2=lower.contains("ll");
boolean consonante3=lower.contains("rr");
boolean consonante4=lower.contains("ch");
boolean clase=lower.equals("algoritmos1-g5");
if (vocal1==true && vocal2==true && vocal3==true && vocal4==true && vocal5==true){
	System.out.println("tiene todas las vocales");
}
if(consonante1==true || consonante2==true || consonante3==true || consonante4==true){
	System.out.println("la palabra es en espanol");
}
if(clase==true){
	System.out.println("la mejor clase :)");
}
}
}