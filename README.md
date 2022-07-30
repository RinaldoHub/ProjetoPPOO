# PROJETO

# IDEIA

→ O que é: Um bagulho que faz um negócio lá. Morô?

→ Porquê: As pessoas tem problemas para localizar vagas em locais públicos grandes, como shoppings

→ Como: O sistema vai mostrar na tela a quantidade de vagas total + as vagas disponíveis em cada área (A~D). Serão 4 vagas por área.

→ Quais padrões podem ser aplicados:
- Observer
- Strategy
- State
- Singleton

→ Funcionamento
- Caso de veículo normal com vagas
Um veículo chega no estacionamento, e a tela mostra quais vagas estão disponiveis. Quando ele tentar ocupar uma vaga ocupada ou especial, um erro será apresentado. Ao tentar ocupar uma vaga livre não especial, o Observer notificará ao sistema para atualizar a lista de vagas disponíveis.
- Caso sem vagas
Quando um novo veículo chegar ao estacionamento, um erro de vagas indisponíveis será apresentado.

# FUNÇÕES
→ Criação do Código: Criar os arquivos referentes às classes e definir os atributos necessários
- Objetos
  - Estacionamento (Contém vagas)
    - Atributos: 
      - Matriz 4x4 (A-D e 1-4) ou ArrayList do tipo Vaga;
      - Boolean cheio.
  - Vaga
    - Atributos: Carro carro; Boolean ocupada; tipo Normal, Idoso ou Deficiente;
    - Métodos:
      - void esvaziar() - Alertar a aplicação da nova vaga;
      - void lotar() - Alertar a aplicação da redução das vagas.
  - Carro
    - Atributos: String modeloCarro; Vaga [] []; Boolean estacionado; tipo (Normal, Idoso ou Deficiente);
    - Métodos: void estacionar(short firstIdx, short secIdx); void sair(); setVaga(Vaga vaga).

→ Aplicação dos Padrões (Mínimo: 3 Padrões)
- Visualizar e enxergar como e onde aplicar os padrões propostos
- Sugestão: 
  - Observer: usado para alertar o sistema sempre que uma vaga for ocupada. Cada vaga (objeto) terá um Observer;
  - Strategy: usado para diferenciar os tipos de vaga, como Normal, Idoso, Deficiente;
  - State: usado para verificar os estados da vaga, caso um veículo tente estacionar numa vaga ocupada ou diferente do seu tipo de vaga;
  - Singleton: usado para criar APENAS UM OBJETO ESTACIONAMENTO;
  - Factory (abstract ou não): usado para criar os diversos carros que ocuparão as vagas.
  
# Testes
- Realizar os testes necessários para verificar o funcionamento do código
- Casos de teste:
  - Verificar se o Objeto Vaga é preenchido por um Objeto Carro);
  - Verificar se o Objeto Vaga muda seu estado para Ocupado;
  - Verificar se um Objeto Carro Normal consegue ocupar uma Vaga Especial;
  - Verificar se um Objeto Carro recebe um alerta quando uma nova vaga surgir.
- CI:
  - Configurar integração contínua onde cada a cada pull request todos os testes automatizados sejam executados e retornem resultados;
  - Caso não seja possivel configurar uma CI no GitHub, mudar urgentemente para GitLab.
