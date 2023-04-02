import java.util.*;

public class Task3 {
    public static void main(String[] args) {

        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun", "Pluton"};
        List<String> planet = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            planet.add(planets[random.nextInt(9)]);
        }
        planet.sort(Comparator.naturalOrder());
        System.out.println("Наш список: " + planet);

        StringBuilder sb = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < planet.size() - 1; i++) {
            if (planet.get(i).equals(planet.get(i + 1))) {
                counter++;
            } else {

                sb.append(planet.get(i))
                        .append(" - ")
                        .append(counter)
                        .append("; ");
                counter = 1;
            }
        }
        sb.append(planet.get(planet.size() - 1))
                .append(" - ")
                .append(counter)
                .append(".");
        System.out.println("Список элементов с их количеством: " + sb);

        Set<String> set = new LinkedHashSet<>(planet); // инициализируем множество с дубликатами
        planet = new ArrayList<>(set); // записываем в наш список множество с дубликатами
        System.out.println("Список с удаленными повтояряющимися элементами: " + planet);
    }
}

