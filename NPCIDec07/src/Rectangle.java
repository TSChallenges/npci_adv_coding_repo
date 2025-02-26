public class Rectangle implements Comparable{

    public static final String shapeName = "RECTANGLE";

    static {
        System.out.println("Hello from Rectangle......");
    }

    private int length;
    private int breadth;

    public static String getShapeName() {
        return shapeName;
    }

    public Rectangle(int length, int breadth){
//        if (length <= 0 || breadth <= 0) {
//            throw new InvalidRectangleException();
//        }
        this.breadth = breadth;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int area(){
        return length * breadth;
    }

    public int perimeter(){
        return 2 * ( length + breadth );
    }

    public void printArea(){
        System.out.println("Name is " + Rectangle.shapeName);
        System.out.println("Area is " + area());
    }

    public  void printDetails(){
        System.out.println("Length = " + length + ", Breadth = " + breadth + " - Area = " + this.area());
    }

    public boolean equals(Rectangle secondObject){
        if (this.length == secondObject.length && this.breadth == secondObject.breadth){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public int compareTo(Object o) {
        Rectangle r = (Rectangle) o;
        return this.area() - r.area();
    }
}
