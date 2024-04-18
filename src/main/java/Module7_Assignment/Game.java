package Module7_Assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Game {
    public static void main(String[] args) {
        Game game = new Game();
        game.showTeamHeadcount(GameType.SOCCER);
        game.showTeamHeadcount(GameType.HOCKEY);
        game.showTeamHeadcount(GameType.RUGBY);
    }

    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void showTeamHeadcount(GameType game) {
        String fileName = "";
        String text = "";

        switch (game) {
            case SOCCER:

                fileName = "soccer.txt";
                text = "Team Headcount - 11 players";
                break;

            case RUGBY:
                fileName = "rugby.txt";
                text = "Team Headcount - 15 players";
                break;

            case HOCKEY:
                fileName = "hockey.txt";
                text = "Team Headcount - 6 players";
                break;
        }

        File file = new File(fileName);
        try {
            file.createNewFile();
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(text);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

