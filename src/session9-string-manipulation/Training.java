public class Training {
    public static void main(String[] args) throws Exception {
        String text = "Learning Java String Method";

        // length()
        System.out.println("Length: " + text.length());

        // substring()
        System.out.println("Substring wants to take 'Java': " + text.substring(9, 14));
        System.out.println("Substring takes 'Java' till the end: " + text.substring(9));

        // charAt()
        System.out.println("Char at last index: " + text.charAt(text.length() - 1));

        // replace()
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));

        // contains()
        System.out.println("Is the string contains 'Java'? " + text.contains("Java"));

        // format() + charAt() + codePointAt()
        System.out.println(String.format("Code point (decimal) at index 7 (%c) is: %d", text.charAt(7), text.codePointAt(7)));

        // getBytes()
        System.out.println("Convert the text into bytes: " + text.getBytes());

        String fullName = "Rendy Elang";

        String firstName = fullName.split(" ")[0];
        String lastName = fullName.substring(fullName.lastIndexOf(" ") + 1);
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
    }
}
