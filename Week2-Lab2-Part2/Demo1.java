public class Demo1{

	public static void main(String args[]){

		Department se = new Department();
		Department cs = new Department();

		Department se2 = new Department();
		Department cs2 = new Department();

		University u1 = new University();
		Campus c1 = new Campus();
		Campus c2 = new Campus();

			cs.setDname("Computer Science");
			cs.setHname("Ali Aziz");

			se.setDname("Accounting and Finance");
			se.setHname("Allama Iqbal");

			cs2.setDname("Applied Sciences");
			cs2.setHname("Quaid e Azam");

			se2.setDname("Space Sciences");
			se2.setHname("Asif Zardari");

			c1.setCname("CUI Lahore Campus");
			c2.setCname("CUI Isl Campus");

			u1.setUniversityName("COMSATS University");


			

		c1.setCS(cs);
		c1.setSE(se);

		c2.setCS(cs2);
		c2.setSE(se2);

		u1.setC1(c1);
		u1.setC2(c2);

			u1.Udisplay();
		


}



}