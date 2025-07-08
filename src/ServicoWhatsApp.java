// Implementação do serviço de WhatsApp
class ServicoWhatsApp implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando por WhatsApp: " + mensagem);
        // Aqui iria a lógica real para enviar mensagem no WhatsApp
    }
}