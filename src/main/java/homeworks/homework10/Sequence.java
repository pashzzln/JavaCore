package homeworks.homework10;

public class Sequence {
    public static int[] filter(int[] array, ByCondition condition) {
        for (int i = 0; i < array.length; i++) {
            if (condition.isOk(array[i]) == false) {
                array[i] = 0;
            }
        }
        int c = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                c++;
            }
        }
        int[] array1 = new int[array.length - c];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((array[j] != 0) & (array1[i] == 0)) {
                    array1[i] = array[j];
                    array[j] = 0;
                }
            }
        }
        return array1;
    }
}
