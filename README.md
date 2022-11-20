<h1 align = "center"> Projeto final Programa #ElasTech da PagBank/PagSeguro</h1>


Data de entrega: 23/11/2022

### Instrutora: Camila Avila

## Grupo: CODELIKEGIRL 👊

### Participantes:

| [<img src="https://avatars.githubusercontent.com/u/108132741?v=4" width=115><br><sub> Andreza Santos </sub>](https://github.com/AndrezaSS) |  [<img src="https://avatars.githubusercontent.com/u/95303672?v=4" width=115><br><sub>Fabiana Ikeda</sub>](https://github.com/Fikda) |  [<img src="https://avatars.githubusercontent.com/u/91692537?v=4" width=115><br><sub>Gina Rocha Dutra</sub>](https://github.com/ginadev-dutra) |  [<img src="https://avatars.githubusercontent.com/u/29560149?v=4" width=115><br><sub>Jéssica Lira</sub>](https://github.com/jessicalira1001) |  [<img src="https://avatars.githubusercontent.com/u/90662162?v=4" width=115><br><sub>Juliana Andrade</sub>](https://github.com/andradeju) |  [<img src="https://avatars.githubusercontent.com/u/4139905?v=4" width=115><br><sub>Monielle Amaral</sub>](https://github.com/monielle) |  [<img src="https://avatars.githubusercontent.com/u/74334360?v=4" width=115><br><sub>Sabrina Santiago Alves</sub>](https://github.com/sabrinasantiagoalves) |
| :---: | :---: | :---: | :---: | :---: | :---: | :---: |


<h1 align = "center"> UcanBank</h1>

## Definição:
Trata-se da criação de um banco fictício que está construindo uma nova plataforma e precisa de um sistema para gerenciar clientes e transações.
Habilidades utilizadas:
Foram utilizados os conceitos de Java com orientação a Objetos, onde classes foram criadas para representar as entidades gerenciadas. Para armazenar os dados, aplicamos os conceitos de bancos de dados relacional. Em específico neste projeto, utilizamos o MySQL Workbench. Para criação do projeto, utilizamos o Maven com Spring Boot (Java Web, actuator, data jpa, msql-jdbc).	

## Tecnologias necessárias para utilização do sistema:
+ Apache Maven
+ Spring Boot
+ SGBD de preferência  

## Caso de uso do sistema:
O sistema permite o cadastro de novos clientes, incluindo dados pessoais e dados para contato, tanto de pessoa física quanto jurídica. O cliente está atrelado a uma conta bancária, a qual possui um saldo inicial de R$ 100,00 ao ser criada. O sistema permite realizar transferências de um cliente para outro e este histórico de transações deve ser registrado. 

## Endpoints:

### Clientes:

-	`Get` Buscar clientes: http://localhost:3306/clientes
-	`Get` Buscar cliente por id: http://localhost:3306/cliente/1
-	`Post` Criar cliente PF: http://localhost:8080/clientepf
-	`Post` Criar cliente PJ: http://localhost:8080/clientepj
-	`Put` Alterar cliente PF: http://localhost:8080/alteraclientepf
-	`Put` Alterar cliente PJ: http://localhost:8080/alteraclientepj

### Contas:

-	`Get` Buscar contas: http://localhost:8080/conta/all 
-	`Get` Buscar conta por id: http://localhost:8080/conta/1
-	`Post` Criar conta: http://localhost:8080/conta/pf
-	`Put` Alterar conta: http://localhost:8080/conta
-	`Delete` Deletar conta: http://localhost:8080/conta/1

### Transações:

-	`Get`  Buscar transações: http://localhost:8080/transacao/all
- 	`Get`  Buscar transação por id: http://localhost:8080/transacao/1
-	`Post`  Criar transação: http://localhost:8080/transacao
 
    
