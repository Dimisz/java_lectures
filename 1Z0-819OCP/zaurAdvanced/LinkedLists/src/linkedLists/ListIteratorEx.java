package linkedLists;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> charList = new LinkedList<>();
        for(char c : s.toCharArray()){
            charList.add(c);
        }
        System.out.println(charList);

        ListIterator<Character> iterator = charList.listIterator();
        ListIterator<Character> reverseIterator = charList.listIterator(charList.size());
        boolean isPalindrome = true;
        while(iterator.hasNext() && reverseIterator.hasPrevious()){
            char ascendingChar = iterator.next();
            char descendingChar = reverseIterator.previous();
            if(ascendingChar != descendingChar){
                isPalindrome = false;
                break;
            }
        }
        System.out.println(isPalindrome);
    }
}
