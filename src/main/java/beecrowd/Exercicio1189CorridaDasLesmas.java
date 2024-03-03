/*
 * Copyright (C) 2024 Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
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

package beecrowd;
import java.util.*;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 01/03/2024
 * @brief Class Exercicio1189CorridaDasLesmas
 */

public class Exercicio1189CorridaDasLesmas {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int qlesmas = ler.nextInt();
        int qcorridas = ler.nextInt();
        
        int[][] velocidades = new int[qlesmas][qcorridas]; // Matriz para armazenar as velocidades das 3 lesmas

        for (int i = 0; i < qlesmas; i++) { // Loop para cada lesma

            for (int j = 0; j < qcorridas; j++) { // Loop para ler as 10 velocidades de cada lesma
                velocidades[i][j] = ler.nextInt(); // Armazena a velocidade na matriz
            }
        }

        for (int i = 0; i < qlesmas; i++) { // Loop para cada lesma
            int maiorVelocidade = 0;

            for (int j = 0; j < qcorridas; j++) { // Loop para verificar a maior velocidade de cada lesma
                if (velocidades[i][j] > maiorVelocidade) {
                    maiorVelocidade = velocidades[i][j];
                }
            }

            int level;
            if (maiorVelocidade < 10) {
                level = 1;
            } else if (maiorVelocidade < 20) {
                level = 2;
            } else {
                level = 3;
            }

            System.out.println(level);
        }

        ler.close();
    }
}