package Management ;

import Staff.Employee;

public class Manager extends Employee {
    private String deptName;

    public Manager(String name,String deptName,  String NI, double salary) {
        super(name, NI, salary);
        this.deptName = deptName;
    }

    public String getDeptname(){
        return this.deptName;
    }

}
