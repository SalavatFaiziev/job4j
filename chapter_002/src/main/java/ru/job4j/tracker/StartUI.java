package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public static void showAll(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        for (Item item : tracker.findAll()) {
            System.out.println(item + " id: "  + item.getId());
        }
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Enter id: ");
        String itemReplaced = input.askStr("Enter new");
        Item itemNew = new Item(itemReplaced);
        if (tracker.replace(id, itemNew)) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Enter item id: ");
        if (tracker.delete(id)) {
            System.out.println("Item deleted");
        } else {
            System.out.println("Failed");
        }
    }

    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        String id = input.askStr("Enter item id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("id: " + item.getId() + " " + item);
        } else {
            System.out.println("item not found");
        }
    }

    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ====");
        String name = input.askStr("Enter item name: ");
        for (Item item: tracker.findByName(name)) {
            System.out.println(item.getName() + " " + item);
        }
    }

        public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                 StartUI.showAll(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findById(input, tracker);
            } else if (select == 5) {
                StartUI.findByName(input, tracker);
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}