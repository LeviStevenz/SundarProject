package org.affl.col;


public class NgpCollege extends ParkCollege {

		 public void stuName() {
			  System.out.println("BRUCE");
		}
		   public void dept() {
			   System.out.println("CSE");
		   }   


	public static void main(String[] args) {
		  NgpCollege info2 = new NgpCollege();
		  ParkCollege info = new ParkCollege();
		  info2.univName();
		  info2.affiliation2();
		  info2.stuName();
		  info2.dept();
		  info.affiliation();
		  info.stuName();
		  info.dept();
		  
	}
}
