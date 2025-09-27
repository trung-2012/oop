package OOP.HW2;

import java.util.HashSet;

public class Intersect {
    public static boolean stringIntersect(String a, String b, int len) {
        if(a==null||b==null||len < 0) return false;
        if(a.length() < len || b.length() < len) return false;

        HashSet<String> substrings = new HashSet<>();

        for(int i = 0; i <= a.length()-len; i++) {
            substrings.add(a.substring(i, i+len));
        }
        for(int i = 0; i <= b.length()-len; i++) {
            if(substrings.contains(b.substring(i, i+len))){
                return true;
            }
        }return false;

    }

}
