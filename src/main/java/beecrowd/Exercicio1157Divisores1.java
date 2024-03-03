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
import java.util.Locale;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 03/03/2024
 * @brief Class Exercicio1157Divisores1
 */
public class Exercicio1157Divisores1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner ler = new Scanner(System.in);

        int n;

        n = ler.nextInt();

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {

                System.out.println(i);
            }
        }

        ler.close();
    }

}
