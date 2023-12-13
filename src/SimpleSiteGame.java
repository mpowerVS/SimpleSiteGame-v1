public class SimpleSiteGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleSite game = new SimpleSite();

        int randomNumber = (int) (Math.random()*4 + 1);
        int[] locations = {randomNumber, randomNumber+1, randomNumber+2};
        game.setLocationCells(locations);

        boolean isAlive = true;
        while(isAlive == true){
            String guess = helper.getUserInput("Enter the number");
            String result = game.check(guess);
            numOfGuesses++;
            if(result.equals("SITE is DOWN!")){
                isAlive = false;
                double luck = 3.0/numOfGuesses*100;
                String nValue = (String) String.format("%.2f", luck);
                System.out.println("You used " + numOfGuesses + " tries to finish site! Your luck is " + nValue +"%");
            }
        }
    }
}
