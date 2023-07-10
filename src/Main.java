
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("Egor");
        System.out.println(names);

        List<Integer> heights = new ArrayList<>();
        heights.add(180);
        heights.add(170);
        heights.add(190);
        System.out.println(heights);

        List<String> ans = new ArrayList<>();
        List<Pair> heightAndNames = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            heightAndNames.add(new Pair(heights.get(i), names.get(i)));
        }

        Collections.sort(heightAndNames, Collections.reverseOrder());

        for (Pair pair : heightAndNames) {
            ans.add(pair.name);
        }
        System.out.println(ans);

        String[] result = new String[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
            System.out.println(result[i]);
        }
    }
}