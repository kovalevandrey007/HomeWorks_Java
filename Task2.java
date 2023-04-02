import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> ArrayList = new ArrayList<>();
        int sum1 = 0;
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            ArrayList.add(rnd.nextInt(10));

        }
        for (int i = 0; i < ArrayList.size(); i++) {
            sum1 += ArrayList.get(i);
        }
        System.out.println("Наш массив: \n" + ArrayList);
        System.out.println("Минимальное значение = " + Collections.min(ArrayList));
        System.out.println("Максимальное значение = " + Collections.max(ArrayList));
        System.out.println("Среднее арифмитической = " + (double) sum1 / (double) ArrayList.size());
    }
}



