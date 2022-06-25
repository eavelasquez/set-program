/******************************************************************************
 * Compilation:  javac SetLinkedList.java
 * Execution:    java SetLinkedList
 *
 * Set Linked List.
 *
 * % java SetLinkedList
 ******************************************************************************/
package setprogram;

/**
 * The {@code SetLinkedList} class represents a set linked list. Set are data
 * structures that store a collection of unique elements in no particular order.
 * The set is implemented as a linked list.
 * 
 * @author eavelasquez
 */
public class SetLinkedList implements Set {
  Node head; // head of list

  /**
   * Initializes an empty set.
   */
  public SetLinkedList() {
    head = null;
  }

  /**
   * Linked List Node. This inner class is made static so that main() can access
   * it.
   */
  static class Node {
    int item; // the item in this node
    Node next; // the next node in the list

    /**
     * Constructs a new node with the specified item and with a null next pointer.
     * 
     * @param item the item to be stored in this node
     */
    Node(int item) {
      this.item = item;
      next = null;
    }

    /**
     * Constructs a new node with the specified item and next pointer.
     * 
     * @param item the item to be stored in this node
     * @param next the next node in the list
     */
    Node(int item, Node next) {
      this.item = item;
      this.next = next;
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
    Node current = head;
    while (current != null) {
      if (current.item == e) {
        return true;
      }
      current = current.next;
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
      head = new Node(e, head);
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
      Node current = head;
      Node previous = null;
      while (current != null) {
        if (current.item == e) {
          if (previous == null) {
            head = current.next;
          } else {
            previous.next = current.next;
          }
        } else {
          previous = current;
        }
        current = current.next;
      }
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
    Node current = head;
    sb.append("{");
    while (current != null) {
      sb.append(current.item);
      current = current.next;
      if (current != null) {
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
    int count = 0;
    Node current = head;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  /**
   * Returns true if this set is empty.
   * 
   * @return true if this set contains no elements
   */
  @Override
  public boolean isEmpty() {
    return head == null;
  }

  /**
   * Removes all of the elements from this set.
   */
  @Override
  public void clear() {
    head = null;
  }
}
