import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList with the values (1, 2, 3, 4, 5, 6, 7)
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);
        myList.add(6);
        myList.add(7);

        // Shuffle the ArrayList
        Collections.shuffle(myList);

        // Convert the shuffled ArrayList back to an array (if needed)
        Integer[] shuffledArray = myList.toArray(new Integer[0]);

        // Print the shuffled array
        for (int i = 0; i < shuffledArray.length; i++) {
            System.out.print(shuffledArray[i]);
            if (i < shuffledArray.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
