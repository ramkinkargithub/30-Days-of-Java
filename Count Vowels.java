import java.util.HashMap;
import java.util.Map;

class Main {
    public static void main(String[] args) {
        // Example test cases
        System.out.println(calculateVowels("hello world")); // {e: 1, o: 2}
        System.out.println(calculateVowels("rhythm")); // {a: 0, e: 0, i: 0, o: 0, u: 0}
    }

    public static Map<Character, Integer> calculateVowels(String input) {
        Map<Character,Integer>m = new HashMap<>();
        for(int i=0;i<input.length();i++){
            char c = Character.toLowerCase(input.charAt(i));
            if(isVowel(c)){
                if(m.get(c)==null)
                    m.put(c,1);
                else
                    m.put(c,m.get(c)+1);
            }
        }
        if(m.size()==0){
            m.put('a',0);
            m.put('e',0);
            m.put('i',0);
            m.put('o',0);
            m.put('u',0);
        }
        return m;
    }
    public static Boolean isVowel(Character c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            return true;
            return false;
    }
}
