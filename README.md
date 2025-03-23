# Mapeamento de Áreas Verdes de Joinville

## Descrição

O projeto **Mapeamento de Áreas Verdes de Joinville** tem como objetivo criar um sistema para auxiliar moradores e turistas a localizar e obter informações sobre os parques e áreas verdes da cidade de Joinville. O aplicativo permitirá visualizar as áreas verdes, como parques e praças, oferecendo dados sobre nome, localização, tipo de vegetação, horários de funcionamento e atividades disponíveis.

Além disso, o sistema permitirá que os usuários adicionem novas áreas verdes e realizem avaliações baseadas em critérios sustentáveis, como a quantidade de árvores, a qualidade do ar, a ausência de poluição sonora, a coleta de resíduos e a facilidade de acesso via transporte público.

## Funcionalidades

- **Listagem de Áreas Verdes**: Exibe uma lista com as áreas verdes cadastradas, mostrando o nome, tipo de vegetação e a média das avaliações.
- **Detalhes de uma Área Verde**: Exibe todos os detalhes de uma área verde específica, incluindo suas informações de localização, tipo de vegetação, atividades disponíveis e avaliações.
- **Cadastro de Novas Áreas Verdes**: Permite o cadastro de novas áreas verdes no sistema com dados como nome, localização, tipo de vegetação, horários de funcionamento e atividades disponíveis.
- **Avaliação de Áreas Verdes**: Permite aos usuários avaliar uma área verde específica com notas (1 a 5) para critérios como quantidade de árvores, qualidade do ar, poluição sonora, coleta de resíduos e acessibilidade via transporte público.

## Estrutura do Sistema

### Entidades Principais

1. **Classe AreaVerde**  
   Representa uma área verde com os seguintes atributos:
   - id
   - nome
   - localização (coordenadas geográficas)
   - tipo de vegetação (árvores, arbustos, gramado)
   - horários de funcionamento
   - atividades disponíveis (caminhada, ciclismo, futebol, etc.)
   - lista de avaliações

   Métodos:
   - `calcularMediaAvaliacoes()`: Retorna a média de todas as avaliações.
   - `toStringListagem()`: Representa as informações de listagem de forma textual.
   - `toStringDetalhe()`: Representa os dados detalhados de uma área verde de forma textual.

2. **Classe Localizacao**  
   Representa a localização da área verde com os seguintes atributos:
   - latitude
   - longitude
   - identificador da área verde

   Métodos:
   - `toString()`: Representa a localização de forma textual.

3. **Classe Avaliacao**  
   Representa uma avaliação de uma área verde com os seguintes atributos:
   - notas para critérios como quantidade de árvores, qualidade do ar, poluição sonora, coleta de resíduos, facilidade de chegar via transporte público.
   - identificador da área verde avaliada.

   Métodos:
   - `calcularMediaAvaliacoes()`: Calcula a média das notas para todos os critérios.

### Repositórios

O sistema contará com classes repositório para armazenar e gerenciar os dados das entidades. Cada repositório será responsável por uma lista estática de objetos:
- **AreaVerdeRepository**: Armazena as áreas verdes cadastradas.
- **LocalizacaoRepository**: Armazena as localizações das áreas verdes.
- **AvaliacaoRepository**: Armazena as avaliações feitas pelos usuários.

### Interação com o Usuário

O sistema interage com o usuário através de um terminal utilizando a classe `Scanner`. Um menu interativo será exibido ao usuário para realizar operações como listar áreas verdes, avaliar uma área verde, visualizar detalhes de uma área ou cadastrar uma nova área verde.

#### Exemplo de menu:

```bash
Digite a opção que deseja acessar:
1- Listar Áreas Verdes
2- Avaliar Área Verde
3- Ver Detalhe de uma Área Verde
4- Cadastrar Nova Área Verde
```bash
### Exemplo de Interações

- **Listar Áreas Verdes**: O sistema apresenta uma lista com todas as áreas verdes cadastradas, mostrando informações como nome, tipo de vegetação e média das avaliações.
- **Avaliar Área Verde**: O usuário escolhe uma área verde a ser avaliada e atribui uma nota para cada critério.
- **Ver Detalhes de uma Área Verde**: O usuário pode consultar todos os detalhes de uma área verde específica.
- **Cadastrar Nova Área Verde**: O usuário fornece informações sobre a nova área verde, que será cadastrada no sistema.

### Tecnologias Utilizadas

- **Java**: A linguagem de programação principal do projeto.
- **Scanner**: Para interação com o usuário via terminal.
- **Coleções (List, ArrayList)**: Para armazenar as áreas verdes, localizações e avaliações.
- **Orientação a Objetos**: O projeto segue o paradigma de orientação a objetos para modelar as entidades e interações.

### Como Executar o Projeto

1. **Clonar o repositório**:

   ```bash
   git clone https://github.com/seu-usuario/mapeamento-areas-verdes-joinville.git
   cd mapeamento-areas-verdes-joinville

2. **Compilar o projeto**:

Certifique-se de ter o Java instalado e configure o ambiente de desenvolvimento. Compile o código com:

```bash
javac Main.java

3. **Executar o sistema**:

Para rodar o sistema, execute o seguinte comando:

```bash
Java Main

O menu será exibido e você poderá interagir com o sistema.
