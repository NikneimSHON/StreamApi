import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // #1 пусти числа парные если они больше p
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for(int i = 0;i<1000;i++){
            list.add(i+ rand.nextInt()%30);
        }
        int p = rand.nextInt()%1000;
        int count = (int) list.stream().filter(x -> x>p).count();
        System.out.println(count);

        // #2
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Jams");
        list2.add("Mironov");
        list2.add("OLegov");
        list2.stream().filter(x -> x.indexOf('J')==0).forEach(System.out::println);
        //3
        String[] arrayOfStrings = {"banana", "apple", "orange", "grape"};
        String[] sortedStrings = Arrays.stream(arrayOfStrings)
                .sorted()
                .toArray(String[]::new);
        System.out.println(Arrays.toString(sortedStrings));
        //4
        ArrayList<Integer> list3 = new ArrayList<>();
        for(int i = 0;i<1000;i++){
            list3.add(i+ rand.nextInt());
        }
        System.out.println("Чётных чисел " + list3.stream().filter(x -> x%2==0).count());
        //5
        List<String> names = Arrays.asList("Alice", "", "Bob", "Charlie", "David", "Eva", "Frank", "Anna");
        List<String> upperCaseNames = names.stream()
                .filter(name -> !name.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Upper case names: " + upperCaseNames);
        long countNamesStartingWithA = names.stream()
                .filter(name -> !name.isEmpty() && name.startsWith("A"))
                .count();

        System.out.println("A': " + countNamesStartingWithA);



    }
}