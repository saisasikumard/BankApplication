import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
        //create first Account
        HDFCAccount hdfcAccount1=new HDFCAccount("Sasi",100000,"abc@12345");
        System.out.println("Congrats! " +hdfcAccount1.getName()+"Your Account has been created with account number: "+hdfcAccount1.getAccountNo());

        //create second Account
        HDFCAccount hdfcAccount2=new HDFCAccount("vamsi",200000,"12345");
        System.out.println("Congrats! " +hdfcAccount2.getName()+"Your Account has been created with account number: "+hdfcAccount2.getAccountNo());

        //add money to first account
        hdfcAccount1.addMoney(20000);

        //change password with incorrect password
        System.out.println(hdfcAccount1.withdrawMoney("abc@12345",50000));

        //change password for first account
        System.out.println( hdfcAccount1.withdrawMoney("fbisdb",50000));

        //fetch balance for first account
        System.out.println(hdfcAccount1.fetchBalance("abc@12345"));

        //change Password
        System.out.println(hdfcAccount1.changePassword("Password","abc@12345"));

        //calculate Interest
        System.out.println("Enter the years of interest: ");
        int years=sc.nextInt();
        System.out.println("Interest for "+years+" years is:"+hdfcAccount1.claculateInterest(years));
    }
}