package com.neelesh.pojo;

import java.util.ArrayList;
import java.util.List;

public class Country {
	private List<State> state = new ArrayList<State>() ;
	private String name ; 
	
	public void addState( State s  ) {
		if ( s != null )
			state.add(s) ; 
	}

	public List<State> getState() {
		return state;
	}

	public void setState(List<State> state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
