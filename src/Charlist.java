import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
    private Charlist(List<Character> list){
        container =new ArrayList<>();
        container.addAll(list);

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

   public Charlist replaceFirst(Character c) {
        container.set(0,c);
        return new Charlist(container);
    }



    public boolean isEmpty() {
        return container.isEmpty();
    }

    public boolean contains(Character character) {
        return container.contains(character);
    }

    public Charlist sortedList(){
        Collections.sort(container);
        return new Charlist(container);
    }
   public Charlist mixedList(){
        Collections.shuffle(container);
        return new Charlist(container);
    }

    public Charlist reversList(){
        Collections.reverse(container);
        return new Charlist(container);
    }
    public Charlist clearList(){
        container.clear();
        return new Charlist(container);
    }
    public  Charlist removeAll( Character c){
        container.removeAll(Collections.singleton(c));
        return new Charlist(container) ;

    }
    public Charlist removeFirst(Character c) {
        container.remove(c);
        return new Charlist(container);
    }


}
