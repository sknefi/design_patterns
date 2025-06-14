package factory;

public class TestFactory {
	public static void test()
	{
		Shape shape = ShapeFactory.createShape("triangle"); // square/triangle/circle/*
		if (shape != null)
			shape.draw();
		else
			System.out.println("Invalid shape");
	}
}
