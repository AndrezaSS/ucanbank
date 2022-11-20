<h1 align = "center"> Projeto final Programa #ElasTech da PagBank/PagSeguro</h1>
<h2 align = "center"> UcanBank</h2>

Data de entrega: 23/11/2022

Instrutora: Camila Avila

Participantes:
- Andreza Santos	
- Fabiana Ikeda
- Gina Rocha Dutra
- Juliana Andrade
- Jessica Lira
- Monielle Amaral
- Sabrina Santiago Alves

# Autores

| [<img src="https://avatars.githubusercontent.com/u/108132741?v=4" width=115><br><sub> Andreza Santos </sub>](https://github.com/AndrezaSS) |  [<img src="https://avatars.githubusercontent.com/u/95303672?v=4" width=115><br><sub>Fabiana Ikeda</sub>](https://github.com/Fikda) |  [<img src="https://avatars.githubusercontent.com/u/91692537?v=4" width=115><br><sub>Gina Rocha Dutra</sub>]() |  [<img src="https://avatars.githubusercontent.com/u/8989346?v=4" width=115><br><sub>Alex Felipe</sub>](https://github.com/alexfelipe) |  [<img src="https://avatars.githubusercontent.com/u/8989346?v=4" width=115><br><sub>Alex Felipe</sub>](https://github.com/alexfelipe) |  [<img src="https://avatars.githubusercontent.com/u/8989346?v=4" width=115><br><sub>Alex Felipe</sub>](https://github.com/alexfelipe) |  [<img src="https://avatars.githubusercontent.com/u/8989346?v=4" width=115><br><sub>Alex Felipe</sub>](https://github.com/alexfelipe) |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |

O projeto:

Definição: Trata-se da criação de um banco fictício que está construindo uma nova plataforma e precisa de um sistema para gerenciar clientes e transações.
Habilidades utilizadas:
Foram utilizados os conceitos de Java com orientação a Objetos, onde classes foram criadas para representar as entidades gerenciadas. Para armazenar os dados, aplicamos os conceitos de bancos de dados relacional. Em específico neste projeto, utilizamos o MySQL Workbench. Para criação do projeto, utilizamos o Maven com Spring Boot (Java Web, actuator, data jpa, msql-jdbc).	

Tecnologias necessárias para utilização do sistema:
- Apache Maven
- Spring Boot
- SGBD de preferência  

Caso de uso do sistema: O sistema permite o cadastro de novos clientes, incluindo dados pessoais e dados para contato, tanto de pessoa física quanto jurídica. O cliente está atrelado a uma conta bancária, a qual possui um saldo inicial de R$ 100,00 ao ser criada. O sistema permite realizar transferências de um cliente para outro e este histórico de transações deve ser registrado. 

Endpoints:

Clientes:

	Get busca clientes: http://localhost:3306/clientes
	Get busca cliente por id: http://localhost:3306/cliente/1
	Post criar cliente PF: http://localhost:8080/clientepf
	Post criar cliente PJ: http://localhost:8080/clientepj
	Put alterar cliente PF: http://localhost:8080/alteraclientepf
	Put alterar cliente PJ: http://localhost:8080/alteraclientepj

Contas:

	Get buscar contas: http://localhost:8080/conta/all 
	Get buscar conta por id: http://localhost:8080/conta/1
	Post criar conta: http://localhost:8080/conta/pf
	Put alterar conta: http://localhost:8080/conta
	Delet deletar conta: http://localhost:8080/conta/1

Transações:
<table>
  <tr>
    <td>Get buscar transações</td>
    <td>Get buscar transação por id</td>
    <td>Post criar transação</td>
  </tr>
  <tr>
    <td>http://localhost:8080/transacao/all</td>
    <td>http://localhost:8080/transacao/1</td>
    <td>http://localhost:8080/transacao</td>
  </tr>  
 </table>
