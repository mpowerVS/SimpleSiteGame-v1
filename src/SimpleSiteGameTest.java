public class SimpleSiteGameTest {
    public static void main(String[] args) {
        SimpleSiteGame game = new SimpleSiteGame();

        int[] locations = {2,3,4};
        game.setLocationCells(locations);

        String userGuess = "2";
        String result = game.check(userGuess);
        String testResult = "FAIL";
        if(result.equals("HIT"))
            testResult = "SUCCESS";
        System.out.println(testResult);
    }
}