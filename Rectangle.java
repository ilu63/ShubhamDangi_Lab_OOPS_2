public class Rectangle implements Ishape{
    int length, width;
    String color; 
    Renderer renderer;
    
    public Rectangle(String color, int length, int width){
        this.color = color;
        this.length = length;
        this.width = width;
    }
    
    public double CalculateArea(){
        return this.length*this.width;
    }

    
    public double CalculatePerimeter(){
        return 2*(this.length+this.width);
    }


}
