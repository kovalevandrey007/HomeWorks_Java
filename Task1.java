import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rnd.nextInt(20));
        }
        System.out.println("Массив: \n" + list + "\n");
        System.out.println("Массив без четных чисел: ");
        list.removeIf(i -> i % 2 == 0);
        System.out.println(list);
    }
}

