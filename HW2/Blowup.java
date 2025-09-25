package OOP.HW2;

import edu.princeton.cs.algs4.StdDraw;

public class Blowup {
    public static String blowup(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isDigit(c)){
                int count = c - '0';
                if(i+1 <  str.length()){
                    char nextChar = str.charAt(i+1);
                    for(int j = 0; j < count; j++){
                        result.append(nextChar);
                    }
                }
            }else{
                result.append(c);
            }
        }
        return result.toString();
    }
}
