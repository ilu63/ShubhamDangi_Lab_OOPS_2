public class Circle implements Ishape{
    int radius;
    String color;
    final double pi = 3.14;
    public Circle(String color, int radius){
        this.color = color;;
        this.radius = radius;
    }
    
    public double CalculateArea(){
        return pi*this.radius*this.radius;
    }
    
    public double CalculatePerimeter(){
        return 2*pi*this.radius;
    }

}
