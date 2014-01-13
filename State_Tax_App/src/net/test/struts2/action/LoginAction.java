package net.test.struts2.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.test.domain.Address;
import net.test.domain.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
    private String username;
    private String password;
    private User currentUser;

    public String execute() {
 
        if (this.username.equals("ttatva")
                && this.password.equals("ttatva123")) {
        	currentUser=new User("Sushil",32,45678,456783);
        	currentUser.setAddress(fillAddress());
        	ActionContext.getContext().getSession().put("currentUser", currentUser);
            return "success";
        } else {
            addActionError(getText("error.login"));
            return "error";
        }
        
    }
    
    
    private List<Address> fillAddress(){
    	List<Address> userAddress = new ArrayList<Address>();
    	if (currentUser.getUID()==45678){
    		Address office = new Address("1", "Bangalore");
    		Address home = new Address("2", "Delhi");
    		Address comm = new Address("3", "Mumbai");
  	    	userAddress.add(office);
  	    	userAddress.add(home);
  	    	userAddress.add(comm);
    	}
  	  return userAddress;
    }
     
    
    
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
}

