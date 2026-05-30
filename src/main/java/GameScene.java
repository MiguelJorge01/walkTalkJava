public class GameScene {
    Scene scene1 = new Scene(
            "William vê uma entrada para uma vila, o chão é de pedra, " +
                    "as casas ao fundo são aparentemente de pedra também, " +
                    "porém, com reforços em madeira. \nHá pessoas nas ruas.",
            "\nO cheiro é de chuva e terra molhada, e no fundo, um típico cheiro de pão assando.",
            "\nWilliam está se sentindo curioso em conhecer a vila, também se sente com fome.",

            new Action[]{
                    new Action("Entrar na vila", () -> System.out.println("William entrou na vila"))
            }
    );

    Scene scene2 = new Scene(
            "William vê a praça principal da vila, há uma fonte de água feita toda em concreto, " +
                    "pessoas comprando com comerciantes, crianças brincando com duas espadas de madeira ao lado da fonte, " +
                    "há dois andarilhos bêbados dormindo, um de cada lado da praça, um deles ao lado de William, ele acha curioso. " +
                    "\nUm rapaz vestido com uma túnica azul e uma boina marrom de veludo está olhando para William, " +
                    "com uma feição de curiosidade, como se William não fosse daquele mundo." +
                    "\nHá uma alta porta dupla de madeira seguindo reto em direção a fonte, parece ligar para outra parte da vila",
            "\nO cheiro de terra molhada é cessado pelo cheiro de álcool vindo do andarilho ao lado.",
            "\nWilliam está desconfortável com o olhar do rapaz de túnica azul, mas ainda está com fome.",

            new Action[]{
                    new Action("Conversar com o rapaz da túnica", () -> GameFlow.talkToNPC(entities.GameCharacters.juksePunktet)),
                    new Action("Voltar para fora da vila", () -> GameFlow.goToScene(1))
            }
    );
}
