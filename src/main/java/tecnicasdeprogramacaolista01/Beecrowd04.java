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
import java.io.IOException;
import java.util.*;

/**
 *
 * @author Pedro Spindola
 * @date 02/03/2024
 * @brief Class Beecrowd04
 */
public class Beecrowd04 {

    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();

        if (numero >= 0 && numero <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (numero > 50 && numero <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
 
    }
}
