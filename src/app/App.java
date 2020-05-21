package app;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double largRetangulo, altRetangulo, areaRetangulo, perimeRetangulo;
        int opcao = 0; 

        System.out.println("Digite a largura do retangulo: ");
        largRetangulo = sc.nextDouble();

        while (largRetangulo <= 0) {
			System.out.println("O valor deve ser positivo. Tente novamente:");
			largRetangulo = sc.nextDouble();
        }
        System.out.println("Digite a altura do retangulo: ");
		altRetangulo = sc.nextDouble();
		while (altRetangulo <= 0) {
			System.out.println("O valor deve ser positivo. Tente novamente: ");
			altRetangulo = sc.nextDouble();
		}

        sc.close();
    }
}