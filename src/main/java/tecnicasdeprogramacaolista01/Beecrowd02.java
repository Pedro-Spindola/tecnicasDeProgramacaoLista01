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
 * @brief Class Beecrowd02
 */
public class Beecrowd02 {

    public static void main(String[] args) throws IOException {
    
    int A, B, C, D;
    Scanner scanner = new Scanner(System.in);
    A = scanner.nextInt();
    B = scanner.nextInt();
    C = scanner.nextInt();
    D = scanner.nextInt();
    
    if(B > C && D > A){
        if((C + D) > (A + B))
        {
            if(C >= 0 && D >= 0)
            {
                if(A % 2 == 0)
                {
                    System.out.println("Valores aceitos");   
                }
                else
                {
                    System.out.println("Valores nao aceitos");
                }
            }
            else
            {
                System.out.println("Valores nao aceitos");
            }
        }
        else
        {
            System.out.println("Valores nao aceitos");
        }
    }
    else
    {
        System.out.println("Valores nao aceitos");
    }
 
    }
}
