package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void allFind() {
        Tracker tracker = new Tracker();
        Item one = new Item("test1");
        tracker.add(one);
        Item two = new Item("test2");
        tracker.add(two);
        Item three = new Item("test3");
        tracker.add(three);
        Item[] expected = {one, two, three};
        Item[] result = tracker.findAll();
        assertThat(result, is(expected));
    }

    @Test
    public void nameFind() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item[] expected = {item};
        Item[] result = tracker.findByName("test1");
        assertThat(result, is(expected));
    }

    @Test
    public void idFind() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }
}