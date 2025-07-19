package ficha;

public enum TipoClasses {

    FISICA("Adaptando a magia em seus corpos para a amplificação física, cavaleiros, assassinos, arqueiros e bárbaros criaram uma forma especial de uso mágico, que nomearam de Aura.\n" +
            "A Aura permite que sua força, velocidade e resistência aumente em imensa quantidade, e quanto mais afinidade magica ou esforço colocado em prática, maior é esse aumento. " +
            "Com técnicas assim, muitos conseguem passar o limite natural de seus corpos em diversas vezes, podendo destruir estruturas inteiras apenas com suas mãos em segundos."),
    MAGICA("Sem uma especialização definida, alguns mortais transitam entre as artes marciais e manifestações elementais. " +
            "Treinando seu corpo, mente e alma, alguns decidiram fracionar seu poder entre a Aura e a Manifestação."),
    MESTICA("Com a Manifestação, os mortais aprenderam a dominar os elementos naturais, canalizar a energia dos deuses a seus próprios corpos, " +
            "e até manipular a mente dos fracos. Com uma boa capacidade de Manifestação, um único mago experiente poderia destruir uma pequena cidadela," +
            " queimando-a até as cinzas, criando um grande tufão, ou deixando-a congelada por meses seguidos.");

    TipoClasses(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;

    private String getDescricao() {
        return descricao;
    }
}
