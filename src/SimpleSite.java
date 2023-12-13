public class SimpleSite {
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    public String check(String userGuess){
        int guess = Integer.parseInt(userGuess);
        String result = "MISS";

        for(int cell : locationCells){
            if(guess == cell){
                result = "HIT";
                numOfHits++;
                break;
            }
        }

        if(numOfHits == locationCells.length)
            result = "SITE is DOWN!";

        System.out.println(result);
        return result;
    }
}
