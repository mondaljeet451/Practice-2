import java.sql.SQLOutput;

public class Rectangle implements Shape {

    double L;
    double B;

    public Rectangle(double L,double B){
        this.L=L;
        this.B=B;

    }

    public void calculateArea() {
        System.out.println(L * B);
    }


    public void perimeter() {
        System.out.println(2*(L+B));

    }
}


