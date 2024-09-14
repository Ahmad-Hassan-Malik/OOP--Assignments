public class Campus{

	private String campusName;

	Department CS;
	Department SE;

	Department d3 = new Department();

		public void setCS(Department d){
			CS = d;
		}

		public Department getCS(){
			return CS;
		}

		public void setSE(Department e){
			SE = e;
		}

		public Department geSE(){
			return SE;
		}

		public void setCname(String name){
			campusName = name;
		}

		public String getCname(String name){
			return campusName;
		}

		public void display(){

			System.out.println("Campus Name:"+campusName);
			CS.display1();
			SE.display1();
		}

}