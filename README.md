# Exemplo-JPA

## Propósito do Repositório
Sua função é a de demonstrar uma implementação simples envolvendo persistência de dados com JPA/Hibernate e o banco de dados MySQL. Este repositório se baseia em um exercício realizado durante o curso do Prof. Nélio Alves na Udemy de Java.

## Observações
Para reproduzir o exercício, certifique-se de inserir um arquivo `persistence.xml` dentro de uma pasta chamada `META-INF` em `resources`. O conteúdo do arquivo deverá ser parecido com o código a seguir:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<persistence xmlns="http://xmlns.jcp.org/xml/ns/persistence"
             xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
             xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
http://xmlns.jcp.org/xml/ns/persistence/persistence_2_1.xsd" version="2.1">
    <persistence-unit name="exemplo-jpa" transaction-type="RESOURCE_LOCAL">
        <properties>
            <property name="javax.persistence.jdbc.url"
                      value="jdbc:mysql://localhost:3306/aulajpa?useSSL=FALSE&amp;serverTimezone=UTC" />
            <property name="javax.persistence.jdbc.driver" value="com.mysql.jdbc.Driver" />
            <property name="javax.persistence.jdbc.user" value="seu_usuario" />
            <property name="javax.persistence.jdbc.password" value="sua_senha" />
            <property name="hibernate.hbm2ddl.auto" value="update" />
            <property name="hibernate.dialect" value="org.hibernate.dialect.MySQL8Dialect" />
        </properties>
    </persistence-unit>
</persistence>
```
