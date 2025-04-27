package homeworks.homework10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] a1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        ByCondition c1 = a -> a%2==0;
        System.out.println(Arrays.toString(Sequence.filter(a1, c1)));
        //четность

        int[] a2 = new int[]{11, 42, 523, 64, 81, 677, 78888, 88968, 678969};
        ByCondition c2 = a -> {
            List<Integer> nums = new ArrayList<>();
            while (a != 0) {
                nums.add(a % 10);
                a /= 10;
            }
            int s = 0;
            for (int i = 0; i < nums.size(); i++) {
                s += nums.get(i);
            }
            return s % 2 == 0;
        };
        System.out.println(Arrays.toString(Sequence.filter(a2, c2)));
        //четность суммы цифр
    }
}
