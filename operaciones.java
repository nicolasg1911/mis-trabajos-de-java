
public class operaciones{
	public static void main(String[] args){
		double num1=8;
		double dec1=1.5;
		double sum=num1+dec1;
		System.out.println(num1+" "+"+ "+dec1+" ="+sum);
		double mul=num1*dec1;
		double div1=mul/sum;
		System.out.println("("+num1+"x"+dec1+") ="+mul);
		System.out.println(mul+"/"+sum+" ="+div1);
		double resi=num1%dec1;
		System.out.println("residuo de "+num1+" y "+dec1+" = "+resi);
		boolean homogenea=resi==0;
		boolean mayor = num1>dec1;
		boolean differ=mul!=div1;
		System.out.println("¿"+num1+" mayor que "+dec1+"?"+mayor);
		System.out.println("¿es la division entre "+num1+" y "+dec1+" homogenea?"+homogenea);
		System.out.println("¿son "+mul+" y "+div1+" diferentes? "+differ);
		boolean mayOIgual=num1<=dec1;
		System.out.println(mayOIgual);
		String nombre="nicolas";
		String nombre2="fernando";
		boolean igual=nombre.equals(nombre2);
	}
}