/******************************************************************************
 * Compilation:  javac SetLinkedList.java
 * Execution:    java SetLinkedList
 *
 * Set Linked List.
 *
 * % java SetLinkedList
 */
package setprogram;

/**
 * The {@code SetLinkedList} class represents a set linked list. Set are data
 * structures that store a collection of unique elements in no particular order.
 * The set is implemented as a linked list.
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
