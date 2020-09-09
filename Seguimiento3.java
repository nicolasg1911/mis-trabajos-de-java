import java.util.Scanner;
public class Seguimiento3{
	public static final int PILOTS=15;
	public static void main(String[] args){
		Scanner entry=new Scanner(System.in);
		System.out.println("Bienvenido al programa de formula 1");
		String [] name=new String [PILOTS];
		double [] minutesItaly=new double[PILOTS];
		double [] secondsItaly=new double[PILOTS];
		double [] hoursItaly=new double[PILOTS];
		double [] minutesBahrein=new double[PILOTS];
		double [] secondsBahrein=new double[PILOTS];
		double [] hoursBahrein=new double[PILOTS];
		double [] pilotAverage=new double[PILOTS];
		double convertionHours=0;
		double convertionMinutes=0;
		double convertionSeconds=0;
		String averageWinner=("");
		double averageComparisson=100000000;
		double averageCounter=0;
		String winnerItaly=("");
		String winnerBahrein=("");
		boolean winnerComfirmationItaly=false;
		boolean winnerComfirmationBahrein=false;
		
		System.out.println("Premio de Monza: ");
		for(int i=0;i<PILOTS;i++){
			System.out.println("ingrese nombre del competidor #"+(i+1));
			name[i]=entry.next();
			System.out.println("ingrese la cantidad de horas que se demoro "+name[i]+" (sin minutos ni segundos, ni decimales)");
			hoursItaly[i]=entry.nextDouble();
			System.out.println("ingrese la cantidad de minutos que se demoro "+name[i]+" (sin segundos ni decimales, mayor que 0 y menor que 60) ");
			minutesItaly[i]=entry.nextDouble();
			while(minutesItaly[i]<0 || minutesItaly[i]>=60){
				System.out.println("ingrese tiempo correctamente");
				minutesItaly[i]=entry.nextDouble();
			}
			System.out.println("ingrese la cantidad de segundos que se demoro "+name[i]+" (sin decimales, mayor que 0 y menor que 60) ");
			secondsItaly[i]=entry.nextDouble();
				while(secondsItaly[i]<0 || secondsItaly[i]>=60){
				System.out.println("ingrese tiempo correctamente");
				secondsItaly[i]=entry.nextDouble();
			}
			System.out.println("ingrese el ganador de la carrera:");
			winnerItaly=entry.next();
		}
		System.out.println("Premio de bahrein: ");
		for(int n=0;n<PILOTS;n++){
			System.out.println("ingrese la cantidad de horas que se demoro "+name[n]+" (sin minutos ni segundos, ni decimales)");
			hoursBahrein[n]=entry.nextDouble();
			System.out.println("ingrese la cantidad de minutos que se demoro "+name[n]+" (sin segundos ni decimales, mayor que 0 y menor que 60) ");
			minutesBahrein[n]=entry.nextDouble();
			while(minutesBahrein[n]<0 || minutesBahrein[n]>=60){
				System.out.println("ingrese tiempo correctamente");
				minutesBahrein[n]=entry.nextDouble();
			}
			System.out.println("ingrese la cantidad de segundos que se demoro "+name[n]+" (sin decimales, mayor que 0 y menor que 60) ");
			secondsBahrein[n]=entry.nextDouble();
				while(secondsBahrein[n]<0 || secondsBahrein[n]>=60){
				System.out.println("ingrese tiempo correctamente");
				secondsBahrein[n]=entry.nextDouble();
			}
			
		}
		System.out.println("ingrese el ganador de la carrera:");
			winnerBahrein=entry.next();
		
		//media 
		for(int t=0;t<PILOTS;t++){
			pilotAverage[t]=((hoursItaly[t]*3600)+(minutesItaly[t]+60)+(secondsItaly[t])+(hoursBahrein[t]*3600)+(minutesBahrein[t]*60)+(secondsBahrein[t]))/2;
			convertionHours=pilotAverage[t]/3600;
			System.out.print("promedio de: "+(int) Math.round(convertionHours)+" horas");
			convertionMinutes=(((int) Math.round(convertionHours)*60)-(pilotAverage[t]/60));
			System.out.print(" "+(int) Math.round(convertionMinutes)+" minutos");
			convertionSeconds=((((int) Math.round(convertionHours)*3600)+(int) Math.round(convertionMinutes*60))-(pilotAverage[t]));
			System.out.print(" "+(int) Math.round(convertionSeconds)+" segundos");
			averageCounter=pilotAverage[t];
			if(averageCounter<averageComparisson){
				averageWinner=name[t];
				averageComparisson=averageCounter;
			}
		}
		System.out.println("el piloto con mejor promedio fue: "+averageWinner);
		if(averageWinner.equals(winnerBahrein)){
			System.out.println("el piloto con mejor promedio gano la competencia de Bahrein");
		}
		if(averageWinner.equals(winnerItaly)){
			System.out.println("el piloto con mejor promedio gano la competencia de Monza");
		}
		
		System.out.println("");
	}
}