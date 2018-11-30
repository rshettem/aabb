package aabb;

public class Test {

	private int empId;
	private String empName;
	
	private String empDept;

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

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "Test [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + "]";
	}
	
	
}
