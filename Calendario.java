import java.util.Scanner;
public class Calendario{
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
		
		boolean esEnero=mes==01;
		boolean febrero=mes==02;
		boolean marzo=mes==03;
		boolean abril=mes==04;
		boolean mayo=mes==05;
		boolean junio=mes==06;
		boolean julio=mes==07;
		boolean agosto=mes==8;
		boolean septiembre=mes==9;
		boolean octubre=mes==10;
		boolean noviembre=mes==11;
		boolean diciembre=mes==12;
	if(ano % 4==0 || ano % 400==0){
		diasTotales=366;
		System.out.println("ano bisiesto");
	}
	if(enero==true){
			if(dia>1 && dia<31){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				
			}
			else{
			if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=12;
				int ano2=ano-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano2);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
				else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			}
		}
	if(febrero=true){
		if(ano % 4==0 || ano % 400==0){
			if(dia>1 && dia<29){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = ((dia+31)/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=mes-1;
				double porcentaje = ((dia+31)/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}
				else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = ((dia+31)/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");	
				}
			}
		}
		else{
			if(dia>1 && dia<28){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = ((dia+31)/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=mes-1;
				double porcentaje = ((dia+31)/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");	
				}
				else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = ((dia+31)/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");	
				}
			}
		}
	}
	if(marzo==true){
		if(dia>1 && dia<31){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
		}
		else{
			if(dia==1){
				double diaSiguiente=dia+1;
				int mes2=mes-1;
				if(ano %4==0 || ano % 400==0){
				double diaAnterior=29;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}
				else{
				double diaAnterior=28;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}
			}
			else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
		}
	}
	if(abril==true){
		if(dia>1 && dia<30){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				
			}
		else{
			if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=mes-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}			
			}
	}
	if(mayo==true){
		if(dia>1 && dia<31){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				
			}
		else{
			if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=30;
				int mes2=mes-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}		
			}
	}
	if(junio==true){
		if(dia>1 && dia<30){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				
			}
		else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=mes-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}	
			}
	}
	if(julio==true){
		if(dia>1 && dia<31){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				
			}
		else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=30;
				int mes2=mes-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}
		}
	}
	if(agosto==true){
		if(dia>1 && dia<31){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				
			}
		else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=mes-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}	
			}
	}
	if(septiembre==true){
		if(dia>1 && dia<30){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				
			}
		else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=mes-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}	
			}
	}
	if(octubre==true){
		if(dia>1 && dia<31){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				
			}
		else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=30;
				int mes2=mes-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}	
			}
	}
	if(noviembre==true){
		if(dia>1 && dia<30){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				
			}
		else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=mes-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=mes+1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}	
			}
	}
	if(diciembre==true){
		if(dia>1 && dia<31){
				double diaSiguiente=dia+1;
				double diaAnterior=dia-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				
			}
		else{
				if(dia==1){
				double diaSiguiente=dia+1;
				double diaAnterior=31;
				int mes2=mes-1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes2+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes+"/"+ano);
				System.out.println("lleva un "+ porcentaje+"% de ano");
			}
			else{
				double diaSiguiente=1;
				double diaAnterior=dia-1;
				int mes2=1;
				int ano2=ano+1;
				double porcentaje = (dia/diasTotales)*100;
				int diaSiguienteRedon=(int) Math.round(diaSiguiente);
				int diaAnteriorRedon=(int) Math.round(diaAnterior);
				System.out.println("el dia anterior fue: "+diaAnteriorRedon+"/"+mes+"/"+ano);
				System.out.println("el dia siguiente es: "+diaSiguienteRedon+"/"+mes2+"/"+ano2);
				System.out.println("lleva un "+ porcentaje+"% de ano");
				}	
			}
	}
	}
}