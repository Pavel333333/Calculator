import java.util.Objects;
import java.util.Optional;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Input:");
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Output:");
        String result = calc(input);
        System.out.println(result);
    }
    public static String calc(String input){

        int[] arrArab = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arrMathSign = new String[] {"+", "-", "*", "/"};
        String[] arrRom = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arrArab2 = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        //разбиваем входящую строку на подстроки по разделителю "пробел"
        //и записываем в массив
        String result = "";
        String[] parts = input.split(" ");

        //если кол-во подстрок не равно 3, то отбой
        if(parts.length > 3){
            System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
            System.exit(0);
        }
        if(parts.length < 3){
            System.out.println("throws Exception //т.к. строка не является математической операцией");
            System.exit(0);
        }
//      присваиваем строки трём подстрокам
        String part0 = parts[0];
        String part1 = parts[1];
        String part2 = parts[2];

//      переменные для вычислений
        int value0 = 0;
        String value1 = " ";
        int value2 = 0;
        int res = 0;

//        пытался реализовать красиво, но не вышло
//        for(int i = 0, j = 0, a = 0; i<arrRom.length && j<arrMathSign.length && a<arrArab2.length; i++, j++, a++){
//            if (Objects.equals(arrRom[i], part0) && Objects.equals(arrRom[i], part2)){
//                  part0 = arrRom[i]; part2 = arrRom[i];
//              }
//            else if (Objects.equals(arrRom[i], part0) && Objects.equals(arrArab2[a], part2)){
//                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
//                System.exit(0);
//            }
//            if (Objects.equals(arrMathSign[j], part1)) {
//                part1 = arrMathSign[j];
//            }
//            else if (!Objects.equals(arrMathSign[j], part1)) {
//                System.out.println("throws Exception //т.к. строка не является математической операцией");
//                System.exit(0);}
//        }

//      конвертация римских в арабские
        value0 = Convert.RomToArab(part0);
        value1 = part1;
        value2 = Convert.RomToArab(part2);

//    присвоение переменной для строки со знаками для последующих исключений
      int sign = Convert.SignToInt(value1);

//        System.out.println(value0 + value2);

//    исключения
        switch(sign){
            case 8:
            System.out.println("throws Exception //т.к. строка не является математической операцией");
            System.exit(0);
            case 13:
                System.out.println("throws Exception //т.к. строка не является математической операцией");
                System.exit(0);
            case 21:
                System.out.println("throws Exception //т.к. строка не является математической операцией");
                System.exit(0);
            case 34:
                System.out.println("throws Exception //т.к. строка не является математической операцией");
                System.exit(0);
        }
//      специальные переменные для точной отработки исключений
        int check0 = Convert.StrToInt(part0);
        int check2 = Convert.StrToInt(part2);
        int arabNotArr55 = 0;
        int arabNotArr89 = 0;

        try {
            arabNotArr55 = Integer.parseInt(part0);
        } catch (NumberFormatException e) {
        }

        try {
            arabNotArr89 = Integer.parseInt(part2);
        } catch (NumberFormatException e) {
        }

        for (int i : arrArab) {
            if (value0 == 34 && value2 == 34 && check0 == 21 && check2 != 21 && arabNotArr55 == 55 && arabNotArr89 == i) {
                System.out.println("throws Exception //т.к. первое число выходит за рамки допустимых значений арабских цифр");
                System.exit(0);
            }
        }
        for (int i : arrArab) {
            if (value0 == 34 && value2 == 34 && check0 != 21 && check2 == 21 && arabNotArr55 == i && arabNotArr89 == 89) {
                System.out.println("throws Exception //т.к. второе число выходит за рамки допустимых значений арабских цифр");
                System.exit(0);
            }
        }

//      ещё специальные переменные для точной отработки исключений
        int arabNotArr0 = 55;
        int arabNotArr2 = 89;

        try {
            arabNotArr0 = Integer.parseInt(part0);
            } catch (NumberFormatException e) {
            }

        try {
            arabNotArr2 = Integer.parseInt(part2);
        } catch (NumberFormatException e) {
        }

        if(check2 == 0 && sign == 5){
            System.out.println("throws Exception //я работаю с арабскими числами от 1 до 10 включительно и на ноль делить нельзя");
            System.exit(0);
        }

        if(check0 == 0 || check2 == 0){
            System.out.println("throws Exception //я работаю с арабскими числами от 1 до 10 включительно");
            System.exit(0);
        }

        if (value0 != 34 && value2 == 34 && check0 == 21 && check2 != 21 && arabNotArr0 == 55 && arabNotArr2 != 55) {
            System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
            System.exit(0);
        }

        if (value0 == 34 && value2 != 34 && check0 != 21 && check2 == 21 && arabNotArr0 != 89 && arabNotArr2 == 89) {
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                System.exit(0);
        }

        for (int i : arrArab) {
            if (value0 == 34 && value2 == 34 && check0 == 21 && check2 != 21 && arabNotArr0 == 55 && arabNotArr2 == i) {
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления и/или первое число выходит за рамки допустимых значений римских цифр");
                System.exit(0);
            }
        }
        for (int i : arrArab) {
            if (value0 == 34 && value2 == 34 && check0 != 21 && check2 == 21 && arabNotArr0 == i && arabNotArr2 == 89) {
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления и/или второе число выходит за рамки допустимых значений римских цифр");
                System.exit(0);
            }
        }

        for (int i : arrArab) {
            if (value0 == 34 && value2 == 34 && check0 == 21 && check2 == 21 && arabNotArr0 == 55 && arabNotArr2 != i) {
                System.out.println("throws Exception //т.к. числа выходят за рамки допустимых значений");
                System.exit(0);
            }
        }

        for (int i : arrArab) {
            if (value0 == 34 && value2 == 34 && check0 == 21 && check2 == 21 && arabNotArr0 != i && arabNotArr2 == 89) {
                System.out.println("throws Exception //т.к. числа выходят за рамки допустимых значений");
                System.exit(0);
            }
        }

        if (value0 == 34 && value2 != 34 && check0 == 21 && check2 == 21 && arabNotArr0 == 55 && arabNotArr2 == 89) {
            System.out.println("throws Exception //т.к. первое число выходит за рамки допустимых значений римских цифр");
            System.exit(0);
        }

        if (value0 != 34 && value2 == 34 && check0 == 21 && check2 == 21 && arabNotArr0 == 55 && arabNotArr2 == 89) {
            System.out.println("throws Exception //т.к. второе число выходит за рамки допустимых значений римских цифр");
            System.exit(0);
        }

        if (value0 < value2 && value0 != 0 && value2 !=0 && sign == 2){
            System.out.println("throws Exception //т.к. в римской системе нет отрицательных чисел");
            System.exit(0);}

        // упражнялся с условиями, но...
//        if (value0 == 0 && value2 == 0 && !Objects.equals(arrRom[0], part0) || !Objects.equals(arrRom[1], part0) || !Objects.equals(arrRom[2], part0) || !Objects.equals(arrRom[3], part0) || !Objects.equals(arrRom[4], part0) || !Objects.equals(arrRom[5], part0) || !Objects.equals(arrRom[6], part0) || !Objects.equals(arrRom[7], part0) || !Objects.equals(arrRom[8], part0) || !Objects.equals(arrRom[9], part0)
//                || !Objects.equals(arrRom[0], part2) && !Objects.equals(arrRom[1], part2) || !Objects.equals(arrRom[2], part2) || !Objects.equals(arrRom[3], part2) || !Objects.equals(arrRom[4], part2) || !Objects.equals(arrRom[5], part2) || !Objects.equals(arrRom[6], part2) || !Objects.equals(arrRom[7], part2) || !Objects.equals(arrRom[8], part2) || !Objects.equals(arrRom[9], part2))){
//            System.out.println("throws Exception //т.к. введены неиспользуемые значения");
//            System.exit(0);
//        }

//      вычисления для римских
        if(sign == 1) {
            res = value0 + value2;
        } else if(sign == 2) {
            res = value0 - value2;
        } else if(sign == 3) {
            res = value0 * value2;
        } else if(sign == 5) {
            try {  res = value0 / value2;
            } catch (ArithmeticException e) {
            }
        }

        result = Convert.ArabToRom(res);

//      отправляем результат по римским на консоль
        if (Objects.equals(arrRom[0], part0) || Objects.equals(arrRom[1], part0) || Objects.equals(arrRom[2], part0) || Objects.equals(arrRom[3], part0) || Objects.equals(arrRom[4], part0) || Objects.equals(arrRom[5], part0) || Objects.equals(arrRom[6], part0) || Objects.equals(arrRom[7], part0) || Objects.equals(arrRom[8], part0) || Objects.equals(arrRom[9], part0)
                && Objects.equals(arrRom[0], part2) || Objects.equals(arrRom[1], part2) || Objects.equals(arrRom[2], part2) || Objects.equals(arrRom[3], part2) || Objects.equals(arrRom[4], part2) || Objects.equals(arrRom[5], part2) || Objects.equals(arrRom[6], part2) || Objects.equals(arrRom[7], part2) || Objects.equals(arrRom[8], part2) || Objects.equals(arrRom[9], part2)){
            return result;
        }

//      переводим строки с арабскими в int
        value0 = Convert.StrToInt(part0);
        value2 = Convert.StrToInt(part2);

       if (value0 == 21 && value2 == 21) {
                System.out.println("throws Exception //т.к. числа выходят за рамки допустимых арабских значений");
                System.exit(0);
       }

//      вычисления для арабских
        if(sign == 1) {
            res = value0 + value2;
        } else if(sign == 2) {
            res = value0 - value2;
        } else if(sign == 3) {
            res = value0 * value2;
        } else if(sign == 5 && value2 == 0) {
            System.out.println("throws Exception //делить на ноль нельзя");
            System.exit(0);
        } else if (sign == 5){
             res = value0 / value2;
        }

//      переводим результат в строку
        result = Integer.toString(res);

//      отправляем на консоль
        return result;

    }

}
