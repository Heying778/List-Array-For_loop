import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("COll");
//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0,"Tiree");
//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2,"Islay");
//        4. Print out the index position of "Skye"
        System.out.println(scottishIslands.indexOf("Skye"));
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        System.out.println(scottishIslands.size());
//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);
//        9. Print out all the islands using a for loop
        for(String name:scottishIslands){
            System.out.println(name);
        }

        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("numbers: " + numbers);

//        1. Print out a list of the even integers
        int[] array_num = {1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7};
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < array_num.length; i++){
            if(array_num[i] % 2 ==0){
                even.add(array_num[i]);
                System.out.println(even);
            }
        }

//        2. Print the difference between the largest and smallest value
        int max = array_num[0];
        int min = array_num[0];
        for(int i = 1; i < array_num.length;i++){
            if(array_num[i] > max)
                max = array_num[i];
            else if (array_num[i]< min) {
                min = array_num[i];
            }
        }
        System.out.println("Difference between largest and smallest is " + (max-min));
//        3. Print True if the list contains a 1 next to a 1 somewhere.

//        4. Print the sum of the numbers,
        int sum = IntStream.of(array_num).sum();
        System.out.println(sum);
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 7.

    }

}
