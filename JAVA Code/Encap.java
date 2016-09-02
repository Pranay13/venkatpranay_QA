public class Encap {

	public static void main(String[] args){
	Abc obj=new Abc();
	obj.setEmpId(3);
	obj.setEmpName("Pranay");
	
	System.out.println(obj.getEmpName());
	System.out.println(obj.getEmpId());

	}
}

class Abc {
	private int empId;
	private String empName;
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}