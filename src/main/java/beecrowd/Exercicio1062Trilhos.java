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
 * @brief Class Exercicio1062Trilhos
 */

public class Exercicio1062Trilhos {
    
    public static void main(String[] args) {
        
    Scanner ler = new Scanner(System.in);
        int N;

        while ((N = ler.nextInt()) != 0) { 
            while (true) {
                int proximoVagaoDesejado = ler.nextInt(); 
                if (proximoVagaoDesejado == 0) { 
                    System.out.println();
                    break;
                }

                Stack<Integer> station = new Stack<>(); 
                int a = 1; 
                boolean possivel = true;

                for (int i = 0; i < N; i++) {
                    int vagaoDesejado = (i == 0) ? proximoVagaoDesejado : ler.nextInt();

                    while (a <= N && (station.isEmpty() || station.peek() != vagaoDesejado)) {
                        station.push(a++); 
                    }

                    if (station.peek() == vagaoDesejado) {
                        station.pop(); 
                    } else {
                        possivel = false; 
                        break;
                    }
                }

                System.out.println(possivel ? "Yes" : "No");
                if (ler.hasNextLine()) ler.nextLine(); 
            }
        }
        
        ler.close();
    }
}


