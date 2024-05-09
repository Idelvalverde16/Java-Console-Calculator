public class Variables {
    public static void main (String[] args) {

        String[][] player = {
                {"FC Barcelona", "Spain", "Robert Lewandowski"},
                {"Manchester City", "England", "Kevin de Bruyne"},
                {"Paris Saint-Germain", "France", "Kylian Mbappe"}
        };

        int[][] playerNumber = {
                {9},
                {17},
                {7}
        };

        System.out.println("Hello, this is Skysports. We are currently in an interview with " + player[0][2] + ". He is " + player[0][0] + "'s number " + playerNumber[0][0] + ".");


    }
}
