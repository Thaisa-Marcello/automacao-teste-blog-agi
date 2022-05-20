# language: pt

  Funcionalidade: pesquisar conteúdo inexistente
    Eu como usuário do blo Agi
    quero ter um retorno por mensagem quando o conteúdo pesquisado não tem retorno
    para estar ciente de que realmente não há aquele conteúdo

  Cenário: pesquisa de conteúdo no blog com sucesso
    Dado que estou no site do Agibank
    E eu clicar no ícone de lupa para pesquisar um conteúdo no blog
    E clicar no campo para digitar minha pesquisa inexistente
    E inserir minha pesquisa inexistente no campo
    Quando clicar no botão para realizar a pesquisa
    Então uma mensagem deve informar que aquele conteúdo não existe no blog

