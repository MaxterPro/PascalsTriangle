import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int numRows = 7;
        List<List<Integer>> res = generate(numRows);
        System.out.println(res);
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>(new ArrayList<>());
        List<Integer> last = new ArrayList<>();

        last.add(1);
        arr.add(last);

        for (int i = 2; i <= numRows; i++) {
            ArrayList<Integer> curr = new ArrayList<>();
            curr.add(1);

            for (int j = 0; j < last.size()-1; j++) {
                curr.add(last.get(j) + last.get(j + 1));
            }

            curr.add(1);
            arr.add(curr);
            last = curr;
        }
        return arr;
    }

}
