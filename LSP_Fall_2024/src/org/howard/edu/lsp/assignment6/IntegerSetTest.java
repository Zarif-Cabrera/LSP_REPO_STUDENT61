package org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

public class IntegerSetTest {

    private IntegerSet set1;
    private IntegerSet set2;

    @BeforeEach
    public void setUp() {
        // Create and initialize two sets before each test
        set1 = new IntegerSet();
        set2 = new IntegerSet();
    }

    @Test
    @DisplayName("Test case for add method")
    public void testAdd() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Assertions.assertTrue(set1.contains(1), "Set should contain 1");
        Assertions.assertTrue(set1.contains(2), "Set should contain 2");
        Assertions.assertTrue(set1.contains(3), "Set should contain 3");
        set1.add(2); // Adding duplicate element should not change the set
        Assertions.assertEquals(3, set1.length(), "Set should still have 3 elements");
    }

    @Test
    @DisplayName("Test case for remove method")
    public void testRemove() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.remove(2);
        Assertions.assertFalse(set1.contains(2), "Set should not contain 2 after removal");
        Assertions.assertEquals(2, set1.length(), "Set should have 2 elements after removal");
        set1.remove(2); // Removing duplicate element should not change the set
        Assertions.assertEquals(2, set1.length(), "Set should still have 2 elements");
    }

    @Test
    @DisplayName("Test case for clear method")
    public void testClear() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.clear();
        Assertions.assertTrue(set1.isEmpty(), "Set should be empty after clearing");
    }

    @Test
    @DisplayName("Test case for length method")
    public void testLength() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Assertions.assertEquals(3, set1.length(), "Set should have 3 elements");
    }

    @Test
    @DisplayName("Test case for equals method")
    public void testEquals() {
        set1.add(1);
        set1.add(2);
        set2.add(1);
        set2.add(2);
        Assertions.assertTrue(set1.equals(set2), "Sets should be equal");
        Assertions.assertTrue(set1.equals(set1), "Sets should be equal");
        set2.add(3);
        Assertions.assertFalse(set1.equals(set2), "Sets should not be equal after adding 3 to set2");
    }

    @Test
    @DisplayName("Test case for contains method")
    public void testContains() {
        set1.add(1);
        set1.add(2);
        Assertions.assertTrue(set1.contains(1), "Set should contain 1");
        Assertions.assertTrue(set1.contains(2), "Set should contain 2");
        Assertions.assertFalse(set1.contains(3), "Set should not contain 3");
    }

    @Test
    @DisplayName("Test case for largest method")
    public void testLargest() {
        set1.add(1);
        set1.add(5);
        set1.add(3);
        Assertions.assertEquals(5, set1.largest(), "Largest element should be 5");
    }

    @Test
    @DisplayName("Test case for largest method exception")
    public void testLargestException() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            set1.largest();
        }, "Should throw IllegalStateException when the set is empty");
    }

    @Test
    @DisplayName("Test case for smallest method")
    public void testSmallest() {
        set1.add(1);
        set1.add(5);
        set1.add(3);
        Assertions.assertEquals(1, set1.smallest(), "Smallest element should be 1");
    }

    @Test
    @DisplayName("Test case for smallest method exception")
    public void testSmallestException() {
        Assertions.assertThrows(IllegalStateException.class, () -> {
            set1.smallest();
        }, "Should throw IllegalStateException when the set is empty");
    }

    @Test
    @DisplayName("Test case for union method")
    public void testUnion() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set1.union(set2);
        Assertions.assertTrue(set1.contains(1), "Set1 should contain 1 after union");
        Assertions.assertTrue(set1.contains(2), "Set1 should contain 2 after union");
        Assertions.assertTrue(set1.contains(3), "Set1 should contain 3 after union");
        Assertions.assertEquals(3, set1.length(), "Set1 should have 3 elements");
    }

    @Test
    @DisplayName("Test case for intersect method")
    public void testIntersect() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(2);
        set2.add(3);
        set1.intersect(set2);
        Assertions.assertTrue(set1.contains(2), "Set1 should contain 2 after intersection");
        Assertions.assertTrue(set1.contains(3), "Set1 should contain 3 after intersection");
        Assertions.assertFalse(set1.contains(1), "Set1 should not contain 1 after intersection");
        Assertions.assertEquals(2, set1.length(), "Set1 should have 2 elements after intersection");
    }

    @Test
    @DisplayName("Test case for diff method")
    public void testDiff() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set2.add(2);
        set2.add(3);
        set1.diff(set2);
        Assertions.assertTrue(set1.contains(1), "Set1 should contain 1 after difference");
        Assertions.assertFalse(set1.contains(2), "Set1 should not contain 2 after difference");
        Assertions.assertFalse(set1.contains(3), "Set1 should not contain 3 after difference");
        Assertions.assertEquals(1, set1.length(), "Set1 should have 1 element after difference");
    }

    @Test
    @DisplayName("Test case for complement method")
    public void testComplement() {
        set1.add(1);
        set1.add(2);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set1.complement(set2);
        Assertions.assertTrue(set1.contains(3), "Set1 should contain 3 after complement");
        Assertions.assertTrue(set1.contains(4), "Set1 should contain 4 after complement");
        Assertions.assertEquals(2, set1.length(), "Set1 should have 2 elements after complement");
    }

    @Test
    @DisplayName("Test case for isEmpty method")
    public void testIsEmpty() {
        set1.add(1);
        Assertions.assertFalse(set1.isEmpty(), "Set should not be empty after adding an element");
        set1.clear();
        Assertions.assertTrue(set1.isEmpty(), "Set should be empty after clearing");
    }

    @Test
    @DisplayName("Test case for toString method")
    public void testToString() {
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Assertions.assertEquals("[1, 2, 3]", set1.toString(), "toString should return correct string representation");
    }
}
