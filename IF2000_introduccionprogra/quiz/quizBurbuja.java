/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

/**
 *
 * @author Lenovo X1
 */
public class quizBurbuja {
     
    public static void main(String[] a) {
        int n = 100000;
        int[] x = new int[n];
        for (int i = 0; i < n; i++) x[i] = (int)(Math.random() * 100000);
        int[] b = x.clone(), q = x.clone(), m = x.clone(), s = x.clone();

        long t = System.currentTimeMillis();
        burbuja(b);
        System.out.println("Burbuja: " + (System.currentTimeMillis() - t) + " ms");

        t = System.currentTimeMillis();
        quick(q, 0, n - 1);
        System.out.println("Quick: " + (System.currentTimeMillis() - t) + " ms");

        t = System.currentTimeMillis();
        merge(m, 0, n - 1);
        System.out.println("Merge: " + (System.currentTimeMillis() - t) + " ms");

        t = System.currentTimeMillis();
        shell(s);
        System.out.println("Shell: " + (System.currentTimeMillis() - t) + " ms");
    }

    static void burbuja(int[] x) {
        for (int i = 0; i < x.length - 1; i++)
            for (int j = 0; j < x.length - 1 - i; j++)
                if (x[j] > x[j + 1]) {
                    int t = x[j]; x[j] = x[j + 1]; x[j + 1] = t;
                }
    }

    static void quick(int[] a, int i, int d) {
        int iz = i, de = d, p = a[(i + d) / 2];
        while (iz <= de) {
            while (a[iz] < p) iz++;
            while (a[de] > p) de--;
            if (iz <= de) { int t = a[iz]; a[iz] = a[de]; a[de] = t; iz++; de--; }
        }
        if (i < de) quick(a, i, de);
        if (iz < d) quick(a, iz, d);
    }

    static void merge(int[] a, int i, int d) {
        if (i >= d) return;
        int m = (i + d) / 2;
        merge(a, i, m); merge(a, m + 1, d);
        int[] t = new int[d - i + 1];
        int x = i, y = m + 1, z = 0;
        while (x <= m && y <= d) t[z++] = a[x] < a[y] ? a[x++] : a[y++];
        while (x <= m) t[z++] = a[x++];
        while (y <= d) t[z++] = a[y++];
        for (z = 0; z < t.length; z++) a[i + z] = t[z];
    }

    static void shell(int[] a) {
        for (int g = a.length / 2; g > 0; g /= 2)
            for (int i = g; i < a.length; i++) {
                int t = a[i], j = i;
                while (j >= g && a[j - g] > t) { a[j] = a[j - g]; j -= g; }
                a[j] = t;
            }
    }
}

    


    
    
    




