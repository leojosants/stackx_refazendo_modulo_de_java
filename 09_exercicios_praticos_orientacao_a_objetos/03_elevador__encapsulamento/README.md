# Exercício 03 - Elevador (Encapsulamento)

    - Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. 
    
    - A classe deve armazenar:
        - O andar atual (térreo = 0);
        
        - Total de andares no prédio (desconsiderando o térreo);
        
        - Capacidade do elevador;
        
        - Quantas pessoas estão presentes nele;
        
    
    - A classe deve também disponibilizar os seguintes métodos:
        - Inicializa: 
            - Que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
        
        - Entra: 
            - Para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);

        - Sai: 
            - Para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);

        - Sobe: para subir um andar (não deve subir se já estiver no último andar);

        - Desce: para descer um andar (não deve descer se já estiver no térreo);

    - Encapsular todos os atributos da classe (criar os métodos get e set). 