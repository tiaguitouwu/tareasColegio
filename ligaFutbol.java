import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

class ligaFutbol{
	public static void club(String[] clubes){
		int club,partidos,res,j,i,x,k;
		int resultadoEq[]={0,0,0,0,0,0,0,0,0,0,0,0};
		String[][] clubess=new String[2][12];
		Scanner sc=new Scanner(System.in);
		for (club=0; club<12; club++) {	
		
			for (partidos=0; partidos<2; partidos++) {
				System.out.println
				("¿Cuál fue el resultado de "+clubes[club]+" en la fecha "+partidos
				+"?\n 0-Derrota \n 1-Empate \n 2-Victoria");
				res=sc.nextInt();
				while(res>2 || res<0){
					System.out.println("Valor introducido inválido, intente nuevamente");
					res=sc.nextInt();
				}
				switch (res) {
					case 0:
						resultadoEq[club]=resultadoEq[club];
						break;

					case 1:
						resultadoEq[club]=resultadoEq[club]+1;
						break;

					case 2:
						resultadoEq[club]=resultadoEq[club]+3;
						break;
				}

			}
			clubess[0][club]=clubes[club];
			clubess[1][club]=""+resultadoEq[club];
			
		}

		//Antes de ordenar

		for (i=0;i<12;i++) {
				System.out.println("["+clubess[0][i]+" "+clubess[1][i]+"]");
		}
	

		//Se ordenan los puntajes

		for (x = 0; x < resultadoEq.length; x++) {
	        for (i = 0; i < resultadoEq.length-x-1; i++) {
	            if(resultadoEq[i] < resultadoEq[i+1]){
	                int tmp = resultadoEq[i+1];
	                resultadoEq[i+1] = resultadoEq[i];
	                resultadoEq[i] = tmp;
	            }
	        }
   		}
		for (i=0;i<12;i++) {
				System.out.print("["+resultadoEq[i]+"]");
		}
		
		System.out.println(" ");

		//Supuestamente deberia imprimir los puestos de forma ordenada, comparando los puntajes ordenados
		k=1;
		for(j=0;j<12;j++){
			for(i=0; i<12; i++){
				if(Integer.parseInt(clubess[1][i])==resultadoEq[j]){
					System.out.println(k+" puesto "+clubess[0][i]+" con "+clubess[1][i]+" puntos");
					clubess[1][i]=""+10000;
					k=k+1;
				}
			}
		}
	}
	public static void main(String[] args) {
		String clubes[]=
		{"Equipo 1","Equipo 2","Equipo 3","Equipo 4","Equipo 5","Equipo 6",
		"Equipo 7","Equipo 8","Equipo 9","Equipo 10","Equipo 11","Equipo 12"};
		club(clubes);
	}
}
