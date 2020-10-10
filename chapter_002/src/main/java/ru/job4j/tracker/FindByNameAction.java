package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by name ===");
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
