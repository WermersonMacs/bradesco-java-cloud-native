# 🧮 GeometriaCalc

Projeto Java simples para cálculo de área de figuras geométricas básicas: **Quadrado**, **Retângulo** e **Círculo**.  
O usuário interage com o programa via terminal, escolhendo a forma desejada e inserindo os valores necessários.

---

## 🎯 Objetivo

Exercitar os conceitos de:
- Programação orientada a objetos (POO)
- Interfaces
- Polimorfismo
- Entrada de dados via terminal
- Estrutura de decisão

---

## 📦 Estrutura do Projeto

```
geometriaCalc/
├── Main.java             # Classe principal com menu e entrada de dados
├── GeometricForm.java    # Interface com o método getArea()
├── Square.java           # Implementação da área do quadrado
├── Rectangle.java        # Implementação da área do retângulo
├── Circle.java           # Implementação da área do círculo
```

---

## ⚙️ Como Executar

### Pré-requisitos
- Java JDK 11 ou superior instalado

### Passos

1. Compile os arquivos:

```bash
javac geometriaCalc/*.java
```

2. Execute o programa:

```bash
java geometriaCalc.Main
```

---

## 💻 Exemplo de uso no terminal

```
Escolha a forma geometrica para calcular a area:
1 - Quadrado
2 - Retângulo
3 - Círculo
4 - Sair do programa!
```

Depois, o programa solicitará os valores necessários para o cálculo e exibirá a área calculada.

---

## 📘 Licença

Este projeto é apenas para fins de estudo e prática pessoal. Sinta-se à vontade para usar e modificar.