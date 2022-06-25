# Set Program

This program represents the form of sets in arrays and linked list, it allows adding and removing elements, among other relations and properties of sets.

## Classes and Methods

- The SetArray class is a class that represents a set in an array.

- The SetLinkedList class is a class that represents a set in a linked list.

Each class has the following methods:

**Basics methods:**

- `contains(element)`: returns true if the element is in the set, false otherwise.
- `add(element)`: adds an element to the set.
- `remove(element)`: removes an element from the set.
- `toString()`: returns a string representation of the set.
- `size()`: returns the size of the set.
- `isEmpty()`: returns true if the set is empty, false otherwise.
- `clear()`: removes all elements from the set.
- `indexOf(element)`: returns the index of the element in the set, or -1 if the element is not in the set.

**Algebraic operations:**

- `equals(set)`: returns true if the set is equal to the parameter set, false otherwise.
- `union(set)`: returns the union of the set and the parameter set.
- `intersection(set)`: returns the intersection of the set and the parameter set.
- `complement(set)`: returns the complement of this set relative to the parameter set.
- `difference(set)`: returns the difference of the set and the parameter set.
- `symmetricDifference(set)`: returns the symmetric difference of the set and the parameter set.
- `subsetOf(set)`: returns true if the set is a subset of the parameter set, false otherwise.
- `properSubsetOf(set)`: returns true if the set is a proper subset of the parameter set, false otherwise.
- `supersetOf(set)`: returns true if the set is a superset of the parameter set, false otherwise.
- `properSupersetOf(set)`: returns true if the set is a proper superset of the parameter set, false otherwise.
