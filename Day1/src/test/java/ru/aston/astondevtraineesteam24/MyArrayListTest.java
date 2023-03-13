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
        list.put(0, test2);
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