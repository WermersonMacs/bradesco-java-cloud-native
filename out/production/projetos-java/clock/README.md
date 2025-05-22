# Projeto Clock - Conversao de Horarios BRL/US

Este projeto em Java simula dois tipos de relogios: um no formato brasileiro (24 horas) e outro no formato americano (12 horas com AM/PM). Ele tambem permite converter os horarios entre esses dois formatos de forma orientada a objetos, utilizando recursos modernos da linguagem, como **classes seladas** e **pattern matching**.

## 📦 Estrutura do Projeto

```
clock/
├── MainClock.java
├── Clock.java
├── BRLClock.java
└── USClock.java
```

## 🚀 Como Funciona

- `Clock`: classe abstrata selada que define os atributos e metodos comuns aos dois tipos de relogio.
- `BRLClock`: implementacao do relogio brasileiro no formato 24 horas.
- `USClock`: implementacao do relogio americano no formato 12 horas com indicacao de AM ou PM.
- `MainClock`: classe principal que instancia um relogio BRL, define o horario, e mostra a conversao para o formato americano.

## ✅ Funcionalidades

- Definicao e formatacao de horas, minutos e segundos.
- Conversao automatica de BRL para US e vice-versa.
- Validacao de limites para hora (max 24), minuto e segundo (max 60).
- Uso de classes seladas para limitar quem pode estender `Clock`.

## 🛠️ Tecnologias Usadas

- Java 17 ou superior (necessario para suportar `sealed`, `non-sealed` e `switch pattern matching`)
- Orientacao a Objetos
- Padrao de projeto: Conversor

## 🧪 Exemplo de Saida

```
13:00:00
01:00:00 PM
```

## 📚 Possiveis Expansoes

- Suporte a outros fusos horarios
- Interface grafica para selecionar e converter horarios
- Internacionalizacao com diferentes linguagens

## 📄 Licenca

Este projeto esta sob a licenca MIT. Sinta-se livre para usar, modificar e compartilhar.