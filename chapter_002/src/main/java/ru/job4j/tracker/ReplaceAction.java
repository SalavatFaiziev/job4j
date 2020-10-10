package ru.job4j.tracker;

public class ReplaceAction implements  UserAction {
    private final Output out;

    public ReplaceAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit item ===");
        String id = input.askStr("Enter id: ");
        String itemReplaced = input.askStr("Enter new name : ");
        Item itemNew = new Item(itemReplaced);
        if (tracker.replace(id, itemNew)) {
            System.out.println("Success");
        } else {
            System.out.println("Failed");
        }
        return true;
    }
}
