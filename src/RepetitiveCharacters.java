import java.util.HashMap;
import java.util.Map;

public class RepetitiveCharacters {
    public static void main(String[] args) {
        String s = "loksainadh";
        findRepetitiveCharacters(s);
    }

    public static void findRepetitiveCharacters(String s) {

        HashMap<Character, Integer> charCountMap = new HashMap<>();


        for (char c : s.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        charCountMap.entrySet().stream().forEach(i->System.out.println(i.getKey()+""+i.getValue()));
        }
    }
