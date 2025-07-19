package ficha;

public enum Racas {
    ABERRACAO ("As Aberrações são seres cujas biologias desafiam as categorias convencionais, tornando-as enigmáticas e difíceis de compreender." +
            " Suas formas estranhas e características peculiares as distinguem das outras raças, confundindo estudiosos e cientistas que tentam desvendar sua" +
            " verdadeira natureza.",
            "Aberração: Sua biologia diferente permite com que você tenha imunidade aos efeitos de acertos críticos contra você." +
            " Porém, também faz com que você tenha que restaurar sua vida apenas através da magia."),
    CELESTIAIS ("Os Celestiais são guardiões divinos, dedicados a proteger os inocentes e a preservar o equilíbrio cósmico. " +
            "Dotados de poderes transcendentes, eles empunham a luz como arma contra as sombras que ameaçam a harmonia do universo. Seus " +
            "atos são guiados pela sabedoria e pela compaixão, e sua presença traz esperança e inspiração aos que enfrentam as adversidades do mundo.",
            "Celestial: Você é resistente a dano do elemento Divino pela bondade que compõe seu corpo, mas também é vulnerável a dano do elemento Sanguíneo."),
    FAUNOS ("Os Faunos variam amplamente em aparência, refletindo a diversidade das espécies animais que os compõem. " +
            "Alguns exibem traços sutis de seus ancestrais animais, como orelhas pontudas ou caudas esguias, enquanto outros " +
            "apresentam transformações mais drásticas, como chifres imponentes ou patas de animais. Apesar de sua origem não natural, " +
            "os Faunos desenvolveram culturas e sociedades próprias, adaptando-se ao mundo ao seu redor e encontrando um lugar único na tapeçaria da vida.",
            "Fauno: Você consegue se comunicar livremente com animais que formam a sua mutação. Porém, todas as suas afinidades elementais têm " +
                    "eficiência reduzida pela metade, arredondando a redução de custo para baixo."),
    FEERICOS ("Variedade é a marca registrada dos Feéricos, que podem assumir uma infinidade de formas e tamanhos, refletindo a diversidade e a riqueza da vida selvagem." +
            " No entanto, todos compartilham uma conexão profunda com o mundo natural e uma compreensão intuitiva dos segredos da magia." +
            "Os Feéricos são guardiões dos bosques, das montanhas, dos rios e das florestas, protegendo os ecossistemas delicados e mantendo o equilíbrio da natureza. " +
            "Sua presença é como uma bênção para as criaturas e" +
            " plantas que habitam nesses lugares, pois eles são capazes de curar, revitalizar e proteger tudo o que está ao seu redor com seus dons naturais e mágicos.",
            "Feérico: Você é resistente a danos mágicos pelo seu corpo ter sido criado por sua mais pura forma. Porém, você recebe vulnerabilidade a danos físicos."),
    INFERNAIS ("Os Infernais são entidades malignas, cujo propósito é semear o caos e a ruína que os criou em primeiro lugar. " +
            "Possuindo poderes sobrenaturais corrompidos, eles utilizam o sangue e a sombra como instrumento para subjugar e destruir aqueles que se opõem a eles. " +
            "Sua presença é como uma chaga que consome a esperança e a luz, deixando apenas desolação e desespero em seu rastro.",
            "Infernal: Você é resistente a dano do elemento Sanguíneo pela corrupção que compõe seu corpo, mas também é vulnerável a dano do elemento Divino."),
    MORTOSVIVOS("Os Mortos-Vivos variam em forma e aparência, refletindo as circunstâncias de sua ressurreição e a natureza de sua ligação com o além. " +
            "Alguns mantêm uma aparência pálida e cadavérica, enquanto outros retêm traços de sua forma original, agora distorcidos pela influência da morte e da magia. " +
            "Sua presença muitas vezes inspira medo e repulsa, tanto pela lembrança da mortalidade quanto pela incerteza de suas intenções.",
            "Morto-Vivo: Você é resistente a danos físicos pelo seu corpo se mover praticamente pela magia. " +
                    "Porém, você recebe vulnerabilidade a danos mágicos por esse mesmo motivo."),
    MUNDANOS("Os Mundanos são raças semelhantes aos humanos, incluindo os mesmos, que não possuem vantagens biológicas significativas em relação a outras raças." +
            " Devido à sua grande quantidade e falta de características distintivas, a individualidade de cada um muitas vezes se perde em meio à multidão. " +
            "Enquanto outras raças podem possuir habilidades mágicas naturais, força sobre-humana ou características únicas, os Mundanos geralmente se destacam" +
            " apenas por sua normalidade aparente.",
            "Não possuem fraquezas mas também não têm habilidades específicas."),;

    private String descricao;
    private String habilidade;

    Racas(String descricao, String habilidade) {
        this.descricao = descricao;
        this.habilidade = habilidade;
    }

    public String getDescricao() {
        return descricao;
    }
}
