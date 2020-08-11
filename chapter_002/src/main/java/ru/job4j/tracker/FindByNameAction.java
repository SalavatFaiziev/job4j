package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Enter item name: ");
        for (Item item: tracker.findByName(name)) {
            if (item != null) {
                System.out.println("Item found");
                System.out.println(item.toString());
            } else {
                System.out.println("Item not found");
            }
        }
        return true;
    }
}
