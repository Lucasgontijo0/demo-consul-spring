# Uso do [Consul](https://www.consul.io/) em uma aplicação Spring Boot

A aplicação serve para demonstrar o uso do consul em uma aplicação spring boot.

## Demonstração do uso de parâmetros dinâmicos
Para ilustrar a injeção de parâmetros de forma dinâmica, utilizaremos o consul. A aplicação está estruturada de forma que há uma chamada de um endpoint externo e teremos um parâmetro dinâmico que irá alterar a chamada entre estes dois endpoints.

### Inicializar projeto
Para inicializar o projeto é necessário que você tenha instalado o [docker](https://docs.docker.com/install) e [docker-compose](https://docs.docker.com/compose/) e também a **versão 11 do JAVA**.

Para inicializar os containers (Consul e Mocks) utilize o comando:
> docker-compose up

O consul estará acessível na porta **8500**, como foi definido no docker-compose.yml.

### Consul
O consul pode ser acessado na url **localhost:8085**.

Iremos criar o parâmetro utilizando a aba **key/value**
<img width="525" alt="Screen Shot 2019-06-22 at 10 36 49" src="https://user-images.githubusercontent.com/31103149/59964796-e7d8bb00-94db-11e9-8298-f3981e7b1ccd.png">
<img width="1672" alt="Screen Shot 2019-06-22 at 10 37 37" src="https://user-images.githubusercontent.com/31103149/59964797-e7d8bb00-94db-11e9-8430-40174020e269.png">

Iremos criar a configuração através do seguinte padrão **config/APPLICATION_NAME/KEY**
<img width="1189" alt="Screen Shot 2019-06-22 at 10 40 33" src="https://user-images.githubusercontent.com/31103149/59964799-e7d8bb00-94db-11e9-9e9a-5932ac372b1a.png">
O nome da aplicação deve ser definido no **application.properties**
<img width="417" alt="Screen Shot 2019-06-22 at 10 39 03" src="https://user-images.githubusercontent.com/31103149/59964798-e7d8bb00-94db-11e9-8f96-432b8445ebfa.png">

Após criada a configuração podemos ver a mesma chamada retornando valores diferentes.
<img width="450" alt="Screen Shot 2019-06-22 at 10 43 59" src="https://user-images.githubusercontent.com/31103149/59964800-e8715180-94db-11e9-94c4-eb230a4296fe.png">
<img width="428" alt="Screen Shot 2019-06-22 at 10 46 01" src="https://user-images.githubusercontent.com/31103149/59964801-e8715180-94db-11e9-8f6b-ffca85484509.png">
