# Santander Boot Camp 2025

* 🎬 Sistema Mensageria Marketing

* Sistema Java para envio de mensagens de marketing através de múltiplos canais, implementando:
* Interface comum para serviços de mensagens (SMS, E-mail, Redes Sociais, WhatsApp)
* Envio da mesma mensagem para diferentes serviços
* Expansibilidade para novos canais de comunicação
* Menu interativo para seleção de serviços
* Envio individual ou em massa para todos os canais

* 🛠️ Tecnologias Utilizadas
* Java 17+
* Scanner para entrada de dados
* Interfaces e polimorfismo
* Encapsulamento de propriedades
* Menu interativo com switch-case
* Padrão de design baseado em interfaces

* 📚 Pré-requisitos
* Java JDK 17 ou superior
* Conhecimento básico de compilação Java
* Terminal/Console para execução

* 🚀 Como Executar
* Compile o programa:

* bash
* javac MarketingMensageria.java
* Execute o programa:

* bash
* java MarketingMensageria
* Siga o fluxo interativo:

* === Sistema de Envio de Mensagens de Marketing ===
1. Enviar por SMS
2. Enviar por E-mail
3. Enviar por Redes Sociais
4. Enviar por WhatsApp
5. Enviar para todos os serviços
0. Sair
* Escolha uma opção:

* 🎯 Funcionalidades Implementadas
* ✔️ Sistema baseado em interface para serviços de mensagens
* ✔️ Implementações para 4 canais de comunicação
* ✔️ Envio individual ou em massa de mensagens
* ✔️ Menu interativo completo
* ✔️ Arquitetura expansível para novos serviços
* ✔️ Separação clara entre lógica de negócio e implementações

* 📝 Exemplo de Uso

* === Sistema de Envio de Mensagens de Marketing ===
* Escolha uma opção: 1

* Digite a mensagem de marketing: Promoção de verão - 50% off!
* Enviando por SMS: Promoção de verão - 50% off!

* Escolha uma opção: 5
* Digite a mensagem de marketing: Novo catálogo disponível!
* Enviando por SMS: Novo catálogo disponível!
* Enviando por E-mail: Novo catálogo disponível!
* Enviando por Redes Sociais: Novo catálogo disponível!
* Enviando por WhatsApp: Novo catálogo disponível!

* ⚠️ Importante
* O sistema demonstra o padrão de envio mas não conecta com serviços reais
* Novos serviços podem ser adicionados implementando a interface ServicoMensagem
* Todas as implementações devem fornecer o método enviarMensagem
* O sistema não persiste histórico de mensagens enviadas
 
 ````mermaid
classDiagram
    class ServicoMensagem {
        <<interface>>
        +enviarMensagem(String)
    }
    
    class ServicoSMS {
        +enviarMensagem(String)
    }
    
    class ServicoEmail {
        +enviarMensagem(String)
    }
    
    class ServicoRedesSociais {
        +enviarMensagem(String)
    }
    
    class ServicoWhatsApp {
        +enviarMensagem(String)
    }
    
    class MarketingMensageria {
        -servico: ServicoMensagem
        -scanner: Scanner
        +setServico(ServicoMensagem)
        +enviarMensagem(String)
        +exibirMenu()
    }
    
    ServicoMensagem <|.. ServicoSMS
    ServicoMensagem <|.. ServicoEmail
    ServicoMensagem <|.. ServicoRedesSociais
    ServicoMensagem <|.. ServicoWhatsApp
    MarketingMensageria --> ServicoMensagem

 ````

🔄 Fluxograma Básico

[Início]

↓

[Menu Principal]

↓

├─ 1. SMS → Recebe mensagem e envia por SMS

├─ 2. E-mail → Recebe mensagem e envia por e-mail

├─ 3. Redes Sociais → Recebe mensagem e posta

├─ 4. WhatsApp → Recebe mensagem e envia

├─ 5. Todos → Envia para todos os canais

└─ 0. Sair → Encerra programa

📌 Notas de Implementação

Cada serviço implementa a mesma interface garantindo consistência
O sistema demonstra o princípio Open/Closed (aberto para extensão)
Fácil adição de novos serviços sem modificar a lógica principal
Design desacoplado permite substituir implementações facilmente