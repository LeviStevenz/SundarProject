package org.col.info;

public class InfoCollege {
	
   public void univName() {
	  System.out.println("SRM UNIVERSITY");
}
   public void affiliation() {
	   System.out.println("PARK COLLEGE");
   }   
	   public void affiliation2() {
		   System.out.println("NGP COLLEGE");
   }
	   public void affiliation3() {
		   System.out.println("SNS COLLEGE");
   }
	   
  public static void main(String[] args) {
	  InfoCollege details = new InfoCollege();
	  details.univName();
	  details.affiliation();
	  details.affiliation2();
	  details.affiliation3();
  }
}
