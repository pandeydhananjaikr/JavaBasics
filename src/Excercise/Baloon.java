package Excercise;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.*;

public class Baloon {

    public static int maxNumberOfBalloons(String text) {
        Map<Character, Long> textFrequencyMap = getFrequencyMap(text);
        Map<Character, Long> ballonFrequencyMap = getFrequencyMap("balloon");
        return ballonFrequencyMap.keySet().stream()
                .map(k ->
                        (int) (textFrequencyMap.getOrDefault(k, 0L) / ballonFrequencyMap.get(k)))
                .min(Integer::compare)
                .orElse(0);
    }

    public static  Map<Character, Long> getFrequencyMap(String s) {
        return s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), HashMap::new, Collectors.counting()));
    }

    public static void main(String[] args) {
        maxNumberOfBalloons("Balloon");
    }






}
