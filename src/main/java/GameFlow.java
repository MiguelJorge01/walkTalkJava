import java.util.Scanner;

public class GameFlow {
    Scene atualScene = new Scene(
        "\nWilliam vê uma entrada para uma cidade, o chão é de pedra, " +
        "as casas ao fundo são aparentemente de pedra também, " +
        "porém, com reforços em madeira. \nHá pessoas nas ruas.",
        "\nO cheiro é de chuva e terra molhada, e no fundo, um típico cheiro de pão assando.",
        "\nWilliam está se sentindo curioso em conhecer a vila, também se sente com fome.",

        new Action[] {
            new Action("Entrar na cidade", () -> System.out.println("William entrou na cidade"))
        }
    );

    public void displayScene() {
        System.out.println(atualScene.description);
        System.out.println(atualScene.smell);
        System.out.println(atualScene.feeling);

        System.out.println("\n[AÇÕES]: ");
        for (int i = 0; i < atualScene.actions.length; i++) {
            System.out.println("[" + (i+1) + "] - " + atualScene.actions[i].name);
        }
    }

    Scanner scanner = new Scanner(System.in);
}
