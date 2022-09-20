package ss8_clean_code_refactoring.bai_tap;

public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        String score = "";
        boolean drawScore = player1Score == player2Score;
        boolean endScore = player1Score >= 4 || player2Score >= 4;

        if (drawScore) {
            score = getDrawScore(player1Score);
        } else if (endScore) {
            score = getEndScore(player1Score, player2Score);
        } else {
            score = getPlayerScore(player1Score) + " - " + getPlayerScore(player2Score);
        }
        return score;
    }

    public static String getDrawScore(int drawScore) {
        String score = "";
        switch (drawScore) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    public static String getEndScore(int player1Score, int player2Score) {
        String score = "";

        boolean advantagePlayer1 = player1Score - player2Score == 1;
        boolean advantagePlayer2 = player1Score - player2Score == -1;
        boolean winForPlayer1 = player1Score - player2Score >= 2;
        boolean winForPlayer2 = player1Score - player2Score <= -2;

        if (advantagePlayer1) {
            score = "Advantage player1";
        }
        if (advantagePlayer2) {
            score = "Advantage player2";
        }
        if (winForPlayer1) {
            score = "Win for player1";
        }
        if (winForPlayer2) {
            score = "Win for player2";
        }
        return score;
    }

    public static String getPlayerScore(int playerScore) {
        String score = "";
        switch (playerScore) {
            case 0:
                score = "Love";
                break;
            case 1:
                score = "Fifteen";
                break;
            case 2:
                score = "Thirty";
                break;
            case 3:
                score = "Forty";
                break;
        }
        return score;
    }
}
