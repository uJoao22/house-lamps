package pacPrincipal;

import java.util.Scanner;

public class Pincipal {

	public static void menu() {
		System.out.println("1 - Ligar lâmpada de um cômodo");
		System.out.println("2 - Apagar lâmpada de um cômodo");
		System.out.println("3 - Verificar a casa");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Lampada casa[] = new Lampada[5];

		for (int i = 0; i < casa.length; i++) {
			casa[i] = new Lampada();
		}

		menu();
		int comodo, op = sc.nextInt();

		while (op >= 1 && op <= 3) {

			switch (op) {

			case 1:
				System.out.println("\nQual cômodo?");
				comodo = sc.nextInt();
				casa[comodo].ligar();
				break;

			case 2:
				System.out.println("\nQual cômodo?");
				comodo = sc.nextInt();
				casa[comodo].desligar();
				break;

			case 3:
				for (int i = 0; i < casa.length; i++) {

					if (casa[i].getEstado()) {
						System.out.println("Cômodo " + i + " - ligado");
					} else {
						System.out.println("Cômodo " + i + " - desligado");
					}
				}
			}
			menu();
			op = sc.nextInt();
		}

		sc.close();
	}
}