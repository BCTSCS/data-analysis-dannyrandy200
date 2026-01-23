import java.util.ArrayList;
public class Re {
    public static void main(String[] args) {
        String re="([A-Za-z0-9]+),(-?\\d+.\\d+)";
        // String text= "BAABBAAB";

        // ArrayList<String> text = FileOperator.getStringList("posts.txt");

        ArrayList<String> text = FileOperator.getStringList("sentiments.txt");

        
        for (String line : text) {
            if (line.matches(re)) {
                System.out.println(line);
            }
            else {
                System.out.println("No match found");
            }
        }
    }
}
