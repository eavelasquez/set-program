/******************************************************************************
 * Compilation:  javac SetArray.java
 * Execution:    java SetArray
 *
 * Set Array.
 *
 * % java SetArray
 */
package setprogram;

/**
 * The {@code SetArray} class represents a set array. Set are data structures
 * that store a collection of unique elements in no particular order.
 * The set is implemented as a array.
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
   * Initializes a set from an array of ints.
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
   * @param e the element to be checked for containment in this set
   * @return true if this set contains e
   */
  @Override
  public boolean contains(int e) {
    for (int i = 0; i < set.length; i++) {
      if (set[i] == e) {
        return true;
      }
    }
    return false;
  }

  /**
   * Adds an element to this set if it is not already present.
   * @param e the element to be added to this set
   */
  @Override
  public void add(int e) {
    if (!contains(e)) {
      int[] newSet = new int[set.length + 1];
      for (int i = 0; i < set.length; i++) {
        newSet[i] = set[i];
      }
      newSet[set.length] = e;
      set = newSet;
    } else {
      System.out.println("Element " + e + " already exists in the set.");
    }
  }

  /**
   * Removes an element from this set if it is present.
   * @param e the element to be removed from this set, if present
   */
  @Override
  public void remove(int e) {
    if (contains(e)) {
      int[] newSet = new int[set.length - 1];
      int j = 0;
      for (int i = 0; i < set.length; i++) {
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
   * @return a string representation of this set
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("{");
    for (int i = 0; i < set.length; i++) {
      sb.append(set[i]);
      if (i < set.length - 1) {
        sb.append(", ");
      }
    }
    sb.append("}");
    return sb.toString();
  }

  /**
   * Returns the size of this set.
   * @return the number of elements in this set
   */
  @Override
  public int size() {
    return set.length;
  }

  /**
   * Returns true if this set is empty.
   * @return true if this set contains no elements
   */
  @Override
  public boolean isEmpty() {
    return set.length == 0;
  }

  /**
   * Removes all of the elements from this set.
   */
  @Override
  public void clear() {
    set = new int[0];
  }
}
