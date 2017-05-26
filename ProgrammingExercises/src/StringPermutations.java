/**
 * Created by rajkumarpurushothaman on 5/23/17.
 */
public class StringPermutations {

    public static void printPermutations(String buffer, String input) {
        int len = input.length();

        if(input.length()==0) {
            System.out.println(buffer);
//            return;
        }

        for(int i=0; i<len;i++) {
//            printPermutations(buffer+input.charAt(i), input.substring(i));
//            printPermutations(input.substring(0,i), input.substring(i));

            printPermutations(buffer +input.charAt(i), input.substring(0,i) + input.substring(i+1,len));
        }

    }


    public static void main(String[] args) {
        printPermutations("","ABC");
    }
}
