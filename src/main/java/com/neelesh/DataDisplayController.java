package com.neelesh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neelesh.pojo.Country;
import com.neelesh.pojo.State;


@Controller
public class DataDisplayController {
	
	
	@SuppressWarnings("unchecked")
	@GetMapping("/getcountryjson") 
	@ResponseBody
	public List<Country> getCountryJSon() {
		 List<Country> ls = getCountry() ;  
		return  ls ; 
	}
		
		
	private List<Country> getCountry() { 
		List<Country> cl = new ArrayList<Country>() ; 
		Country c = new Country() ; 
  String[] _state = {"Alabama AL","Alaska AK","Arizona AZ ","Arkansas AR ","California CA ","Colorado CO ","Connecticut CT ","Delaware DE ","Florida FL ","Georgia GA ","Hawaii HI ","Idaho ID ","Illinois IL ","Indiana IN ","Iowa IA ","Kansas KS ","Kentucky[","Louisiana LA ","Maine ME ","Maryland MD ","Massachusetts[","Michigan MI ","Minnesota MN ","Mississippi MS ","Missouri MO ","Montana MT ","Nebraska NE ","Nevada NV ","New Hampshire ","New Jersey ","New Mexico ","New York ","North Carolina ","North Dakota ","Ohio OH ","Oklahoma OK ","Oregon OR ","South Carolina ","South Dakota ","Tennessee TN ","Texas TX ","Utah UT ","Vermont VT ","Virginia VA","Washington WA ","West Virginia ","Wisconsin WI "};
		
		c.setName("USA");
		for( String s : _state ) 
			c.addState(new State(s));
			
		cl.add(c) ; 
		c = new Country() ; 
		
		
		String[] _state1 = {"Andhra Pradesh (AP)","Arunachal Pradesh (AR)","Assam (AS)","Bihar (BR)","Chhattisgarh (CG)","Goa (GA)","Gujarat (GJ)","Haryana (HR)","Himachal Pradesh (HP)","Jammu and Kashmir (JK)","Jharkhand (JH)","Karnataka (KA)","Kerala (KL)","Madhya Pradesh (MP)","Maharashtra (MH)","Manipur (MN)","Meghalaya (ML)","Mizoram (MZ)","Nagaland (NL)","Odisha(OR)","Punjab (PB)","Rajasthan (RJ)","Sikkim (SK)","Tamil Nadu (TN)","Telangana (TS)","Tripura (TR)","Uttar Pradesh (UP)","Uttarakhand (UK)","West Bengal (WB)"};
		c.setName("India");
		for( String s : _state1 ) 
			c.addState(new State(s) ); 
		
		cl.add(c) ; 
		return cl ; 
	}

}
