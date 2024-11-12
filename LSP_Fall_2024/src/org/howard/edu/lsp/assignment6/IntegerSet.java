package org.howard.edu.lsp.assignment6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class represents a set of integers using an ArrayList.
 * It provides methods to perform common set operations like
 * addition, removal, union, intersection, difference, and more.
 */
public class IntegerSet {
    // Store the set elements in an ArrayList.
    private List<Integer> set = new ArrayList<>();

    /**
     * Default constructor that initializes an empty IntegerSet.
     */
    public IntegerSet() {
    }

    /**
     * Constructor that initializes the IntegerSet with a provided list of integers.
     *
     * @param set an ArrayList of integers to initialize the set.
     */
    public IntegerSet(ArrayList<Integer> set) {
        this.set = set;
    }

    /**
     * Clears the internal representation of the set, removing all elements.
     */
    public void clear() {
        set.clear();
    }

    /**
     * Returns the number of elements in the set.
     *
     * @return the length of the set.
     */
    public int length() {
        return set.size();
    }

    /**
     * Compares this IntegerSet to another object for equality.
     *
     * @param o, the object to compare with this IntegerSet.
     * @return true if the two sets contain the same elements, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true; 
        }
        if (!(o instanceof IntegerSet)) {
            return false;
        }
        
        IntegerSet other = (IntegerSet) o;
        return this.set.containsAll(other.set) && other.set.containsAll(this.set);
    }

    /**
     * Checks if the set contains a specific value.
     *
     * @param value, the integer value to check for.
     * @return true if the value is in the set, false otherwise.
     */
    public boolean contains(int value) {
        return set.contains(value);
    }

    /**
     * Returns the largest item in the set.
     *
     * @return the largest integer in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int largest() {
        if (set.isEmpty()) {
            throw new IllegalStateException("Set is empty");
        }
        return Collections.max(set);
    }

    /**
     * Returns the smallest item in the set.
     *
     * @return the smallest integer in the set.
     * @throws IllegalStateException if the set is empty.
     */
    public int smallest() {
        if (this.isEmpty()) {
            throw new IllegalStateException("Set is empty");
        }
        return Collections.min(set);
    }

    /**
     * Adds an item to the set if it is not already present.
     *
     * @param item, the integer to add to the set.
     */
    public void add(int item) {
        if (!contains(item)) {
            set.add(item);
        }
    }

    /**
     * Removes an item from the set if it is present.
     *
     * @param item, the integer to remove from the set.
     */
    public void remove(int item) {
        set.remove(Integer.valueOf(item));
    }

    /**
     * Computes the union of this set and another set.
     *
     * @param intSetb, the other IntegerSet to union with.
     */
    public void union(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            add(item);
        }
    }

    /**
     * Computes the intersection of this set and another set.
     *
     * @param intSetb, the other IntegerSet to intersect with.
     */
    public void intersect(IntegerSet intSetb) {
        List<Integer> intersection = new ArrayList<>();
        for (int item : set) {
            if (intSetb.contains(item)) {
                intersection.add(item);
            }
        }
        set = intersection;
    }

    /**
     * Computes the difference between this set and another set (this - other).
     *
     * @param intSetb, the other IntegerSet to subtract from this set.
     */
    public void diff(IntegerSet intSetb) {
        for (int item : intSetb.set) {
            remove(item);
        }
    }

    /**
     * Computes the complement of this set with respect to another set,
     * containing all integers that are in the universal set (represented by 
     * intSetb) but not in this set (the current set).
     * 
     * @param intSetb the other IntegerSet (universal set) to compute the complement against.
     */
    public void complement(IntegerSet intSetb) {
        List<Integer> complementSet = new ArrayList<>();

        for (Integer element : intSetb.set) {
            if (!contains(element)) {
                complementSet.add(element);
            }
        }

        set = complementSet;
    }
    
    /**
     * Checks if the set is empty.
     *
     * @return true if the set is empty, false otherwise.
     */
    public boolean isEmpty() {
        return set.isEmpty();
    }

    /**
     * Returns a string representation of the set.
     *
     * @return a string containing the elements of the set.
     */
    @Override
    public String toString() {
        return set.toString();
    }
}
