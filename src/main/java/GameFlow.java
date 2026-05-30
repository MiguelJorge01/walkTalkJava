import entities.GameCharacters;

import java.util.Scanner;

public class GameFlow {
    Scene actualScene;

    public void displayScene() {
        System.out.println(actualScene.description);
        System.out.println(actualScene.smell);
        System.out.println(actualScene.feeling);

        System.out.println("\n[AÇÕES]: ");
        for (int i = 0; i < actualScene.actions.length; i++) {
            System.out.println("[" + (i+1) + "] - " + actualScene.actions[i].name);
        }
    }

    Scanner scanner = new Scanner(System.in);

    public static void talkToNPC(entities.NPC npc) {

    }

    public static void goToScene(int sceneValue) {

    }
}
