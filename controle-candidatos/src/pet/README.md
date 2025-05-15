
# PetMachine

Projeto simples em Java que simula uma máquina para dar banho em pets.

## Descrição

Este projeto implementa uma classe `PetMachine` que pode receber um `Pet`, dar banho nele usando água e shampoo, e controlar o estado da máquina (limpa ou suja). Também há uma classe `Pet` que representa o pet com nome e estado de limpeza.

## Funcionalidades

- Colocar um pet na máquina (apenas se a máquina estiver limpa e sem outro pet)
- Dar banho no pet (usa água e shampoo, deixa o pet limpo)
- Abastecer a máquina com água e shampoo (até o limite máximo)
- Verificar a quantidade de água e shampoo disponíveis
- Verificar se há um pet na máquina
- Remover o pet da máquina, mostrando se está limpo ou sujo
- Limpar a máquina (gasta água e shampoo)

## Como usar

1. Compile as classes `Pet.java`, `PetMachine.java` e `MainPet.java`.
2. Execute a classe `MainPet` que apresenta um menu para interagir com a máquina.
3. Siga as instruções do menu para colocar pets, dar banho e gerenciar a máquina.

## Exemplo de uso


## Requisitos

- Java 8 ou superior

## Estrutura do projeto

- `Pet.java` - Classe que representa o pet
- `PetMachine.java` - Classe que simula a máquina de banho
- `MainPet.java` - Classe com interface de linha de comando para interagir com a máquina
 
