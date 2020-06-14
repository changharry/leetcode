package easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private final Map<Character,Integer> map = new HashMap<Character,Integer>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public int romanToInt(String s) {
        char[] arr = s.toCharArray();
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                result = map.get(arr[i]);
            }
            if (i + 1 >= arr.length) {
                break;
            }
            if (map.get(arr[i]) >= map.get(arr[i + 1])) {
                result += map.get(arr[i + 1]);
            } else {
                result += map.get(arr[i + 1]) - map.get(arr[i]) - map.get(arr[i]);
            }
        }
        return result;
    }
}


