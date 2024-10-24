package q1;

public class Supervisor extends Worker {
    private String division;

    public Supervisor(String name,double wage,String division){
       super(name,wage);
        this.division = division;

    }
    public String getDivision(){
        return division;
    }

    public String toString(){
        return " Supervisor Name : " + getName() + " ,Division " + division + " ,wage " + getWage();
    }
}
