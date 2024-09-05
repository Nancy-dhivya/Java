public class StringBuilderBufferExample {

    public static void main(String[] args) {

        // Example with StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        
        // append
        sb.append(" World");
        System.out.println("After append: " + sb.toString()); // Hello World

        // insert
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb.toString()); // Hello Java World

        // replace
        sb.replace(6, 10, "C++");
        System.out.println("After replace: " + sb.toString()); // Hello C++ World

        // delete
        sb.delete(6, 10);
        System.out.println("After delete: " + sb.toString()); // Hello World

        // deleteCharAt
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb.toString()); // HelloWorld

        // reverse
        sb.reverse();
        System.out.println("After reverse: " + sb.toString()); // dlroWolleH

        // setCharAt
        sb.setCharAt(0, 'D');
        System.out.println("After setCharAt: " + sb.toString()); // DlroWolleH

        // charAt
        char ch = sb.charAt(1);
        System.out.println("charAt(1): " + ch); // l

        // length
        int length = sb.length();
        System.out.println("Length: " + length); // 10

        // capacity
        int capacity = sb.capacity();
        System.out.println("Capacity: " + capacity); // Default is 16 + length of the string

        // ensureCapacity
        sb.ensureCapacity(50);
        System.out.println("After ensureCapacity: " + sb.capacity()); // 50
  
        // setLength
        sb.setLength(5);
        System.out.println("After setLength: " + sb.toString()); // DlroW

        // substring
        String substr = sb.substring(1, 4);
        System.out.println("Substring(1, 4): " + substr); // lro

        // indexOf
        int index = sb.indexOf("o");
        System.out.println("Index of 'ro': " + index); // 2

        // lastIndexOf
        int lastIndex = sb.lastIndexOf("o");
        System.out.println("Last index of 'o': " + lastIndex); // 3

        // trimToSize
        sb.trimToSize();
        System.out.println("After trimToSize, Capacity: " + sb.capacity()); // 5

        // getChars
        char[] charArray = new char[3];
        sb.getChars(1, 4, charArray, 0);
        System.out.println("getChars: " + new String(charArray)); // lro

        // codePointAt
        int codePoint = sb.codePointAt(1);
        System.out.println("Code point at index 1: " + codePoint); // Unicode code point of 'l'

        // codePointBefore
        int codePointBefore = sb.codePointBefore(1);
        System.out.println("Code point before index 1: " + codePointBefore); // Unicode code point of 'D'

        // codePointCount
        int codePointCount = sb.codePointCount(0, sb.length());
        System.out.println("Code point count: " + codePointCount); // Number of Unicode code points

        // offsetByCodePoints
        int offset = sb.offsetByCodePoints(0, 3);
        System.out.println("Offset by 3 code points: " + offset); // 3

        // subSequence
        CharSequence subSeq = sb.subSequence(1, 4);
        System.out.println("SubSequence(1, 4): " + subSeq); // lro

        // Repeat the same with StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");

        // You can use all the above methods in a similar way with StringBuffer
    }
}