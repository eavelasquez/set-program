/******************************************************************************
 * Compilation:  javac SetArray.java
 * Execution:    java SetArray
 *
 * Set Array.
 *
 * % java SetArray
 ******************************************************************************/
package setprogram;

/**
 * The {@code SetArray} class represents a set array. Set are data structures
 * that store a collection of unique elements in no particular order.
 * The set is implemented as a array.
 * 
 * @author eavelasquez
 */
public class SetArray implements Set {
  int[] set; // set array

  /**
   * Initializes an empty set.
   */
  public SetArray() {
    set = new int[0];
  }

  /**
   * Initializes a set with one element.
   * 
   * @param element the element to add to the set.
   */
  public SetArray(int e) {
    set = new int[1];
    set[0] = e;
  }

  /**
   * Initializes a set from an array of ints.
   * 
   * @param nums the array of ints
   */
  public SetArray(int[] nums) {
    set = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      set[i] = nums[i];
    }
  }

  /**
   * Returns true if this set contains the specified element.
   * 
   * @param e the element to be checked for containment in this set
   * @return true if this set contains e
   */
  @Override
  public boolean contains(int e) {
    for (int i = 0; i < size(); i++) {
      if (set[i] == e) {
        return true;
      }
    }
    return false;
  }

  /**
   * Adds an element to this set if it is not already present.
   * 
   * @param e the element to be added to this set
   */
  @Override
  public void add(int e) {
    if (!contains(e)) {
      int[] newSet = new int[size() + 1];
      for (int i = 0; i < size(); i++) {
        newSet[i] = set[i];
      }
      newSet[size()] = e;
      set = newSet;
    } else {
      System.out.println("Element " + e + " already exists in the set.");
    }
  }

  /**
   * Removes an element from this set if it is present.
   * 
   * @param e the element to be removed from this set, if present
   */
  @Override
  public void remove(int e) {
    if (contains(e)) {
      int[] newSet = new int[size() - 1];
      int j = 0;
      for (int i = 0; i < size(); i++) {
        if (set[i] != e) {
          newSet[j] = set[i];
          j++;
        }
      }
      set = newSet;
    } else {
      System.out.println("Element " + e + " does not exist in the set.");
    }
  }

  /**
   * Returns a string representation of this set.
   * 
   * @return a string representation of this set
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    for (int i = 0; i < size(); i++) {
      sb.append(set[i]);
      if (i < size() - 1) {
        sb.append(", ");
      }
    }
    sb.append("}");
    return sb.toString();
  }

  /**
   * Returns the size of this set.
   * 
   * @return the number of elements in this set
   */
  @Override
  public int size() {
    return set.length;
  }

  /**
   * Returns true if this set is empty.
   * 
   * @return true if this set contains no elements
   */
  @Override
  public boolean isEmpty() {
    return size() == 0;
  }

  /**
   * Removes all of the elements from this set.
   */
  @Override
  public void clear() {
    set = new int[0];
  }

  /**
   * Returns the index of the specified element in this set.
   * 
   * @param e the element to search for
   * @return the index of the element in this set, or -1 if it is not found
   */
  @Override
  public int indexOf(int e) {
    for (int i = 0; i < size(); i++) {
      if (set[i] == e) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Returns true if this set is equal to the specified set.
   * 
   * @param other the other set
   * @return true if this set is equal to the specified set
   */
  public boolean equals(SetArray other) {
    if (other.size() != size()) {
      return false;
    }
    for (int i = 0; i < size(); i++) {
      if (!other.contains(set[i])) {
        return false;
      }
    }
    return true;
  }

  /**
   * Returns a new set that is the union of this set and the specified set.
   * 
   * @param other the other set
   * @return a new set that is the union of this set and the specified set
   */
  public SetArray union(SetArray other) {
    SetArray newSet = new SetArray();
    for (int i = 0; i < size(); i++) {
      if (!newSet.contains(set[i])) {
        newSet.add(set[i]);
      }
    }
    for (int i = 0; i < other.size(); i++) {
      if (!newSet.contains(other.set[i])) {
        newSet.add(other.set[i]);
      }
    }
    return newSet;
  }

  /**
   * Returns a new set that is the intersection of this set and the specified set.
   * 
   * @param other the other set
   * @return a new set that is the intersection of this set and the specified set
   */
  public SetArray intersection(SetArray other) {
    SetArray newSet = new SetArray();
    for (int i = 0; i < size(); i++) {
      if (other.contains(set[i])) {
        newSet.add(set[i]);
      }
    }
    return newSet;
  }

  /**
   * Returns a new set that is the complement of this set and the specified set.
   * 
   * @param other the other set
   * @return a new set that is the complement of this set and the specified set
   */
  public SetArray complement(SetArray other) {
    SetArray newSet = new SetArray();
    // add the elements that are not in this set
    for (int i = 0; i < other.size(); i++) {
      if (!contains(other.set[i])) {
        newSet.add(other.set[i]);
      }
    }
    return newSet;
  }

  /**
   * Returns a new set that is the difference of this set and the specified set.
   * 
   * @param other the other set
   * @return a new set that is the difference of this set and the specified set
   */
  public SetArray difference(SetArray other) {
    SetArray newSet = new SetArray();
    for (int i = 0; i < size(); i++) {
      if (!other.contains(set[i])) {
        newSet.add(set[i]);
      }
    }
    return newSet;
  }

  /**
   * Returns a new set that is the symmetric difference of this set and the
   * specified set.
   * 
   * @param other the other set
   * @return a new set that is the symmetric difference of this set and the
   *         specified set
   */
  public SetArray symmetricDifference(SetArray other) {
    SetArray newSet = new SetArray();
    for (int i = 0; i < size(); i++) {
      if (!other.contains(set[i])) {
        newSet.add(set[i]);
      }
    }
    for (int i = 0; i < other.size(); i++) {
      if (!contains(other.set[i])) {
        newSet.add(other.set[i]);
      }
    }
    return newSet;
  }

  /**
   * Returns true if this set is a subset of the specified set.
   * 
   * @param other the other set
   * @return true if this set is a subset of the specified set
   */
  public boolean subsetOf(SetArray other) {
    for (int i = 0; i < size(); i++) {
      if (!other.contains(set[i])) {
        return false;
      }
    }
    return true;
  }

  /**
   * Returns true if this set is a proper subset of the specified set.
   *
   * @param other the other set
   * @return true if this set is a proper subset of the specified set
   */
  public boolean properSubsetOf(SetArray other) {
    if (size() >= other.size()) {
      return false;
    }
    return subsetOf(other);
  }

  /**
   * Returns true if this set is a superset of the specified set.
   *
   * @param other the other set
   * @return true if this set is a superset of the specified set
   */
  public boolean supersetOf(SetArray other) {
    return other.subsetOf(this);
  }

  /**
   * Returns true if this set is a proper superset of the specified set.
   *
   * @param other the other set
   * @return true if this set is a proper superset of the specified set
   */
  public boolean properSupersetOf(SetArray other) {
    return other.properSubsetOf(this);
  }
}
