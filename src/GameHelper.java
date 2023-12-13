import java.io.*;
public class GameHelper {
    public String getUserInput(String promt){
        String input = null;
        System.out.print(promt + " ");

        try{
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            input = is.readLine();
            if (input.length() == 0)
                return null;
        } catch(IOException e) {
            System.out.println("Wrong input :(");
        }
        return input;
    }
}
