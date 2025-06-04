package peixaria;

import java.util.List;

public class Pedido {
    private Cliente cliente;

    public List<ItemPedido> getItensPedidos() {
        return itensPedidos;
    }

    public void setItensPedidos(List<ItemPedido> itensPedidos) {
        this.itensPedidos = itensPedidos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    private List<ItemPedido> itensPedidos;

}
