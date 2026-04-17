# ParkingSystem 🚗🏍️🚚

## Visão Geral

Este projeto é um **Sistema de Gerenciamento de Estacionamento** desenvolvido em Java. Ele demonstra conceitos de **Programação Orientada a Objetos (POO)** como **herança, polimorfismo, encapsulamento e uso de enums** através das classes `Vehicle`, `Car`, `Motorcycle`, `Truck`, `ParkingSpace` e `Ticket`.

O sistema permite:
- Registrar veículos e vagas.
- Emitir tickets de entrada e saída.
- Calcular automaticamente o valor da tarifa por hora de acordo com o tipo de veículo.
- Controlar ocupação e liberação de vagas.

---

## Funcionalidades

- **Hierarquia de Veículos**:
  - `Vehicle` (classe abstrata base)
  - `Car` (tarifa R$5/hora)
  - `Motorcycle` (tarifa R$3/hora)
  - `Truck` (tarifa R$10/hora)
- **ParkingSpace (Vaga)**:
  - Armazena número, tipo permitido e status (ocupada ou livre).
  - Permite ocupar e liberar vagas.
- **Ticket (Entrada/Saída)**:
  - Registra horário de entrada e saída.
  - Calcula tempo de permanência e valor total.
  - Exibe informações completas do ticket.
- **Main**:
  - Simula ocupação de vagas e emissão de tickets.
  - Exibe informações de veículos, vagas e valores calculados.

---

## Estrutura do Projeto
com.kauabiscotto.ParkingSystem
├── Vehicle.java        # Classe abstrata base

├── Car.java            # Subclasse para carros

├── Motorcycle.java     # Subclasse para motos

├── Truck.java          # Subclasse para caminhões

├── TipoVaga.java       # Enum para tipos de vaga

├── ParkingSpace.java   # Representa uma vaga de estacionamento

├── Ticket.java         # Representa um ticket de entrada/saída

└── Main.java           # Classe principal para testes

---

## Exemplo de Saída
=== Ticket ===

Veículo: Car {plate='ABC1234', model='Fiesta', year=2015}

Vaga: ParkingSpace{number=1, allowedType=CARRO, taken=true, vehicle=ABC1234}

Entrada: 17/04/2026 20:22:10

Saída:   17/04/2026 20:22:12

Tempo (h): 1

Valor a pagar: R$ 5.0

---

## Como Executar

1. Compile o projeto:
```bash
javac com/kauabiscotto/ParkingSystem/*.java
```

2. Execute a classe principal:
```bash
java com.kauabiscotto.ParkingSystem.Main
```

---

## Conceitos Utilizados

- **Herança**: `Car`, `Motorcycle` e `Truck` herdam de `Vehicle`.
- **Polimorfismo**: cada veículo calcula sua tarifa de forma diferente.
- **Encapsulamento**: atributos privados com getters/setters.
- **Enum**: `TipoVaga` para controlar tipos de vaga permitidos.
