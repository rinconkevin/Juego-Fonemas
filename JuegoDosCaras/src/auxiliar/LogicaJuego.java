/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author Dark
 */
public class LogicaJuego {

    public int[] getCardNumbers() {

        int[] numbers = new int[16];
        int count = 0;

        while (count < 16) {
            Random r = new Random();
            int na = r.nextInt(8) + 1;
            int nvr = 0;

            for (int i = 0; i < 16; i++) {
                if (numbers[i] == na) {
                    nvr++;
                }
            }
            if (nvr < 2) {
                numbers[count] = na;
                count++;
            }//fin

        }

        return numbers;
    }

    public Stack<Integer> obtenerCartas() {
        int pos;
        int nCartas = 8;
        Stack< Integer> pCartas = new Stack< Integer>();
        for (int i = 0; i < nCartas; i++) {
            pos = (int) Math.floor(Math.random() * nCartas);
            while (pCartas.contains(pos)) {
                pos = (int) Math.floor(Math.random() * nCartas);
            }
            pCartas.push(pos);
        }
        System.out.println("Núm. aleatorios sin repetición:");
        System.out.println(pCartas.toString());
        return pCartas;
    }

}
