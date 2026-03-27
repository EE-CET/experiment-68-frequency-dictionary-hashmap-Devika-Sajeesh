import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String line = scanner.nextLine();
        
        String[] words = line.split("\\s+");
        
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }
        
        List<Map.Entry<String, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
        Collections.sort(list, Comparator.comparingInt((Map.Entry<String, Integer> entry) -> -entry.getValue())
                .thenComparing((Map.Entry<String, Integer> entry) -> entry.getKey(), Comparator.reverseOrder()));
        
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        scanner.close();
    }
}
