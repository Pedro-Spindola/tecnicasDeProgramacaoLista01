/*
 * Copyright (C) 2024 Pedro Spindola
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package tecnicasdeprogramacaolista01;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Pedro Spindola
 * @date 02/03/2024
 * @brief Class Beecrowd14
 */
public class Beecrowd14 {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int N;

        while ((N = ler.nextInt()) != 0) { // Enquanto N não for zero
            while (true) {
                int proximoVagaoDesejado = ler.nextInt(); // Próximo vagão desejado
                if (proximoVagaoDesejado == 0) { // Se o primeiro número da sequência for 0, termina o caso de teste
                    System.out.println();
                    break;
                }

                Stack<Integer> station = new Stack<>(); // Pilha para simular a via de escape
                int a = 1; // Próximo vagão a entrar na estação
                boolean possivel = true;

                for (int i = 0; i < N; i++) {
                    int vagaoDesejado = (i == 0) ? proximoVagaoDesejado : ler.nextInt(); // Vagão desejado

                    while (a <= N && (station.isEmpty() || station.peek() != vagaoDesejado)) {
                        station.push(a++); // Empurra o próximo vagão para a pilha
                    }

                    if (station.peek() == vagaoDesejado) {
                        station.pop(); // Retira o vagão da pilha se corresponder ao desejado
                    } else {
                        possivel = false; // Se não for possível retirar o vagão desejado, a sequência é impossível
                        break;
                    }
                }

                System.out.println(possivel ? "Yes" : "No");
                if (ler.hasNextLine()) {
                    ler.nextLine(); // Prepara para o próximo caso de teste
                }
            }
        }

        ler.close();
    }
}
