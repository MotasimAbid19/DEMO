public class Triangle {
    private double side1, side2, side3;

    public Triangle() {
        side1 = 1;
        side2 = 2;
        side3 = 3;

    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        if (this.side1 + this.side2 < this.side3 || this.side2 + this.side3 < this.side1
                || this.side1 + this.side3 < this.side2)
            throw new IllegalTriangleException("Invalid Sides");

    }

    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3) / 2;
        return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
    }

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle : Side1= " + this.side1 + " Side2 = " + this.side2 + " Side 3 = " + this.side3 + " area : "
                + this.getArea() + " perimeter = " + this.getPerimeter();
    }

}