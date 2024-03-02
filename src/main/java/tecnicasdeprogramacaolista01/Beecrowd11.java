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
 * @brief Class Beecrowd11
 */
public class Beecrowd11 {

    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
            int R1 = scanner.nextInt();
            int X1 = scanner.nextInt();
            int Y1 = scanner.nextInt();
            int R2 = scanner.nextInt();
            int X2 = scanner.nextInt();
            int Y2 = scanner.nextInt();
            
            double distanciaCentros = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
            
            if (distanciaCentros + R2 <= R1) {
                System.out.println("RICO");
            } else {
                System.out.println("MORTO");
            }
        }
    }
}
