package factory;

public class ShapeFactory {
	public static void drawShape(String name)
	{
		Square		square = new Square();
		Circle		circle = new Circle();
		Triangle	triangle = new Triangle();

		if (name == "circle")
			circle.draw();
		else if (name == "square")
			square.draw();
		else if (name == "triangle")
			triangle.draw();
		else
			System.out.println("Invalid shape");
	}
}
