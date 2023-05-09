import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        // Değişkenler tanımlandı
        int km, age, type;
        double price, perKm = 0.10;
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan girişler alındı
        System.out.print("Enter the distance in km type: ");
        km = input.nextInt();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("Enter the type of trip (1 => One Way, 2 => Round Trip): ");
        type = input.nextInt();

        // Km başına ücret hesaplandı
        price = km * perKm;

        // İstenilen koşullara göre fiyat çıkarıldı
        if ((age > 0) && (type == 1 || type == 2)) {
            if (age < 12) {
                price = price - (price * 0.50);
            } else if (age >= 12 && age <= 24) {
                price = price - (price * 0.10);
            } else if (age > 65) {
                price = price - (price * 0.30);
            }
            if (type == 2) {
                price = (price - (price * 0.20)) * 2;

            }
            System.out.println("Total amount: " + price);

        } else {
            System.out.println("You Entered Wrong Data!");
        }

    }
}

