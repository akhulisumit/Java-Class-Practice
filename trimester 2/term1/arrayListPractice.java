public class arrayListPractice {
    public static void main(String[] args) {
        myList list = new myList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50); 
        System.out.println("Element at index 2: " + list.get(2)); 
        System.out.println("Size of the list: " + list.size());  
    }    
}

class myList {
    private int[] arr;
    private int size;

    public myList() {
        arr = new int[4];
        size = 0;
    }

    public void add (int x){
        if(size < arr.length){
            arr[size] = x;
            return;
        }
        int [] newArr = new int[arr.length*2];
        for(int i = 0; i<size; i++){
            newArr[i] = arr[i];
        }
        newArr[size]=x;
        size++;
        this.arr = newArr;
    }

    public int get (int idx){
        return arr[idx];
    }

    public int size(){
        return size;
    }

    public void set(int idx, int val){
        arr[idx]=val;
    }
}
