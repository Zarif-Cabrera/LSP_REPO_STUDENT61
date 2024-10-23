package org.howard.edu.lsp.assignment5;

public class Driver {
    public static void main(String[] args) {
        // Create and test Set1
        IntegerSet set1 = new IntegerSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("Value of Set1 is: " + set1.toString());
        System.out.println("Smallest value in Set1 is: " + set1.smallest());
        System.out.println("Largest value in Set1 is: " + set1.largest());

        // Create and test Set2
        IntegerSet set2 = new IntegerSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Value of Set2 is: " + set2.toString());

        // Union of Set1 and Set2
        System.out.println("Union of Set1 and Set2");
        set1.union(set2);
        System.out.println("Result of union of Set1 and Set2: " + set1.toString());

        // Reset Set1 for further tests
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        // Intersection of Set1 and Set2
        System.out.println("Intersection of Set1 and Set2:");
        set1.intersect(set2);
        System.out.println("Result of intersection: " + set1.toString());

        // Reset Set1 for difference test
        set1.clear();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set1 before difference: " + set1.toString());
        System.out.println("Set2 before difference: " + set2.toString());
        set1.diff(set2);
        System.out.println("Result of difference (Set1 - Set2): " + set1.toString());

        // Testing add and contains
        set1.clear();
        set1.add(5);
        set1.add(10);
        System.out.println("After adding 5 and 10, Set1: " + set1.toString());
        System.out.println("Does Set1 contain 5? " + set1.contains(5));
        System.out.println("Does Set1 contain 2? " + set1.contains(2));

        // Testing clear method
        set1.clear();
        System.out.println("Set1 after clearing: " + set1.toString());
        System.out.println("Is Set1 empty? " + set1.isEmpty());

        // Testing largest and smallest methods on an empty set
        try {
            set1.largest();
        } catch (IllegalStateException e) {
            System.out.println("Caught exception for largest: " + e.getMessage());
        }
        try {
            set1.smallest();
        } catch (IllegalStateException e) {
            System.out.println("Caught exception for smallest: " + e.getMessage());
        }
    }
}

