import java.util.Scanner;

// Classe principal que gerencia o envio de mensagens
public class MarketingMensageria {
    private ServicoMensagem servico;
    private Scanner scanner;

    public MarketingMensageria() {
        scanner = new Scanner(System.in);
    }

    // Método para configurar o serviço de mensagem
    public void setServico(ServicoMensagem servico) {
        this.servico = servico;
    }

    // Método para enviar a mensagem usando o serviço configurado
    public void enviarMensagem(String mensagem) {
        if (servico != null) {
            servico.enviarMensagem(mensagem);
        } else {
            System.out.println("Nenhum serviço selecionado!");
        }
    }

    // Método para exibir o menu e interagir com o usuário
    public void exibirMenu() {
        int opcao;
        String mensagem;

        do {
            System.out.println("\n=== Sistema de Envio de Mensagens de Marketing ===");
            System.out.println("1. Enviar por SMS");
            System.out.println("2. Enviar por E-mail");
            System.out.println("3. Enviar por Redes Sociais");
            System.out.println("4. Enviar por WhatsApp");
            System.out.println("5. Enviar para todos os serviços");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite a mensagem de marketing: ");
                mensagem = scanner.nextLine();

                switch (opcao) {
                    case 1:
                        setServico(new ServicoSMS());
                        break;
                    case 2:
                        setServico(new ServicoEmail());
                        break;
                    case 3:
                        setServico(new ServicoRedesSociais());
                        break;
                    case 4:
                        setServico(new ServicoWhatsApp());
                        break;
                }
                enviarMensagem(mensagem);
            } else if (opcao == 5) {
                System.out.print("Digite a mensagem de marketing: ");
                mensagem = scanner.nextLine();

                // Envia para todos os serviços
                ServicoMensagem[] servicos = {
                        new ServicoSMS(),
                        new ServicoEmail(),
                        new ServicoRedesSociais(),
                        new ServicoWhatsApp()
                };

                for (ServicoMensagem servico : servicos) {
                    setServico(servico);
                    enviarMensagem(mensagem);
                }
            } else if (opcao != 0) {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        System.out.println("Sistema encerrado.");
    }
    }
