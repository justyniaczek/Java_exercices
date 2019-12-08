public class Main {
    public static void main(String[] args) {
        Square square1 = new Square();
        Square square2 = new Square(15);


        System.out.println(square1.getLength());
        square1.setLength(10);
        System.out.println(square1.getLength());
        System.out.println("Area of square " + square1.calcArea());
        System.out.println("Perimeter of square " + square1.calcPerimeter());

        System.out.println("");
        System.out.println(square2.getLength());
        square2.setLength(22);
        System.out.println(square2.getLength());
        System.out.println("Area of square " + square2.calcArea());
        System.out.println("Perimeter of square " + square2.calcPerimeter());

    }
}
