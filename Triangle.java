public class Triangle implements Shape{

    int a = 40;
    int b = 30;
    int c = 10;
    int s=(a+b+c)/2;

    public Triangle(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public void perimeter(){

        System.out.println(a+b+c);
    }


    @Override
    public void calculateArea() {

        System.out.println(Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}







