import java.util.Scanner;
public class EligibilityOfAdmission {
    public static void main(String []args){
        Scanner s1=new Scanner(System.in);

        System.out.println("ENTER MCA MARKS:");
        int mca=s1.nextInt();

        System.out.println("ENTER BCA MARKS: ");
        int bca=s1.nextInt();

        System.out.println("ENTER BA MARKS: ");
        int ba=s1.nextInt();


        if(mca>=50 && bca>=50 && ba>=50){
            System.out.println("ELIGIBLE FOR ADMISSION:");
        }
        else{
            System.out.println("NOT ELIGIBLE FOR ADMISSION:");
        }
        s1.close();
    }
}
