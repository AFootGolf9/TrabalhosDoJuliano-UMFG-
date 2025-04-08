# Deploy na pratica

1. Deploy é o ato de disponibilizar a aplicação para o usuario, no caso de aplicações web é muito utilizado  serviços de nuvem para fazer o deploy.
2. Um ambiente local tem segredos diferentes que normalmente se conexão em um banco de testes ou a forma que as dependencias são geridas não pode ser usada em produção, já no ambiente de produção, temos a conexão com o banco de produção e dependencias bem gerias, para evitar conflitos também é usado dockerização da aplicação.
3. Heroku é uma das plataformas que permite o deploy em nuvem e entre suas vantagens se encontra a simplicidade comparado a seus concorentes e o preço resuzido.
4. Os mesmos do que criar um banco localmente, a diferença é que antes deve se acessar o host remotamente para a criação
5. A string de conexão deve incluir informações como tipo do banco de dados, endereço do
host, porta, nome do banco de dados, usuário e senha
6. Ferramentas como pgAdmin (para PostgreSQL), DBeaver ou MySQL Workbench
permitem testar conexões e visualizar dado
7. Docker é a forma que a dockerização é feita, criando uma imagem que tem um sistema operacional virtualizado que rodara nos recursos alocados a ele, para rodar a aplicação.
8. Dockerfile é o arquivo usado para criar a imagem docker, ele é extremamente importante já que o funcionamento da imagem esta atrealado a o mesmo.
9. .dockerignore é ultilizado para especificar quais arquivos seram explicitamente ignorados no momento da criação da imagem docker, é importante para evitar que a imgem receba arquivos indesejados.
10. 
    -  git push heroku main (para enviar o código para o Heroku)  
    - heroku create (para criar uma nova aplicação no Heroku)
11. O comando heroku ps:restart reinicia a aplicação, e heroku open abre a aplicação no
navegador
12. O comando heroku logs --tail permite visualizar os logs da aplicação em tempo real
para diagnosticar problemas
13. Encontrar informações relatadas diretamente com Heroku e as perguntas.
14. Ambientes que nececitao de escalabilidade e disponibilidade, ja que a dockerização ajuda aumentar a escalabilidade e o Heroku disponibiliza a aplicação de maneira eficiente.  