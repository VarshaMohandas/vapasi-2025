class Emp {

    private int eid;
    private float salary;
    private String eName;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        if(eid > 100){
            this.eid = eid;
        }

    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }



    void display(){
        System.out.println("Employee name : "+this.eName);
        System.out.println("Salary : "+ this.salary);
        System.out.println(("Employee Id : "+this.eid));


    }

    @Override
    public String toString(){
        return "Emp{eId : "+eid+", eName : "+eName + ", salary : "+salary +"}";
    }
}
