import java.util.ArrayList;
import java.util.List;

public class Charlist {

    List<Character> container;

    Charlist() {
        container = new ArrayList<>();
    }

    Charlist(String inputText) {
        char[] chars = inputText.toCharArray();
        container = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            container.add(chars[i]);
        }
    }

    public String toString(){
      return container.toString();
    };

    public int length(){
        return container.size();
    }

    public char charAt(int index){
        return container.get(index);
    }

    public int indexOf(char c){
        return container.indexOf(c);
    }
}
