package ru.aston.astondevtraineesteam24;

import java.util.Collection;
import java.util.Iterator;

/**
 * Собственная реализация ArrayList согласно заданию.
 * Не является имплементацией интерфеса List!
 *
 * @author Denis Davydov 09.03.2023
 */
public class MyArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] innerList = new Object[DEFAULT_CAPACITY];
    private int size;

    public MyArrayList() {
    }

    /**
     * В конструкторе принимается начальное значение размера списка
     * Минимальный размер равен 10. Меньший размер инициализирован
     * быть не может, за исключением передачи к конструктор самого
     * массива.
     *
     * @param size - начальный размер
     */
    public MyArrayList(int size) {
        if (size > 10) {
            this.innerList = new Object[size];
        } else {
            this.innerList = new Object[10];
        }
    }

    public MyArrayList(Object[] inner) {
        if (inner == null) {
            throw new IllegalArgumentException("Массив должен быть!");
        }
        this.innerList = inner;
    }

    /**
     * Добавляет элемент к конец списка. Перед этим осуществляется
     * проверка размера массива. Если массив заполнен, - он расширяется.
     * Только после этого производится добавление.
     *
     * @param o - элемент, добавляемый в массив.
     */
    public void add(Object o) {
        if (size == innerList.length) {
            this.expand();
        }
        innerList[size++] = o;
    }

    public void add(int index, Object o) {
        if (size == innerList.length) {
            this.expand();
        }
        for (int i = innerList.length - 2; index <= i; i--) {
            innerList[i + 1] = innerList[i];
        }
        innerList[index] = o;
        size++;
    }

    /**
     * Вставляет элемент в массив по указанному индексу.
     *
     * @param index индекс
     * @param o     вставляемый элемент
     * @return возвращает элемент, ране находившийся
     * по данному индексу или null.
     */
    public Object set(int index, Object o) {
        if (index > size - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == innerList.length) {
            this.expand();
        }
        Object old = innerList[index];
        innerList[index] = o;
        return old;
    }

    /**
     * Получить элемент по данному индексу.
     * Если индекс больше размера, выбрасывает исключение.
     *
     * @param index индекс
     * @return возвращает сам элемент
     */
    public Object get(int index) {
        if (index > size - 1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return innerList[index];
    }

    /**
     * Удаляет элемент по данному индексу.
     * Оставшиеся элементы копированием сдвигаются влево на 1 индекс.
     * Последний элемент масива зануляется.
     * @param index
     */
    public void delete(int index) {
        if (index > size - 1) {
            throw new IllegalArgumentException("Index is not exists!");
        }
        for (int i = index; i < innerList.length - 1; i++) {
            innerList[i] = innerList[i + 1];
        }
        innerList[size - 1] = null;
        size--;
    }

    /**
     * Очищает внутрений массив.
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            innerList[i] = null;
        }
        size = 0;
    }

    public void sort(Collection collection) {
        Iterator iterator = collection.iterator();
        Object[] objects = new Object[collection.size()];
        for (int i = 0; iterator.hasNext(); i++) {
            objects[i] = iterator.next();
        }
    }

    //    public int[] quickSort(int[] o) {
//        if (o.length == 1) {
//            return o;
//        } else if (o.length == 2) {
//            int[] res = new int[2];
//
//        } else {
//            int pivot = o[o.length - 1];
//            int wall = 0;
//            int current = 0;
//            for (int i = 0; i < o.length; i++) {
//                if (o[i] < pivot) {
//
//                    wall++;
//                } else {
//
//                }
//
//            }
//        }
//
//    }

    public int size() {
        return size;
    }

    /**
     * Увеличивает внутренний массив.
     * Создается новый массив в два раза большей предыдущего,
     * в него копируются элементы старого. Старыймассив перезаписывается
     * на новый.
     */
    private void expand() {
        if (innerList.length == 0) {
            innerList = new Object[10];
            return;
        }
        Object[] o = new Object[size * 2];
        for (int i = 0; i < innerList.length; i++) {
            if (innerList[i] == null) {
                break;
            }
            o[i] = innerList[i];
        }
        this.innerList = o;
    }
}
