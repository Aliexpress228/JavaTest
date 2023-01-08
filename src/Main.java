import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
public class Main {
    public static int maxInList(List array){
        return (int)Collections.max(array);
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();

        numbers.add(3);
        numbers.add(4);
        numbers.add(7);
        numbers.add(2);

        System.out.println(numbers);
        System.out.println("Max in this list is: "+maxInList(numbers));
    }
}