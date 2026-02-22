public class strings {
    public static void main(String[] args){
        String name = "Password";
       /* B  r  o     c  o  d  e
        0  1  2  3  4  5  6  7
        int length = name.length();
        0
        char letter = name.charAt(2);
        0 (sout(length))
        int index= name.indexOf("c");
        4
        int lastIndex = name.lastIndexOf("o");
        5
        name = name.toUpperCase();
      BRO CODE
        name = name.toLowerCase();
      bro code
        name = name.trim();
        if not then output will have before and after space as it has but after trimming no spaces
        name = name.replaceAll("o","a");
        bra cade


        if (name.isEmpty()){
            System.out.println("your name is empty");
        }
        else {
            System.out.println("hello "+ name);
        }

        if(name.contains(" ")){
            System.out.println("your name contains spaces");
        }
        else {
            System.out.println("your name dosent contains spaces");
        }

        */
        if(name.equalsIgnoreCase("password")){
            System.out.println("your name cant be password");
//            how ever this is not case sensitive
        }
        else {
            System.out.println("hello "+ name);
        }
    }
}