import java.util.Random;

public class Inicio {

	public static void main(String[] args) {
        System.out.print("Dados meteorológicos da década 2011-2020\n");
        Cadastrar Janeiro = new Cadastrar();
        Random gerador = new Random();
        
        //Preenchimento dos dados de janeiro de 2020 com números aleatṕrios entre 12 e 30
        for (int i = 0; i < 31; i++) {
            Janeiro.jan2020[i] = gerador.nextDouble()*18+12;
        }

		Menu.menu();
	}
}