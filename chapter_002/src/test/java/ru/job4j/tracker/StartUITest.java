package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.nullValue;


public class StartUITest {
    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[] {"0"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Exit" + System.lineSeparator()
                        + "Exit" + System.lineSeparator()));
    }

    @Test
    public void whenCreate() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0", "Item name", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {new CreateAction(out), new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("Item name"));
    }

    @Test
    public void whenReplace() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Replace item"));
        String replacedName = "New item name";
        Input in = new StubInput(new String[]
                {"0", item.getId(), replacedName, "1"});
        UserAction[] actions = {new ReplaceAction(out), new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void findAllAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "1"});
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ShowAllAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu." + System.lineSeparator()
                        + "0. === Show all items ===" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator()
                        + "=== Show all items ===" + System.lineSeparator()
                        + "Menu." + System.lineSeparator()
                        + "0. === Show all items ===" + System.lineSeparator()
                        + "1. Exit" + System.lineSeparator() + "Exit" + System.lineSeparator()));
    }

    @Test
    public void findByIdAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("Find item by id"));
        Input in = new StubInput(
                new String[] {"0", String.valueOf(item.getId()), "1"});
        UserAction[] actions = {
                new FindByIdAction(out),
                new ExitAction(out)};
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findById(item.getId()), is(item));
    }

    @Test
    public void findByNameAction() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = tracker.add(new Item("item"));
        Input in = new StubInput(
                new String[] {"0", "Find item by name", "1"});
        UserAction[] actions = {
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(tracker.findAll()[0].getName(), is("item"));
    }
}






