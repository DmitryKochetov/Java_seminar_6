// Создать класс Ноутбук для магазина техники.
// Добавить атрибуты класса с соответствующими типами.
// Например,
// - идентификатор
// - производитель
// - название модели
// - RAM
// - объем HD
// - операционная система
// - и т.д.
// Добавить конструктор класса.
// Добавить необходимые методы класса.

// Создать множество ноутбуков (множество объектов класса ноутбук).
// 3-10 штук

// Написать метод, который будет запрашивать у пользователя критерий фильтрации (один) и выведет ноутбуки, отвечающие критерию.
// Например:

// “Введите цифру, соответствующую необходимому критерию:
// 1 - RAM
// 2 - Объем HD
// 3 - Операционная система
// 4 - Цвет …

// Для критериев объем и память необходимо запросить дополнительно диапазон.
// Например,
// "Введите минимальное значение"
// "Введите максимальное значение"

// Отфильтровать ноутбуки и вывести проходящие по критерию.
// Пример вывода:

// Ноутбуки с объем HD от 256 до 512
// 1 HP EliteBook...
// 2..
// 3...

// Пример вывода:

// Ноутбуки с цвет Серебристый
// 1 Honor ...
// 2..
// 3...

package DZ;

import java.util.*;

public class task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");

        Notebook note1 = new Notebook("white", "IBM", "modelM", 32, 250, "windows", 1);
        Notebook note2 = new Notebook("black", "Chinabook", "uncleLao", 16, 500, "Linux", 2);
        Notebook note3 = new Notebook("silver", "Apple", "macbookPro", 32, 250, "MacOS", 3);
        Notebook note4 = new Notebook("silver", "HP", "model1", 8, 512, "Windows", 4);

        // Notebook[] noteb = new Notebook[] { note1, note2, note3, note4 };
        List<Notebook> noteb = new ArrayList<Notebook>();
        List<Notebook> res = new ArrayList<Notebook>();
        noteb.add(note1);
        noteb.add(note2);
        noteb.add(note3);
        noteb.add(note4);
        while (true) {
            // List<Notebook> res = new ArrayList<Notebook>();
            System.out.println(
                    "\n1 - RAM\n2 - Объем HD\n3 - Операционная система\n4 - Цвет\n5 - Производитель\nВведите цифру, соответствующую необходимому критерию:");
            int a = scanner.nextInt();
            // System.out.println(a);

            switch (a) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Введите минимальный объем RAM включительно: ");
                    int minram = scanner.nextInt();
                    System.out.println("Введите максимальный объем RAM включительно: ");
                    int maxram = scanner.nextInt();
                    System.out.println("Минимальный объем Ram " + minram + ", Максимальный объем RAM " + maxram);
                    System.out.println("\nСписок ноутбуков подходящих по параметру:");
                    res = Notebook.getBooksByRam(noteb, minram, maxram);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Введите минимальный объем HDD включительно: ");
                    int minhdd = scanner.nextInt();
                    System.out.println("Введите максимальный объем HDD включительно: ");
                    int maxhdd = scanner.nextInt();
                    System.out.println("Минимальный объем HDD " + minhdd + ", Максимальный объем HDD " + maxhdd);
                    System.out.println("\nСписок ноутбуков подходящих по параметру:");
                    res = Notebook.getBooksByHdd(noteb, minhdd, maxhdd);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Введите название OS: ");
                    String osys = scanner.nextLine();
                    // String col1 = "silver";
                    System.out.println("OS: " + osys);
                    // System.out.println(col1.equals(col));
                    System.out.println("\nСписок ноутбуков подходящих по параметру:");

                    res = Notebook.getBooksByOs(noteb, osys);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Введите цвет: ");
                    String col = scanner.nextLine();
                    // String col1 = "silver";
                    System.out.println("Цвет: " + col);
                    // System.out.println(col1.equals(col));
                    System.out.println("\nСписок ноутбуков подходящих по параметру:");

                    res = Notebook.getBooksByColor(noteb, col);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Введите производителя: ");
                    String vend = scanner.nextLine();
                    System.out.println("Производитель: " + vend);
                    // System.out.println(col1.equals(col));
                    System.out.println("\nСписок ноутбуков подходящих по параметру:");

                    res = Notebook.getBooksByVendor(noteb, vend);
                    for (Notebook n : res) {
                        System.out.println(n.toString());
                    }

                    break;
                default:
                    System.out.println("Некорректный ввод");
                    break;
            }

        }

    }

}
