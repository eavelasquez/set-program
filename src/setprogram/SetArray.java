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
public class SetArray {
  int[] set; // set array

  /**
   * Initializes an empty set.
   */
  public SetArray() {
    set = new int[0];
  }
}
