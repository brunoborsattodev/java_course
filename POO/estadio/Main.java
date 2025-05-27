package POO.estadio;

public class Main {
    public static void main(String[] args) {

        JogadorFutebol mateu = new JogadorFutebol(
                "Mateu",
                9,
                "direito",
                20);
        JogadorFutebolAmericano alex = new JogadorFutebolAmericano(
                "Alex",
                1,
                "Touch Down",
                0);
        JogadorBasquete richard = new JogadorBasquete(
                "Richard",
                20,
                2,
                0);

        mateu.fazerGol();
        mateu.driblar();
        System.out.println(mateu);

        System.out.println("\n");

        alex.correrJardas(100);
        alex.fazerTouchDown();
        System.out.println(alex);

        System.out.println("\n");

        richard.arremessar();
        richard.fazerEnterrada();
        System.out.println(richard);

    }
}

