# 📌 Descrição

Este repositório apresenta a implementação da estrutura de dados **Fila (Queue)** em Java, utilizando duas abordagens distintas: **Fila Estática** e **Fila Dinâmica**. O projeto foi desenvolvido com o objetivo de praticar conceitos fundamentais de Estruturas de Dados, incluindo o princípio FIFO (First In, First Out), manipulação de arrays circulares, gerenciamento de nós encadeados e implementação de interfaces genéricas.

A aplicação implementa operações essenciais de uma fila, como inserção, remoção, consulta do primeiro e último elemento, verificação de tamanho, limpeza da estrutura e validação de estado vazio. Também foram desenvolvidos testes para verificar o comportamento correto das implementações em diferentes cenários.

---

# 🛠 Recursos Utilizados

Linguagem: Java
IDE: IntelliJ IDEA
Controle de versão: Git
Plataforma de hospedagem: GitHub

---

# 📋 Estrutura do Código

## 🔹 Interface Queue<T>

Define as operações principais da fila, incluindo:

* Inserção de elementos (`push`)
* Remoção de elementos (`pop`)
* Consulta do primeiro elemento (`peek`)
* Consulta do último elemento (`back`)
* Verificação de tamanho (`size`)
* Verificação de fila vazia (`isEmpty`)
* Limpeza da estrutura (`clear`)

---

## 🔹 Classe StaticQueue<T>

Responsável pela implementação da fila estática utilizando um array circular, contendo:

* Controle dos índices `head` e `tail`
* Reaproveitamento de posições através de aritmética modular
* Controle de capacidade máxima
* Tratamento de Overflow (fila cheia)

---

## 🔹 Classe LinkedQueue<T>

Responsável pela implementação da fila dinâmica utilizando lista encadeada, contendo:

* Referência para o primeiro elemento da fila
* Referência para o último elemento da fila
* Gerenciamento dinâmico de memória
* Crescimento conforme a necessidade da aplicação

---

## 🔹 Classe QueueNode<T>

Representa os nós utilizados pela fila dinâmica, contendo:

* Valor armazenado
* Referência para o próximo nó da fila

---

## 🔹 Classes Exercise01 até Exercise05

Responsáveis pela execução prática dos exercícios propostos, demonstrando o funcionamento das operações implementadas nas filas estática e dinâmica.

Cada classe realiza testes específicos relacionados aos cenários solicitados.

---

## 🔹 Classe QueueTests

Responsável pelos testes gerais da aplicação, validando:

* Inserção de elementos
* Remoção de elementos
* Comportamento FIFO
* Tratamento de Overflow
* Tratamento de Underflow
* Funcionamento dos métodos auxiliares da fila

---

# ⚙️ Observações sobre a implementação

* Estrutura FIFO (First In, First Out)
* Implementação genérica utilizando `<T>`
* Uso de array circular na fila estática
* Uso de nós encadeados na fila dinâmica
* Separação entre interface, estrutura, exercícios e testes
* Organização em packages padronizados em inglês
* Tratamento de exceções para filas vazias e filas cheias

---

# ▶️ Exemplos de Execução

```text
Fila:
10 -> 20 -> 30

Elemento removido:
10

Fila após remoção:
20 -> 30

Primeiro elemento:
20

Último elemento:
30
```

---

# 👨‍💻 Autor

Marcos Antonio de Oliveira Filho
Curso: Análise e Desenvolvimento de Sistemas
Disciplina: Estrutura de Dados I
