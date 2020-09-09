import java.util.Scanner;
public class Calendario2{
	public static void main(String[] args){
		System.out.println("ingrese la fecha de hoy en formato dd/mm/aaaa");
		Scanner diaScanner = new Scanner(System.in);
		Scanner mesScanner = new Scanner(System.in);
		Scanner anoScanner = new Scanner(System.in);
		System.out.println("dia");
		double dia = diaScanner.nextDouble();
		System.out.println("mes");
		int mes = mesScanner.nextInt();
		System.out.println("ano");
		int ano = anoScanner.nextInt();
		double diasTotales=365;
		while(dia>31 || dia<1 || mes>12 || mes<0 || ano<1){
			System.out.println("ingrese la fecha correctamente");
			System.out.println("dia");
		dia = diaScanner.nextDouble();
		System.out.println("mes");
		mes = mesScanner.nextInt();
		System.out.println("ano");
		ano = anoScanner.nextInt();
		}
		boolean esEnero=mes==1;//ya
		boolean esFebrero=mes==2;
		boolean esMarzo=mes==3;
		boolean esAbril=mes==4;
		boolean esMayo=mes==5;//ya
		boolean esJunio=mes==6;
		boolean esJulio=mes==7;//ya
		boolean esAgosto=mes==8;//ya
		boolean esSeptiembre=mes==9;
		boolean esOctubre=mes==10;//ya
		boolean esNoviembre=mes==11;
		boolean esDiciembre=mes==12;//ya
		if(ano % 4==0 || ano % 400==0){
		diasTotales=366;
		System.out.println("ano bisiesto");
		}
		if(esEnero==true || esJulio==true || esMayo==true || esAgosto==true || esOctubre==true||esDiciembre==true){
			
			if(dia>1 && dia<31){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				
			}
			else{
			if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=30;
				int ano2=ano;
				int mes2=mes-1;
				if(esAgosto==true){
					diaAnterior=31;
				}
				if(esEnero==true){
					ano2=ano-1;
					mes2 =12;
					diaAnterior=31;
				}
				
				
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano2);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
			}
				else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				int ano2=ano;
				if(esDiciembre==true){
					ano2=ano+1;
					mes2=1;
				}
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano2);
				
			}
			}
		}
		if(esNoviembre==true || esSeptiembre==true || esJunio==true || esAbril==true){
			if(dia>1 && dia<30){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				
			}
		else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=mes-1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
			}
			else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				}	
			}
		}
		if(diasTotales==366){
			if(esFebrero==true){
				if(dia>1 && dia<29){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				}
			else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=mes-1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				}
				else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				}
			}
			}
			if(esMarzo==true){
				if(dia>1 && dia<31){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
			}
			
			else{
			if(dia==1){
				double diaSiguiente=dia+1;
				int mes2=mes-1;
				double diaAnterior=29;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				}
				else{
				double diaSiguiente=dia+1;
				int mes2=mes+1;
				double diaAnterior=dia-1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				}
			}
			}
		}
		if(diasTotales==365){
			if(esFebrero==true){
				if(dia>1 && dia<28){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				}
			else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=mes-1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				}
				else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				}
			}
			}
			if(esMarzo==true){
				if(dia>1 && dia<31){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
			}
			
			else{
			if(dia==1){
				double diaSiguiente=dia+1;
				int mes2=mes-1;
				double diaAnterior=28;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				}
				else{
				double diaSiguiente=dia+1;
				int mes2=mes+1;
				double diaAnterior=dia-1;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				}
			}
			}
			
	}
	double diasHastaFecha=0;
	if(mes==2){
		diasHastaFecha=31;
	}
	if(mes==3){
		diasHastaFecha=59;
	}
	if(mes==4){
	diasHastaFecha=90;
	}
	if(mes==5){
	diasHastaFecha=120;
	}
	if(mes==6){
	 diasHastaFecha=151;
	}
	if(mes==7){
	diasHastaFecha=181;
	}
	if(mes==8){
	diasHastaFecha=212;
	}
	if(mes==9){
	 diasHastaFecha=243;
	}
	if(mes==10){
	diasHastaFecha=273;
	}
	if(mes==11){
	diasHastaFecha=304;
	}
	if(mes==12){
	diasHastaFecha=334;
	}
	if(diasTotales==365){ 
	double porcentaje=((dia+diasHastaFecha)/365)*100;
	System.out.println("lleva "+porcentaje+"% del ano");
	}
	else if(diasTotales==366){
	double porcentaje=((dia+diasHastaFecha+1)/366)*100;
		System.out.println("lleva "+porcentaje+"% del ano");	
	}
	
	}
}