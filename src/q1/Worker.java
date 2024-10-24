package q1;

public class Worker {
    private String name;
    private double wage ;

    public Worker(String name,double wage){
        this.name = name;
        this.wage = wage;

    }
    public void setName(String aName){
        this.name = aName;
    }
    public void setWage(double aWage){
        this.wage = aWage;
    }

    public String getName() {
        return name;
    }

    public double getWage() {
        return wage;
    }
    public String toString(){
        return "  Worker name : " + name + " ,Wage " + wage;
    }
}
