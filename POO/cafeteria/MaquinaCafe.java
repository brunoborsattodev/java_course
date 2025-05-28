package POO.cafeteria;

public interface MaquinaCafe {
    void ligar();
    void desligar();
    void colocarCachimbo();
    void retirarCachimbo();
    void selecionarModo(ModoCafe modoCafe);
    void fazerCafe();
}
