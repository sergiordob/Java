<p align="center">
  <img src="./Capa.png" alt="Texto Alternativo">
</p>

# Descrição:

- Atualize o projeto 01 a

## Tópicos abordados:

- Tipos de dados (Secção 4.3)
- Criar classes/objectos (Secção 4.2)
- Variáveis de instância/campos (Secção 4.2)
- Construtores (Secção 4.2)
- Métodos (getters/acessores, setters/mutadores) (Secção 4.2)
- Sobrecarga (Secção 4.2)
- Classes principais/de teste (Secção 4.2)
- toString() (Secção 4.4)
- Entrada por meio de teclado (Secção 5.1)
- Operadores booleanos e ternários (Secção 5.1)

### Instruções

1 - Modifique a classe de teste:

a) Adicione um Scanner chamado no início do seu método principal.

b) Crie variáveis locais que armazenarão valores para cada um dos atributos da classe Produto. Nomeie as variáveis tempNumber, tempName, tempQty e tempPrice.

c) Peça ao utilizador para introduzir valores para cada um dos atributos da classe "Produto". Peça o nome, a quantidade, o preço e o número do item, guarde os valores nas variáveis locais temporárias que acabou de criar.

d) Utilize os valores que foram introduzidos pelo utilizador para criar o objeto p1. Isto significa que vai utilizar o construtor que recebe 4 parâmetros em vez do construtor predefinido.

2 - Peça ao utilizador que forneça valores para p2.

a) Utilize as mesmas variáveis locais que anteriormente para obter a entrada do utilizador para criar o objeto p2. Copie e cole o código após a linha que cria o objeto p1.

b) Execute o programa e identifique onde ocorreu um erro.

c) O programa não parece pedir um valor para nome. Isto deve-se ao facto de o último valor introduzido ter sido um valor numérico e ter deixado alguns caracteres especiais no buffer de entrada. Para limpar o buffer de entrada, adicione a seguinte instrução antes de pedir qualquer valor para p2:
in.nextLine();
Esta instrução recebe todos os valores armazenados na memória intermédia e elimina-os, deixando uma memória intermédia vazia.

d) Execute o programa agora, ele deve estar livre de erros e mostrar todos os valores, incluindo os valores introduzidos pelo utilizador, na consola.

e) Feche o objeto Scanner quando tiver terminado.










| Atributo | Dados de amostra | 
|-------------|-------------|
| Nome do produto | ---- |
| Preço do produto | ---- | 
| Número de unidades no estoque | ---- |

2 - O passo seguinte é pensar nos tipos de dados corretos que irá utilizar para armazenar os valores no seu sistema. Para tal, adicione outra coluna à sua tabela que identifique o tipo de dados correto para cada valor que identificou.

| Atributo | Dados de amostra | Tipo de dado |
|-------------|-------------|-------------|
| Nome do produto | ---- | ---- |
| Preço do produto |---- | ---- |
| Número de unidades no estoque | ---- | ---- |
| Número do item | ---- | ---- |

3 - Crie um projeto chamado "Inventário".

4- Crie um objeto de classe chamado "Produto"

5 - Adicione os seguintes campos privados:

a) Número do item.
b) Nome do produto.
c) Número de unidades no estoque.
d) Preço de cada unidade.

6 - Adicione um comentário no campo de declaracao de instância.

7 - Crie dois construtores:

a) Um construtor padrão, sem parâmetros, que permitirá ao compilador inicializar os campos com os seus valores predefinidos. Adicione um comentário acima do seu construtor que explique o objetivo do código.

b) Um construtor sobrecarregado com os parâmetros: número, name, quantidade, preço.

8 - Implementar os métodos gets / sets para cada uma das quatro variáveis de instância. Adicione comentários para explicar o propósito.

9 - Substitua o método toString() da classe de objeto para mostrar uma descrição de cada objeto Produto que inclua os valores do campo de instância no seguinte formato:

| Campo                 | Valor       |
|-----------------------|-------------|
| Número do produto     | 1           |
| Nome                  | Melhores Hits |
| Quantidade no estoque | 25          |
| Preço                 | 9.99        |

10 - Crie uma classe main que realize os testes.

11 - Crie e inicialize seis objetos "produto" com base na lista que criou na tarefa 1.

a) Dois dos produtos devem ser criados utilizando o construtor predefinido.

b) Os outros quatro devem ser criados fornecendo valores para os argumentos que correspondem aos parâmetros do construtor.

12 - Utilizando a classe "ProductTester", apresente os detalhes de cada produto na consola.

13 - Salve o projeto.
