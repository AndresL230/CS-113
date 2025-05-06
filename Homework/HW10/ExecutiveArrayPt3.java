import java.util.Scanner;
public class ExecutiveArrayPt3
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Executive Array Size: ");

        int size = scan.nextInt();
        scan.nextLine();
        Executive[] executives = new Executive[size];

        for (int i = 0; i < size; i++)
        {
            System.out.print("Enter Employee Name: ");
            String eName = scan.nextLine();

            System.out.print("Enter Email Address: ");
            String eMail = scan.nextLine();

            System.out.print("Enter Phone Number: ");
            String ePhone = scan.nextLine();

            System.out.print("Enter Social Security Number: ");
            String eSoc = scan.nextLine();

            System.out.print("Enter Rate: ");
            Double eRate = scan.nextDouble();

            System.out.print("Enter Bonus Amount: ");
            Double eBonus = scan.nextDouble();
            
            scan.nextLine();

            executives[i] = new Executive(eName, eMail, ePhone, eSoc, eRate);

            try{
                executives[i].awardBonus(eBonus);
            }
            catch (BonusTooHighException e){
                System.out.println(e.getMessage());
            }
        }


        int validBonuses = 0;
        int sumPay = 0;

        for (Executive e: executives)
        {
            if (e.getBonus()>0 && e.getBonus()<10000)
                validBonuses+=1;
            
            sumPay += e.pay();
        }

        System.out.print("Executives with Valid Bonuses: "+validBonuses+
                        "\nExecutive Average Pay: "+(sumPay/size));
    }    
}
