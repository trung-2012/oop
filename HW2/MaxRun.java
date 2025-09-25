package OOP.HW2;

public class MaxRun {
    private static Object max1;

    public static int maxRun(String str){
        int dem = 1;
        int maxRun = 0;
        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i)==str.charAt(i+1)){
                dem++;
            }else {
                dem = 1;
            }
            maxRun = Math.max(maxRun, dem);
        }
        return maxRun;
    }
}
