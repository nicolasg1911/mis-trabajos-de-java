
			for(int i=0;i<3;i++){
			System.out.println(name[i]+" "+hoursItaly[i]+" "+minutesItaly[i]);
			
		}
		
		for(int i=1;i<=15;i++){
			System.out.println("ingrese nombre del competidor #"+i);
			name[i-1]=entry.next();
		}
		for(int n=1;n<=15;n++){
			System.out.println("ingrese la cantidad de horas que se demoro "+name[n-1]+" (sin minutos ni segundos, ni decimales)");
			hoursItaly[n-1]=entry.nextDouble();
		}
		for(int counter=1;counter<=15;counter++){
			System.out.println("ingrese la cantidad de minutos que se demoro "+name[counter-1]+" (sin segundos ni decimales, mayor que 0 y menor que 60) ");
			minutesItaly[counter-1]=entry.nextDouble();
			while(minutesItaly[counter-1]<0 || minutesItaly[counter-1]>=60){
				System.out.println("ingrese tiempo correctamente");
				minutesItaly[counter-1]=entry.nextDouble();
			}
		}
		for(int z=1;z<=15;z++){
			System.out.println("ingrese la cantidad de segundos que se demoro "+name[z-1]+" (sin decimales, mayor que 0 y menor que 60) ");
			secondsItaly[z-1]=entry.nextDouble();
			while(secondsItaly[z-1]<0 || secondsItaly[z-1]>=60){
				System.out.println("ingrese tiempo correctamente");
				secondsItaly[z-1]=entry.nextDouble();
			}
		}
		System.out.println("ingrese el ganador de la carrera:");
		winnerItaly=entry.next();
		for(int x=1;x<=15;x++){
			if(winnerItaly.equals(name[x-1])){
				x=16;
			}
			
			
			
			
		}
		System.out.println("Premio de bahrein: ");
		for(int j=1;j<=15;j++){
			System.out.println("ingrese la cantidad de horas que se demoro "+name[j-1]+" (sin minutos ni segundos, ni decimales)");
			hoursBahrein[j-1]=entry.nextDouble();
		}
		for(int r=1;r<=15;r++){
			System.out.println("ingrese la cantidad de minutos que se demoro "+name[r-1]+" (sin segundos ni decimales, mayor que 0 y menor que 60) ");
			minutesBahrein[r-1]=entry.nextDouble();
			while(minutesBahrein[r-1]<0 || minutesBahrein[r-1]>=60){
				System.out.println("ingrese tiempo correctamente");
				minutesBahrein[r-1]=entry.nextDouble();
			}
		}
		
		for(int z=1;z<=15;z++){
			System.out.println("ingrese la cantidad de segundos que se demoro "+name[z-1]+" (sin decimales, mayor que 0 y menor que 60) ");
			secondsBahrein[z-1]=entry.nextDouble();
			while(secondsBahrein[z-1]<0 || secondsBahrein[z-1]>=60){
				System.out.println("ingrese tiempo correctamente");
				secondsBahrein[z-1]=entry.nextDouble();
			}
		}
		System.out.println("ingrese el ganador de la carrera:");
		winnerBahrein=entry.next();
		for(int f=1;f<=15;f++){
			if(winnerBahrein.equals(name[x-1])){
				x=16;
			}
		}