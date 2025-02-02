import java.util.*;
public class test {
    public int solve(String A, String B) {

        if(A.length() != B.length()){
            return 0;
        }

        Map<Character, Character> MapAtoB = new HashMap<>();
        Map<Character, Character> MapBtoA = new HashMap<>();

        for(int i = 0; i<A.length(); i++){
            char charA = A.charAt(i);
            char charB = B.charAt(i);

            if(MapAtoB.containsKey(charA)){
                if(MapAtoB.get(charA)!=charB){
                    return 0;
                }
                else{
                    MapAtoB.put(charA, charB);
                }
            }

            if(MapBtoA.containsKey(charB)){
                if(MapBtoA.get(charB)!=charA){
                    return 0;
                }
                else{
                    MapBtoA.put(charB, charA);
                }
            }
        }

        return 1;
    }
}
