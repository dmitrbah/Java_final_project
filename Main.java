import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HP", 100, 16, 256, "Windows 11", "Белый");
        Laptop laptop2 = new Laptop("ASUS", 101, 32, 512, "Windows 11", "Белый");
        Laptop laptop3 = new Laptop("DELL", 102, 8, 256, "Windows 10", "Черный");
        Laptop laptop4 = new Laptop("Apple", 103, 8, 256, "Linux", "Серый");
        Laptop laptop5 = new Laptop("Apple", 103, 8, 256, "Linux", "Серый");

        Set<Laptop> laptopSet = new HashSet<>();
        laptopSet.add(laptop1);
        laptopSet.add(laptop2);
        laptopSet.add(laptop3);
        laptopSet.add(laptop4);
        laptopSet.add(laptop5);

        for (Laptop laptop : laptopSet) {
            System.out.println(laptop);
        }

        searchLaptop(laptopSet);

    }

    public static void searchLaptop(Set<Laptop> laptops) {
        Map<String, String> criteria = new HashMap<>();
        criteria.put("1", "Модель");
        criteria.put("2", "RAM");
        criteria.put("3", "Объем ЖД");
        criteria.put("4", "Операционная система");
        criteria.put("5", "Цвет");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифру соответствующую необходимому критерию:");
        System.out.println("1 - Модель");
        System.out.println("2 - RAM");
        System.out.println("3 - Объем ЖД");
        System.out.println("4 - Операционная система");
        System.out.println("5 - Цвет");
        String userRequest = scanner.nextLine();

        if (criteria.containsKey(userRequest)) {
            String selectedCriteria = criteria.get(userRequest);
            System.out.println("Введите минимальное значение для " + selectedCriteria + " :");
            String minValue = scanner.nextLine();

            Set<Laptop> filteredLaptops = new HashSet<>();

            switch (selectedCriteria) {

                case "Модель":
                    for (Laptop laptop : laptops) {
                        if (laptop.getModel().equals(minValue)) {
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;
                
                case "RAM":
                    int minRAM = Integer.parseInt(minValue);
                    for (Laptop laptop : laptops) {
                        if (laptop.getRAM() >= minRAM) {
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;
                
                case "Объем ЖД":
                    int minCapacityHD = Integer.parseInt(minValue);
                    for (Laptop laptop : laptops) {
                        if (laptop.getCapacityHD() >= minCapacityHD) {
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;

                case "Операционная система":
                    for (Laptop laptop : laptops) {
                        if (laptop.getModel().equals(minValue)) {
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;

                case "Цвет":
                    for (Laptop laptop : laptops) {
                        if (laptop.getModel().equals(minValue)) {
                            filteredLaptops.add(laptop);
                        }
                    }
                    break;
            
                default:
                    System.out.println("Некорректный ввод критерия!");
                    break;
            }

            if (filteredLaptops.isEmpty()) {
                System.out.println("Ноутбуки, соответсвтвующие требуемым критериям не найдены");
            } else {
                for (Laptop laptop : filteredLaptops) {
                    System.out.println(laptop);
                }
            }
        } else {
            System.out.println("Некорректный ввод критерия!");
        }
    scanner.close();
    }
}
