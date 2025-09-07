package ArrayList_with_ListStudients;

public class XuLyTen  {
    public static void xuLyTen(String ten) {
        String firstName;
        String lastName;
        int n= ten.lastIndexOf(" ");
        firstName = ten.substring(n ,ten.length());
        lastName = ten.substring(0 , n);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);

    }


}
