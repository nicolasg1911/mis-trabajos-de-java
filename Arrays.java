import java.util.Scanner;
public class Arrays{
	public static void main (String[] args){
	Scanner entry=new Scanner(System.in);
	int [] array=new int[10];
	for(int i=1;i<=10;i++){
		System.out.println("ingrese valor #"+i);
		array[i-1]=entry.nextInt();
	}
	for(int counter=1;counter<=10;counter++){
		System.out.println("valor #"+counter+" es: "+array[counter-1]);
	}
	}
}