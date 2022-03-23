package org.affl.col;

import org.col.info.InfoCollege;

public class ParkCollege extends InfoCollege {
	 public void stuName() {
		  System.out.println("LOKI");
	}
	   public void dept() {
		   System.out.println("Mech");
	   }   


public static void main(String[] args) {
	  ParkCollege info = new ParkCollege();
	  info.univName();
	  info.affiliation();
	  info.stuName();
	  info.dept();
}
	  
}