package aulas;

import java.util.Scanner;

public class notas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota1 = 7, nota2 = 7;
		double media;
		
		media = (nota1 + nota2)/2;
		
		if(media >= 7) {
			System.out.println("Aprovado com media: "+media);
		}else {
			System.out.println("repovado com media: "+media);
		}
	}

}
