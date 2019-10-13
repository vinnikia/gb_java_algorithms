package lesson2;

public class Sort {

    /**
     * Sort bubble
     */
    static void sortBubble(int[] mass) {
        int in, out;
        int len = mass.length;
        for (out = len - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (mass[in] > mass[in + 1]) {
                    change(in, in + 1, mass);
                }
            }
        }
    }

    /**
     * Sort select
     */
    static void sortSelect(int[] mass) {
        int in, out, mark;
        int len = mass.length;
        for (out = 0; out < len; out++) {
            mark = out;
            for (in = out + 1; in < len; in++) {
                if (mass[in] < mass[mark]) {
                    mark = in;
                }
            }
            change(out, mark, mass);
        }
    }

    /**
     * sortInsert
     */
    static void sortInsert(int[] mass) {
        int in, out;
        int len = mass.length;
        for (out = 1; out < len; out++) {
            int temp = mass[out];
            in = out;
            while (in > 0 && mass[in - 1] >= temp) {
                mass[in] = mass[in - 1];
                --in;
            }
            mass[in] = temp;
        }
    }


    private static void change(int a, int b, int[] mass) {
        int temp = mass[a];
        mass[a] = mass[b];
        mass[b] = temp;
    }
}
