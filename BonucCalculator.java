public class BonucCalculator {
    public static void main(String[] args) {

//        Employee[] eArray = new Employee[3];
//
//        eArray[0] = new Engineer(10000);
//        eArray[1] = new Manager(10000);
//        eArray[2] = new Salesperson(10000);

//        BonucCalculator b = new BonucCalculator();
//
//        System.out.println(b.allBonus(eArray));

        Engineer e = new Engineer(10000);
        Manager b = new Manager(10000);
        Salesperson c = new Salesperson(10000);

        System.out.println(e.caculateBonus());
        System.out.println(b.caculateBonus());
        System.out.println(c.caculateBonus());
    }

//    public boolean allBonus(Employee[] ep){
//        Object[] extra;
//
//        for (int i = 0; i <= ep.length - 1; i++){
//            ep[i].caculateBonus();
//            for (int j = i; j <= extra.length - 1; j++){
//
//            }
//        }
//        return false;
//    }
}
