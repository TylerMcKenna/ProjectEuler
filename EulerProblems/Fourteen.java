public class Fourteen {
    public static void main(String args[]) {
        int lVal = 1000;
        while(lVal != 1) {
            if (lVal % 2 == 0) {
                lVal /= 2;
            } else {
                lVal = 3 * (lVal) + 1;
            }
            System.out.println(lVal);
        }
    }
}
