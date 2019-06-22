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
