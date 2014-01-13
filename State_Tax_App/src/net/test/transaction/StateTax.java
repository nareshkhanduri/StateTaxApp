package net.test.transaction;

public class StateTax {
	
private double annualIncome;

public double getAnnualIncome() {
	return annualIncome;
}
public void setAnnualIncome(double annualIncome) {
	this.annualIncome = annualIncome;
}
public double getMonthlyIncome() {
	return monthlyIncome;
}
public void setMonthlyIncome(double monthlyIncome) {
	this.monthlyIncome = monthlyIncome;
}
public int getTaxCity() {
	return taxCity;
}
public void setTaxCity(int taxCity) {
	this.taxCity = taxCity;
}
private double monthlyIncome;
private int taxCity;

public double netTaxPayable(){
	double calculatedTax=0.0;
	if(getTaxCity()==1)
		calculatedTax=getAnnualIncome()*0.1+getAnnualIncome()*0.05;
	if(getTaxCity()==2)
		calculatedTax=getAnnualIncome()*0.1+getAnnualIncome()*0.06;
	if (getTaxCity()==3)
		calculatedTax=getAnnualIncome()*0.1+getAnnualIncome()*0.09;
	return calculatedTax;	
		
}


}
