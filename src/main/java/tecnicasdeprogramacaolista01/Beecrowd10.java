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
 * @brief Class Beecrowd10
 */
public class Beecrowd10 {

    public static void main(String[] args) throws IOException {
 
    Scanner scanner = new Scanner(System.in);
    
    while (scanner.hasNext()) {
        int M = 0;
        int L = scanner.nextInt();
        
        for (int i = 0; i < L; i++){
                int V = scanner.nextInt();
                if (V > M){
                    M = V;
                }
            }
            if (M >= 20){
                System.out.println("3");
            } else if (M >= 10){
                System.out.println("2");
            } else {
                System.out.println("1");
            }
        }
    }
}
