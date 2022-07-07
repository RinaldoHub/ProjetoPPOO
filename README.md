# PROJETO

# IDEIA

→ O que é: Um sistema para gerenciar vagas de um estacionamento

→ Porquê: As pessoas tem problemas para localizar vagas em locais públicos grandes, como shoppings

→ Como: O sistema vai mostrar na tela a quantidade de vagas total + as vagas disponíveis em cada área (A~D). Serão 4 vagas por área.

→ Quais padrões podem ser aplicados

- Observer: usado para alertar ao sistema sempre que uma vaga for ocupada. Cada vaga (objeto) terá um Observer.
- Strategy: usado para diferenciar os tipos de vaga, como Normal, Idoso, Deficiente
- State: usado para verificar os estados da vaga, caso um veículo tente estacionar numa vaga ocupada ou especial

→ Funcionamento
- Caso de veículo normal com vagas
Um veículo chega no estacionamento, e a tela mostra quais vagas estão disponiveis. Quando ele tentar ocupar uma vaga ocupada ou especial, um erro será apresentado. Ao tentar ocupar uma vaga livre não especial, o Observer notificará ao sistema para atualizar a lista de vagas disponíveis.
- Caso sem vagas
Quando um novo veículo chegar ao estacionamento, um erro de vagas indisponíveis será apresentado
