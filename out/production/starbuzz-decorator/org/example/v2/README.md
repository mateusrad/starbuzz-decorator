# Padrão de Projeto Decorator: Starbuzz Coffee

Este projeto é uma implementação do padrão de projeto **Decorator**, utilizando o problema de exemplo da cafeteria Starbuzz Coffee.

## Sobre o Padrão Decorator

O padrão **Decorator** é um padrão de projeto estrutural que permite adicionar novas funcionalidades a objetos existentes dinamicamente, sem alterar sua estrutura. Ele é uma alternativa flexível à herança, resolvendo problemas como a "explosão de subclasses" que ocorre quando se tenta adicionar muitas combinações de funcionalidades usando herança tradicional.

No nosso exemplo, as bebidas são o **componente base**, e os condimentos (Mocha, Soy, Whip) são os **decoradores**, que podem ser combinados para criar uma variedade infinita de pedidos.

## Estrutura do Projeto

O projeto está organizado em um pacote `starbuzz` e contém as seguintes classes:

- **`Beverage.java`**: A classe abstrata base para todas as bebidas.
- **`DarkRoast.java`, `Expresso.java`, `HauseBlend.java`**: Classes concretas que representam as bebidas (componentes).
- **`CondimentDecorator.java`**: A classe abstrata para todos os condimentos (decoradores).
- **`Mocha.java`, `Soy.java`, `Whip.java`**: Classes concretas que representam os condimentos (decoradores).
- **`StarbuzzCoffe.java`**: A classe principal que demonstra o uso do padrão Decorator.
