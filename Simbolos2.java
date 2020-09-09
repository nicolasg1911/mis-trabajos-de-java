import java.util.Scanner;
public class Simbolos2{
	public static void main(String[] args){
		boolean falso =!false;
		boolean verdadero= !true;
		System.out.println(falso);
		System.out.println(verdadero);
		int valorA=4;
		int valorB=2;
		int valorC=3;               
		valorC=valorC--*valorB++;
		System.out.println(valorC);
		valorA=valorA>valorB ? valorA+valorA:0;// condicional dentro de una variable (si valorA>valorB entonces valorA+valorA sino 0
		System.out.println(valorA);
	}
}