import java.util.ArrayList;

public class test35 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1); 
        list.add(4);
        list.add(2); 

        removeRepeatingElements(list);

        System.out.println("Modified list: " + list);
    }

    public static void removeRepeatingElements(ArrayList<Integer> list) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for(int j = 0; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
            }

            if(count == 1) {
            ans.add(list.get(i));
            }
        }

        list.clear();
        list.addAll(ans);
    }
}
