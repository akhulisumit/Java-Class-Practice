public class arrayList {
    public static void main(String[] args) {
        myList list = new myList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50); 
        System.out.println("Element at index 2: " + list.get(2)); 
        System.out.println("Size of the list: " + list.size());  

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
    }
}

class myList{
    private int[] arr;
    private int size;

    public myList(){
        arr = new int[4];
        size = 0;
    }

    public void add(int x){
        if(size==arr.length){
            resize();
        }

        arr[size]=x;
        size++;
    }


    public int get (int idx){
        if(idx<0 || idx>=size){
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        return arr[idx];
    }

    public void set(int idx, int val){
        if(idx<0 || idx>=size){
            throw new IndexOutOfBoundsException("Index: " + idx + ", Size: " + size);
        }
        arr[idx] = val;
    }

    public int size(){
        return size;
    }

    private void resize(){
        int[] newArr = new int[arr.length*2];
        for(int i = 0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}