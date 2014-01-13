package net.test.struts2.action;

import net.test.domain.User;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class GetDetails extends ActionSupport {
	
	public String execute() {
		System.out.println("I am in Welcome Action");
		User currentUser= (User)ActionContext.getContext().getSession().get("currentUser");
		System.out.println("Got User " + currentUser.getUID());
		setUser(currentUser);
		return "success";
	}

	private User user=null;

	public void setUser(User user){
	    this.user=user;
	}

	public User getUser(){
	    return user;
	}
	
}
