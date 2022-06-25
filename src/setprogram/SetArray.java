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

  @Override
  public boolean contains(int e) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void add(int e) {
    // TODO Auto-generated method stub

  }

  @Override
  public void remove(int e) {
    // TODO Auto-generated method stub

  }

  @Override
  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean isEmpty() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void clear() {
    // TODO Auto-generated method stub
  }
}
