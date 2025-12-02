package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

/**
 * A simple Queue implementation using a static integer array.
 *
 * NOTE:
 * This queue behaves as a FIFO (First-In First-Out) structure.
 * Elements are inserted at the "top" index (end of array)
 * and removed from the beginning (index 0).
 *
 * Important:
 * - This is NOT an efficient queue implementation because dequeue()
 *   requires copying the array every time (O(n) complexity).
 * - A proper queue typically uses head/tail pointers or Circular Buffer logic.
 */
public class QueueApp {

    // The underlying array representing the queue.
    // Its size is fixed to 10.
    static int[] queue = new int[10];

    // 'top' represents the index of the last inserted element.
    // When the queue is empty, top = -1.
    static int top = -1;

    public static void main(String[] args) {
        int num = 0;

        // Insert several numbers into the queue
        enqueue(1);
        enqueue(2);
        enqueue(3);
        enqueue(4);
        enqueue(5);
        enqueue(6);

        // Print current queue contents
        printQueue();

        // Remove and store the element at the front of the queue
        num = dequeue();

        // Show the removed element
        System.out.println("Dequeued: " + num);
        System.out.println();

        // Print queue again after removal
        printQueue();
    }

    /**
     * Adds a new value to the queue.
     *
     * @param val The integer value to insert.
     */
    public static void enqueue(int val) {
        // Check if queue is already at maximum capacity
        if (isFull()) {
            throw new RuntimeException("Queue is full!");
        }

        // Pre-increment top, then store value at that position
        queue[++top] = val;
    }

    /**
     * Removes the first element of the queue (FIFO logic).
     *
     * @return The value that was removed.
     */
    public static int dequeue() {
        int num;

        // Can't dequeue from an empty queue
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }

        // The first value (queue[0]) is ALWAYS the next to be removed
        num = queue[0];

        /**
         * Shift the entire array to the left by one.
         * Arrays.copyOfRange(queue, 1, queue.length + 1)
         * creates a new array where:
         * - elements at index 1..end are shifted to 0..end-1
         * - last position becomes a default 0 because we extend the size
         *
         * NOTE: This is inefficient for a queue!
         * It copies the array every time we dequeue.
         */
        queue = Arrays.copyOfRange(queue, 1, queue.length + 1);

        // Decrement top because the queue now has one fewer element
        top--;

        return num;
    }

    /**
     * Checks if the queue is empty.
     *
     * @return true if top == -1 (no elements present)
     */
    public static boolean isEmpty() {
        return top == -1;
    }

    /**
     * Checks if the queue is full.
     *
     * @return true if top equals the last valid index of the array.
     */
    public static boolean isFull() {
        return top == queue.length - 1;
    }

    /**
     * Prints all elements currently in the queue.
     * Prints from index 0 (front) to index 'top' (rear).
     */
    public static void printQueue() {
        // If no elements exist, report it
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty!");
        }

        // Loop through queue contents
        for (int i = 0; i <= top; i++) {
            System.out.println(queue[i]);
        }
    }
}
