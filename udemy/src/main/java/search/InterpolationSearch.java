package search;

import java.util.Arrays;
import java.util.List;

public class InterpolationSearch {
    public static int search(List<Integer> elements, int value) {
        int low = 0;
        int high = elements.size() - 1;

        while (low <= high && value <= elements.get(high) && value >= elements.get(low)) {
            if (low == high) {
                if (value == elements.get(low))
                    return low;
                else return -1;
            }

            int pos = low + ((high - low) * (value - elements.get(low)) / (elements.get(high) - elements.get(low)));

            if (elements.get(pos) == value) {
                return pos;
            }

            if (elements.get(pos) < value) {
                low = pos + 1;
            } else high = pos - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(Arrays.asList(1,2,3,4,5,6,7,8), 5));
    }
}
