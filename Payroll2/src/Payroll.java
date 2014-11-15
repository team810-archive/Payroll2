
public class Payroll {

	public static void main(String[] args) {
		//Please do number one first
		//This will be confusing if you have not completed the first one yet!
		System.out.println(payroll(8,200));

	}
	
	//Declares 2 parameters that have to have a value
	//If it does not have the 2 parameters filled in where you use it, it won't compile!
	
	static String payroll(double hours, double payment) {
		double fedTaxRate = 0.2; 
		double stateTaxRate = 0.06;
		double ficaRate = 0.05;
		
		double pay = 0; 
		double overTime = 0;
		double grossPay = 0; 
		double fedTax = 0; 
		double stateTax = 0;
		double fica = 0;
		double net = 0;
		
		pay = hours*payment;
		if(hours>=40) {
			overTime = ((hours-40)*1.5)*payment;
		}
		grossPay = pay+overTime;
		fedTax = grossPay*fedTaxRate;
		stateTax = grossPay*stateTaxRate;
		fica = grossPay*ficaRate;
		net = grossPay-fedTax-stateTax-fica;

		return "Regular pay: $"+pay+"\nOver Time: $"+overTime+"\nGross Pay: $"+grossPay+
				"\nFederal Tax: $"+fedTax+"\nState Tax: $"+stateTax+"\nFICA: $"+fica+
				"\n*************************************"+"\nNet Pay: $"+net;
	}

}
