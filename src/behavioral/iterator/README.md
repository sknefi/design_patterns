# Iterator Pattern

The Iterator pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

## Overview

The Iterator pattern is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.). This implementation provides a generic collection with an inner iterator class.

## Structure

```
[Image: Iterator Pattern Class Diagram]
<!-- Add a class diagram showing Iterator interface, Collection class, and CollectionIterator -->
```

## Implementation Details

### Core Components

1. **Iterator Interface** (`Iterator.java`)
   ```java
   public interface Iterator<T> {
       T current();
       void gotoNext();
       void writeCurr();
       boolean hasNext();
   }
   ```
   - Defines the interface for accessing and traversing elements
   - Generic interface that works with any type `T`
   - Provides methods for navigation and element access

2. **Collection Class** (`Collection.java`)
   - **Role**: Aggregate/Container
   - **Purpose**: Holds a collection of items and provides an iterator
   - **Key Features**:
     - Generic class that can hold any type of objects
     - Uses varargs constructor for easy initialization
     - Contains an inner `CollectionIterator` class
     - Provides factory method to create iterators

   ```java
   public class Collection<T> {
       private T[] items;
       
       @SafeVarargs
       public Collection(T... items) {
           this.items = items;
       }
       
       public CollectionIterator iterator() {
           return new CollectionIterator();
       }
   }
   ```

3. **CollectionIterator Class** (Inner Class)
   - **Role**: Concrete Iterator
   - **Purpose**: Implements the iteration logic for the collection
   - **Key Features**:
     - Maintains current position in the collection
     - Implements all iterator interface methods
     - Encapsulates traversal logic
     - Provides safe iteration without exposing internal structure

   ```java
   private class CollectionIterator implements Iterator<T> {
       private int i = 0;
       
       public T current() {
           return items[i];
       }
       
       public void gotoNext() {
           i++;
       }
       
       public boolean hasNext() {
           return i < items.length;
       }
       
       public void writeCurr() {
           System.out.println(items[i]);
       }
   }
   ```

### Example Usage

```java
// Create a collection of strings
Collection<String> stringCollection = new Collection<>("Apple", "Banana", "Cherry");

// Get an iterator
Iterator<String> iterator = stringCollection.iterator();

// Iterate through the collection
while (iterator.hasNext()) {
    iterator.writeCurr();  // Print current element
    iterator.gotoNext();   // Move to next element
}

// Output:
// Apple
// Banana
// Cherry
```

## Use Cases

This Iterator pattern implementation is ideal for:
1. **Collection Traversal**: Safely iterating through any collection
2. **Data Structure Abstraction**: Hiding internal structure details
3. **Multiple Traversals**: Supporting multiple simultaneous iterations
4. **Uniform Interface**: Providing consistent iteration across different collections
5. **Safe Iteration**: Preventing direct access to internal data structures

## Benefits

- **Encapsulation**: Hides the internal structure of the collection
- **Uniform Interface**: Same interface for different collection types
- **Multiple Iterators**: Supports multiple simultaneous iterations
- **Simplified Client Code**: Clients don't need to know collection internals
- **Single Responsibility**: Separates traversal logic from collection logic

## Drawbacks

- **Additional Complexity**: Adds extra classes and interfaces
- **Memory Overhead**: Each iterator maintains its own state
- **Limited Functionality**: Basic iteration might be sufficient for simple cases
- **Performance**: May be slower than direct array access

## Real-World Applications

1. **Java Collections Framework**
   - ArrayList, LinkedList, HashSet iterators
   - Enhanced for-loop implementation

2. **Database Result Sets**
   - JDBC ResultSet iteration
   - Cursor-based database access

3. **File System Traversal**
   - Directory listing
   - File tree navigation

4. **GUI Components**
   - Menu item iteration
   - Widget traversal

## Testing the Implementation

The `TestIterator.java` file demonstrates:
- Creating collections with different data types
- Using iterators to traverse collections
- Safe iteration without exposing internal structure
- Multiple iterator usage scenarios

## Key Design Decisions

1. **Generic Implementation**: Uses Java generics for type safety
2. **Inner Class**: Iterator is implemented as an inner class for encapsulation
3. **Varargs Constructor**: Convenient initialization with multiple elements
4. **Simple Interface**: Clean and minimal iterator interface
5. **Index-based Traversal**: Uses array index for efficient access

## Best Practices

1. **Fail-Fast Iterators**: Consider implementing concurrent modification detection
2. **Remove Support**: Add remove() method for element deletion during iteration
3. **Bidirectional Iteration**: Consider supporting backward iteration
4. **Iterator Validity**: Ensure iterators remain valid during collection changes
5. **Resource Management**: Properly clean up iterator resources

## Common Pitfalls

1. **Concurrent Modification**: Modifying collection while iterating
2. **Iterator Invalidation**: Using iterator after collection modification
3. **Bounds Checking**: Not checking hasNext() before accessing elements
4. **Memory Leaks**: Not properly disposing of iterators
5. **Performance**: Using iterator when direct access would be more efficient

## Related Patterns

- **Composite**: Often used together for tree traversal
- **Factory Method**: Iterator creation can use factory pattern
- **Visitor**: Can be combined for element processing during iteration
- **Command**: Iterator operations can be encapsulated as commands

## Future Improvements

1. Add support for bidirectional iteration (previous/next)
2. Implement fail-fast behavior for concurrent modifications
3. Add remove() method for safe element deletion
4. Support for filtered iteration (skip certain elements)
5. Add support for parallel iteration
6. Implement lazy loading for large collections
7. Add support for nested collection iteration 