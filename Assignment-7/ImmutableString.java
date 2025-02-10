public class ImmutableString {
    public static void main(String[] args) {
        // Demonstrating immutability of String
        String str = "Hello";
        System.out.println("Original String: " + str);
        
        // Trying to modify the String by concatenation
        str.concat(" World");
        System.out.println("After concat attempt (String is immutable): " + str); // Output will still be "Hello"
        
        // Reassigning with concatenation result
        str = str.concat(" World");
        System.out.println("After reassigning with concat result: " + str); // Output will be "Hello World"

        // Demonstrating mutability of StringBuffer
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("\nOriginal StringBuffer: " + sb);
        
        // Modifying StringBuffer by appending
        sb.append(" World");
        System.out.println("After append (StringBuffer is mutable): " + sb); // Output will be "Hello World"
    }
}

