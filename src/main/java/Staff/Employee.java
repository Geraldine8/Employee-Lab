package Staff;

public abstract class Employee {
    private String name;
    private String NI;;
    protected double salary;

    public Employee(String name, String NI, double salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public String getNI(){
        return this.NI;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double raiseValue){
       if(raiseValue > 0){
           this.salary += raiseValue;
       }
    }

    public double payBonus(){
        return (this.salary * 0.01);
    }

//    public void changeName(String name){
//        if(name != null) {
//            this.name = name;
//        }
//    }


    public void changeName(String name) {
        if (name != null && !name.equals("")){
            this.name = name;
        }
    }
}
