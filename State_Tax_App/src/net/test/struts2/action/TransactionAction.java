package net.test.struts2.action;

import java.util.ArrayList;
import java.util.List;

import net.test.domain.Address;
import net.test.domain.User;
import net.test.transaction.StateTax;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TransactionAction extends ActionSupport {
	String TransactionAddress;
	public String getTransactionAddress() {
		return TransactionAddress;
	}

	public void setTransactionAddress(String transactionAddress) {
		TransactionAddress = transactionAddress;
	}

	public String execute() {
		System.out.println( "You Selected: " + getTransactionAddress());
		User currentUser= (User)ActionContext.getContext().getSession().get("currentUser");
		
		System.out.println( "You Selected: " + currentUser.getAnnualIncome());
		StateTax st=new StateTax();
		
		for(int count=0;count<currentUser.getAddress().size();count++){
			Address addr=currentUser.getAddress().get(count);
			if (addr.getKey().equals(getTransactionAddress()))
				currentUser.setTaxAddress(addr);
		}
		System.out.println( "You Selected: " + currentUser.getTaxAddress().getState());
		int taxcity=Integer.parseInt(getTransactionAddress());
		st.setAnnualIncome(currentUser.getAnnualIncome());
		st.setTaxCity(taxcity);
		System.out.println( "You Tax: " + st.netTaxPayable());
		currentUser.setStateTax(st.netTaxPayable());
		setTaxPayedUser(currentUser);
		ActionContext.getContext().getSession().put("TaxPayedUser", currentUser);
		return "success";
	}
	
	public String display() {
		return "none";
	}
	
	private User taxPayedUser;
	public User getTaxPayedUser() {
		return taxPayedUser;
	}

	public void setTaxPayedUser(User taxPayedUser) {
		this.taxPayedUser = taxPayedUser;
	}
	
	
	

}
