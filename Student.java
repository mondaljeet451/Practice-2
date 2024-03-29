public class Student {
    private String name;
    private String id;
    private char grade;

        public Student(String name,String id,char grade){
            this.name=name;
            this.id=id;
            this.grade=grade;
        }

        public String getName(){
            return name;
        }
        public String getId(){
            return id;
        }
        public char getGrade(){
            return grade;
        }

        public void updateGrade(char newGrade){
                   this.grade=newGrade;
        }

    public static void main(String[] args) {

            Student S = new Student("ASIS","S1544",'A');

        System.out.println(S.getName());
        System.out.println(S.getId());
//        System.out.println(S.getGrade());

        S.updateGrade('B');{
            System.out.println(S.getGrade());
        }
        }
}
