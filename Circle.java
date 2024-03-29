import java.sql.SQLOutput;

public class Circle implements Shape{

    private double R;

  public double R(){
      return R;
  }
    public void setR(double R){
      this.R = R;
    }
//    public Circle(double R){
//        this.R = R;
//    }

    public void calculateArea(){

        System.out.println(Math.PI*R*R);
    }


    public void perimeter(){
        System.out.println(2*Math.PI*R);

    }
}
