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

c) O programa não parece pedir um valor para nome. Isto deve-se ao fato de o último valor introduzido ter sido um valor numérico e ter deixado alguns caracteres especiais no buffer de entrada. Para limpar o buffer de entrada, adicione a seguinte instrução antes de pedir qualquer valor para p2:
in.nextLine();
Esta instrução recebe todos os valores armazenados na memória intermédia e elimina-os, deixando uma memória intermédia vazia.

d) Execute o programa agora, ele deve estar livre de erros e mostrar todos os valores, incluindo os valores introduzidos pelo utilizador, na consola.

e) Feche o objeto Scanner quando tiver terminado.

3 - É desejável poder marcar os seus produtos como activos ou descontinuados. Se um produto for descontinuado, significa que o stock restante será o último e que não serão feitas mais encomendas.

a) Adicione um campo de instância booleano à sua classe Produto chamado ativo, que tem um valor predefinido de verdadeiro.

b) Crie métodos getter/setter para este novo campo.

c) Adicione o valor deste novo campo ao método toString() de modo a que o resultado corresponda ao seguinte:

| Campo                 | Valor       |
|-----------------------|-------------|
| Número do produto     | 1           |
| Nome                  | Melhores Hits |
| Quantidade no estoque | 25          |
| Preço                 | 9.99        |

4 - Quando se executa o código, obtém-se um valor impresso para ativo como verdadeiro ou falso. Isto não é fácil de utilizar e seria melhor se a saída indicasse Ativo (verdadeiro) ou Descontinuado (falso). Para o efeito, adicione um operador ternário no método toString().

5 - Chame o setter da classe driver e defina o valor ativo como false para o objeto p6 antes de apresentar os valores no ecrã. Execute e teste o seu código.
   
6 - Crie um método na classe Produto que devolva o valor do inventário para cada item. Utilize o preço do produto multiplicado pela quantidade de stock para calcular o valor do inventário. Não utilize nenhuma variável local neste método, apenas devolva o valor numa única linha de código.

7 - Atualize o método toString() da classe Product para incluir uma chamada ao método getInventoryValue() que acabou de criar, de modo a que o resultado seja o seguinte:

| Campo                 | Valor       |
|-----------------------|-------------|
| Número do produto     | 1           |
| Nome                  | Melhores Hits |
| Quantidade no estoque | 25          |
| Preço                 | 9.99        |
| Valor do estoque      | 249.75      |
| Status do produto     | true        |

8 - Salve o projeto.






