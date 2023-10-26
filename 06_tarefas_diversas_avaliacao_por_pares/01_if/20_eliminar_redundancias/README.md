# Exercício 20 - Eliminar redundâncias (IF)

    - Elimine os testes reduntantes do trecho de código abaixo:

        - Exemplo 1
            Linha 1     se (a > b) entao
            Linha 2         escreva("o maior é", a);
            Linha 3     senao
            Linha 4         se (b >= a) entao
            Linha 5             escreva("o maior é", b);
            Linha 6         fimse
            Linha 7     fimse

        - Exemplo 2:
            Linha 1     se (x > 10) entao
            Linha 2         escreva("Valor maior do que 10");
            Linha 3     senao
            Linha 4         se (x <= 10 && x > 5) entao
            Linha 5             escreva("Menor ou igual a 10 e maior do que 5);
            Linha 6         senao
            Linha 7             se (x <= 5) entao
            Linha 8                 mostre("Menor ou igual a 5");
            Linha 9             fimse
            Linha 10        fimse
            Linha 11    fimse