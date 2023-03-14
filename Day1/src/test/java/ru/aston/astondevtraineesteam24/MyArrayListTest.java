package ru.aston.astondevtraineesteam24;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayListTest {

    @Test
    public void whenAddStringThenSizeIs1() {
        MyArrayList list = new MyArrayList();
        String test = "test";
        list.add(test);
        assertEquals(1, list.size());
    }

    @Test
    public void whenAddByIndexThenSizeIs1() {
        MyArrayList list = new MyArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add(0, "101");
        assertEquals("101", list.get(0));
        assertEquals("1", list.get(1));
        assertEquals("3", list.get(3));
    }

    @Test
    public void whenAddThenSameGet() {
        MyArrayList list = new MyArrayList();
        String test = "test";
        list.add(test);
        assertEquals(test, list.get(0));
    }

    @Test
    public void whenAddAndPutStringThenGetSecondString() {
        MyArrayList list = new MyArrayList();
        String test = "test";
        String test2 = "test1";
        list.add(test);
        list.set(0, test2);
        assertEquals(test2, list.get(0));
    }

    @Test
    public void whenAddAndDeleteThenSizeIs0() {
        MyArrayList list = new MyArrayList();
        String test = "test";
        list.add(test);
        list.delete(0);
        assertEquals(0, list.size());
    }

    @Test
    public void whenAddAndClearThenSizeIs0() {
        MyArrayList list = new MyArrayList();
        list.add("test");
        list.add("test2");
        assertEquals(2, list.size());
        list.clear();
        assertEquals(0, list.size());
    }

    @Test
    @Ignore
    public void sort() {
    }

    @Test
    @Ignore
    public void quickSort() {
    }

    @Test
    public void whenTwiceAddThenSizeIs2() {
        MyArrayList list = new MyArrayList();
        String test = "test";
        String test2 = "test1";
        list.add(test);
        list.add(test2);
        assertEquals(2, list.size());
    }
}