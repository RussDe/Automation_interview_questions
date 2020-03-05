package meetup.str_utils;

import java.util.Arrays;

public class SortLetters {

    static char[] sortLetters(String str) {
        char[] char_array = str.toLowerCase().replaceAll("\\s+", "").toCharArray();
        Arrays.sort(char_array);
        return char_array;
    }
}
