public class App {
    public static void main(String[] args) throws Exception {
        App.arithmeticOperators(10, 5);
        App.comparationOperators(10, 5);
        App.booleanOperators(true, false);
        System.out.println();
        System.out.println("Classe Math");
        App.classMath(10.85, 50.258, -15.01);
    }

    private static void arithmeticOperators(int numb1, int numb2) {
        // sum
        int numTotal = numb1 + numb2;
        System.out.println(numTotal);
        // subtraction
        numTotal = (numb1 - numb2);
        System.out.println(numTotal);
        // division
        numTotal = (numb1 / numb2);
        System.out.println(numTotal);
        // multiplication
        numTotal = numb1 * numb2;
        System.out.println(numTotal);
    }

    private static void comparationOperators(int numb1, int numb2) {
        System.out.println("numb1 = " + numb1 + ", " + "numb2 = " + numb2);

        // equals
        String flag = ("numb1 == numb2 => " + (numb1 == numb2));
        System.out.println(flag);

        // different
        flag = ("numb1 != numb2 => " + (numb1 != numb2));
        System.out.println(flag);

        // bigger then
        flag = ("numb1 > numb2 =>" + (numb1 > numb2));
        System.out.println(flag);

        // greater or equal to
        flag = ("numb1 >= numb2 => " + (numb1 >= numb2));
        System.out.println(flag);

        // less than
        flag = ("numb1 < numb2 => " + (numb1 < numb2));
        System.out.println(flag);

        // less than or equal to
        flag = ("numb1 <= numb2 => " + (numb1 <= numb2));
        System.out.println(flag);
    }

    private static void booleanOperators(boolean oper1, boolean oper2) {
        // and operator
        boolean result = oper1 && oper2;
        System.out.println(oper1 + " && " + oper2 + " = " + result);

        // or operator
        result = oper1 || oper2;
        System.out.println(oper1 + " || " + oper2 + " = " + result);

        // xor operator
        result = oper1 ^ oper2;
        System.out.println(oper1 + " ^ " + oper2 + " = " + result);

        // not operator
        System.out.println("not " + oper1 + " = " + !oper1 + ",  not " + oper2 + " = " + !oper2);
    }

    /**
     * Class Math
     * java.lang.Object
     * java.lang.Math
     * public final class Math
     * extends Object
     * 
     * A classe Math contém métodos para realizar operações numéricas básicas, como
     * exponencial elementar, logaritmo, raiz quadrada e funções trigonométricas.
     * Ao contrário de alguns métodos numéricos da classe StrictMath, todas as
     * implementações das funções equivalentes da classe Math não são definidas para
     * retornar os mesmos resultados bit a bit. Esse relaxamento permite
     * implementações de melhor desempenho onde a reprodutibilidade estrita não é
     * necessária.
     * 
     * Por padrão, muitos dos métodos Math simplesmente chamam o método equivalente
     * em StrictMath para sua implementação. Os geradores de código são incentivados
     * a usar bibliotecas nativas específicas da plataforma ou instruções de
     * microprocessador, quando disponíveis, para fornecer implementações de métodos
     * Math de alto desempenho. Essas implementações de alto desempenho ainda devem
     * estar em conformidade com a especificação para Math.
     * 
     * A qualidade das especificações de implementação diz respeito a duas
     * propriedades, precisão do resultado retornado e
     * monotonicidade do método. A precisão dos métodos matemáticos de ponto
     * flutuante é medida em termos de ulps, unidades em
     * último lugar. Para um determinado formato de ponto flutuante, um ulp de um
     * valor de número real específico é a
     * distância entre os dois valores de ponto flutuante que delimitam esse valor
     * numérico. Ao discutir a precisão de um
     * método como um todo em vez de um argumento específico, o número de ulps
     * citados é para o erro de pior caso em qualquer
     * argumento. Se um método sempre tiver um erro menor que 0,5 ulps, o método
     * sempre retornará o número de ponto flutuante
     * mais próximo do resultado exato; tal método é arredondado corretamente. Um
     * método corretamente arredondado é geralmente
     * o melhor que uma aproximação de ponto flutuante pode ser; no entanto, é
     * impraticável que muitos métodos de ponto
     * flutuante sejam arredondados corretamente. Em vez disso, para a classe Math,
     * um limite de erro maior de 1 ou 2 ulps é
     * permitido para determinados métodos. Informalmente, com um limite de erro de
     * 1 ulp, quando o resultado exato é um
     * número representável, o resultado exato deve ser retornado como o resultado
     * calculado; caso contrário, qualquer um dos
     * dois valores de ponto flutuante que delimitam o resultado exato pode ser
     * retornado. Para resultados exatos de grande
     * magnitude, uma das extremidades do suporte pode ser infinita. Além da
     * precisão em argumentos individuais, manter
     * relações adequadas entre o método em argumentos diferentes também é
     * importante. Portanto, a maioria dos métodos com
     * mais de 0,5 erros ulp devem ser semi-monotônicos: sempre que a função
     * matemática não é decrescente, a aproximação de
     * ponto flutuante também o é, da mesma forma, sempre que a função matemática
     * não é crescente, o mesmo acontece com a
     * aproximação de ponto flutuante. -aproximação de pontos. Nem todas as
     * aproximações com precisão de 1 ulp atenderão
     * automaticamente aos requisitos de monotonicidade.
     * 
     * A plataforma usa aritmética inteira de complemento de dois com sinais com
     * tipos primitivos int e long. O desenvolvedor deve escolher o tipo primitivo
     * para garantir que as operações aritméticas produzam resultados corretos
     * consistentemente, o que em alguns casos significa que as operações não
     * excederão o intervalo de valores da computação. A melhor prática é escolher o
     * tipo primitivo e o algoritmo para evitar estouro. Nos casos em que o tamanho
     * é int ou long e erros de estouro precisam ser detectados, os métodos
     * addExact, subtrairExato, multiplicarExato e toIntExact lançam uma
     * ArithmeticException quando os resultados estouram. Para outras operações
     * aritméticas, como divisão, valor absoluto, incremento, decremento e negação,
     * o estouro ocorre apenas com um valor mínimo ou máximo específico e deve ser
     * verificado em relação ao mínimo ou máximo conforme apropriado.
     * 
     * Desde: * JDK1.0
     */
    private static void classMath(double number1, double number2, double negativeNumber) {
        // abs Retorna o valor absoluto de um valor int, double, float e long (qualquer
        // valor negativo numérico).
        System.out.println(Math.abs(negativeNumber));
        // acos Retorna o arco cosseno de um valor; o ângulo retornado está no intervalo
        // de 0,0 a pi. Caso especial: Se o argumento for NaN ou seu valor absoluto for
        // maior que 1, o resultado será NaN. O resultado calculado deve estar dentro de
        // 1 ulp do resultado exato. Os resultados devem ser semi-monotônicos.
        System.out.println(Math.acos(0.005));
        // addExact Retorna a soma de seus argumentos, lançando uma exceção se o
        // resultado estourar um int.
        System.out.println(Math.addExact(100, 200));
        // max number
        System.out.println(Math.max(number1, number2));
        // min number
        System.out.println(Math.min(number1, number2));
        // round number
        System.out.println(Math.round(number1));
        // round max
        System.out.println(Math.ceil(number2));
        // round min
        System.out.println(Math.floor(number2));
        // potetion
        System.out.println(Math.pow(10, 2));
        // randomize
    }
}
