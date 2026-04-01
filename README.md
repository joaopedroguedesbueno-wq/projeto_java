GameRank Sobre o Projeto

O GameRank é um sistema back-end para cadastro de jogadores, registro de partidas e geração de ranking com base nas pontuações. O sistema armazena todas as informações em um banco de dados e permite o controle e a consulta do desempenho dos jogadores.

Este projeto tem como objetivo praticar conceitos de desenvolvimento back-end e modelagem de banco de dados.

Objetivo

Cadastrar jogadores

Cadastrar jogos

Registrar partidas

Armazenar pontuações

Gerar ranking dos jogadores

Consultar o histórico de partidas

Funcionalidades Jogadores

Cadastro de novos jogadores

Listagem de jogadores cadastrados

Consulta de um jogador específico

Jogos

Cadastro de jogos

Listagem dos jogos disponíveis

Partidas

Registro de partidas

Associação da partida a um jogador e a um jogo

Armazenamento da pontuação e da data

Ranking

Listagem de jogadores ordenados por pontuação

Exibição dos melhores jogadores (Top 10)

Estrutura do Sistema

O sistema é composto por três entidades principais:

Jogadores: armazena os dados dos usuários.

Jogos: armazena os jogos disponíveis.

Partidas: registra as pontuações obtidas pelos jogadores.

Relacionamentos

Um jogador pode ter várias partidas.

Cada partida pertence a apenas um jogador.

Um jogo pode ter várias partidas.

Cada partida pertence a apenas um jogo.

Modelo simplificado:

JOGADORES (1) ---- (N) PARTIDAS (N) ---- (1) JOGOS Regras de Negócio

O jogador deve estar cadastrado para registrar uma partida.

A pontuação não pode ser negativa.

O ranking será exibido em ordem decrescente de pontuação.

O ranking pode ser calculado pela soma ou pela maior pontuação do jogador.

Endpoints do Back-end Jogadores

POST /jogadores

GET /jogadores

GET /jogadores/{id}

Jogos

POST /jogos

GET /jogos

Partidas

POST /partidas

GET /partidas/jogador/{id}

Ranking

GET /ranking/top10
