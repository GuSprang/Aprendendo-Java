public static void main(String[] args) { //Método main, por onde o programa começará a ser lido
    System.out.println("Hello World");   // Comando para exibir mensagens no console
    // Tipos de Variáveis
    byte numeroInteiroP = 8;             // byte é uma váriavel que comporta apenas números inteiros de ate 8 bits
    short numeroInteiroM = 16;           // byte é uma váriavel que comporta apenas números inteiros de ate 16 bits
    int numeroInteiro = 10;              // int é uma variável que comporta apenas números inteiros de até 32 bits
    long numeroInteiroGG = 233;          // long é uma váriavel que comporta apenas números inteiso de até 64 bits
    double numeroDecimal = 3.1415;       // double é uma variável que comporta números inteiros e decimais, porém números inteiros adicionados a essa variável receberão um ".0" EX: 10 - 10.0
    boolean verdadeiro = true;           // boolean é uma variável que comporta apenas "true" para verdadeiro e "falso" para falso
    String texto = "Ola!";               //String é uma "variável" que comporta apenas textos

    System.out.println(texto);           // Esse comando também pode imprimir variáveis

                                         // uma variável pode armazenar o valor do resultado de uma operação entre números ou entre outras variáveis

    int ex1 = 1 + 1;                     // resultado esperado: 2
    System.out.println(ex1);
    int ex2 = numeroInteiro + 3;
    System.out.println(ex2);             // resultado esperado: 3
    int ex3 = numeroInteiro + numeroInteiroP;

                                         // as operações também podem ser feitas de dentro do comando de exibir texto, porém isso não é recomendado

    System.out.println(numeroInteiro + 7);

                                         // na programação, aluns caracteres usados para realizar as operações são um pouco diferentes dos convencionais:
                                         // Adição -> +  |  Subtração -> -  |  Divisão -> /  |  Multiplicação -> *
                                         //Exemplos:

    int soma = 2 + 1;
    int subtracao = 2 - 1;
    int divisao = 2 / 1;
    int multiplicacao = 2 * 1;



}