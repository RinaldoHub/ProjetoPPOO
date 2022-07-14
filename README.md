# PROJETO

# IDEIA

→ O que é: Um sistema para gerenciar vagas de um estacionamento

→ Porquê: As pessoas tem problemas para localizar vagas em locais públicos grandes, como shoppings

→ Como: O sistema vai mostrar na tela a quantidade de vagas total + as vagas disponíveis em cada área (A~D). Serão 4 vagas por área.

→ Quais padrões podem ser aplicados
- Observer
- Strategy
- State
- Singleton

→ Funcionamento
- Caso de veículo normal com vagas
Um veículo chega no estacionamento, e a tela mostra quais vagas estão disponiveis. Quando ele tentar ocupar uma vaga ocupada ou especial, um erro será apresentado. Ao tentar ocupar uma vaga livre não especial, o Observer notificará ao sistema para atualizar a lista de vagas disponíveis.
- Caso sem vagas
Quando um novo veículo chegar ao estacionamento, um erro de vagas indisponíveis será apresentado

# FUNÇÕES
→ Criação do Código: Criar os arquivos referentes às classes e definir os atributos necessários
- Objetos
  - Estacionamento
    - Atributos: Matriz  4x4 (A~D e 1~4) do tipo Vaga; Boolean cheio
    - Métodos: void esvaziar();
  - Vaga
    - Atributos: Carro carro; Boolean ocupada; tipo Normal, Idoso ou Deficiente
  - Carro
    - Atributos: String modeloCarro; Vaga [] []; Boolean estacionado; tipo Normal, Idoso ou Deficiente
    - Métodos: void estacionar(short firstIdx, short secIdx); void sair(); setVaga(Vaga vaga);

→ Aplicação dos Padrões (Mínimo: 2 Padrões)
- Visualizar e enxergar como e onde aplicar os padrões propostos
- Sugestão: 
  - Observer: usado para alertar ao sistema sempre que uma vaga for ocupada. Cada vaga (objeto) terá um Observer.
  - Strategy: usado para diferenciar os tipos de vaga, como Normal, Idoso, Deficiente
  - State: usado para verificar os estados da vaga, caso um veículo tente estacionar numa vaga ocupada ou especial
  - Singleton: usado para criar APENAS UM OBJETO ESTACIONAMENTO
  
→ Testes
- Realizar os testes necessários para verificar o funcionamento do código
- Áreas de testes:
  - Testar o relacionamento do Objeto Carro com o Objeto Vaga (verificar se o Objeto Vaga é preenchido por um Objeto Carro)
  - Verificar se o Objeto Vaga muda seu estado para Ocupado
  - Verificar se um Objeto Carro Normal consegue ocupar uma Vaga Especial
