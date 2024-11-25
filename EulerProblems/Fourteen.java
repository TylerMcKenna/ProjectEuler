import java.util.HashMap;

public class Fourteen {
    public static void main(String args[]) {
        int n = 1000000;
        HashMap<Integer, Integer> solutionSet = new HashMap<>();
        for(int i = 2; i < n; i++) {
            int curr = i;
            int counter = 1;
            while (curr != 1) {
                if (solutionSet.get(curr) != null) {
                    counter += solutionSet.get(curr) - 1;
                    break;
                }
                if (curr % 2 == 0) curr /= 2;
                else curr = 3*(curr) + 1;
                counter++;
            }
            solutionSet.put(i, counter);
        }

        int maxIndex = 2;
        for(int i = 2; i < solutionSet.size(); i++) {
            System.out.println("heehee");
            if(solutionSet.get(i) > solutionSet.get(maxIndex)) maxIndex = i;
        }
        System.out.println(maxIndex);
    }
}
