public class Department{

	private String departmentName;
	private String hodName;

		public void setDname(String name){
			departmentName = name;
		}

		public void setHname(String name1){
			hodName = name1;
		}

		public String getDname(){
			return departmentName;
		}

		public String getHname(){
			return hodName;
		}

	public void display1(){

		System.out.println("Department name: " +departmentName);
		System.out.println("HOD name: " +hodName );
	}


}