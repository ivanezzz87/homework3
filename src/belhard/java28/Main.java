package belhard.java28;

public class Main {

    public static void main(String[] args) {
	int monthNumber = 5;
	if (monthNumber == 12 || monthNumber == 1 ||monthNumber == 2) {
        System.out.println("Зима");
    } else if (monthNumber == 3 || monthNumber == 4 ||monthNumber == 5) {
        System.out.println("Весна");
    } else if (monthNumber == 6 || monthNumber == 7 ||monthNumber == 8) {
        System.out.println("Лето");
    } else {
        System.out.println("Осень");
    }
	String [] myArr = new String [] {"один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять",  "десять"};
	for (int i = myArr.length-1;i >= 0; i--) {
            System.out.println(myArr[i]);
        }
    }
}
