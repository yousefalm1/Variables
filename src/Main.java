public class Main {
    public static void main(String[] args) {

//        String firstName = "Yousef";
//        String lastName = "Almasaeed";
        int age = 22;
        int amount = 222;
        boolean married  = false;

//        System.out.println(firstName);
//        System.out.println(lastName);
//        System.out.println(age);
//        System.out.println(amount);
//        System.out.println(married);

//        String deposit = "Deposit";
//        String withdraw = "Withdraw";
//
//
//        System.out.println("The amount is" + " " + amount);
//        System.out.println("Would you like to replace deposit or Withdraw the amount?");

        int amount2 = 5;

        System.out.println(amount2 + " plus " + amount2 + " makes 10" );

        String fullName = "Yousef Almasaeed";
        String[] a = fullName.split(" ");
        String firstName = a[0];
        String lastName = a[1];


        System.out.println("My name is " + firstName.toUpperCase() + " and my last name length is " + lastName.length() );


        System.out.println(lastName.startsWith("A"));

    }

}
