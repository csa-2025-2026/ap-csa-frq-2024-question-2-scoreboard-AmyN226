/*

# Answer close reading 1 questions here


# Answer close reading 2 questions here

*/

public class Scoreboard
{
    private String team1;
    private String team2;
    private String currentTeam;
    private int score1 = 0;
    private int score2 = 0;

    public Scoreboard(String iTeam1, String iTeam2)
    {
        team1 = iTeam1;
        team2 = iTeam2;
        currentTeam = team1;
    }

    public void recordPlay(int points)
    {
        if (points > 0)
        {
            if (currentTeam.equals(team1))
            {
                score1 += points;
            }
            else 
            {
                score2 += points;
            }
        }
        else 
        {
            if (currentTeam.equals(team1))
            {
                currentTeam = team2;
            }
            else 
            {
                currentTeam = team1;
            }
        }
    }

    public String getScore()
    {
        return (score1 + "-" + score2 + "-" + currentTeam);
    }
}