import java.util.Scanner;

public class Menu {

	static int menu() {
		int x, mes, ano;
		Scanner ler = new Scanner(System.in);
		System.out.println();
        System.out.println("Escolha uma opção do menu: \n"
        		+ "1. Entrada das temperaturas: \n"
        		+ "2. Cálculo da temperatura média: \n"
        		+ "3. Cálculo da temperatura mínima: \n"
        		+ "4. Cálculo da temperatura máxima: \n"
        		+ "5. Relatório meteorológico: \n"
        		+ "6. Encerrar programa");
		System.out.println();
        do {
    		x = ler.nextInt();
    		if (x < 1 || x > 6) {
		        System.out.print("Índice inválido!\n");
    		}
        } while(x < 1 || x > 6);
        if(x==6) {
	        System.out.println("\n"
	        		+ " ________ ___  _____ ______   ___       \n"
	        		+ "|\\  _____\\\\  \\|\\   _ \\  _   \\|\\  \\      \n"
	        		+ "\\ \\  \\__/\\ \\  \\ \\  \\\\\\__\\ \\  \\ \\  \\     \n"
	        		+ " \\ \\   __\\\\ \\  \\ \\  \\\\|__| \\  \\ \\  \\    \n"
	        		+ "  \\ \\  \\_| \\ \\  \\ \\  \\    \\ \\  \\ \\__\\   \n"
	        		+ "   \\ \\__\\   \\ \\__\\ \\__\\    \\ \\__\\|__|   \n"
	        		+ "    \\|__|    \\|__|\\|__|     \\|__|   ___ \n"
	        		+ "                                   |\\__\\\n"
	        		+ "                                   \\|__|\n"
	        		+ "                                        \n"
	        		+ "");
        	return 0;
        }
		do {
	        System.out.print("Digite o ano (entre 2011 e 2020):\n");
			ano = ler.nextInt();
			if(ano < 2011 || ano > 2020) {
		        System.out.print("Ano inválido!\n");
			}
		} while (ano < 2011 || ano > 2020);
		do {
	        System.out.print("Digite o mês (entre 1 e 12):\n");
			mes = ler.nextInt();
			if(mes < 1 || mes > 12) {
		        System.out.print("Mês inválido!\n");
			}
		} while(mes < 1 || mes > 12);

		switch(x) {
		case 1:
			//Chamada da função para cadastrar médias de temperatura
			Cadastrar.enterTemp(mes, ano);
			break;
		case 2:
			//Chamada da função para calcular temperatura média
			Media.tempMedia(mes, ano);
		case 3:
			//Chamada da função para imprimir temperatura mínima
			Minima.tempMin(mes, ano);
			break;
		case 4:
			//Chamada da função para imprimir temperatura máxima
			Maxima.tempMax(mes, ano);
			break;
		case 5:
			//Chamada da função para gerar relatório
			Relatorio.relatorio(mes, ano);
			break;
		default:
			break;
		}

		return 0;
	}
}