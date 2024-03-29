public class Engineer1 extends Employee1{
        public String name;
        public long id;
        public int salary;
        public  String performance;


    public Engineer1(String name,long id,int salary,String performance){
           super(name,id,salary);
           this.performance=performance;

    }
    public void softwaredevewloper(){

        System.out.println("name,id,salary,performance");
    }



    }
