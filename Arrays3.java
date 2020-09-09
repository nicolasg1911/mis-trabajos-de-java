import java.util.Scanner;
public class Arrays3{
	public static final int GRADES=10;
	public static void main(String[] args){
		Scanner entry=new Scanner(System.in);
		double modifiedGrade=0;
		double [] array=new double[GRADES];
		for(int i=1;i<=GRADES;i++){
			System.out.println("ingrese nota #"+i);
			array[i-1]=entry.nextDouble();
			
		}
		for(int n=1;n<=GRADES;n++){
		modifiedGrade=array[n-1]+(array[n-1]*0.5);
		System.out.println("nota modificada: "+modifiedGrade);
		}
	}
}