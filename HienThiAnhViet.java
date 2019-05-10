package season1.HienThiAnhViet;

import java.util.Scanner;

public class HienThiAnhViet {
    public static void main(String[] args) {
        System.out.print("Nhập số cần đổi: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number<10 && number>0){
            switch (number){
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("for");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("sive");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
                default:
                        System.out.print("out of ability");
            }
        } else if (number>=10 && number < 20){
            int hangDonVi;
            hangDonVi = number%10;
            switch (hangDonVi){
                case 1:
                    System.out.print("eleventh");
                    break;
                case 2:
                    System.out.print("twelfth");
                    break;
                case 3:
                    System.out.print("thirteen");
                    break;
                case 4:
                    System.out.print("fourteen");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eighteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
                case 0:
                    System.out.print("ten");
                    break;
            }
        } else  if(number>=20 && number<100){
            int hangChuc = number/10;
            int hangDonVi = number%10;
            switch (hangChuc){
                case 2:
                System.out.print("twenty");
                    break;
                case 3:
                    System.out.print("thirty");
                    break;
                case 4:
                    System.out.print("forty");
                    break;
                case 5:
                    System.out.print("fifty");
                    break;
                case 6:
                    System.out.print("sixty");
                    break;
                case 7:
                    System.out.print("seventy");
                    break;
                case 8:
                    System.out.print("eightty");
                    break;
                case 9:
                    System.out.print("ninety");
                    break;
            }
            switch (hangDonVi){
                case 1:
                    System.out.print(" one");
                    break;
                case 2:
                    System.out.print(" two");
                    break;
                case 3:
                    System.out.print(" three");
                    break;
                case 4:
                    System.out.print(" for");
                    break;
                case 5:
                    System.out.print(" five");
                    break;
                case 6:
                    System.out.print(" six");
                    break;
                case 7:
                    System.out.print(" seven");
                    break;
                case 8:
                    System.out.print(" eight");
                    break;
                case 9:
                    System.out.print(" nine");
                    break;
            }
        } else if(number >=100 && number < 120){
            int hangTram = number/100;
            int hangChuc = number%10;
            switch (hangTram){
                case 0:
                    break;
                case 1:
                    System.out.print("one hundred and ");
                    break;
                case 2:
                    System.out.print("two hundred and ");
                    break;
                case 3:
                    System.out.print("three hundred and ");
                    break;
                case 4:
                    System.out.print("for hundred and ");
                    break;
                case 5:
                    System.out.print("five hundred and ");
                    break;
                case 6:
                    System.out.print("six hundred and ");
                    break;
                case 7:
                    System.out.print("seven hundred and ");
                    break;
                case 8:
                    System.out.print("eight hundred and ");
                    break;
                case 9:
                    System.out.print("nine hundred and ");
                    break;
            }
            switch (hangChuc){
                case 1:
                    System.out.print("eleventh");
                    break;
                case 2:
                    System.out.print("twelfth");
                    break;
                case 3:
                    System.out.print("thirteen");
                    break;
                case 4:
                    System.out.print("fourteen");
                    break;
                case 5:
                    System.out.print("fifteen");
                    break;
                case 6:
                    System.out.print("sixteen");
                    break;
                case 7:
                    System.out.print("seventeen");
                    break;
                case 8:
                    System.out.print("eighteen");
                    break;
                case 9:
                    System.out.print("nineteen");
                    break;
                case 0:
                    System.out.print("ten");
                    break;
            }

        } else if (number >=120 && number<=999){
            int hangTram = number/100;
            int hangChuc = number/10;
            int hangDonVi = number%10;
            switch (hangTram){
                case 1:
                    System.out.print("one hundred ");
                    break;
                case 2:
                    System.out.print("two hundred ");
                    break;
                case 3:
                    System.out.print("three hunfred ");
                    break;
                case 4:
                    System.out.print("for hundred ");
                    break;
                case 5:
                    System.out.print("five hundred ");
                    break;
                case 6:
                    System.out.print("six hundred ");
                    break;
                case 7:
                    System.out.print("seven hundred ");
                    break;
                case 8:
                    System.out.print("eight hundred ");
                    break;
                case 9:
                    System.out.print("nine hundred ");
                    break;
            }
            switch (hangChuc){
                case 2:
                    System.out.print("and twenty");
                    break;
                case 3:
                    System.out.print("and thirty");
                    break;
                case 4:
                    System.out.print("and forty");
                    break;
                case 5:
                    System.out.print("and fifty");
                    break;
                case 6:
                    System.out.print("and sixty");
                    break;
                case 7:
                    System.out.print("and seventy");
                    break;
                case 8:
                    System.out.print("and eightty");
                    break;
                case 9:
                    System.out.print("and ninety");
                    break;
            }
            switch (hangDonVi){
                case 1:
                    System.out.print("and one");
                    break;
                case 2:
                    System.out.print("and two");
                    break;
                case 3:
                    System.out.print("and three");
                    break;
                case 4:
                    System.out.print("and for");
                    break;
                case 5:
                    System.out.print("and five");
                    break;
                case 6:
                    System.out.print("and six");
                    break;
                case 7:
                    System.out.print("and seven");
                    break;
                case 8:
                    System.out.print("end eight");
                    break;
                case 9:
                    System.out.print("end nine");
                    break;
            }
        }
    }
}
