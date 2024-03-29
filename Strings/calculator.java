package Strings;

public  class calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        calculator a1 = new calculator();

        System.out.println(a1.add(30, 20));
        System.out.println(a1.subtract(30, 20));

    }


}
