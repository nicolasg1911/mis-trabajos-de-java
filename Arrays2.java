
public class Arrays2{
	public static void main (String[] args){
		double addition=0;
		double average=0;
		double [] array=new double[100];
		for(int i=0;i<100;i++){
			array [i]=i+1;
		}
		for(int n=0;n<100;n++){
			addition=addition+array[n];
		}
		System.out.println("la suma de los numeros es: "+Math.round(addition));
		average=addition/100;
		System.out.println("la media es: "+average);
	}
}