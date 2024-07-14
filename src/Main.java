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

    public static String calc(String input) {

        int[] arrArab = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] arrMathSign = new String[]{"+", "-", "*", "/"};
        String[] arrRom = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] arrArab2 = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        //разбиваем входящую строку на подстроки по разделителю "пробел"
        //и записываем в массив
        String result = "";
        String[] parts = input.split(" ");

        if (parts.length > 3) {
            try {
                throw new CustomException(parts.length > 3);
            } catch (CustomException e) {
                System.out.println("формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                System.exit(0);
            }
        }

        if (parts.length < 3) {
            try {
                throw new CustomException(parts.length < 3);
            } catch (CustomException e) {
                System.out.println("строка не является математической операцией");
                System.exit(0);
            }
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

//      конвертация римских в арабские
        value0 = Convert.RomToArab(part0);
        value1 = part1;
        value2 = Convert.RomToArab(part2);

//    присвоение переменной для строки со знаками для последующих исключений
        int sign = Convert.SignToInt(value1);

//        System.out.println(value0 + value2);

        if (sign == 8) {
            try {
                throw new CustomException(sign == 8);
            } catch (CustomException e) {
                System.out.println("строка не является математической операцией");
                System.exit(0);
            }
        } else if (sign == 13) {
            try {
                throw new CustomException(sign == 13);
            } catch (CustomException e) {
                System.out.println("строка не является математической операцией");
                System.exit(0);
            }
        } else if (sign == 21) {
            try {
                throw new CustomException(sign == 21);
            } catch (CustomException e) {
                System.out.println("строка не является математической операцией");
                System.exit(0);
            }
        } else if (sign == 34) {
            try {
                throw new CustomException(sign == 34);
            } catch (CustomException e) {
                System.out.println("строка не является математической операцией");
                System.exit(0);
            }
        }

//      специальные переменные для точной отработки исключений
//      перевод строковых арабских в int

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

        if (value0 == 34 && value2 == 34 && check0 == 21 && check2 != 21 && arabNotArr55 == 55 && arabNotArr89 == check2) {
            try {
                throw new CustomException(value0 == 34 && value2 == 34 && check0 == 21 && check2 != 21 && arabNotArr55 == 55 && arabNotArr89 == check2);
            } catch (CustomException e) {
                System.out.println("первое число выходит за рамки допустимых значений арабских цифр");
                System.exit(0);
            }
        }

        if (value0 == 34 && value2 == 34 && check0 != 21 && check2 == 21 && arabNotArr55 == check0 && arabNotArr89 == 89) {
            try {
                throw new CustomException(value0 == 34 && value2 == 34 && check0 != 21 && check2 == 21 && arabNotArr55 == check0 && arabNotArr89 == 89);
            } catch (CustomException e) {
                System.out.println("второе число выходит за рамки допустимых значений арабских цифр");
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

        if (check2 == 0 && sign == 5) {
            try {
                throw new CustomException(check2 == 0 && sign == 5);
            } catch (CustomException e) {
                System.out.println("я работаю с арабскими числами от 1 до 10 включительно и на ноль делить нельзя");
                System.exit(0);
            }
        }

        if (check0 == 0 || check2 == 0) {
            try {
                throw new CustomException(check0 == 0 || check2 == 0);
            } catch (CustomException e) {
                System.out.println("я работаю с арабскими числами от 1 до 10 включительно");
                System.exit(0);
            }
        }

        if (value0 != 34 && value2 == 34 && check0 == 21 && check2 != 21 && arabNotArr0 == 55 && arabNotArr2 != 55) {
            try {
                throw new CustomException(value0 != 34 && value2 == 34 && check0 == 21 && check2 != 21 && arabNotArr0 == 55 && arabNotArr2 != 55);
            } catch (CustomException e) {
                System.out.println("используются одновременно разные системы счисления");
                System.exit(0);
            }
        }

        if (value0 == 34 && value2 != 34 && check0 != 21 && check2 == 21 && arabNotArr0 != 89 && arabNotArr2 == 89) {
            try {
                throw new CustomException(value0 == 34 && value2 != 34 && check0 != 21 && check2 == 21 && arabNotArr0 != 89 && arabNotArr2 == 89);
            } catch (CustomException e) {
                System.out.println("используются одновременно разные системы счисления");
                System.exit(0);
            }
        }

        if (value0 == 34 && value2 == 34 && check0 == 21 && check2 != 21 && arabNotArr0 == 55 && arabNotArr2 == check2) {
            try {
                throw new CustomException(value0 == 34 && value2 == 34 && check0 == 21 && check2 != 21 && arabNotArr0 == 55 && arabNotArr2 == check2);
            } catch (CustomException e) {
                System.out.println("используются одновременно разные системы счисления и/или первое число выходит за рамки допустимых значений римских цифр");
                System.exit(0);
            }
        }

        if (value0 == 34 && value2 == 34 && check0 != 21 && check2 == 21 && arabNotArr0 == check0 && arabNotArr2 == 89) {
            try {
                throw new CustomException(value0 == 34 && value2 == 34 && check0 != 21 && check2 == 21 && arabNotArr0 == check0 && arabNotArr2 == 89);
            } catch (CustomException e) {
                System.out.println("используются одновременно разные системы счисления и/или второе число выходит за рамки допустимых значений римских цифр");
                System.exit(0);
            }
        }

        if (value0 == 34 && value2 == 34 && check0 == 21 && check2 == 21 && arabNotArr0 == 55 && !java.util.Arrays.asList(arrArab).contains(arabNotArr2)) {
            try {
                throw new CustomException(value0 == 34 && value2 == 34 && check0 == 21 && check2 == 21 && arabNotArr0 == 55 && !java.util.Arrays.asList(arrArab).contains(arabNotArr2));
            } catch (CustomException e) {
                System.out.println("числа выходят за рамки допустимых значений");
                System.exit(0);
            }
        }

        if (value0 == 34 && value2 == 34 && check0 == 21 && check2 == 21 && !java.util.Arrays.asList(arrArab).contains(arabNotArr0) && arabNotArr2 == 89) {
            try {
                throw new CustomException(value0 == 34 && value2 == 34 && check0 == 21 && check2 == 21 && arabNotArr0 == 55 && !java.util.Arrays.asList(arrArab).contains(arabNotArr2));
            } catch (CustomException e) {
                System.out.println("числа выходят за рамки допустимых значений");
                System.exit(0);
            }
        }

        if (value0 == 34 && value2 != 34 && check0 == 21 && check2 == 21 && arabNotArr0 == 55 && arabNotArr2 == 89) {
            try {
                throw new CustomException(value0 == 34 && value2 != 34 && check0 == 21 && check2 == 21 && arabNotArr0 == 55 && arabNotArr2 == 89);
            } catch (CustomException e) {
                System.out.println("первое число выходит за рамки допустимых значений римских цифр");
                System.exit(0);
            }
        }

        if (value0 != 34 && value2 == 34 && check0 == 21 && check2 == 21 && arabNotArr0 == 55 && arabNotArr2 == 89) {
            try {
                throw new CustomException(value0 != 34 && value2 == 34 && check0 == 21 && check2 == 21 && arabNotArr0 == 55 && arabNotArr2 == 89);
            } catch (CustomException e) {
                System.out.println("второе число выходит за рамки допустимых значений римских цифр");
                System.exit(0);
            }
        }

        if (value0 < value2 && value0 != 0 && value2 != 0 && sign == 2) {
            try {
                throw new CustomException(value0 < value2 && value0 != 0 && value2 != 0 && sign == 2);
            } catch (CustomException e) {
                System.out.println("в римской системе нет отрицательных чисел");
                System.exit(0);
            }
        }

        if (arabNotArr0 == 55 && arabNotArr2 == 89 && sign == 2) {
            try {
                throw new CustomException(value0 == value2 && sign == 2);
            } catch (CustomException e) {
                System.out.println("в римской системе нет нуля");
                System.exit(0);
            }
        }

//      вычисления для римских
            if (sign == 1) {
                res = value0 + value2;
            } else if (sign == 2) {
                res = value0 - value2;
            } else if (sign == 3) {
                res = value0 * value2;
            } else if (sign == 5) {
                try {
                    res = value0 / value2;
                } catch (ArithmeticException e1) {
                }
            }

            result = Convert.ArabToRom(res);

//      отправляем результат по римским на консоль
            if (Objects.equals(arrRom[0], part0) || Objects.equals(arrRom[1], part0) || Objects.equals(arrRom[2], part0) || Objects.equals(arrRom[3], part0) || Objects.equals(arrRom[4], part0) || Objects.equals(arrRom[5], part0) || Objects.equals(arrRom[6], part0) || Objects.equals(arrRom[7], part0) || Objects.equals(arrRom[8], part0) || Objects.equals(arrRom[9], part0)
                    && Objects.equals(arrRom[0], part2) || Objects.equals(arrRom[1], part2) || Objects.equals(arrRom[2], part2) || Objects.equals(arrRom[3], part2) || Objects.equals(arrRom[4], part2) || Objects.equals(arrRom[5], part2) || Objects.equals(arrRom[6], part2) || Objects.equals(arrRom[7], part2) || Objects.equals(arrRom[8], part2) || Objects.equals(arrRom[9], part2)) {
                return result;
            }

      // переводим строки с арабскими в int
            value0 = Convert.StrToInt(part0);
            value2 = Convert.StrToInt(part2);

        if (check0 == 21 && check2 == 21) {
            try {
                throw new CustomException(check0 == 21 && check2 == 21);
            } catch (CustomException e) {
                System.out.println("числа выходят за рамки допустимых арабских значений");
                System.exit(0);
            }
        }

        if (check0 == 21 || check2 == 21) {
            try {
                throw new CustomException(check0 == 21 || check2 == 21);
            } catch (CustomException e) {
                System.out.println("одно из чисел выходит за рамки допустимых арабских значений. я работаю с числами от 1 до 10");
                System.exit(0);
            }
        }

//      вычисления для арабских
            if (sign == 1) {
                res = value0 + value2;
            } else if (sign == 2) {
                res = value0 - value2;
            } else if (sign == 3) {
                res = value0 * value2;
            }
              else if (sign == 5) {
                res = value0 / value2;
            }

//      переводим результат в строку
            result = Integer.toString(res);

//      отправляем на консоль
            return result;

        }
    }


