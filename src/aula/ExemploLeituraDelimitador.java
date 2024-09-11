package aula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraDelimitador {
	public static void main(String[] args) {
		
		try {
			//Ponto barra pega o diretorio atual
			Scanner sc = new Scanner(new File("src./teste/alunos.csv"));
			sc.useDelimiter(";");
			while (sc.hasNext()) {
				System.out.println(sc.next());
			}
			sc.close();
			} catch (FileNotFoundException e) {
			System.err.println("Arquivo não encontrado!");
		}
	
	}	
}
