import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //List<Character> charList = Arrays.asList('a', 'c','b','1','2','3','1','2','3');
        Charlist myCharList = new Charlist("acb123123");
        System.out.println(myCharList.toString());
        System.out.println(myCharList.length());
        System.out.println(myCharList.charAt(1));
        System.out.println(myCharList.indexOf('c'));
        System.out.println(myCharList.subString(1,3));
        System.out.println(myCharList.removeDuplicates());
        System.out.println(myCharList.isEmpty());
        System.out.println(myCharList.contains('a'));


//        System.out.println(charList);
//        Collections.sort(charList);
//        System.out.println(charList);
//        Collections.reverse(charList);
//        System.out.println(charList);
//        Collections.shuffle(charList);
//        System.out.println(charList);



        }
    }

