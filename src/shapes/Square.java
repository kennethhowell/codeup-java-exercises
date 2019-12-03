package shapes;

public class Square extends Rectangle {

    protected int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }

    ;

    @Override
    public int getArea() {
        int returnArea = 4 * this.side;
        return returnArea;
    }

    @Override
    public int getPerimeter() {
        int returnPerimeter = this.side * this.side;
        return returnPerimeter;

    }

    ;

}