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
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 *
 * @author Luís Fernando Siqueira <luisfernandosqueiraadv@gmail.com>
 * @date 01/03/2024
 * @brief Class Exercicio1085Babel
 */

public class Exercicio1085Babel {
    
   static final int INF = 999999;
    static int[][] dist = new int[4005][26];

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        while (true) {
            int N = ler.nextInt();
            if (N == 0) break;

            String origem = ler.next();
            String destino = ler.next();

            Map<String, Integer> mapa = new HashMap<>();
            mapa.put(origem, 1);
            mapa.put(destino, 2);
            final int[] contadorVertice = {3};

            List<List<Par<Integer, String>>> adjacencias = new ArrayList<>();
            for (int i = 0; i < 2 * N + 10; i++) {
                adjacencias.add(new ArrayList<>());
            }

            for (int i = 0; i < N; i++) {
                String idioma1 = ler.next();
                String idioma2 = ler.next();
                String palavra = ler.next();

                int x = mapa.computeIfAbsent(idioma1, k -> contadorVertice[0]++);
                int y = mapa.computeIfAbsent(idioma2, k -> contadorVertice[0]++);

                adjacencias.get(x).add(new Par<>(y, palavra));
                adjacencias.get(y).add(new Par<>(x, palavra));
            }

            for (int i = 0; i < 4005; i++)
                Arrays.fill(dist[i], INF);

            Arrays.fill(dist[1], 0);

            PriorityQueue<Tripla> filaPrioridade = new PriorityQueue<>(Comparator.comparingInt(tripla -> tripla.custo));
            filaPrioridade.add(new Tripla(1, 'a', 0));

            while (!filaPrioridade.isEmpty()) {
                Tripla frente = filaPrioridade.poll();
                int d = frente.custo;
                int v = frente.vertice;
                char cx = frente.ultimoChar;

                for (Par<Integer, String> proximo : adjacencias.get(v)) {
                    char c = proximo.segundo.charAt(0);
                    if (v != 1 && c == cx) continue;

                    if (dist[proximo.primeiro][c - 'a'] > d + proximo.segundo.length()) {
                        dist[proximo.primeiro][c - 'a'] = d + proximo.segundo.length();
                        filaPrioridade.add(new Tripla(proximo.primeiro, c, dist[proximo.primeiro][c - 'a']));
                    }
                }
            }

            int minimo = Arrays.stream(dist[2]).min().getAsInt();
            System.out.println(minimo == INF ? "impossivel" : minimo);
        }
        ler.close();
    }

    static class Par<T1, T2> {
        T1 primeiro;
        T2 segundo;

        Par(T1 primeiro, T2 segundo) {
            this.primeiro = primeiro;
            this.segundo = segundo;
        }
    }

    static class Tripla {
        int vertice;
        char ultimoChar;
        int custo;

        Tripla(int vertice, char ultimoChar, int custo) {
            this.vertice = vertice;
            this.ultimoChar = ultimoChar;
            this.custo = custo;
        }
    }
}
