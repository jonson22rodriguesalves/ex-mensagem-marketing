// Implementação do serviço de WhatsApp
class ServicoWhatsApp implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando por WhatsApp: " + mensagem);
        
    }
}