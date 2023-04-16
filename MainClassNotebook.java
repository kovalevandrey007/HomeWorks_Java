import java.util.*;

public class MainClassNotebook {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цвет ноутбука (Grey, White, Yellow, Dark, Red): ");
        String color = sc.nextLine();
        System.out.println("Цвет ноутбука = " + color+ "\n");
        sc.close();


        Notebook notebook1 = new Notebook(1, 8, 512, "15", "Acer", "Grey", "Intel");
        Notebook notebook2 = new Notebook(8, 16, 1024, "17", "Dell", "White", "AMD");
        Notebook notebook3 = new Notebook(12, 8, 1024, "14", "Gygabyte", "Yellow", "Intel");
        Notebook notebook4 = new Notebook(14, 16, 512, "13", "Apple", "Dark", "M2");
        Notebook notebook5 = new Notebook(10, 4, 512, "15", "lenovo", "Grey", "AMD");
        Notebook notebook6 = new Notebook(5, 8, 1024, "16", "Asus", "Red", "Intel");

        ArrayList<Object> listNotebook = new ArrayList<>();

        listNotebook.add(notebook1);
        listNotebook.add(notebook2);
        listNotebook.add(notebook3);
        listNotebook.add(notebook4);
        listNotebook.add(notebook5);
        listNotebook.add(notebook6);

        listNotebook.clear();
        listNotebook.add(notebook1.getColor());
        listNotebook.add(notebook2.getColor());
        listNotebook.add(notebook3.getColor());
        listNotebook.add(notebook4.getColor());
        listNotebook.add(notebook5.getColor());
        listNotebook.add(notebook6.getColor());

        for (Object i : listNotebook) {
            if (color.contains(listNotebook.get(0).toString())) {
                System.out.println(notebook1);
                break;
            } else if (color.contains(listNotebook.get(1).toString())) {
                System.out.println(notebook2);
                break;
            } else if (color.contains(listNotebook.get(2).toString())) {
                System.out.println(notebook3);
                break;
            } else if (color.contains(listNotebook.get(3).toString())) {
                System.out.println(notebook4);
                break;
            } else if (color.contains(listNotebook.get(4).toString())) {
                System.out.println(notebook5);
                break;
            } else if (color.contains(listNotebook.get(5).toString())) {
                System.out.println(notebook6);
                break;
            } else System.out.println("Заданные параметры не найдены.");
        }
    }
}
