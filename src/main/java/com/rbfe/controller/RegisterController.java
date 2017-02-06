package com.rbfe.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Size;
@ManagedBean
@RequestScoped
public class RegisterController implements Cloneable {
	
	@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

	@Size(min = 3, max = 10, message = "Username length must be between {min} and {max} characters.")
	private String username;
	@Size(min = 6, max = 12, message = "Password length must be between {min} and {max} characters.")
	private String password;
	private String confirm;

	@AssertTrue(message = "Passwords must match!")
	public boolean isPasswordsEquals() {
		return password.equals(confirm);
	}

	public void addUser() {
		FacesContext.getCurrentInstance().addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Successfully registred!", ""));
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

	public String getConfirm() {
		return confirm;
	}

	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
}
