import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    public List<Character> getContainer() {
        return container;
    }

    public void setContainer(List<Character> container) {
        this.container = container;
    }

    public String toString() {
        return container.toString();
    }

    ;

    public int length() {
        return container.size();
    }

    public char charAt(int index) {
        return container.get(index);
    }

    public int indexOf(char c) {
        return container.indexOf(c);
    }

    List<Character> subString(int start, int end) {
        return container.subList(start, end);
    }

    List<Character> removeDuplicates() {
        return getContainer().stream().distinct().collect(Collectors.toList());
    }

    /*List<Character> replaceFirst(Character c) {
        return container.stream().findFirst().
    }

    List<Character> removeAll() {
        return getContainer().removeAll();
    }*/

    public boolean isEmpty() {
        return container.isEmpty();
    }
    public boolean contains(Character character){
        return  container.contains(character);
    }

    List<Character> charListSorted(){
        return Collections.sort();
    }


}
