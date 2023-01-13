package ej02_RuizMedina_Barbara;

import java.util.Scanner;

public class Ej02_RuizMedina_Barbara {

	public static void main(String[] args) {
		// Mostrar matriz, pedir número de paciente y mostrar media
		System.out.println("Este programa recolecta datos de IMC de ciertos pacientes (código paciente) de los 12 meses que tiene el año. El usuario introducirá un número de paciente y el programa calculará la media de IMC durante el año.");
		
		Scanner teclado = new Scanner(System.in);
		double imcs_pacientes [][] = {
				{15.7,15.8,16.1,16.3,16.7,17,17.4,17.1,17.5,17.6,18.4,18.6},
				{38.5,38.4,38.3,38.3,38.8,37.5,37.4,37.1,36.8,36.0,35.4,35.2},
			    {33.5,33.6,33.8,33.9,33.6,33.1,32.4,31.8,31.7,29.8,28.4,27.2},
			    {32.7,32.4,33,32.7,32.9,31.6,31.5,30.4,29.2,27.3,25.2,24.7}
			};
		Ej02_examen.mostrar_imcs(imcs_pacientes);
		
		System.out.println("Cálculo de media de un paciente.");
		System.out.printf("Introduzca el número de paciente, comprendido entre %d y %d:", 0, imcs_pacientes.length-1);
		int codPaciente = teclado.nextInt();
		
		while (codPaciente > imcs_pacientes.length-1) {
			System.err.println("Número de paciente incorrecto. Por favor, empiece de nuevo el proceso.");
			System.out.printf("Introduzca el número de paciente, comprendido entre %d y %d:", 0, imcs_pacientes.length-1);
			codPaciente = teclado.nextInt();
		};
		
		double media = Ej02_examen.media_paciente(imcs_pacientes, codPaciente);
		
		System.out.printf("El paciente con código %d tiene una media de IMC de %.2f.", codPaciente, media);
		teclado.close();
	}

}
