package HashTableChapter;

/**
 * created by Hannah Li on 18/12/16
 * Project name: LeetcodeProject
 * LeetCode NO.: 705
 * Design a HashSet without using any built-in hash table libraries.
 */
public class MyHashSet {

    /**
     * MyHashSet hashSet = new MyHashSet();
     * hashSet.add(1);
     * hashSet.add(2);
     * hashSet.contains(1);    // returns true
     * hashSet.contains(3);    // returns false (not found)
     * hashSet.add(2);
     * hashSet.contains(2);    // returns true
     * hashSet.remove(2);
     * hashSet.contains(2);    // returns false (already removed)
     */
    private int buckets = 1000;
    private int itemPerBucket = 1001;
    private boolean[][] table;


    /** Initialize your data structure here. */
    public MyHashSet() {
        table = new boolean[buckets][];
    }

    public int hash(int key) {
        return key % buckets;
    }

    public int post(int key) {
        return key / buckets;
    }

    /*** add(value): Insert a value into the HashSet. */
    public void add(int key) {
        int hashKey = hash(key);
        if(table[hashKey] == null){
            table[hashKey] = new boolean[itemPerBucket];
        }
        table[hashKey][post(key)] = true;
    }

    /** remove(value): Remove a value in the HashSet. If the value does not exist in the HashSet, do nothing. */
    public void remove(int key) {
        int hashKey = hash(key);
        if(table[hashKey] != null){
            table[hashKey][post(key)] = false;
        }

    }

    /** contains(value) : Return whether the value exists in the HashSet or not. */
    public boolean contains(int key) {
        int hashKey = hash(key);
        return table[hashKey] != null && table[hashKey][post(key)];

    }

}
