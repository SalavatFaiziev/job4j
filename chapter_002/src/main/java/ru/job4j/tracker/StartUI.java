package ru.job4j.tracker;


public class StartUI {
        public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Item added: " + item.getName());
            } else if (select == 1) {
                System.out.println("Show all items: ");
                for (Item item : tracker.findAll()) {
                    System.out.println(item + " id: "  + item.getId());
                }
            } else if (select == 2) {
                System.out.println("Edit item, enter id: ");
                String id = input.askStr("Edit item, enter id: ");
                String itemReplaced = input.askStr("Enter new");
                Item itemNew = new Item(itemReplaced);
                if (tracker.replace(id, itemNew)) {
                    System.out.println("Success");
                } else {
                    System.out.println("Failed");
                }
            } else if (select == 3) {

                String id = input.askStr("Deleting item, enter item id: ");
                if (tracker.delete(id)) {
                    System.out.println("Item deleted");
                } else {
                    System.out.println("Failed");
                }
            } else if (select == 4) {
                String id = input.askStr("Find item by id: ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Item name: " + item.getName() + "id: " + item.getId());
                } else {
                    System.out.println("item not found");
                }
            } else if (select == 5) {
                String name = input.askStr("Find by name: ");
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
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}