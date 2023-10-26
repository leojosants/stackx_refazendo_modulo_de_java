# Exercício 01 - Estruturas condicionais e de repetição: Preço de produtos (Swich Case)

    - Faça um programa que receba:
        - Preço;

        - Categoria:
            - 1: limpeza; 
            - 2: alimentação; 
            - 3: vestuário;
        
        - Situação:
            - R: produtos que necessitam de refrigeração;
            - N: produtos que não necessitam de refrigeração
            
    - Calcule e mostre:
        - O valor do aumento, usando as regras que se seguem.
            
            Preço       Categoria   Percentual de aumento
            <= 25       1           5%
                        2           8%
                        3           10%

            > 25        1           12%
                        2           15%
                        3           18%

        - O valor do imposto, usando as regras a seguir.
            - O produto que preencher pelo menos um dos seguintes requisitos pagará imposto equivalente a 5% do preço; caso contrário, pagará 8%. 
            
            - Os requisitos são:
                - Categoria: 2
                - Situação: R

        - O novo preço, ou seja, o preço mais aumento menos imposto.

        - A classificação, usando as regras a seguir.

            Novo preço                  Classificação
            <=R$50,00                   Barato
            Entre R$50,00 e R$120,00    Normal
            >= R4120,00                 Caro