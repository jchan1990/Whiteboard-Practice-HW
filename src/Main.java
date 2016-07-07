/**
 * Created by Qube on 7/7/16.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(doubleChar("Hi There"));
        System.out.println();
        System.out.println(cigarParty(30, false));
        System.out.println(cigarParty(50, true));
        System.out.println(cigarParty(70, true));
        System.out.println();
        
    }

    public static String doubleChar(String str) {
        String charDouble = "";
        for (int i = 0; i < str.length(); i++) {
            charDouble += String.valueOf(str.charAt(i));
            charDouble += String.valueOf(str.charAt(i));
        }
        return charDouble;
    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {

        if (isWeekend && cigars >= 40) {
            return true;
        }
        else if (cigars >= 40 && cigars <= 60) {
            return true;
        }
        return false;
    }

    public static int[] rotateLeft3(int[] nums) {
        int[] rotateNums = {nums[1], nums[2], nums[0]};
        return rotateNums;
    }
}
