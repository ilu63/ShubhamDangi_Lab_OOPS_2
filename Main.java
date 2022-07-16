public class Main {
    public static void main(String args[]){
        
        Circle circle = new Circle("red", 3);
        System.out.println("Area of Circle: " + circle.CalculateArea());
		System.out.println("Perimeter of Circle: " + circle.CalculatePerimeter());
        Ishape.renderer.draw();
		Ishape.renderer.draw("This is a circle.");
        
        Square square = new Square("blue", 5, 5);
        System.out.println("Area of Square: " + square.CalculateArea());
		System.out.println("Perimeter of Square: " + square.CalculatePerimeter());
        Ishape.renderer.draw();
		Ishape.renderer.draw("This is a square.");
        
        Rectangle rectangle = new Rectangle("voilet", 6, 5);
        System.out.println("Area of Rectangle: " + rectangle.CalculateArea());
		System.out.println("Perimeter of Rectangle: " + rectangle.CalculatePerimeter());
        Ishape.renderer.draw();
		Ishape.renderer.draw("This is a rectangle.");
        
        Triangle triangle = new Triangle("Green", 8, 10);
        System.out.println("Area of Triangle: " + triangle.CalculateArea());
		System.out.println("Perimeter of Triangle: " + triangle.CalculatePerimeter());
        Ishape.renderer.draw();
		Ishape.renderer.draw("This is a triangle.");
    }
    
}
