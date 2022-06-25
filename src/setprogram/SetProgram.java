/******************************************************************************
 * Compilation: javac SetProgram.java
 * Execution: java SetProgram
 *
 * Sets with arrays and Linked List.
 *
 * % java SetProgram
 *
 ******************************************************************************/
package setprogram;

import java.util.Scanner;

/**
 * The {@code SetProgram} class represents a Set with Arrays and with Linked
 * List.
 *
 * @author eavelasquez
 */
public class SetProgram {

    /**
     * Unit tests the Set data type.
     *
     * @param args the command-line arguments (none)
     */
    public static void main(String[] args) {
        int choice = 0;
        Scanner in = new Scanner(System.in);
        String[] options = { "\n1. Set with arrays", "\n2. Set with linked list", "\n3. Quit\n" };

        System.out.println("\n*** Set Program ***");
        while (choice != 3) {
            for (String option : options) {
                System.out.print(option);
            }
            System.out.print("Enter your choice: ");
            try {
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        testSetArray();
                        break;
                    case 2:
                        testSetLinkedList();
                        break;
                    case 3:
                        System.out.println("\nGoodbye!");
                        break;
                    default:
                        System.out.println("\nInvalid choice!");
                        break;
                }
            } catch (Exception e) {
                System.out.println("\nInvalid choice. Try again.");
                in.nextLine();
                continue;
            }
        }
        in.close();
    }

    public static void testSetArray() {
        int[] u = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] a = { 1, 3, 5, 7, 9 };
        int[] b = { 2, 4, 6, 8, 10 };

        // Sets with Arrays
        SetArray uSet = new SetArray(u);
        SetArray aSet = new SetArray(a);
        SetArray bSet = new SetArray(b);
        SetArray cSet = new SetArray(1);

        // test toString()
        System.out.println("uSet = " + uSet);
        System.out.println("aSet = " + aSet);
        System.out.println("bSet = " + bSet);
        System.out.println("cSet = " + cSet);

        // test add() and contains() in aSet
        aSet.add(2);
        System.out.println("aSet.add(2) = " + aSet);
        System.out.println("aSet.contains(2) = " + aSet.contains(2));
        System.out.print("aSet.add(3) = ");
        aSet.add(3); // already exists in the set.

        // test remove() and contains() in bSet
        bSet.remove(10);
        System.out.println("bSet.remove(10) = " + bSet);
        System.out.println("bSet.contains(10) = " + bSet.contains(10));
        System.out.print("bSet.remove(11) = ");
        bSet.remove(11); // does not exist in the set.

        // test size() in uSet
        System.out.println("uSet.size() = " + uSet.size());

        // test clear() and isEmpty() in cSet
        System.out.println("cSet.isEmpty() = " + cSet.isEmpty());
        cSet.clear();
        System.out.println("cSet.clear() = " + cSet);
        System.out.println("cSet.isEmpty() = " + cSet.isEmpty());

        // test indexOf() in aSet
        System.out.println("aSet.indexOf(2) = " + aSet.indexOf(2));
        System.out.println("aSet.indexOf(3) = " + aSet.indexOf(3));
    }

    public static void testSetLinkedList() {
        int[] u = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] a = { 1, 3, 5, 7, 9 };
        int[] b = { 2, 4, 6, 8, 10 };

        // Sets with Arrays
        SetLinkedList uSet = new SetLinkedList(u);
        SetLinkedList aSet = new SetLinkedList(a);
        SetLinkedList bSet = new SetLinkedList(b);
        SetLinkedList cSet = new SetLinkedList(1);

        // test toString()
        System.out.println("uSet = " + uSet);
        System.out.println("aSet = " + aSet);
        System.out.println("bSet = " + bSet);
        System.out.println("cSet = " + cSet);

        // test add() and contains() in aSet
        aSet.add(2);
        System.out.println("aSet.add(2) = " + aSet);
        System.out.println("aSet.contains(2) = " + aSet.contains(2));
        System.out.print("aSet.add(3) = ");
        aSet.add(3); // already exists in the set.

        // test remove() and contains() in bSet
        bSet.remove(10);
        System.out.println("bSet.remove(10) = " + bSet);
        System.out.println("bSet.contains(10) = " + bSet.contains(10));
        System.out.print("bSet.remove(11) = ");
        bSet.remove(11); // does not exist in the set.

        // test size() in uSet
        System.out.println("uSet.size() = " + uSet.size());

        // test clear() and isEmpty() in cSet
        System.out.println("cSet.isEmpty() = " + cSet.isEmpty());
        cSet.clear();
        System.out.println("cSet.clear() = " + cSet);
        System.out.println("cSet.isEmpty() = " + cSet.isEmpty());

        // test indexOf() in aSet
        System.out.println("aSet.indexOf(2) = " + aSet.indexOf(2));
        System.out.println("aSet.indexOf(3) = " + aSet.indexOf(3));
    }
}
