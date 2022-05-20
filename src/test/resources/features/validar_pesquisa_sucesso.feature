# language: pt

  Funcionalidade: pesquisar conteúdo no blog
    Eu como usuário do blo Agi
    quero poder pesquisar conteúdos
    para retornar apenas o conteúdo de interesse

  Cenário: pesquisa de conteúdo com sucesso
    Dado que estou no site do Agi
    E eu clicar no ícone de lupa para pesquisar um conteúdo
    E clicar no campo para digitar minha pesquisa
    E inserir minha pesquisa
    Quando clicar no botão para pesquisar
    Então eu devo verificar o conteúdo retornado de acordo com a pesquisa

