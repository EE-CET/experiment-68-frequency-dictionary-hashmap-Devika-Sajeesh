import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        	
	String line = scanner.nextLine();
        String[] words = line.split("\\s+");

        LinkedHashMap<String, Integer> freqMap = new LinkedHashMap<>();

        for (String word : words) {
            freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
               System.out.print(entry.getKey() + ": " + entry.getValue() + " ");      }

        scanner.close();

    }
}