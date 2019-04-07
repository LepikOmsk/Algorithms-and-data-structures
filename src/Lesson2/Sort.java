package Lesson2;

public class Sort {

    /**
     * Метод реализующий пузырьковую сортиовку
     */
    public void sortBuble(int[] mass) {
        int in, out;
        for (out = mass.length - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (mass[in] > mass[in + 1])
                    change(in, in + 1, mass);
            }
        }
    }

    /**
     * Метод реализующий сортировку методом выбора
     */
    public void sortSelect(int[] mass) {
        int in, out, mark;
        for (out = 0; out < mass.length; out++) {
            mark = out;
            for (in = out + 1; in < mass.length; in++) {
                if (mass[in] < mass[mark]) {
                    mark = in;
                }
            }
            change(out, mark, mass);
        }
    }
    /**
     * Метод реализующий сортировку методом вставки
     */
    public void sortInsert(int[] mass) {
        int in, out;
        for (out = 1; out < mass.length; out++) {
            int temp = mass[out];
            in = out;
            while (in > 0 && mass[in - 1] >= temp) {
                mass[in] = mass[in - 1];
                --in;
            }
            mass[in] = temp;
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
