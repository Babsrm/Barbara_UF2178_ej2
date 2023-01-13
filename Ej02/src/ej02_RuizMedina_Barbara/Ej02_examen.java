package ej02_RuizMedina_Barbara;

import java.util.Scanner;

public class Ej02_examen {
	public static void mostrar_imcs(double matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.printf("%.2f ",matriz[i][j]);
			}
			System.out.println(); // salto de línea
		}
	}
	
	public static double media_paciente (double matriz[][], int paciente) {
		double media = 0;
		double acumulado = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			if (i == paciente) {
				for (int j = 0; j < matriz[0].length; j++) {
					acumulado = acumulado + matriz[i][j];
				}
				media = acumulado / matriz[0].length;
			}	
		}
		return media;		
		} 
	}
	
	
	

