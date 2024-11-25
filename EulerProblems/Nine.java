public class Nine {
    public static void main(String[] args) {
        int n = 500; // Find best number

        for (int b = 1; b < n; b++) {
            for (int a = 1; a < b; a++) {
                if (a + b + Math.sqrt((a*a) + (b*b)) == 1000) {
                    System.out.println("a: " + a + "  b: " + b + "  c: " + Math.sqrt((a*a) + (b*b)));
                    System.out.println(a * b * Math.sqrt((a*a) + (b*b)));
                }
            }
        }
    }
}