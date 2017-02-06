package com.rbfe.controller;
 
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class ListSelectBean {
    private List<String> actions;
    private List<String> organisationTypes;
    
    private List<String> loginType;
    private String loggedInUser;
    private List<Account> accountList;
    
    public List<Account> getAccountList() {
    	accountList = new ArrayList<Account>();
    	Account acc1 = new  Account("acc1", "Alex", "a7341365193", "2017-8-21", 1897);
    	Account acc2 = new  Account("acc1", "John", "j3520142879", "2018-12-12", 0);
    	Account acc3 = new  Account("acc1", "Steve", "s281782323", "2020-7-11", 6544);
    	Account acc4 = new  Account("acc1", "Johnson","J7215449132", "2017-1-18", 234);
    	Account acc5 = new  Account("acc1", "Stokes", "S6341835139", "2016-7-23", 875);
    	accountList.add(acc1);
    	accountList.add(acc2);
    	accountList.add(acc3);
    	accountList.add(acc4);
    	accountList.add(acc5);
		return accountList;
	}

	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}

	public List<String> getItemGroups() {
		return itemGroups;
	}

	public String getLoggedInUser() {
		return loggedInUser;
	}

	public void setLoggedInUser(String loggedInUser) {
		this.loggedInUser = loggedInUser;
	}

	public List<String> getLoginType() {
    	loginType = new ArrayList<String>();
    	loginType.add("Admin");
    	loginType.add("User");
		return loginType;
	}

	public void setLoginType(List<String> loginType) {
		this.loginType = loginType;
	}


	private String organisationType;
    public String getOrganisationType() {
		return organisationType;
	}

	public void setOrganisationType(String organisationType) {
		this.organisationType = organisationType;
	}


	private List<String> agents;
    private List<String> itemGroups;
    public void setOrganisationTypes(List<String> organisationTypes) {
		this.organisationTypes = organisationTypes;
	}

	public void setAgents(List<String> agents) {
		this.agents = agents;
	}

	public void setItemGroups(List<String> itemGroups) {
		this.itemGroups = itemGroups;
	}


	private List<String> selectedActions;
 
    public List<String> getActions() {
    	actions = new ArrayList<String>();
    	actions.add("Generate Report");
    	actions.add("Generate Claims Report");
    	actions.add("Policy Upload");
    	actions.add("Policy Copy");
    	actions.add("Policy Download");
    	actions.add("Policy Search and Select");
        return actions;
    }
 
    public void setActions(List<String> actions) {
        this.actions = actions;
    }
 
    public List<String> getSelectedActions() {
        return selectedActions;
    }
 
    public void setSelectedActions(List<String> selectedActions) {
        this.selectedActions = selectedActions;
    }
    
    public List<String> getOrganisationTypes() {
    	organisationTypes = new ArrayList<String>();
    	organisationTypes.add("Agent");
    	organisationTypes.add("Model Agent");
    	organisationTypes.add("Brokers");
    
        return organisationTypes;
    }
 
    
    
    public List<String> getAgents() {
    	agents = new ArrayList<String>();
    	agents.add("Unisys Agent");
    	agents.add("XYZ INC");
    	agents.add("Zurich Agent");
        return agents;
    }
 
    
    public List<String> getItemsGroup() {
    	itemGroups = new ArrayList<String>();
    	itemGroups.add("Broker");
    	itemGroups.add("Underwriter");
    	itemGroups.add("Agent");

        return itemGroups;
    }
 
}
