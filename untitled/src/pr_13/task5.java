package pr_13;

public class task5 {
    public static String convertPhoneNumber(String phoneNumber) {
        if (phoneNumber.startsWith("+")) {
            // Формат +<Код страны><Номер 10 цифр>
            String countryCode = phoneNumber.substring(1, phoneNumber.length() - 10);
            String number = phoneNumber.substring(phoneNumber.length() - 10);
            return "+" + countryCode + " " + number.substring(0, 3) + " " + number.substring(3, 6) + "-" + number.substring(6, 8) + "-" + number.substring(8);
        }
        else if (phoneNumber.startsWith("8")) {
            // Формат 8<Номер 10 цифр> для России
            String number = phoneNumber.substring(1);
            return "+7 " + number.substring(0, 3) + " " + number.substring(3, 6) + "-" + number.substring(6, 8) + "-" + number.substring(8);
        }
        else {
            // Некорректный формат номера
            return "Некорректный формат номера";
        }
    }

    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";
        String phoneNumber4 = "0888888888888888888888888888888888888888888";
        System.out.println(convertPhoneNumber(phoneNumber1));
        System.out.println(convertPhoneNumber(phoneNumber2));
        System.out.println(convertPhoneNumber(phoneNumber3));
        System.out.println(convertPhoneNumber(phoneNumber4));
    }
}

