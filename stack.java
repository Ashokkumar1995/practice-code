import java.util.*;

public class stack {

    public static void main(String[] args) {

        // Stack<String> st = new Stack<String>();
        // st.push("Ashok");
        // st.push("kumar");

        // System.out.println(st.peek());

        String str = "aababcdeef";
        HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (mp.containsKey(c) == false) {
                mp.put(c, 1);
            } else {
                int freq = mp.get(c);

                mp.put(c, freq + 1);
            }
        }

        System.out.println(mp);
        boolean found = false;
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (mp.get(c) == 1) {
                System.out.println("Found  " + c);
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("No single char found");
        }
    }

}
