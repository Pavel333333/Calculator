import java.util.Objects;

public class Convert {

public static void main(String[] args) {

}
    static int RomToArab(String Rome) {
        int result = 0;
        if (Rome.equals("I")) return 1;
        if (Rome.equals("II")) return 2;
        if (Rome.equals("III")) return 3;
        if (Rome.equals("IV")) return 4;
        if (Rome.equals("V")) return 5;
        if (Rome.equals("VI")) return 6;
        if (Rome.equals("VII")) return 7;
        if (Rome.equals("VIII")) return 8;
        if (Rome.equals("IX")) return 9;
        if (Rome.equals("X")) return 10;
        return result;
    }

    static int StrToInt(String Arab) {
        int result = 0;
        if (Arab.equals("1")) return 1;
        if (Arab.equals("2")) return 2;
        if (Arab.equals("3")) return 3;
        if (Arab.equals("4")) return 4;
        if (Arab.equals("5")) return 5;
        if (Arab.equals("6")) return 6;
        if (Arab.equals("7")) return 7;
        if (Arab.equals("8")) return 8;
        if (Arab.equals("9")) return 9;
        if (Arab.equals("10")) return 10;
        return result;
    }

    static int SignToInt (String Sign) {
        int result = 0;
        if (Sign.equals("+")) return 1;
        if (Sign.equals("-")) return 2;
        if (Sign.equals("*")) return 3;
        if (Sign.equals("/")) return 5;
        if (!Objects.equals(Sign, "+")) return 8;
        if (!Objects.equals(Sign, "-")) return 13;
        if (!Objects.equals(Sign, "*")) return 21;
        if (!Objects.equals(Sign, "/")) return 34;
        return result;
    }

    static String ArabToRom(int arab) {
        String result = "";
        if (arab == 1) return "I";
        if (arab == 2) return "II";
        if (arab == 3) return"III";
        if (arab == 4) return "IV";
        if (arab == 5) return "V";
        if (arab == 6) return "VI";
        if (arab == 7) return "VII";
        if (arab == 8) return "VIII";
        if (arab == 9) return "IX";
        if (arab == 10) return "X";
        if (arab == 11) return "XI";
        if (arab == 12) return "XII";
        if (arab == 13) return "XIII";
        if (arab == 14) return "XIV";
        if (arab == 15) return "XV";
        if (arab == 16) return "XVI";
        if (arab == 17) return "XVII";
        if (arab == 18) return "XVIII";
        if (arab == 19) return "XIX";
        if (arab == 20) return "XX";
        if (arab == 21) return "XXI";
        if (arab == 22) return "XXII";
        if (arab == 23) return "XXIII";
        if (arab == 24) return "XXIV";
        if (arab == 25) return "XXV";
        if (arab == 26) return "XXVI";
        if (arab == 27) return "XXVII";
        if (arab == 28) return "XXVIII";
        if (arab == 29) return "XXIX";
        if (arab == 30) return "XXX";
        if (arab == 31) return "XXXI";
        if (arab == 32) return "XXXII";
        if (arab == 33) return "XXXIII";
        if (arab == 34) return "XXXIV";
        if (arab == 35) return "XXXV";
        if (arab == 36) return "XXXVI";
        if (arab == 37) return "XXXVII";
        if (arab == 38) return "XXXVIII";
        if (arab == 39) return "XXXIX";
        if (arab == 40) return "XL";
        if (arab == 41) return "XLI";
        if (arab == 42) return "XLII";
        if (arab == 43) return "XLIII";
        if (arab == 44) return "XLIV";
        if (arab == 45) return "XLV";
        if (arab == 46) return "XLVI";
        if (arab == 47) return "XLVII";
        if (arab == 48) return "XLVIII";
        if (arab == 49) return "XLIX";
        if (arab == 50) return "L";
        if (arab == 51) return "LI";
        if (arab == 52) return "LII";
        if (arab == 53) return "LIII";
        if (arab == 54) return "LIV";
        if (arab == 55) return "LV";
        if (arab == 56) return "LVI";
        if (arab == 57) return "LVII";
        if (arab == 58) return "LVIII";
        if (arab == 59) return "LIX";
        if (arab == 60) return "LX";
        if (arab == 61) return "LXI";
        if (arab == 62) return "LXII";
        if (arab == 63) return "LXIII";
        if (arab == 64) return "LXIV";
        if (arab == 65) return "LXV";
        if (arab == 66) return "LXVI";
        if (arab == 67) return "LXVII";
        if (arab == 68) return "LXVIII";
        if (arab == 69) return "LXIX";
        if (arab == 70) return "LXX";
        if (arab == 71) return "LXXI";
        if (arab == 72) return "LXXII";
        if (arab == 73) return "LXXIII";
        if (arab == 74) return "LXXIV";
        if (arab == 75) return "LXXV";
        if (arab == 76) return "LXXVI";
        if (arab == 77) return "LXXVII";
        if (arab == 78) return "LXXVIII";
        if (arab == 79) return "LXXIX";
        if (arab == 80) return "LXXX";
        if (arab == 81) return "LXXXI";
        if (arab == 82) return "LXXXII";
        if (arab == 83) return "LXXXIII";
        if (arab == 84) return "LXXXIV";
        if (arab == 85) return "LXXXV";
        if (arab == 86) return "LXXXVI";
        if (arab == 87) return "LXXXVII";
        if (arab == 88) return "LXXXVIII";
        if (arab == 89) return "LXXXIX";
        if (arab == 90) return "XC";
        if (arab == 91) return "XCI";
        if (arab == 92) return "XCII";
        if (arab == 93) return "XCIII";
        if (arab == 94) return "XCIV";
        if (arab == 95) return "XCV";
        if (arab == 96) return "XCVI";
        if (arab == 97) return "XCVII";
        if (arab == 98) return "XCVIII";
        if (arab == 99) return "XCIX";
        if (arab == 100) return "C";
        return result;
    }
}
