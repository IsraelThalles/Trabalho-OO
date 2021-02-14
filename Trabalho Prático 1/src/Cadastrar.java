import java.util.Scanner;

public class Cadastrar {
	//Declaraçao dos arrays
	static double[] jan2011 = new double[31], fev2011 = new double[28], mar2011 = new double[31], abr2011 = new double[30], mai2011 = new double[31], jun2011 = new double[30], jul2011 = new double[31], ago2011 = new double[31], set2011 = new double[30], out2011 = new double[31], nov2011 = new double[30], dez2011 = new double[31];
	static double[] jan2012 = new double[31], fev2012 = new double[29], mar2012 = new double[31], abr2012 = new double[30], mai2012 = new double[31], jun2012 = new double[30], jul2012 = new double[31], ago2012 = new double[31], set2012 = new double[30], out2012 = new double[31], nov2012 = new double[30], dez2012 = new double[31];
	static double[] jan2013 = new double[31], fev2013 = new double[28], mar2013 = new double[31], abr2013 = new double[30], mai2013 = new double[31], jun2013 = new double[30], jul2013 = new double[31], ago2013 = new double[31], set2013 = new double[30], out2013 = new double[31], nov2013 = new double[30], dez2013 = new double[31];
	static double[] jan2014 = new double[31], fev2014 = new double[28], mar2014 = new double[31], abr2014 = new double[30], mai2014 = new double[31], jun2014 = new double[30], jul2014 = new double[31], ago2014 = new double[31], set2014 = new double[30], out2014 = new double[31], nov2014 = new double[30], dez2014 = new double[31];
	static double[] jan2015 = new double[31], fev2015 = new double[28], mar2015 = new double[31], abr2015 = new double[30], mai2015 = new double[31], jun2015 = new double[30], jul2015 = new double[31], ago2015 = new double[31], set2015 = new double[30], out2015 = new double[31], nov2015 = new double[30], dez2015 = new double[31];
	static double[] jan2016 = new double[31], fev2016 = new double[29], mar2016 = new double[31], abr2016 = new double[30], mai2016 = new double[31], jun2016 = new double[30], jul2016 = new double[31], ago2016 = new double[31], set2016 = new double[30], out2016 = new double[31], nov2016 = new double[30], dez2016 = new double[31];
	static double[] jan2017 = new double[31], fev2017 = new double[28], mar2017 = new double[31], abr2017 = new double[30], mai2017 = new double[31], jun2017 = new double[30], jul2017 = new double[31], ago2017 = new double[31], set2017 = new double[30], out2017 = new double[31], nov2017 = new double[30], dez2017 = new double[31];
	static double[] jan2018 = new double[31], fev2018 = new double[28], mar2018 = new double[31], abr2018 = new double[30], mai2018 = new double[31], jun2018 = new double[30], jul2018 = new double[31], ago2018 = new double[31], set2018 = new double[30], out2018 = new double[31], nov2018 = new double[30], dez2018 = new double[31];
	static double[] jan2019 = new double[31], fev2019 = new double[28], mar2019 = new double[31], abr2019 = new double[30], mai2019 = new double[31], jun2019 = new double[30], jul2019 = new double[31], ago2019 = new double[31], set2019 = new double[30], out2019 = new double[31], nov2019 = new double[30], dez2019 = new double[31];
	static double[] jan2020 = new double[31], fev2020 = new double[29], mar2020 = new double[31], abr2020 = new double[30], mai2020 = new double[31], jun2020 = new double[30], jul2020 = new double[31], ago2020 = new double[31], set2020 = new double[30], out2020 = new double[31], nov2020 = new double[30], dez2020 = new double[31];

	static int enterTemp(int a, int b) {
		Scanner ler = new Scanner(System.in);
		
		//Preenchimento dos dados de cada mês (cada case para um ano ou mês)
		switch(b) {
		case 2011:
			switch(a) {
			case 1:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jan2011[i] = ler.nextDouble();
				}
				break;
			case 2:
		        System.out.print("Informe as temperaturas médias dos 28 dias:\n");
				for(int i = 0; i < 28; i++) {
					fev2011[i] = ler.nextDouble();
				}
				break;
			case 3:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mar2011[i] = ler.nextDouble();
				}
				break;
			case 4:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					abr2011[i] = ler.nextDouble();
				}
				break;
			case 5:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mai2011[i] = ler.nextDouble();
				}
				break;
			case 6:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					jun2011[i] = ler.nextDouble();
				}
				break;
			case 7:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jul2011[i] = ler.nextDouble();
				}
				break;
			case 8:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					ago2011[i] = ler.nextDouble();
				}
				break;
			case 9:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					set2011[i] = ler.nextDouble();
				}
				break;
			case 10:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					out2011[i] = ler.nextDouble();
				}
				break;
			case 11:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					nov2011[i] = ler.nextDouble();
				}
				break;
			case 12:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					dez2011[i] = ler.nextDouble();
				}
				break;
			default:
				break;
			}
			break;
			
		case 2012:
			switch(a) {
			case 1:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jan2012[i] = ler.nextDouble();
				}
				break;
			case 2:
		        System.out.print("Informe as temperaturas médias dos 29 dias:\n");
				for(int i = 0; i < 29; i++) {
					fev2012[i] = ler.nextDouble();
				}
				break;
			case 3:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mar2012[i] = ler.nextDouble();
				}
				break;
			case 4:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					abr2012[i] = ler.nextDouble();
				}
				break;
			case 5:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mai2012[i] = ler.nextDouble();
				}
				break;
			case 6:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					jun2012[i] = ler.nextDouble();
				}
				break;
			case 7:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jul2012[i] = ler.nextDouble();
				}
				break;
			case 8:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					ago2012[i] = ler.nextDouble();
				}
				break;
			case 9:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					set2012[i] = ler.nextDouble();
				}
				break;
			case 10:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					out2012[i] = ler.nextDouble();
				}
				break;
			case 11:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					nov2012[i] = ler.nextDouble();
				}
				break;
			case 12:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					dez2012[i] = ler.nextDouble();
				}
				break;
			default:
				break;
			}
			break;
			
		case 2013:
			switch(a) {
			case 1:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jan2013[i] = ler.nextDouble();
				}
				break;
			case 2:
		        System.out.print("Informe as temperaturas médias dos 28 dias:\n");
				for(int i = 0; i < 28; i++) {
					fev2013[i] = ler.nextDouble();
				}
				break;
			case 3:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mar2013[i] = ler.nextDouble();
				}
				break;
			case 4:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					abr2013[i] = ler.nextDouble();
				}
				break;
			case 5:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mai2013[i] = ler.nextDouble();
				}
				break;
			case 6:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					jun2013[i] = ler.nextDouble();
				}
				break;
			case 7:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jul2013[i] = ler.nextDouble();
				}
				break;
			case 8:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					ago2013[i] = ler.nextDouble();
				}
				break;
			case 9:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					set2013[i] = ler.nextDouble();
				}
				break;
			case 10:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					out2013[i] = ler.nextDouble();
				}
				break;
			case 11:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					nov2013[i] = ler.nextDouble();
				}
				break;
			case 12:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					dez2013[i] = ler.nextDouble();
				}
				break;
			default:
				break;
			}
			break;
			
		case 2014:
			switch(a) {
			case 1:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jan2014[i] = ler.nextDouble();
				}
				break;
			case 2:
		        System.out.print("Informe as temperaturas médias dos 28 dias:\n");
				for(int i = 0; i < 28; i++) {
					fev2014[i] = ler.nextDouble();
				}
				break;
			case 3:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mar2014[i] = ler.nextDouble();
				}
				break;
			case 4:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					abr2014[i] = ler.nextDouble();
				}
				break;
			case 5:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mai2014[i] = ler.nextDouble();
				}
				break;
			case 6:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					jun2014[i] = ler.nextDouble();
				}
				break;
			case 7:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jul2014[i] = ler.nextDouble();
				}
				break;
			case 8:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					ago2014[i] = ler.nextDouble();
				}
				break;
			case 9:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					set2014[i] = ler.nextDouble();
				}
				break;
			case 10:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					out2014[i] = ler.nextDouble();
				}
				break;
			case 11:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					nov2014[i] = ler.nextDouble();
				}
				break;
			case 12:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					dez2014[i] = ler.nextDouble();
				}
				break;
			default:
				break;
			}
			break;
			
		case 2015:
			switch(a) {
			case 1:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jan2015[i] = ler.nextDouble();
				}
				break;
			case 2:
		        System.out.print("Informe as temperaturas médias dos 28 dias:\n");
				for(int i = 0; i < 28; i++) {
					fev2015[i] = ler.nextDouble();
				}
				break;
			case 3:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mar2015[i] = ler.nextDouble();
				}
				break;
			case 4:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					abr2015[i] = ler.nextDouble();
				}
				break;
			case 5:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mai2015[i] = ler.nextDouble();
				}
				break;
			case 6:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					jun2015[i] = ler.nextDouble();
				}
				break;
			case 7:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jul2015[i] = ler.nextDouble();
				}
				break;
			case 8:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					ago2015[i] = ler.nextDouble();
				}
				break;
			case 9:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					set2015[i] = ler.nextDouble();
				}
				break;
			case 10:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					out2015[i] = ler.nextDouble();
				}
				break;
			case 11:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					nov2015[i] = ler.nextDouble();
				}
				break;
			case 12:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					dez2015[i] = ler.nextDouble();
				}
				break;
			default:
				break;
			}
			break;
			
		case 2016:
			switch(a) {
			case 1:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jan2016[i] = ler.nextDouble();
				}
				break;
			case 2:
		        System.out.print("Informe as temperaturas médias dos 29 dias:\n");
				for(int i = 0; i < 29; i++) {
					fev2016[i] = ler.nextDouble();
				}
				break;
			case 3:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mar2016[i] = ler.nextDouble();
				}
				break;
			case 4:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					abr2016[i] = ler.nextDouble();
				}
				break;
			case 5:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mai2016[i] = ler.nextDouble();
				}
				break;
			case 6:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					jun2016[i] = ler.nextDouble();
				}
				break;
			case 7:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jul2016[i] = ler.nextDouble();
				}
				break;
			case 8:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					ago2016[i] = ler.nextDouble();
				}
				break;
			case 9:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					set2016[i] = ler.nextDouble();
				}
				break;
			case 10:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					out2016[i] = ler.nextDouble();
				}
				break;
			case 11:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					nov2016[i] = ler.nextDouble();
				}
				break;
			case 12:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					dez2016[i] = ler.nextDouble();
				}
				break;
			default:
				break;
			}
			break;

		case 2017:
			switch(a) {
			case 1:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jan2017[i] = ler.nextDouble();
				}
				break;
			case 2:
		        System.out.print("Informe as temperaturas médias dos 28 dias:\n");
				for(int i = 0; i < 28; i++) {
					fev2017[i] = ler.nextDouble();
				}
				break;
			case 3:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mar2017[i] = ler.nextDouble();
				}
				break;
			case 4:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					abr2017[i] = ler.nextDouble();
				}
				break;
			case 5:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mai2017[i] = ler.nextDouble();
				}
				break;
			case 6:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					jun2017[i] = ler.nextDouble();
				}
				break;
			case 7:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jul2017[i] = ler.nextDouble();
				}
				break;
			case 8:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					ago2017[i] = ler.nextDouble();
				}
				break;
			case 9:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					set2017[i] = ler.nextDouble();
				}
				break;
			case 10:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					out2017[i] = ler.nextDouble();
				}
				break;
			case 11:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					nov2017[i] = ler.nextDouble();
				}
				break;
			case 12:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					dez2017[i] = ler.nextDouble();
				}
				break;
			default:
				break;
			}
			break;
		
		case 2018:
			switch(a) {
			case 1:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jan2018[i] = ler.nextDouble();
				}
				break;
			case 2:
		        System.out.print("Informe as temperaturas médias dos 28 dias:\n");
				for(int i = 0; i < 28; i++) {
					fev2018[i] = ler.nextDouble();
				}
				break;
			case 3:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mar2018[i] = ler.nextDouble();
				}
				break;
			case 4:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					abr2018[i] = ler.nextDouble();
				}
				break;
			case 5:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mai2018[i] = ler.nextDouble();
				}
				break;
			case 6:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					jun2018[i] = ler.nextDouble();
				}
				break;
			case 7:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jul2018[i] = ler.nextDouble();
				}
				break;
			case 8:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					ago2018[i] = ler.nextDouble();
				}
				break;
			case 9:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					set2018[i] = ler.nextDouble();
				}
				break;
			case 10:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					out2018[i] = ler.nextDouble();
				}
				break;
			case 11:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					nov2018[i] = ler.nextDouble();
				}
				break;
			case 12:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					dez2018[i] = ler.nextDouble();
				}
				break;
			default:
				break;
			}
			break;
		
		case 2019:
			switch(a) {
			case 1:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jan2019[i] = ler.nextDouble();
				}
				break;
			case 2:
		        System.out.print("Informe as temperaturas médias dos 28 dias:\n");
				for(int i = 0; i < 28; i++) {
					fev2019[i] = ler.nextDouble();
				}
				break;
			case 3:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mar2019[i] = ler.nextDouble();
				}
				break;
			case 4:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					abr2019[i] = ler.nextDouble();
				}
				break;
			case 5:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mai2019[i] = ler.nextDouble();
				}
				break;
			case 6:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					jun2019[i] = ler.nextDouble();
				}
				break;
			case 7:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jul2019[i] = ler.nextDouble();
				}
				break;
			case 8:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					ago2019[i] = ler.nextDouble();
				}
				break;
			case 9:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					set2019[i] = ler.nextDouble();
				}
				break;
			case 10:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					out2019[i] = ler.nextDouble();
				}
				break;
			case 11:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					nov2019[i] = ler.nextDouble();
				}
				break;
			case 12:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					dez2019[i] = ler.nextDouble();
				}
				break;
			default:
				break;
			}
			break;
		
		case 2020:
			switch(a) {
			case 1:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jan2020[i] = ler.nextDouble();
				}
				break;
			case 2:
		        System.out.print("Informe as temperaturas médias dos 29 dias:\n");
				for(int i = 0; i < 29; i++) {
					fev2020[i] = ler.nextDouble();
				}
				break;
			case 3:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mar2020[i] = ler.nextDouble();
				}
				break;
			case 4:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					abr2020[i] = ler.nextDouble();
				}
				break;
			case 5:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					mai2020[i] = ler.nextDouble();
				}
				break;
			case 6:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					jun2020[i] = ler.nextDouble();
				}
				break;
			case 7:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					jul2020[i] = ler.nextDouble();
				}
				break;
			case 8:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					ago2020[i] = ler.nextDouble();
				}
				break;
			case 9:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					set2020[i] = ler.nextDouble();
				}
				break;
			case 10:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					out2020[i] = ler.nextDouble();
				}
				break;
			case 11:
		        System.out.print("Informe as temperaturas médias dos 30 dias:\n");
				for(int i = 0; i < 30; i++) {
					nov2020[i] = ler.nextDouble();
				}
				break;
			case 12:
		        System.out.print("Informe as temperaturas médias dos 31 dias:\n");
				for(int i = 0; i < 31; i++) {
					dez2020[i] = ler.nextDouble();
				}
				break;
			default:
				break;
			}
			break;
		
		default:
			break;
		}

        System.out.print("Médias de temperaturas cadastradas\n");
		return Menu.menu();
	}

}