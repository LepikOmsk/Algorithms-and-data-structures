package Lesson2;

public class Array {
    private int[] arr;
    private int size;

    public Array(int s) {
        this.arr = new int[s];
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    /**
     * Для проверки правильности выполнения остальных методов создаем метод выводящий массив на экран
     * Поскольку масссив в задании достаточно большой и для проверки правильности выполнения нет необходимости выводить
     * его целиком на экран сделаем возможность выводить на экран часть массива с элемента а по элемент b
     */
    public void display(int a, int b) {
        for (int i = a - 1; i < b; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Метод позволяющий искать заданный элемент в массиве. Может вспомните, я на занятии предлагал именно такую реализацию:
     * если условие выполняется возвращаем True, в противном случае возвращаем False, без дополнительной переменной b
     * Вроде все работает корректно
     */
    public boolean find(int value) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == value)
                return true;
        }
        return false;
    }

    /**
     * Простой метод позволяющий добавлять элемент в наш массив
     */
    public void insert(int value) {
        arr[size] = value;
        size++;
    }

    /**
     * Метод позволяющий удалить элемент из массива
     */
    public void del(int value) {
        int i;
        for (i = 0; i < size; i++) {
            if (arr[i] == value) break;
        }
        for (int j = i; j < size - 1; j++) {
            arr[j] = arr[j + 1];

        }
    }
    /**
     * Метод реализующий пузырьковую сортиовку
     */
    public void sortBuble() {
        int in, out;
        for (out = arr.length - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in + 1])
                    change(in, in + 1, arr);
            }
        }
    }
    /**
     * Метод реализующий сортировку методом выбора
     */
    public void sortSelect() {
        int in, out, mark;
        for (out = 0; out < arr.length; out++) {
            mark = out;
            for (in = out + 1; in < arr.length; in++) {
                if (arr[in] < arr[mark]) {
                    mark = in;
                }
            }
            change(out, mark, arr);
        }
    }
    /**
     * Метод реализующий сортировку методом вставки
     */
    public void sortInsert() {
        int in, out;
        for (out = 1; out < arr.length; out++) {
            int temp = arr[out];
            in = out;
            while (in > 0 && arr[in - 1] >= temp) {
                arr[in] = arr[in - 1];
                --in;
            }
            arr[in] = temp;
        }
    }
    /**
     * Вспомогательный метод, меняющий местами два элемента внутри массива
     */
    private void change(int a, int b, int[] mass) {
        int temp = mass[a];
        mass[a] = mass[b];
        mass[b] = temp;
    }
}