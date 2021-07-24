import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static int search(List<Integer> elements, int value){
        int start = 0;
        int stop = elements.size() - 1;
        int middle = (start+stop)/2;
        while((elements.get(middle) != value) && start < stop){
            stop = elements.get(middle) > value ? middle - 1 : stop;
            start = elements.get(middle) > value ? start : middle + 1;
            middle = (start+stop)/2;
        }
        return elements.get(middle) != value ? -1 : middle;
    }

    public static void main(String[] args) {
        System.out.println(search(Arrays.asList(1,2,3,4,5,6,7,8), 7));
    }
}
