# Strategy Pattern

The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

## Overview

The Strategy pattern is a behavioral design pattern that enables selecting algorithms at runtime. This implementation demonstrates a payment processing system where different payment methods (PayPal, Credit Card) can be chosen dynamically.

## Structure

```
[Image: Strategy Pattern Class Diagram]
<!-- Add a class diagram showing PaymentStrategy interface, concrete strategies, and Payment context -->
```

## Implementation Details

### Core Components

1. **PaymentStrategy Interface** (`PaymentStrategy.java`)
   ```java
   public interface PaymentStrategy {
       void pay(int amount);
   }
   ```
   - Defines the common interface for all concrete strategies
   - Declares the algorithm interface that all strategies must implement
   - Enables interchangeable algorithm implementations

2. **Payment Class** (`Payment.java`)
   - **Role**: Context
   - **Purpose**: Maintains a reference to a strategy object and delegates work to it
   - **Key Features**:
     - Holds a reference to the current payment strategy
     - Provides method to change strategy at runtime
     - Delegates payment processing to the selected strategy
     - Includes validation for null strategy

   ```java
   public class Payment {
       private PaymentStrategy strategy;
       
       public void setStrategy(PaymentStrategy strategy) {
           this.strategy = strategy;
       }
       
       public void pay(int amount) {
           if (this.strategy == null) {
               System.out.println("No strategy specified for this payment!");
               return;
           }
           this.strategy.pay(amount);
       }
   }
   ```

3. **Concrete Strategies**

   **Paypal Class** (`Paypal.java`)
   - **Role**: Concrete Strategy
   - **Purpose**: Implements PayPal payment processing
   - **Implementation**: Simple console output showing PayPal payment

   ```java
   public class Paypal implements PaymentStrategy {
       public void pay(int amount) {
           System.out.println("Paypal: " + amount);
       }
   }
   ```

   **CreditCard Class** (`CreditCard.java`)
   - **Role**: Concrete Strategy
   - **Purpose**: Implements credit card payment processing
   - **Implementation**: Simple console output showing credit card payment

   ```java
   public class CreditCard implements PaymentStrategy {
       public void pay(int amount) {
           System.out.println("Credit card: " + amount);
       }
   }
   ```

### Example Usage

```java
// Create payment context
Payment payment = new Payment();

// Use PayPal strategy
payment.setStrategy(new Paypal());
payment.pay(100);  // Output: Paypal: 100

// Switch to Credit Card strategy
payment.setStrategy(new CreditCard());
payment.pay(200);  // Output: Credit card: 200

// Try payment without strategy
payment.setStrategy(null);
payment.pay(50);   // Output: No strategy specified for this payment!
```

## Use Cases

This Strategy pattern implementation is ideal for:
1. **Payment Processing**: Different payment methods (PayPal, Credit Card, Bank Transfer)
2. **Sorting Algorithms**: Different sorting strategies (QuickSort, MergeSort, BubbleSort)
3. **Compression**: Different compression algorithms (ZIP, RAR, 7Z)
4. **Routing**: Different route calculation strategies (fastest, shortest, scenic)
5. **Pricing**: Different pricing strategies (regular, discount, premium)

## Benefits

- **Runtime Algorithm Selection**: Choose algorithms dynamically
- **Open/Closed Principle**: Easy to add new strategies without modifying existing code
- **Eliminates Conditional Statements**: Replaces large if-else or switch statements
- **Code Reusability**: Strategies can be reused across different contexts
- **Testability**: Each strategy can be tested independently

## Drawbacks

- **Increased Number of Classes**: Each strategy requires a separate class
- **Client Awareness**: Clients must be aware of different strategies
- **Communication Overhead**: Context and strategy must share data
- **Strategy Selection Logic**: Need logic to choose appropriate strategy

## Real-World Applications

1. **E-commerce Platforms**
   - Payment processing (PayPal, Stripe, Square)
   - Shipping methods (Standard, Express, Overnight)
   - Discount calculations (Percentage, Fixed amount, BOGO)

2. **Gaming Systems**
   - AI behavior strategies (Aggressive, Defensive, Balanced)
   - Difficulty levels (Easy, Medium, Hard)
   - Character movement patterns

3. **Data Processing**
   - File format handlers (CSV, JSON, XML)
   - Validation strategies (Email, Phone, Credit Card)
   - Encryption algorithms (AES, RSA, DES)

4. **Navigation Systems**
   - Route calculation (Fastest, Shortest, Avoid tolls)
   - Transportation modes (Car, Walking, Public transport)

## Testing the Implementation

The `TestStrategy.java` file demonstrates:
- Creating payment context
- Setting different payment strategies
- Executing payments with different strategies
- Handling null strategy scenarios

## Key Design Decisions

1. **Simple Interface**: Single method interface for easy implementation
2. **Null Checking**: Validation to handle missing strategy
3. **Runtime Strategy Change**: Ability to change strategy dynamically
4. **Minimal Implementation**: Focus on pattern demonstration rather than complex logic
5. **Clear Naming**: Descriptive class and method names

## Best Practices

1. **Strategy Factory**: Consider using a factory to create strategies
2. **Default Strategy**: Provide a default strategy to avoid null checks
3. **Strategy Validation**: Validate strategy parameters before execution
4. **Strategy Caching**: Cache frequently used strategies for performance
5. **Strategy Configuration**: Allow strategy configuration through external sources

## Common Pitfalls

1. **Too Many Strategies**: Creating strategies for trivial variations
2. **Tight Coupling**: Strategies depending on specific context implementations
3. **Strategy Explosion**: Creating too many similar strategies
4. **Missing Validation**: Not validating strategy state before execution
5. **Performance Overhead**: Creating new strategy instances unnecessarily

## Related Patterns

- **Factory Method**: Can be used to create appropriate strategies
- **State**: Similar structure but different intent (behavior vs. state)
- **Template Method**: Can be combined with Strategy for algorithm frameworks
- **Command**: Both encapsulate behavior, but Command focuses on requests
- **Bridge**: Similar structure but Bridge focuses on abstraction

## Comparison with Similar Patterns

| Pattern | Purpose | When to Use |
|---------|---------|-------------|
| **Strategy** | Algorithm selection | Multiple ways to perform a task |
| **State** | State-dependent behavior | Object behavior changes with state |
| **Command** | Encapsulate requests | Parameterize objects with operations |
| **Template Method** | Algorithm skeleton | Common algorithm structure with variations |

## Future Improvements

1. **Strategy Factory**: Add factory for strategy creation and management
2. **Strategy Registry**: Implement registry for strategy lookup by name
3. **Composite Strategies**: Support combining multiple strategies
4. **Strategy Validation**: Add validation for strategy parameters
5. **Asynchronous Strategies**: Support for async strategy execution
6. **Strategy Metrics**: Add performance monitoring for strategies
7. **Configuration-based Selection**: Load strategy selection from configuration files
8. **Strategy Chaining**: Support for executing multiple strategies in sequence 