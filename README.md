# Design Patterns Implementation

This project demonstrates the implementation of various design patterns in Java, organized into three main categories: Behavioral, Creational, and Structural patterns. Each pattern is implemented with practical examples and includes detailed documentation.

## Project Structure

```
src/
├── behavioral/     # Patterns that focus on object interaction
├── creational/     # Patterns that focus on object creation
└── structural/     # Patterns that focus on object composition
```

## Categories Overview

### Behavioral Patterns
Behavioral patterns are concerned with algorithms and the assignment of responsibilities between objects. They describe not just patterns of objects or classes but also the patterns of communication between them.

- [Command Pattern](src/behavioral/command/README.md)
- [Observer Pattern](src/behavioral/observer/README.md)
- [Iterator Pattern](src/behavioral/iterator/README.md)
- [Strategy Pattern](src/behavioral/strategy/README.md)

### Creational Patterns
Creational patterns abstract the instantiation process. They help make a system independent of how its objects are created, composed, and represented.

- [Factory Pattern](src/creational/factory/README.md)
- [Builder Pattern](src/creational/builder/README.md)
- [Singleton Pattern](src/creational/singleton/README.md)

### Structural Patterns
Structural patterns are concerned with how classes and objects are composed to form larger structures. They help ensure that when one part of a system changes, the entire structure doesn't need to change.

- [Adapter Pattern](src/structural/adapter/README.md)
- [Facade Pattern](src/structural/facade/README.md)

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Maven (for dependency management)

### Building the Project
```bash
# Clone the repository
git clone [repository-url]

# Navigate to project directory
cd design_patterns_implementation

# Build the project
make build
```

### Running Examples
Each pattern implementation includes example code that can be run using:
```bash
make run
```

## Contributing
Feel free to contribute to this project by:
1. Adding new design pattern implementations
2. Improving existing implementations
3. Adding more examples
4. Enhancing documentation

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments
- Design Patterns: Elements of Reusable Object-Oriented Software (Gang of Four)
- Various online resources and community contributions 