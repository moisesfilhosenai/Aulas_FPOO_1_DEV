package enumeracao;

public class Enumeracao {
    public static void main(String[] args) {
        //Usuario usuario = new Usuario("Usuario 01", "usuario01@gmail.com", true, 0);
        Usuario usuario = new Usuario("Usuario 01", "usuario01@gmail.com", true, TipoUsuarioEnum.ADMINISTRADOR);
        System.out.println(usuario);

        Pedido pedido = new Pedido("Pedido do usuario 01", 29.99, StatusEnum.EM_PREPARACAO);
        System.out.println(pedido);
        pedido.setStatus(StatusEnum.EM_TRANSPORTE);
        System.out.println(pedido);
        pedido.setStatus(StatusEnum.ENTREGUE);
        System.out.println(pedido);
    }
}
