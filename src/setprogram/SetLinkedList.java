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
   * Initializes a set with one element.
   * 
   * @param element the element to add to the set.
   */
  public SetLinkedList(int e) {
    head = new Node(e);
  }

  /**
   * Initializes a set from an array of ints.
   * 
   * @param nums the array of ints
   */
  public SetLinkedList(int[] nums) {
    head = null;
    for (int i = 0; i < nums.length; i++) {
      add(nums[i]);
    }
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

  /**
   * Returns the index of the specified element in this set.
   * 
   * @param e the element to search for
   * @return the index of the element, or -1 if it is not found
   */
  @Override
  public int indexOf(int e) {
    int index = 0;
    Node current = head;
    while (current != null) {
      if (current.item == e) {
        return index;
      }
      current = current.next;
      index++;
    }
    return -1;
  }

  /**
   * Returns true if this set is equal to the specified set.
   *
   * @param other the set to be compared to this set
   * @return true if this set equals other
   */
  public boolean equals(SetLinkedList other) {
    if (size() != other.size()) {
      return false;
    }
    Node current = head;
    while (current != null) {
      if (!other.contains(current.item)) {
        return false;
      }
      current = current.next;
    }
    return true;
  }

  /**
   * Returns a new set that is the union of this set and the specified set.
   * 
   * @param other the set to be combined with this set
   * @return a new set that is the union of this set and the specified set
   */
  public SetLinkedList union(SetLinkedList other) {
    SetLinkedList union = new SetLinkedList();
    Node current = head;
    while (current != null) {
      if (!union.contains(current.item)) {
        union.add(current.item);
      }
      current = current.next;
    }
    current = other.head;
    while (current != null) {
      if (!union.contains(current.item)) {
        union.add(current.item);
      }
      current = current.next;
    }
    return union;
  }

  /**
   * Returns a new set that is the intersection of this set and the specified set.
   * 
   * @param other the set to be intersected with this set
   * @return a new set that is the intersection of this set and the specified set
   */
  public SetLinkedList intersection(SetLinkedList other) {
    SetLinkedList intersection = new SetLinkedList();
    Node current = head;
    while (current != null) {
      if (other.contains(current.item)) {
        intersection.add(current.item);
      }
      current = current.next;
    }
    return intersection;
  }

  /**
   * Returns a new set that is the difference of this set and the specified set.
   * 
   * @param other the set to be subtracted from this set
   * @return a new set that is the difference of this set and the specified set
   */
  public SetLinkedList difference(SetLinkedList other) {
    SetLinkedList difference = new SetLinkedList();
    Node current = head;
    while (current != null) {
      if (!other.contains(current.item)) {
        difference.add(current.item);
      }
      current = current.next;
    }
    return difference;
  }

  /**
   * Returns a new set that is the symmetric difference of this set and the
   * specified set.
   * 
   * @param other the set to be subtracted from this set
   * @return a new set that is the symmetric difference of this set and the
   *         specified set
   */
  public SetLinkedList symmetricDifference(SetLinkedList other) {
    SetLinkedList symmetricDifference = new SetLinkedList();
    // add all elements from this set that are not in other
    Node current = head;
    while (current != null) {
      if (!other.contains(current.item)) {
        symmetricDifference.add(current.item);
      }
      current = current.next;
    }
    // add all elements from other that are not in this set
    current = other.head;
    while (current != null) {
      if (!contains(current.item)) {
        symmetricDifference.add(current.item);
      }
      current = current.next;
    }
    return symmetricDifference;
  }
}
