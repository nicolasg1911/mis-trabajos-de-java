import java.util.Scanner;
public class Airplane{
	public static void main(String[] args){
		double aeroFee=0;
		double trackRights=0;
		double boardingCost=0;
		double exchangeFee=0;
		double totalFee=0;
		boolean decition;
		double totalFeeAddition=0;
		String arrivals;
		String departures;
		String lower;
		String lower2;
		String lower3;
		int nationalDepartures;
		int nationalArrivals;
		int international Departures;
		int internationalArrivals;
		String nationalFlightType="nacional";
		String internationalFlightType="internacional";
		String airlineAvianca="avianca";
		String airlineAExpress="American Express";
		Scanner sc=new Scanner(System.in);
		System.out.println("su vuelo es nacional? ingrese y si lo es, n si es internacional");
		String flightvalidation=sc.next();
		lower=flightvalidation.toLowerCase();
		decition=lower.equals("y") || lower.equals("n");
		System.out.println("ingrese lugar de salida");
		departures=sc.next();
		lower2=departures.toLowerCase();
		System.out.println("ingrese lugar de llegada");
		arrivals=sc.next();
		lower3=arrivals.toLowerCase();
		
		while(decition==true){
		
		if(lower.equals("y")){ //nacional
		 aeroFee=15400;
		 trackRights=4.75798;
		 boardingCost=126800;
		 totalFee=(boardingCost+aeroFee)*trackRights;
		 totalFeeAddition=totalFeeAddition+totalFee;
		} 
		else{//internacional
			System.out.println("ingrese el valor de cambio");
		exchangeFee=sc.nextDouble();
		aeroFee=35*exchangeFee;
		trackRights=1.00548*exchangeFee;
		boardingCost=117*exchangeFee;
		totalFee=(boardingCost+aeroFee)*trackRights;
		 totalFeeAddition=totalFeeAddition+totalFee;

		}
		System.out.println("su vuelo es nacional? ingrese y si lo es, n si es internacional");
		System.out.println("o ingrese cualquier otro caracter para salir");
		lower=sc.next();
		decition=lower.equals("y") || lower.equals("n");
		}
		System.out.println("total a pagar es: "+totalFeeAddition)
	}
}