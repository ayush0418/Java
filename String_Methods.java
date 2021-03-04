public class String_Methods
{
    public static void main(String[] args)
    {
        String name = "Ayush";
        System.out.println(name);                    // Prints String

        int value = name.length();
        System.out.println(value);                   // prints the length of String

        String lstring = name.toLowerCase();
        System.out.println(lstring);                 // prints the string in lower case

        String ustring = name.toUpperCase();
        System.out.println(ustring);                 // prints the string in upper case

        System.out.println(name.substring(3));       // prints substring from start to end [3 is starting point]
        System.out.println(name.substring(1,4));     // prints substring from start to end {end point is not included}
                                                     // [1 is starting point and 4 is ending point]

        System.out.println(name.replace('A', 'P'));   // replace the char in string with new one
        System.out.println(name.replace("A","Pi"));  // replace the string with new values.

        System.out.println(name.startsWith("Ay"));  // returns true if the string starts with "A" and false if not.
        System.out.println(name.endsWith("h"));     // returns true if the string ends with "h" and false if not.

        System.out.println(name.charAt(2));         // returns the char at index 2

        String modifiedName = "AyushAyush";
        System.out.println(modifiedName.indexOf("y"));    // returns the first index of the given string starting from first
        System.out.println(modifiedName.indexOf("y",4));  //returns the index of given string starting from index 4

        System.out.println(modifiedName.lastIndexOf("y"));       // returns the first index of the given string starting from last
        System.out.println(modifiedName.lastIndexOf("y",4));  // returns the index of given string within 4 index

        System.out.println(name.equals("Ayush"));    // returns true if the string alphabet and case matches [String is case sensitive]
        System.out.println(name.equalsIgnoreCase("aYusH")); // returns true if the string alphabet matches. ignore case sensitive problem


//  The compareTo() method compares two strings lexicographically(Dictionary order).[ A<B<C<.....<Z<a<b<c<....<z  ]
//  Returns:  An int value: = 0 if the string is equal to the other string.
//                          < 0 if the string is lexicographically less than the other string
//                          > 0 if the string is lexicographically greater than the other string (more characters)

        String A = "hello";
        String B = "world";
//       (h < w) = <0  -->  string A is lexicographically less than string B 
        if(A.compareTo(B) < 0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
