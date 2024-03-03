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
 * @brief Class Exercicio1039FloresDeFogo
 */

public class Exercicio1039FloresDeFogo {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        while (ler.hasNext()) {
            int raioFogo = ler.nextInt();
            int centroXFogo = ler.nextInt();
            int centroYFogo = ler.nextInt();
            int raioFlor = ler.nextInt();
            int centroXFlor = ler.nextInt();
            int centroYFlor = ler.nextInt();

            double distancia = Math.sqrt(Math.pow(centroXFlor - centroXFogo, 2) + Math.pow(centroYFlor - centroYFogo, 2));

            if (distancia <= raioFogo - raioFlor) {
                System.out.println("RICO");
            } else {
                System.out.println("MORTO");
            }
        }
       ler.close();
    }
}

