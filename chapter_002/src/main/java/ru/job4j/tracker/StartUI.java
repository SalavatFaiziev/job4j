package ru.job4j.tracker;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Item added: " + item.getName());
            } else if (select == 1) {
                System.out.println("Show all items: ");
                for (Item item : tracker.findAll()) {
                    System.out.println(item.getName() + " " + item.getId());
                }
            } else if (select == 2) {
                System.out.println("Edit item, enter id: ");
                String id = scanner.nextLine();
                System.out.println("Enter new");
                String itemReplaced = scanner.nextLine();
                Item itemNew = new Item(itemReplaced);
                if (tracker.replace(id, itemNew)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Failed");
                }
            } else if (select == 3) {
                System.out.println("Deleting item, enter item id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Item deleted");
                } else {
                    System.out.println("Failed");
                }
            } else if (select == 4) {
            System.out.println("Find item by id: ");
                String id = scanner.nextLine();
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Item name: " + item.getName() + "id: " + item.getId());
                } else {
                    System.out.println("item not found");
                }
            } else if (select == 5) {
                System.out.println("Find by name: ");
                String name = scanner.nextLine();
                for (Item item : tracker.findByName(name)) {
                    System.out.println(item.getName() + " " + item.getId());
                }
            } else if (select == 6) {
                System.out.println("exiting");
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}