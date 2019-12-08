public class Square {
    private double length;

    public Square() {
        length = 0;
    }

    public Square(double length) {
        this.length = length;
    }

    //---Methods----//
    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double calcArea() {
        return length * length;
    }

    public double calcPerimeter() {
        return 4 * length;
    }

    @Override
    public String toString() {
        return "square [length=" + length + ']';
    }

}
