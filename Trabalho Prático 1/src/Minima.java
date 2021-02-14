import java.text.DecimalFormat;

public class Minima {

	static int tempMin(int a, int b) {
		double nMin=0;
		//Declaração de variável boleana para verificar se array 'mes20??' foi preenchido
		boolean arrayNulo = true;
		double[] mesAlvo;

		Cadastrar Periodo = new Cadastrar();
		DecimalFormat formatador = new DecimalFormat("0.000");
		
		//Buscar array de outra classe e armazená-lo em um array dessa classe
		if(b==2011) {
			if(a==1) {
		    	mesAlvo = Periodo.jan2011;
			}else if(a==2) {
		    	mesAlvo = Periodo.fev2011;
			}else if(a==3) {
		    	mesAlvo = Periodo.mar2011;
			}else if(a==4) {
		    	mesAlvo = Periodo.abr2011;
			}else if(a==5) {
		    	mesAlvo = Periodo.mai2011;
			}else if(a==6) {
		    	mesAlvo = Periodo.jun2011;
			}else if(a==7) {
		    	mesAlvo = Periodo.jul2011;
			}else if(a==8) {
		    	mesAlvo = Periodo.ago2011;
			}else if(a==9) {
		    	mesAlvo = Periodo.set2011;
			}else if(a==10) {
		    	mesAlvo = Periodo.out2011;
			}else if(a==11) {
		    	mesAlvo = Periodo.nov2011;
			}else {
		    	mesAlvo = Periodo.dez2011;
			}

		}else if(b==2012) {
			if(a==1) {
		    	mesAlvo = Periodo.jan2012;
			}else if(a==2) {
		    	mesAlvo = Periodo.fev2012;
			}else if(a==3) {
		    	mesAlvo = Periodo.mar2012;
			}else if(a==4) {
		    	mesAlvo = Periodo.abr2012;
			}else if(a==5) {
		    	mesAlvo = Periodo.mai2012;
			}else if(a==6) {
		    	mesAlvo = Periodo.jun2012;
			}else if(a==7) {
		    	mesAlvo = Periodo.jul2012;
			}else if(a==8) {
		    	mesAlvo = Periodo.ago2012;
			}else if(a==9) {
		    	mesAlvo = Periodo.set2012;
			}else if(a==10) {
		    	mesAlvo = Periodo.out2012;
			}else if(a==11) {
		    	mesAlvo = Periodo.nov2012;
			}else {
		    	mesAlvo = Periodo.dez2012;
			}
			
		}else if(b==2013) {
			if(a==1) {
		    	mesAlvo = Periodo.jan2013;
			}else if(a==2) {
		    	mesAlvo = Periodo.fev2013;
			}else if(a==3) {
		    	mesAlvo = Periodo.mar2013;
			}else if(a==4) {
		    	mesAlvo = Periodo.abr2013;
			}else if(a==5) {
		    	mesAlvo = Periodo.mai2013;
			}else if(a==6) {
		    	mesAlvo = Periodo.jun2013;
			}else if(a==7) {
		    	mesAlvo = Periodo.jul2013;
			}else if(a==8) {
		    	mesAlvo = Periodo.ago2013;
			}else if(a==9) {
		    	mesAlvo = Periodo.set2013;
			}else if(a==10) {
		    	mesAlvo = Periodo.out2013;
			}else if(a==11) {
		    	mesAlvo = Periodo.nov2013;
			}else {
		    	mesAlvo = Periodo.dez2013;
			}
			
		}else if(b==2014) {
			if(a==1) {
		    	mesAlvo = Periodo.jan2014;
			}else if(a==2) {
		    	mesAlvo = Periodo.fev2014;
			}else if(a==3) {
		    	mesAlvo = Periodo.mar2014;
			}else if(a==4) {
		    	mesAlvo = Periodo.abr2014;
			}else if(a==5) {
		    	mesAlvo = Periodo.mai2014;
			}else if(a==6) {
		    	mesAlvo = Periodo.jun2014;
			}else if(a==7) {
		    	mesAlvo = Periodo.jul2014;
			}else if(a==8) {
		    	mesAlvo = Periodo.ago2014;
			}else if(a==9) {
		    	mesAlvo = Periodo.set2014;
			}else if(a==10) {
		    	mesAlvo = Periodo.out2014;
			}else if(a==11) {
		    	mesAlvo = Periodo.nov2014;
			}else {
		    	mesAlvo = Periodo.dez2014;
			}
			
		}else if(b==2015) {
			if(a==1) {
		    	mesAlvo = Periodo.jan2015;
			}else if(a==2) {
		    	mesAlvo = Periodo.fev2015;
			}else if(a==3) {
		    	mesAlvo = Periodo.mar2015;
			}else if(a==4) {
		    	mesAlvo = Periodo.abr2015;
			}else if(a==5) {
		    	mesAlvo = Periodo.mai2015;
			}else if(a==6) {
		    	mesAlvo = Periodo.jun2015;
			}else if(a==7) {
		    	mesAlvo = Periodo.jul2015;
			}else if(a==8) {
		    	mesAlvo = Periodo.ago2015;
			}else if(a==9) {
		    	mesAlvo = Periodo.set2015;
			}else if(a==10) {
		    	mesAlvo = Periodo.out2015;
			}else if(a==11) {
		    	mesAlvo = Periodo.nov2015;
			}else {
		    	mesAlvo = Periodo.dez2015;
			}
			
		}else if(b==2016) {
			if(a==1) {
		    	mesAlvo = Periodo.jan2016;
			}else if(a==2) {
		    	mesAlvo = Periodo.fev2016;
			}else if(a==3) {
		    	mesAlvo = Periodo.mar2016;
			}else if(a==4) {
		    	mesAlvo = Periodo.abr2016;
			}else if(a==5) {
		    	mesAlvo = Periodo.mai2016;
			}else if(a==6) {
		    	mesAlvo = Periodo.jun2016;
			}else if(a==7) {
		    	mesAlvo = Periodo.jul2016;
			}else if(a==8) {
		    	mesAlvo = Periodo.ago2016;
			}else if(a==9) {
		    	mesAlvo = Periodo.set2016;
			}else if(a==10) {
		    	mesAlvo = Periodo.out2016;
			}else if(a==11) {
		    	mesAlvo = Periodo.nov2016;
			}else {
		    	mesAlvo = Periodo.dez2016;
			}
			
		}else if(b==2017) {
			if(a==1) {
		    	mesAlvo = Periodo.jan2017;
			}else if(a==2) {
		    	mesAlvo = Periodo.fev2017;
			}else if(a==3) {
		    	mesAlvo = Periodo.mar2017;
			}else if(a==4) {
		    	mesAlvo = Periodo.abr2017;
			}else if(a==5) {
		    	mesAlvo = Periodo.mai2017;
			}else if(a==6) {
		    	mesAlvo = Periodo.jun2017;
			}else if(a==7) {
		    	mesAlvo = Periodo.jul2017;
			}else if(a==8) {
		    	mesAlvo = Periodo.ago2017;
			}else if(a==9) {
		    	mesAlvo = Periodo.set2017;
			}else if(a==10) {
		    	mesAlvo = Periodo.out2017;
			}else if(a==11) {
		    	mesAlvo = Periodo.nov2017;
			}else {
		    	mesAlvo = Periodo.dez2017;
			}
			
		}else if(b==2018) {
			if(a==1) {
		    	mesAlvo = Periodo.jan2018;
			}else if(a==2) {
		    	mesAlvo = Periodo.fev2018;
			}else if(a==3) {
		    	mesAlvo = Periodo.mar2018;
			}else if(a==4) {
		    	mesAlvo = Periodo.abr2018;
			}else if(a==5) {
		    	mesAlvo = Periodo.mai2018;
			}else if(a==6) {
		    	mesAlvo = Periodo.jun2018;
			}else if(a==7) {
		    	mesAlvo = Periodo.jul2018;
			}else if(a==8) {
		    	mesAlvo = Periodo.ago2018;
			}else if(a==9) {
		    	mesAlvo = Periodo.set2018;
			}else if(a==10) {
		    	mesAlvo = Periodo.out2018;
			}else if(a==11) {
		    	mesAlvo = Periodo.nov2018;
			}else {
		    	mesAlvo = Periodo.dez2018;
			}
			
		}else if(b==2019) {
			if(a==1) {
		    	mesAlvo = Periodo.jan2019;
			}else if(a==2) {
		    	mesAlvo = Periodo.fev2019;
			}else if(a==3) {
		    	mesAlvo = Periodo.mar2019;
			}else if(a==4) {
		    	mesAlvo = Periodo.abr2019;
			}else if(a==5) {
		    	mesAlvo = Periodo.mai2019;
			}else if(a==6) {
		    	mesAlvo = Periodo.jun2019;
			}else if(a==7) {
		    	mesAlvo = Periodo.jul2019;
			}else if(a==8) {
		    	mesAlvo = Periodo.ago2019;
			}else if(a==9) {
		    	mesAlvo = Periodo.set2019;
			}else if(a==10) {
		    	mesAlvo = Periodo.out2019;
			}else if(a==11) {
		    	mesAlvo = Periodo.nov2019;
			}else {
		    	mesAlvo = Periodo.dez2019;
			}
			
		}else {
			if(a==1) {
		    	mesAlvo = Periodo.jan2020;
			}else if(a==2) {
		    	mesAlvo = Periodo.fev2020;
			}else if(a==3) {
		    	mesAlvo = Periodo.mar2020;
			}else if(a==4) {
		    	mesAlvo = Periodo.abr2020;
			}else if(a==5) {
		    	mesAlvo = Periodo.mai2020;
			}else if(a==6) {
		    	mesAlvo = Periodo.jun2020;
			}else if(a==7) {
		    	mesAlvo = Periodo.jul2020;
			}else if(a==8) {
		    	mesAlvo = Periodo.ago2020;
			}else if(a==9) {
		    	mesAlvo = Periodo.set2020;
			}else if(a==10) {
		    	mesAlvo = Periodo.out2020;
			}else if(a==11) {
		    	mesAlvo = Periodo.nov2020;
			}else {
		    	mesAlvo = Periodo.dez2020;
			}
			
		}
		
		for(int i = 0; i < mesAlvo.length; i++) {
			//Verificando se array é nulo (não preenchido)
			if(mesAlvo[i] != 0) {
				arrayNulo = false;
			}
			if(i == 0) {
				nMin = mesAlvo[i];
			}
			if(mesAlvo[i] < nMin) {
				nMin = mesAlvo[i];
			}
		}
		if(arrayNulo) {
	        System.out.println("Não é possível realizar a operação. Entre primeiro com os dados de " + a + "/" + b);
		} else {
			System.out.println("Temperatura média mínima do mês " + a + " do ano " + b + ": " + formatador.format(nMin) + " °C");
			for(int i = 0; i < mesAlvo.length; i++) {
				if(mesAlvo[i] == nMin) {
					System.out.println("Ocorreu no dia " + (i+1));
				}
			}
		}
		
		return Menu.menu();
	}
}