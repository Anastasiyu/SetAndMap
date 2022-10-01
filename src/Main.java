import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
        task2(nums);
        task3(List.of("Losk", "LID", "Lot", "Yar", "LID", "Losk"));
        task4(List.of("Losk", "LID", "Lot", "Yar", "LID", "Losk"));

    }
    private static void  task1(List<Integer> numbers){
        for (Integer num : numbers){
            if (num % 2 == 1){
                System.out.println(num);
            }
        }
        System.out.println();
    }

    private static void  task2(List<Integer> numbers){

        Set<Integer> set = new TreeSet<>(numbers);
        for (Integer num : set) {
            if (num % 2 == 0){
                System.out.println(num);
            }
        }
        System.out.println();
    }

    private static void  task3(List<String> words){

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)){
            map.put(word, map.get(word) + 1);
        }else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1 ) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println();
    }
    private static void  task4(List<String> words){

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else {
                map.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " встречается " + entry.getValue() + " раз");
            }
        }

}