package belhard.java28;

public class Main {

    public static void main(String[] args) {
	int monthNumber = 4;
	if (monthNumber == 12 || monthNumber == 1 ||monthNumber == 2) {
        System.out.println("Зима");
    } else if (monthNumber == 3 || monthNumber == 4 ||monthNumber == 5) {
        System.out.println("Весна");
    } else if (monthNumber == 6 || monthNumber == 7 ||monthNumber == 8) {
        System.out.println("Лето");
    } else {
        System.out.println("Осень");
    }
    }
}
