package Q3;

public class Department {
String deptName;
String deptLoc;

public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
public String getDeptLoc() {
	return deptLoc;
}
public void setDeptLoc(String deptLoc) {
	this.deptLoc = deptLoc;
}
@Override
public String toString() {
	return "Department [deptName=" + deptName + ", deptLoc=" + deptLoc + "]";
}
public Department(String deptName, String deptLoc) {
	super();
	this.deptName = deptName;
	this.deptLoc = deptLoc;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}


}
