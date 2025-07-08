// Implementação do serviço de SMS
class ServicoSMS implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando por SMS: " + mensagem);
        // Aqui iria a lógica real para enviar SMS
    }
}