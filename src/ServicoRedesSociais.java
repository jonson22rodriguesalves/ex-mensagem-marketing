// Implementação do serviço de Redes Sociais
class ServicoRedesSociais implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando por Redes Sociais: " + mensagem);
        
    }
}
