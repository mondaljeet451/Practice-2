public class Areaoftheshape {

    public static void main(String[] args) {

        Circle C = new Circle();
        C.setR(5);
        Rectangle R = new Rectangle(20,40);
        Triangle T = new Triangle(20,40,40);

        C.calculateArea();
        C.perimeter();
        R.calculateArea();
        R.perimeter();
        T.calculateArea();
        T.perimeter();

    }
}
