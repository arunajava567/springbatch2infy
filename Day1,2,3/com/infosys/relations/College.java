package com.infosys.relations;


class Department{ //part class
	private Integer deptId;
	private String hodName;
	private Integer staffCount;
	public Department(Integer deptId, String hodName, Integer staffCount) {
		this.deptId = deptId;
		this.hodName = hodName;
		this.staffCount = staffCount;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getHodName() {
		return hodName;
	}
	public void setHodName(String hodName) {
		this.hodName = hodName;
	}
	public Integer getStaffCount() {
		return staffCount;
	}
	public void setStaffCount(Integer staffCount) {
		this.staffCount = staffCount;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", hodName=" + hodName + ", staffCount=" + staffCount + "]";
	}
	
	
	
}

class College{  //main class
	private Integer collegeId;
	private String name;
	private Integer year;
	private Department department;  // has a relation
	public Integer getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(Integer collegeId) {
		this.collegeId = collegeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", name=" + name + ", year=" + year + ", department=" + department
				+ "]";
	}
	public static void main(String[] args) {
		College college =new College();
		Department d=new Department(203,"RAM",20);
		//college.collegeId=101;
		college.setCollegeId(101);
		college.setName("SRM");
		college.setYear(2001);
		college.setDepartment(d);
		
		System.out.println(college.getCollegeId()+"  "+college.getName()+"  "+college.getYear()+
				college.getDepartment().getStaffCount());
		
		System.out.println(college);

	}

}
