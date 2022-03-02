// package ExceptionHandling.iAssess_2;

public class UserBO {
    public static void validate(User u) throws WeakPasswordException {
        if (!((u.password.length() > 10 && u.password.length() <= 20) && containsDigit(u.password) && containsLetter(u.password) && containsSpecial(u.password)))
            throw new WeakPasswordException();
    }

    private static boolean containsDigit(String str) {
        for (char c : str.toCharArray()) {
            if (c >= 48 && c <= 57)
                return true;
        }
        return false;
    }

    private static boolean containsSpecial(String str) {
        for (char c : str.toCharArray()) {
            if (!(c >= 48 && c <= 57) && !(c >= 65 && c <= 90) && !(c >= 97 && c <= 122))
                return true;
        }
        return false;
    }

    private static boolean containsLetter(String str) {
        for (char c : str.toCharArray()) {
            if ((c >= 65 && c <= 90) || (c >= 97 && c <= 122))
                return true;
        }
        return false;
    }

}
