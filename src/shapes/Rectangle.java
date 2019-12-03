package shapes;

public class Rectangle {
    protected int length;
    protected int width;

   public Rectangle(int length, int width){
     this.length = length;
     this.width = width;
   }

   public int getArea(){
       int returnArea = this.length * this.width;
        return returnArea;
   };

   public int getPerimeter(){
       int returnPerimeter =  (2 * this.length) + (2 * this.width);
       return returnPerimeter;

   };



}
