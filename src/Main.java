import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;
public class Main {
    public static int maxInList(List array){
        return (int)Collections.max(array);
    }
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Write numbers amount: ");
        int amount = sc.nextInt();
        for (int i=0;i<amount;i++) {
            numbers.add(sc.nextInt());
        }
        System.out.println("Your list: "+numbers);
        System.out.println("Max in this list is: "+maxInList(numbers));
    }
}