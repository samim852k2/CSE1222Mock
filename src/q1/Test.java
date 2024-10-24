package q1;

public class Test {
    public static void main(String[] args) {
        Worker worker =new Worker("siam",500);
        System.out.println(worker);
        Supervisor supervisor = new Supervisor("Rasel",1000,"Dhaka");
        System.out.println(supervisor);
        Director director = new Director("samim",20000,"Rajshahi");
        System.out.println(director);
    }
}
