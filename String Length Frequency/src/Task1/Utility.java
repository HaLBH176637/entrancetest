package Task1;

import java.util.*;

public class Utility {
    public List<String> mostFrequentLengths(String[] strings) {
        if (strings == null || strings.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        Map<Integer, List<String>> lengthMap = new HashMap<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (String str : strings) {
            int length = str.length();
            lengthMap.putIfAbsent(length, new ArrayList<>());
            lengthMap.get(length).add(str);

            frequencyMap.put(length, frequencyMap.getOrDefault(length, 0) + 1);
        }

        int maxFrequency = Collections.max(frequencyMap.values());
        int mostFrequentLength = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mostFrequentLength = entry.getKey();
                break;
            }
        }

        return lengthMap.get(mostFrequentLength);
    }
}
