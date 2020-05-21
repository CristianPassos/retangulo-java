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
        while (opcao < 3) {
			System.out.println();
			System.out.println("MENU:");
			System.out.println("1 - Mostrar area");
			System.out.println("2 - Mostrar perimetro");
			System.out.println("3 - Sair");
			System.out.println("Digite uma opcao: ");
			opcao = sc.nextInt();
			while (opcao > 3 || opcao < 1) {
				System.out.println();
				System.out.println("OPÇÃO INVALIDA");

				System.out.println();
				System.out.println("MENU:");
				System.out.println("1 - Mostrar area");
				System.out.println("2 - Mostrar perimetro");
				System.out.println("3 - Sair");
				System.out.println("Digite uma opcao: ");
				opcao = sc.nextInt();
			}

			System.out.println();

			if (opcao == 1) {
				areaRetangulo = largRetangulo * altRetangulo;
				System.out.println("AREA = " + areaRetangulo);
			} else if (opcao == 2) {
				perimeRetangulo = 2 *(largRetangulo + altRetangulo);
				System.out.println("PERIMETRO = " + perimeRetangulo);
			} else {
				System.out.println("FIM DO PROGRAMA!");
			}

		}

        sc.close();
    }
}