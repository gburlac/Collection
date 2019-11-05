# Collection
Implement CharList class (like String using ArrayList as value).
Don`t use String objects in CharList class.
All methods excluding constructors and toString should be implemented without "for" expression.
Look at Collections, Lists methods and use them at maximum.
Implement:
CharList()
CharList(String s)
private CharList(ArrayList<Character> list) - it will help you to implement other methods
methods:
1.String toString()
2.int length() - returns CharList length
3.char charAt(int index) - returns char value for the particular index
4.int indexOf(char c) - returns the specified char value index.
5.CharList subString(int start, int end) - returns substring for given begin index.
6.CharList removeDuplicates() - remove duplicates symbols using collections.
7.CharList replaceFirst(Character c) - remove first occurrences of the specified char value.
8.CharList removeAll(Character c) - remove all occurrences of the specified char value.
9.boolean isEmpty() - returns true is CharList is empty
10.boolean contains(Character c) - returns true is CharList contains the specified char value
11.CharList clearList() - returns cleared CharList
12.CharList sortList() - returns sorted CharList
13.CharList reverseList() - returns reversed CharList
14.CharList mixedList() - returns CharList with mixed elements

 

Additional(optional) methods(you can implement them however you want):
boolean trim - removes beginning and ending spaces of this charlist.
CharList concat - concatenates the specified CharList.
CharList replaceAll(CharList old, CharList new) - replaces all occurrences of the specified CharList value.
CharList replaceFirst(CharList old, CharList new) - replaces all occurrences of the specified CharList value.
CharList replaceLast(CharList old, CharList new) - replaces all occurrences of the specified CharList value.
boolean endsWith(CharList charList) - returns true if CharList ends with given charList
CharList toLowerCase - returns a CharList in lowercase.
CharList toUpperCase - returns a CharList in uppercase.
boolean isPalindrome - A palindrome String is a String that is same after reverse. Returns true if CharList is palindrome

 

Test data: 

 

CharList is: acb123123
Index of '1' char is: 3
Length of CharList is: 9
Char on the second place is: b
Substring(from 3 to 5) of CharList is: 12
CharList without duplicate symbols is: a1b2c3
CharList without removed symbols('1', '2') is: acb33
CharList without removed first symbol('1') is: acb23123
CharList contains symbol 'q': false
CharList contains symbol 'a': true
Cleared CharList:
CharList is empty: true
Sorted CharList: 112233abc
Reversed CharList: 321321bca
Mixed CharList: 1a322b13c


split array char

set
