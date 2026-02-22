public class substrings {
    public static void main(String[] args){
//        A substring is a part of a string extracted using the substring() method.

        String email = "shailesh@gmail.com";
//        System.out.println(email.lastIndexOf("h"));
        String username = email.substring(0,8);
//        output is = shailesh
//           String username = email.substring(0,email.indexOf("@"));
//        note @is not included
        String domain = email.substring(email.indexOf("g"));
//        String domain = email.substring(email.indexOf("@")+1);
//        u can put direclty index also and if we want to cover all
//        things till last write only initial
        System.out.println(domain);


    }
} 