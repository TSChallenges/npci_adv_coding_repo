public class Rectangle implements Shape, Diagram{
   private double length;
   private double breadth;

    public double getArea(){
      return this.length * this.breadth;
    }


    public String getColor(){
       return "Red";
    }
    public void setColor(String color){
    }
}