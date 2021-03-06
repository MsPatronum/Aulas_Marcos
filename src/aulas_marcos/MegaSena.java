package aulas_marcos;

import javax.swing.*;

public class MegaSena {

    public static void main(String[] args) {

        String entrada = JOptionPane.showInputDialog("Quantos números?");
        int n = Integer.parseInt(entrada);
        int palpite[] = new int[n];

        sortear(palpite);
        classificar(palpite);
        exibir(palpite);

    }

    static void sortear(int[] num) {

        int aux[] = new int[60];

        for (int cont = 0; cont < aux.length; cont++) {
            aux[cont] = cont + 1;
        }
        embaralhar(aux);

        for (int cont = 0; cont < num.length; cont++) {
            num[cont] = aux[cont];
        }

    }

    static void embaralhar(int[] num) {
        for (int cont = 1; cont <= 1000; cont++) {
            int pos1 = (int) (Math.random() * 60);
            int pos2 = (int) (Math.random() * 60);
            int aux = num[pos1];
            num[pos1] = num[pos2];
            num[pos2] = aux;
        }
    }

    static void classificar(int[] num) {
        for (int x = 0; x < num.length - 1; x++) {
            for (int y = x + 1; y < num.length; y++) {
                if (num[x] > num[y]) {
                    int aux = num[x];
                    num[x] = num[y];
                    num[y] = aux;
                }
            }
        }
    }

    static void exibir(int[] num) {
        for (int x : num) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
