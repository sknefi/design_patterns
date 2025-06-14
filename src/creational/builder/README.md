# Builder Pattern

The Builder pattern lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

## Overview

The Builder pattern is a creational design pattern that provides a flexible solution to various object creation problems. This implementation demonstrates building a pizza object with different ingredients and properties using a fluent interface.

## Structure

```
[Image: Builder Pattern Class Diagram]
<!-- Add a class diagram showing BuilderPizza class with nested Builder class -->
```

## Implementation Details

### Core Components

1. **BuilderPizza Class** (`BuilderPizza.java`)
   - **Role**: Product
   - **Purpose**: The complex object being constructed
   - **Key Features**:
     - Immutable object with final fields
     - Private constructor that takes Builder as parameter
     - Display method to show pizza configuration
     - Contains nested Builder class

   ```java
   public class BuilderPizza {
       private final String cheeseType;
       private final List<String> extras;
       private final boolean crusty;
       
       private BuilderPizza(Builder builder) {
           this.cheeseType = builder.cheeseType;
           this.crusty = builder.crusty;
           this.extras = builder.extras;
       }
   }
   ```

2. **Builder Class** (Nested Static Class)
   - **Role**: Builder
   - **Purpose**: Constructs the BuilderPizza object step by step
   - **Key Features**:
     - Static nested class for easy access
     - Fluent interface with method chaining
     - Mutable state during construction
     - Build method returns immutable product

   ```java
   public static class Builder {
       private String cheeseType;
       private boolean crusty;
       private List<String> extras = new ArrayList<>();
       
       public Builder addCheeseType(String cheeseType) {
           this.cheeseType = cheeseType;
           return this;
       }
       
       public Builder addExtras(String[] extras) {
           for (String item : extras) {
               this.extras.add(item);
           }
           return this;
       }
       
       public Builder addCrusty(boolean crusty) {
           this.crusty = crusty;
           return this;
       }
       
       public BuilderPizza build() {
           return new BuilderPizza(this);
       }
   }
   ```

### Example Usage

```java
// Create a pizza using the builder pattern
BuilderPizza pizza = new BuilderPizza.Builder()
    .addCheeseType("Mozzarella")
    .addCrusty(true)
    .addExtras(new String[]{"Pepperoni", "Mushrooms", "Olives"})
    .build();

// Display the pizza configuration
pizza.showPizza();
// Output:
// Cheese: Mozzarella
// Crusty: true
// Extras: [Pepperoni, Mushrooms, Olives]

// Create another pizza with different configuration
BuilderPizza simplePizza = new BuilderPizza.Builder()
    .addCheeseType("Cheddar")
    .addCrusty(false)
    .build();

simplePizza.showPizza();
// Output:
// Cheese: Cheddar
// Crusty: false
// Extras: []
```

## Use Cases

This Builder pattern implementation is ideal for:
1. **Complex Object Construction**: Objects with many optional parameters
2. **Configuration Objects**: Settings and configuration builders
3. **Immutable Objects**: Creating immutable objects with many fields
4. **SQL Query Builders**: Building complex database queries
5. **HTTP Request Builders**: Constructing HTTP requests with various parameters

## Benefits

- **Flexible Construction**: Build objects step by step with optional parameters
- **Immutable Products**: Creates immutable objects after construction
- **Fluent Interface**: Method chaining provides readable code
- **Parameter Validation**: Can validate parameters during construction
- **Multiple Representations**: Same builder can create different object variations

## Drawbacks

- **Code Complexity**: Increases the number of classes and code complexity
- **Memory Overhead**: Builder objects consume additional memory
- **Overkill for Simple Objects**: May be unnecessary for objects with few parameters
- **Duplicate Code**: Some duplication between builder and product classes

## Real-World Applications

1. **Configuration Management**
   - Application configuration builders
   - Database connection builders
   - HTTP client configuration

2. **Document Generation**
   - PDF document builders
   - HTML page builders
   - Report generators

3. **Game Development**
   - Character builders with various attributes
   - Level builders with different components
   - Weapon/item builders

4. **Web Development**
   - Form builders
   - API request builders
   - Response builders

## Testing the Implementation

The `TestBuilder.java` file demonstrates:
- Creating pizza objects with different configurations
- Using method chaining for fluent interface
- Building objects with optional parameters
- Showing the flexibility of the builder pattern

## Key Design Decisions

1. **Nested Static Builder**: Builder is a static nested class for easy access
2. **Fluent Interface**: Methods return `this` for method chaining
3. **Immutable Product**: Final fields ensure immutability after construction
4. **Private Constructor**: Product constructor is private, forcing use of builder
5. **List Handling**: Extras are handled as a list for multiple ingredients

## Builder Pattern Variations

1. **Classic Builder** (Current Implementation)
   - Nested static builder class
   - Fluent interface with method chaining

2. **Telescoping Constructor Alternative**
   - Replaces multiple constructor overloads
   - Better readability for many parameters

3. **Step Builder**
   - Enforces construction order
   - Uses interfaces to guide construction steps

## Best Practices

1. **Validation**: Validate parameters in the build() method
2. **Immutability**: Make the product object immutable
3. **Fluent Interface**: Use method chaining for better readability
4. **Required Parameters**: Consider separate methods for required vs optional parameters
5. **Copy Constructor**: Provide a way to create builder from existing object

## Common Pitfalls

1. **Mutable Products**: Creating mutable objects defeats the purpose
2. **Missing Validation**: Not validating required parameters
3. **Complex Builders**: Making builders too complex
4. **Memory Leaks**: Not properly cleaning up builder state
5. **Thread Safety**: Not considering thread safety in builder

## Related Patterns

- **Factory Method**: Builder can use factory methods for component creation
- **Abstract Factory**: Can be combined for creating families of objects
- **Composite**: Often used together for building complex tree structures
- **Prototype**: Alternative approach for object creation
- **Fluent Interface**: Design pattern often used with Builder

## Comparison with Other Creational Patterns

| Pattern | Purpose | When to Use |
|---------|---------|-------------|
| **Builder** | Construct complex objects step by step | Many optional parameters, immutable objects |
| **Factory** | Create objects without specifying exact class | Simple object creation |
| **Abstract Factory** | Create families of related objects | Multiple product families |
| **Prototype** | Create objects by cloning | Expensive object creation |

## Future Improvements

1. **Parameter Validation**: Add validation in build() method
2. **Required Parameters**: Separate required from optional parameters
3. **Copy Constructor**: Add method to create builder from existing pizza
4. **Builder Reset**: Add method to reset builder state
5. **Nested Builders**: Support for building complex nested objects
6. **Conditional Building**: Add conditional logic for parameter combinations
7. **Builder Interface**: Extract builder interface for multiple implementations
8. **Thread Safety**: Make builder thread-safe for concurrent usage

## Advanced Features

1. **Step Builder Pattern**: Enforce construction order using interfaces
2. **Generic Builder**: Create reusable generic builder framework
3. **Annotation-based Builder**: Generate builders using annotations
4. **Builder Inheritance**: Support inheritance in builder hierarchies
5. **Lazy Building**: Defer object creation until actually needed 