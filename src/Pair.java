import java.util.List;

public class Pair implements Comparable<Pair> {
    int height;
    String name;

    List<Integer> heights;
    public Pair(int height, String name) {
        this.height = height;
        this.name = name;

    }

    public int compareTo(Pair other) {
        return Integer.compare(this.height, other.height);
    }
}
