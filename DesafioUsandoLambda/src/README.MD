# 💻 Desafio Java – Cálculo de Preço Final com Programação Funcional

Este projeto foi desenvolvido como um desafio para praticar **Programação Funcional em Java**, utilizando:

- `Function`
- `UnaryOperator`
- Expressões Lambda
- Encadeamento com `andThen()`

O objetivo é aplicar regras de negócio de forma encadeada até gerar um valor final formatado.

---

# 🎯 Regras do Desafio

A partir de um objeto `Produto`, o sistema deve:

1. Calcular o preço real aplicando o desconto.
2. Aplicar imposto municipal:
    - Se o valor for **≥ 2500** → acréscimo de **8,5%**
    - Se for **< 2500** → isento
3. Calcular frete:
    - Se o valor for **≥ 3000** → R$ 100
    - Se for **< 3000** → R$ 50
4. Arredondar para duas casas decimais.
5. Formatar no padrão brasileiro: R$ 1234,56


---

# 🧠 Conceitos Praticados

- Programação funcional
- Encadeamento de funções
- Regras condicionais com operador ternário
- Arredondamento numérico
- Formatação monetária
- Organização de fluxo de processamento

---
# 🔄 Fluxo do Processamento
Produto
->
Aplicar Desconto
->
Aplicar Imposto
->
Calcular Frete
->
Arredondar
->
Formatar
->
Resultado Final
---

# 📦 Estrutura do Projeto

- Desafio.java
- Produto.java


---
# 📤 Exemplo de Saída
### O preço final é: R$ 1756,38

---
# 🚀 Aprendizados

### Durante o desenvolvimento deste desafio foi possível:

- Trabalhar com funções como cidadãos de primeira classe

- Entender melhor o uso de Function e UnaryOperator

- Aplicar encadeamento com andThen()

- Organizar regras de negócio de forma limpa e legível

- Evitar código imperativo repetitivo
---

# 📚 Possíveis Melhorias Futuras

1. Utilizar BigDecimal para maior precisão financeira
2. Implementar testes unitários com JUnit
3. Separar regras de negócio em camadas
4. Aplicar Locale para internacionalização
 