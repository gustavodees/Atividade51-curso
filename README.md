# Análise de Matriz Quadrada em Java

Este projeto consiste em um programa Java simples que lê uma matriz quadrada de números inteiros inserida pelo usuário, exibe os elementos da sua diagonal principal e conta a quantidade de números negativos presentes na matriz.

**Autor:** gustavodees

## Arquivos Incluídos

* `principal/Main.java`: Contém a classe principal com o método `main`, responsável por obter a entrada do usuário, processar a matriz e exibir os resultados.

## Como Usar

1.  **Salve o arquivo:** Salve o código fornecido em um arquivo chamado `Main.java` dentro de uma pasta chamada `principal`.
2.  **Compile o código:** Abra um terminal ou prompt de comando, navegue até o diretório raiz do seu projeto e compile o arquivo Java utilizando o compilador Java:

    ```bash
    javac principal/Main.java
    ```

3.  **Execute o programa:** Após a compilação ser concluída com sucesso, execute a classe `Main` com o comando:

    ```bash
    java principal.Main
    ```

4.  **Entrada de Dados:**
    * O programa primeiro solicitará que você digite a quantidade de linhas (e colunas, já que é uma matriz quadrada) que a matriz terá. Digite um número inteiro e pressione Enter.
    * Em seguida, para cada linha da matriz, o programa pedirá que você digite os elementos da linha, um por um, separados por espaços ou quebras de linha. Para uma matriz de tamanho N x N, você deverá inserir N números para cada uma das N linhas.

5.  **Resultado:** Após inserir todos os elementos da matriz, o programa exibirá:
    * A mensagem "Main Diagonal" seguida pelos elementos da diagonal principal da matriz, separados por espaços.
    * A mensagem "Números negativos:" seguida pela quantidade total de números negativos encontrados na matriz.

## Explicação do Código

### `principal/Main.java`

Este arquivo contém a classe `Main`, que é o ponto de entrada do programa.

* **Método `main`:**
    1.  Cria um objeto da classe `Scanner` para permitir a leitura de dados inseridos pelo usuário no console.
    2.  Declara uma variável inteira `negativo` inicializada com 0, que será utilizada para contar o número de elementos negativos na matriz.
    3.  Lê um número inteiro fornecido pelo usuário, que representa a dimensão `n` da matriz quadrada (tanto o número de linhas quanto o número de colunas).
    4.  Cria uma matriz de inteiros bidimensional chamada `mat` com dimensões `n x n`.
    5.  Utiliza dois loops `for` aninhados para percorrer todas as posições da matriz (linhas de 0 a `n-1` e colunas de 0 a `n-1`).
        * Dentro do loop interno, lê um número inteiro fornecido pelo usuário e o armazena na posição `[i][j]` da matriz.
        * Em seguida, verifica se o número lido é menor que 0. Se for, incrementa o contador `negativo`.
    6.  Imprime a mensagem "Main Diagonal".
    7.  Utiliza um loop `for` para percorrer as linhas da matriz (de 0 a `n-1`). Em cada iteração, acessa o elemento da diagonal principal, que possui o mesmo índice para a linha e a coluna (`mat[i][i]`), e o imprime, seguido de um espaço.
    8.  Após imprimir todos os elementos da diagonal principal, imprime uma quebra de linha.
    9.  Imprime a mensagem "Números negativos:" seguida pelo valor da variável `negativo`, que representa a contagem total de números negativos na matriz.
    10. Fecha o objeto `Scanner` para liberar os recursos.
