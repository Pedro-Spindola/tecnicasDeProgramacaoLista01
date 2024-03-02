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
 * @brief Class Beecrowd09
 */
public class Beecrowd09 {

    public static void main(String[] args) throws IOException {
 
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            int soma = 0;
            int numb = scanner.nextInt();
            
            for(int j = 1; j < numb; j++){
            if (numb % j == 0) {
                soma = soma + j;
                }
            }
            if (soma == numb){
                System.out.println(numb + " eh perfeito");
            } else {
                System.out.println(numb + " nao eh perfeito");
            }
            
        }
    }
}
