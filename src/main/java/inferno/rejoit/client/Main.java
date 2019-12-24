package inferno.rejoit.client;


import inferno.rejoit.client.handler.GameHandler;
import inferno.rejoit.client.handler.IGameLogic;

public class Main {

    public static void main(String[] args){
        try {
            boolean vSync = true;
            IGameLogic gameLogic = new DummyGame();
            GameHandler gameEng = new GameHandler("GAME", 600, 480, vSync, gameLogic);
            gameEng.run();
        } catch (Exception excp) {
            excp.printStackTrace();
            System.exit(-1);
        }
    }
}
