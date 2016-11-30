/**
 *
 */
package com.trete.cs20162.aula11;

import com.github.kyriosdata.parser.Lexer;
import com.github.kyriosdata.parser.Parser;

/**
  *Classe utilizada para realizar as operações matemáticas com os parâmetros
  *inseridos.
*/
public class Calcular {
    public static void main(String[] args) {
        Calcular calculo = new Calcular();
        int saida = Calcular.calcula(args[0]);
        if(saida == 0) {
            System.out.println(resultado);
        }

        System.exit(saida);
    }
    private static float resultado;
    /**
      *Método que calcula o resultado da expressão inserida.
     * @param expressao é a expressão que terá o resultado calculado.
     * @return o resultado da expressão.
     */
    public static int calcula(String expressao) {
        try {
            Lexer tokens = new Lexer(expressao);
            Parser parser = new Parser(tokens.tokenize());
            resultado = parser.expressao().valor();
            return 0;
        } catch(Exception ex) {
            System.out.println("insira uma expresão válida");
            return 1;
        }
    }
}
