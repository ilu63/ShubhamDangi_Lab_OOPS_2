public class Triangle implements Ishape{
    int height;
    int base;
    String color;
       
    public Triangle(String color, int height, int base){
        this.color = color;
        this.height = height;
        this.base = base;
    }

    
    public double CalculateArea(){
        return (this.height*this.base)/2;
    }

    
    public double CalculatePerimeter(){
        return ((this.height+this.base)+Math.sqrt(this.height^2+this.base^2));
    }

 
}
