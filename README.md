# Padrões de Projeto

## Padrões criacionais

### Singleton

O Singleton é um padrão de projeto criacional que permite a você garantir que uma classe tenha apenas uma instância, enquanto provê um ponto de acesso global para essa instância.
 - Uma classe fachada pode frequentemente ser transformada em uma singleton já que um único objeto fachada é suficiente na maioria dos casos.
 - As Fábricas Abstratas, Construtores, e Protótipos podem todos ser implementados como Singletons.

## Padrões comportamentais

## Padrões estruturais
O Facade é um padrão de projeto estrutural que fornece uma interface simplificada para uma biblioteca, um framework, ou qualquer conjunto complexo de classes.
- O Facade define uma nova interface para objetos existentes, enquanto que o Adapter tenta fazer uma interface existente ser utilizável. O Adapter geralmente envolve apenas um objeto, enquanto que o Facade trabalha com um inteiro subsistema de objetos.
- O Abstract Factory pode servir como uma alternativa para o Facade quando você precisa apenas esconder do código cliente a forma com que são criados os objetos do subsistema.
