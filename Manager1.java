
public class Manager1 extends Employee1 {
    public String name;
    public long id;
    public int salary;
    public String manageteam;


    public Manager1(String name, long id, int salary, String manageteam) {
        super(name, id, salary);
        this.manageteam = manageteam;
    }


    public void teammanage() {
        System.out.println("HE CAN MANAGE THE TEAM EASILY");

    }
}



















