import java.util.ArrayList;

public class SimpleSite {
    private ArrayList<String> locationCells;
    //int numOfHits = 0;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }
    public String check(String userGuess){
        int guess = Integer.parseInt(userGuess);
        String result = "MISS";

        int index = locationCells.indexOf(userGuess);
        if (index >= 0){
            locationCells.remove(index);
            if (locationCells.isEmpty())
                result = "SITE is DOWN!";
            else
                result = "HIT!";
        }

        System.out.println(result);
        return result;
    }
}
