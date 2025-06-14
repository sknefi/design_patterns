package factory;

// this DP basicly works like a switch, based on input it selects the output, like in factory
// A class (the factory) that, based on input parameters, decides what object to create
public class ShapeFactory {
	public static Shape createShape(String name)
	{
		if (name.equalsIgnoreCase("circle"))
			return (new Circle());
		else if (name.equalsIgnoreCase("square"))
			return (new Square());
		else if (name.equalsIgnoreCase("triangle"))
			return (new Triangle());
		return (null);
	}
}
