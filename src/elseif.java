public class elseif {
    public static void main (String[] args){
        int age = 66;


        if( age >= 18) {
            System.out.println("you are an adult");
        }
        else if( age >= 60) {
            System.out.println("you are senior citizen");

        }
//        ALWAYS REMMEBER THE CODE IS READ FROM TOP TO BOTTOM SO WRITE IN COORECT SEQUENCE
        else if( age == 0) {
                System.out.println(" you are just born");
            }
        else if( age <= 0 ){
                    System.out.println("you are not yet born");
                }

        else{
            System.out.println(" you are a child");
        }
    }
}