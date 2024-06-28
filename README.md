# App Teste Spring Modulith

Aplicação para teste da biblioteca Spring Modulith apresentada em Meetup tecnológico para toda a Comunidade Java Minsait.

## 🔧 Configuração do pom.xml

Adicione o seguinte Dependency Management no arquivo `pom.xml`:

```xml
<dependencyManagement>
    <dependencies>
        <dependency>
            <groupId>org.springframework.experimental</groupId>
            <artifactId>spring-modulith-bom</artifactId>
            <version>${spring-modulith-bom.version}</version>
            <scope>import</scope>
            <type>pom</type>
        </dependency>
    </dependencies>
</dependencyManagement>
```
E adicione as seguintes dependências:
```xml
<dependency>
    <groupId>org.springframework.experimental</groupId>
    <artifactId>spring-modulith-api</artifactId>
</dependency>
<dependency>
    <groupId>org.springframework.experimental</groupId>
    <artifactId>spring-modulith-starter-test</artifactId>
    <scope>test</scope>
</dependency>
```

## 📄 Descrição da Aplicação
A aplicação contém domínios simples de _**Produto**_ e _**Notificação**_, com os devidos encapsulamentos e tratamentos. Cada domínio é encapsulado em um módulo separado para garantir a modularidade e a manutenção facilitada do código.

## 🗂️ Estrutura dos Domínios
**Produto**: Gerencia a lógica de negócio relacionada a produtos, incluindo criação, atualização e listagem de produtos.

**Notificação**: Responsável pelo envio de notificações relacionadas a eventos de produtos, como criação ou atualização.

## 🚀 Funcionalidades Principais
Criação de produtos.
Envio de notificações quando um produto é criado ou atualizado.
Testes unitários para garantir a funcionalidade e a integridade dos módulos.

## 💻 Como Executar
Clone o repositório.
Configure o Maven com as dependências descritas acima.

Execute os testes para verificar a integridade do sistema.

## 🤝 Contribuições
Sinta-se à vontade para contribuir com melhorias e novas funcionalidades. Abra uma issue para discutir o que gostaria de mudar ou enviar um pull request com suas alterações.

## ✉ Contato
eduardohmferreira@gmail.com