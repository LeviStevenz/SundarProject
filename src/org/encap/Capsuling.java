package org.encap;

import java.util.ArrayList;
import java.util.List;

public class Capsuling {
	
	
	public static void main(String[] args) {
		
	GetSet y = new GetSet();
	
	y.setName("Steve");
	y.setId(122333);
	y.setSalary(95000.69f);
	
	GetSet u = new GetSet();
	u.setName("Kevin");
	u.setId(455666);
	u.setSalary(85000.96f);
	
	List<GetSet> x = new ArrayList<>();
	
	x.add(y);
	x.add(u);
	
	for (GetSet a : x) {
		System.out.println(a.getName());
		System.out.println(a.getId());
		System.out.println(a.getSalary());
	}	
	
 }
	

}
