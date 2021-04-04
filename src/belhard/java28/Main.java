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
	int [][] squareArray = new int [3][4];
	squareArray[0][0] = 13;
	squareArray[0][1] = 9;
	squareArray[0][2] = 1;
	squareArray[0][3] = 6;
	squareArray[1][0] = 1;
	squareArray[1][1] = 3;
	squareArray[1][2] = 33;
	squareArray[1][3] = 14;
	squareArray[2][0] = 4;
	squareArray[2][1] = 15;
	squareArray[2][2] = 0;
	squareArray[2][3] = 20;

    for (int i = 0; i < 3; i++) {
       for (int j = 0; j < 4; j++) {
           System.out.println(squareArray[i][j] + "[" + i + "]" + "[" + j + "]");
       }
    }
    }
}
