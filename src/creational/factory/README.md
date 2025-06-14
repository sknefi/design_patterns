# Factory Pattern

The Factory pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

## Overview

The Factory pattern is a creational design pattern that provides a way to create objects without specifying their exact classes. This implementation demonstrates a shape factory that creates different geometric shapes based on string input.

## Structure

```
[Image: Factory Pattern Class Diagram]
<!-- Add a class diagram showing Shape interface, concrete shapes, and ShapeFactory -->
```

## Implementation Details

### Core Components

1. **Shape Interface** (`Shape.java`)
   ```java
   public interface Shape {
       void draw();
   }
   ```
   - Defines the common interface for all products
   - Declares the method that all concrete shapes must implement
   - Enables polymorphic usage of different shape types

2. **ShapeFactory Class** (`ShapeFactory.java`)
   - **Role**: Factory/Creator
   - **Purpose**: Creates shape objects based on input parameters
   - **Key Features**:
     - Static factory method for easy access
     - String-based shape selection
     - Case-insensitive shape name matching
     - Returns null for unknown shape types

   ```java
   public class ShapeFactory {
       public static Shape createShape(String name) {
           if (name.equalsIgnoreCase("circle"))
               return new Circle();
           else if (name.equalsIgnoreCase("square"))
               return new Square();
           else if (name.equalsIgnoreCase("triangle"))
               return new Triangle();
           return null;
       }
   }
   ```

3. **Concrete Shape Classes**

   **Circle Class** (`Circle.java`)
   - **Role**: Concrete Product
   - **Purpose**: Implements circle-specific drawing behavior
   
   ```java
   public class Circle implements Shape {
       public void draw() {
           System.out.println("Drawing circle ");
       }
   }
   ```

   **Square Class** (`Square.java`)
   - **Role**: Concrete Product
   - **Purpose**: Implements square-specific drawing behavior
   
   ```java
   public class Square implements Shape {
       public void draw() {
           System.out.println("Drawing square ");
       }
   }
   ```

   **Triangle Class** (`Triangle.java`)
   - **Role**: Concrete Product
   - **Purpose**: Implements triangle-specific drawing behavior
   
   ```java
   public class Triangle implements Shape {
       public void draw() {
           System.out.println("Drawing triangle ");
       }
   }
   ```

### Example Usage

```java
// Create different shapes using the factory
Shape circle = ShapeFactory.createShape("circle");
Shape square = ShapeFactory.createShape("SQUARE");  // Case insensitive
Shape triangle = ShapeFactory.createShape("Triangle");

// Use the shapes polymorphically
if (circle != null) {
    circle.draw();  // Output: Drawing circle
}

if (square != null) {
    square.draw();  // Output: Drawing square
}

if (triangle != null) {
    triangle.draw();  // Output: Drawing triangle
}

// Handle unknown shape
Shape unknown = ShapeFactory.createShape("hexagon");
if (unknown == null) {
    System.out.println("Unknown shape type");
}
```

## Use Cases

This Factory pattern implementation is ideal for:
1. **Object Creation**: When you need to create objects without specifying exact classes
2. **Plugin Systems**: Loading different implementations based on configuration
3. **Database Drivers**: Creating different database connection objects
4. **File Parsers**: Creating parsers for different file formats
5. **UI Components**: Creating different UI elements based on platform

## Benefits

- **Encapsulation**: Object creation logic is centralized
- **Flexibility**: Easy to add new product types
- **Loose Coupling**: Client code doesn't depend on concrete classes
- **Single Responsibility**: Factory handles object creation concerns
- **Open/Closed Principle**: Easy to extend without modifying existing code

## Drawbacks

- **Complexity**: Adds extra layer of abstraction
- **Class Proliferation**: May lead to many small classes
- **Static Dependencies**: Static factory methods can be hard to test
- **Limited Flexibility**: Simple factory is less flexible than other factory patterns

## Real-World Applications

1. **Graphics Libraries**
   - Creating different shape objects (Circle, Rectangle, Polygon)
   - Rendering different graphic elements

2. **Database Systems**
   - Creating different database connection objects
   - Instantiating different query builders

3. **Document Processing**
   - Creating parsers for different file formats (PDF, DOC, TXT)
   - Generating different document types

4. **Game Development**
   - Creating different enemy types
   - Instantiating different weapon objects
   - Generating different level components

## Testing the Implementation

The `TestFactory.java` file demonstrates:
- Creating different shapes using the factory
- Testing case-insensitive shape creation
- Handling unknown shape types
- Polymorphic usage of created objects

## Key Design Decisions

1. **Static Factory Method**: Easy to use without instantiating factory
2. **String-based Selection**: Simple parameter-based object creation
3. **Case Insensitive**: User-friendly shape name matching
4. **Null Return**: Clear indication of unsupported shape types
5. **Simple Interface**: Minimal product interface for demonstration

## Factory Pattern Variations

1. **Simple Factory** (Current Implementation)
   - Single factory class with static method
   - Good for simple object creation scenarios

2. **Factory Method Pattern**
   - Abstract factory class with concrete factory subclasses
   - Better for complex hierarchies

3. **Abstract Factory Pattern**
   - Factory for creating families of related objects
   - Useful for platform-specific object creation

## Best Practices

1. **Error Handling**: Consider throwing exceptions instead of returning null
2. **Enum Parameters**: Use enums instead of strings for type safety
3. **Factory Interface**: Consider using factory interface for testability
4. **Caching**: Cache frequently created objects for performance
5. **Configuration**: Load factory mappings from configuration files

## Common Pitfalls

1. **Null Returns**: Not handling null returns from factory
2. **String Magic**: Using string literals instead of constants
3. **Tight Coupling**: Factory depending on too many concrete classes
4. **Missing Validation**: Not validating input parameters
5. **Static Overuse**: Overusing static methods making testing difficult

## Related Patterns

- **Abstract Factory**: Creates families of related objects
- **Builder**: Constructs complex objects step by step
- **Prototype**: Creates objects by cloning existing instances
- **Singleton**: Often used with Factory for single factory instance
- **Strategy**: Factory can create different strategy implementations

## Comparison with Other Creational Patterns

| Pattern | Purpose | When to Use |
|---------|---------|-------------|
| **Factory** | Create objects without specifying exact class | Simple object creation scenarios |
| **Abstract Factory** | Create families of related objects | Multiple product families |
| **Builder** | Construct complex objects step by step | Complex object construction |
| **Prototype** | Create objects by cloning | Expensive object creation |

## Future Improvements

1. **Exception Handling**: Replace null returns with meaningful exceptions
2. **Enum-based Selection**: Use enums instead of strings for type safety
3. **Reflection-based Factory**: Use reflection for dynamic class loading
4. **Configuration-driven**: Load shape mappings from external configuration
5. **Factory Registry**: Implement registry pattern for factory management
6. **Parameterized Creation**: Support additional parameters for object creation
7. **Caching Mechanism**: Add caching for frequently created objects
8. **Factory Interface**: Extract factory interface for better testability 