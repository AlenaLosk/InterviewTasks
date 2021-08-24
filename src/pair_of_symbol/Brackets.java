package pair_of_symbol;

import java.io.*;
import java.util.*;

public class Brackets {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] array = reader.readLine().toCharArray();
        boolean isLineCorrect = false;
        if (array.length >= 2) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == '{') {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] == '}') {
                            isLineCorrect = true;
                            array[i] = 0;
                            array[j] = 0;
                            break;
                        }
                    }
                } else if (array[i] == '[') {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] == ']') {
                            isLineCorrect = true;
                            array[i] = 0;
                            array[j] = 0;
                            break;
                        }
                    }
                } else if (array[i] == '(') {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] == ')') {
                            isLineCorrect = true;
                            array[i] = 0;
                            array[j] = 0;
                            break;
                        }
                    }
                } else if (array[i] == 0) {
                    continue;
                } else {
                    isLineCorrect = false;
                    break;
                }
            }
        }
        System.out.println(isLineCorrect);
    }
}
