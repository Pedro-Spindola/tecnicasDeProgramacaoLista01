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
 * @brief Class Beecrowd05
 */
public class Beecrowd05 {

    public static void main(String[] args) throws IOException {
     
    Scanner scanner = new Scanner(System.in);
    
    double x = scanner.nextDouble();
    double y = scanner.nextDouble();
    
    String resul = "";
    if (x == 0 && y == 0){
        resul = "Origem";
    } else if (y == 0){
        resul = "Eixo X";
    } else if (x == 0){
        resul = "Eixo Y";
    } else if (x > 0 && y > 0){
        resul = "Q1";
    } else if (x < 0 && y > 0){
        resul = "Q2";
    } else if (x < 0 && y < 0){
        resul = "Q3";
    } else if (x > 0 && y < 0){
        resul = "Q4";
    }
    
    System.out.println(resul);
    
    }
}
