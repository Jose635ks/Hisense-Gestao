# 📺 Hisense — Sistema de Gestão de Aparelhos

Sistema de gestão de televisões Hisense desenvolvido em Java, que lê dados a partir de um ficheiro, aplica acréscimos de preço para Smart TVs e apresenta estatísticas dos aparelhos.

---

## 📋 Descrição

O programa lê um ficheiro (`Hisense`) com registos de televisões, apresenta a lista de aparelhos, calcula o valor total aplicando um **acréscimo de 20%** nos preços das Smart TVs e conta quantas Smart TVs têm **mais de 50 polegadas**.

---

## ⚙️ Funcionalidades

- 📂 **Leitura de dados** a partir do ficheiro `Hisense`
- 📋 **Listagem** de todas as TVs com código, tipo (Smart/Normal), polegadas e preço
- 💰 **Acréscimo de 20%** no preço das Smart TVs para cálculo do total
- 🔢 **Contagem de Smart TVs** com mais de 50 polegadas
- 📊 **Apresentação de resultados** com o valor total e a contagem

---

## 🗂️ Estrutura do Projeto

```
src/
├── Main.java             # Ponto de entrada da aplicação
├── Aparelhos.java        # Classe modelo da TV (código, smart, polegadas, preço)
└── TodosAparelhos.java   # Lógica de leitura do ficheiro e cálculo dos resultados
```

---

## 📄 Formato do Ficheiro de Entrada

O ficheiro `Hisense` deve ter uma linha por registo, com os campos separados por espaço:

```
Smart/Nao  Codigo  Polegadas  Preco
```

**Exemplo:**
```
Sim 1001 55 25000.00
Nao 1002 43 12000.00
Sim 1003 65 45000.00
```

---

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior

### Passos

1. Clona o repositório:
   ```bash
   git clone https://github.com/teu-utilizador/hisense-gestao-java.git
   ```

2. Certifica-te que o ficheiro `Hisense` está na raiz do projeto.

3. Compila e executa:
   ```bash
   javac src/*.java -d out/
   java -cp out/ Main
   ```

---

## 🖥️ Exemplo de Output

```
Lista de Tvs
Codigo 1001 Smart Sim Polegadas 55 Preco 25,000.00MT
Codigo 1002 Smart Nao Polegadas 43 Preco 12,000.00MT
Codigo 1003 Smart Sim Polegadas 65 Preco 45,000.00MT
Valor total (com Acrescimo nas smart): 82,000.00MT
Numero de smart TVs acima de 50 polegadas: 2
```

---

## 🛠️ Tecnologias Utilizadas

- **Java** — Linguagem de programação
- **FileReader / BufferedReader** — Leitura de ficheiros de texto
- **StringTokenizer** — Parsing de linhas do ficheiro
- **DecimalFormat** — Formatação de valores monetários em MT

---

## 👨‍💻 Autor

Trabalho Prático — Desenvolvido no âmbito da unidade curricular de programação.
