import java.util.ArrayList;

public class Four {
    public static void main(String[] args) {
        System.out.print(checkPalindrome(1001));
    }

    public static boolean checkPalindrome(int number) {
        int reversedNumber = 0;
        // 1234 (%10 4 / 1 = 4) (%100 34 / 10 = 3.4(int) 3 ) (%1000 234 / 100 = 2.34(int) = 2) (% 10000 1234 / 1000 = 1.234(int) = 1)
        int currentModNum = 10;
        int currentDivideNum = 1;
        ArrayList<Integer> numberArray = new ArrayList<Integer>();
        while ((int)(number % currentModNum) != 0) {
            numberArray.add((int)(number % currentModNum / currentDivideNum));
            currentDivideNum = currentModNum;
            currentModNum *= 10;
        }
        for(int i = numberArray.size() - 1; i > 0; i--) {
            reversedNumber += numberArray.get(i) * (Math.pow(10,i));
        }
        System.out.println(reversedNumber + "reverse");
        if (reversedNumber == number) return true;
        else return false;
    }
}
