// Implementação do serviço de E-mail
class ServicoEmail implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando por E-mail: " + mensagem);
        
    }
}
