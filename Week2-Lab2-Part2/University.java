public class University{

	
        private String universityName;
        Campus C1;
	Campus C2;

		public void setC1(Campus a){
			C1 = a;
		}

		public Campus getC1(){
			return C1;
		}

		public void setC2(Campus b){
			C2 = b;
		}

		public Campus getC2(){
			return C2;
		}

		public void setUniversityName(String Uname){
			universityName = Uname;
		}

		public String getUniversityName(){
			return universityName;
		}

	public void Udisplay(){
		System.out.println("University name: "+universityName);
		C1.display();
		C2.display();
		
	}



}