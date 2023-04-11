
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        ex1();
    }

    private static void ex1() {
        Map<String, String[]> PhoneBook = new HashMap<>();
        PhoneBook.put("Иванов И.И.", new String[]{"34324525245", "465757676"});
        PhoneBook.put("Петров П.П.", new String[]{"352232523", "84967386934875", "45434536"});
        PhoneBook.put("Васильев В.В.", new String[]{"56457547554", "45346457"});
        PhoneBook.put("Балашов Б.Б.", new String[]{"356689807"});

        for (Map.Entry<String, String[]> entry : PhoneBook.entrySet()) {
            System.out.printf("%s : %s%n", entry.getKey(), Arrays.stream(entry.getValue()).collect(Collectors.joining(", ")));
        }
    }
}
