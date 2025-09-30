# 📊 Sistema de Cálculo de Impostos em Java  

Este projeto é um sistema simples para cálculo de **impostos de contribuintes**, desenvolvido em **Java**, com foco em **programação orientada a objetos (POO)**.  
Ele permite cadastrar **pessoas físicas e jurídicas**, calcular seus impostos de acordo com regras específicas e exibir o total arrecadado.  

---

## 📋 Funcionalidades  

- Cadastro de contribuintes (**Pessoa Física ou Pessoa Jurídica**).  
- Cálculo de imposto com regras diferentes para cada tipo:  
  - **Pessoa Física**:  
    - Renda < 20.000 → taxa de **15%**.  
    - Renda ≥ 20.000 → taxa de **25%**.  
    - Gastos com saúde geram abatimento de **50%** do valor gasto.  
  - **Pessoa Jurídica**:  
    - Até 10 funcionários → taxa de **16%**.  
    - Mais de 10 funcionários → taxa de **14%**.  
- Exibição do imposto individual de cada contribuinte.  
- Cálculo do **total de impostos** arrecadados.  

---

## 🔹 Classes principais  

- **Contribuintes (abstrata)** → Classe base com atributos comuns (nome e renda anual).  
- **PessoaFisica** → Subclasse que representa pessoas físicas (com gastos com saúde).  
- **PessoaJuridica** → Subclasse que representa pessoas jurídicas (com quantidade de funcionários).  
- **ProgramaPrincipal** → Classe principal com a lógica de cadastro, cálculo e exibição dos resultados.  

---

## ⚙️ Tecnologias e Conceitos Aplicados  

- **Java SE 24+**  
- Programação Orientada a Objetos (**POO**)  
- **Herança** e **Polimorfismo**  
- **Classes Abstratas** e sobrescrita de métodos  
- Uso de listas dinâmicas com **ArrayList**  
- Entrada e saída de dados com **Scanner**  

---

## 💡 Exemplo de Execução  

### Entrada:  

Insira o numero de contribuintes: 2

Dados do 1 contribuinte:
Pessoa Fisica ou Juridica(F/J)? F
Nome: Maria
Renda anual: 18000
Gastos com Saude: 2000

Dados do 2 contribuinte:
Pessoa Fisica ou Juridica(F/J)? J
Nome: SoftTech
Renda anual: 400000
Quantidade de funcionarios: 25

### Saída no Terminal:

IMPOSTOS PAGOS:
Maria: $ 2200.00
SoftTech: $ 56000.00

TOTAL DE IMPOSTOS: $ 58200.00


## 👨‍💻 Autor  

**João Neto**  

📧 Email: neto31510@gmail.com 
📱 Telefone: (34) 99683-2626  
🔗 LinkedIn: https://www.linkedin.com/in/joao-rodrigues-neto-855757293


