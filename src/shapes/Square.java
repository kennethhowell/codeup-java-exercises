package shapes;

public class Square extends Quadrilateral {

    public Square(double side){
        super(side, side);
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
        this.length = width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public double getPerimeter() {

        return this.length * 4;
    }

    @Override
    public double getArea() {
        return this.length * this.length;
    }
}