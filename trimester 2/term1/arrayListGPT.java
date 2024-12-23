public class arrayListGPT {
    public static void main(String[] args) {
        myList list = new myList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50); // This will test the dynamic resizing
        System.out.println("Element at index 2: " + list.get(2)); // Output: 30
        System.out.println("Size of the list: " + list.size());  // Output: 5

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}

class myList {
    private int[] arr;
    private int size;

    // Constructor
    public myList() {
        arr = new int[4]; // Initial capacity of 4
        size = 0;
    }

    // Add an element to the list
    public void add(int x) {
        if (size == arr.length) { // Check if resizing is needed
            resize();
        }
        arr[size] = x;
        size++;
    }

    // Get an element at a specific index
    public int get(int idx) {
        if (idx < 0 || idx >= size) {
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        return arr[idx];
    }

    // Return the current size of the list
    public int size() {
        return size;
    }

    // Internal method to resize the array when needed
    private void resize() {
        int[] newArr = new int[arr.length * 2]; // Double the capacity
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
