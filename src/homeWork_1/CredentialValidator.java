package homeWork_1;

import java.util.Objects;

public class CredentialValidator {
    private static final String INVALID_lENGTH = "Длина может быть от 1 до 20";
    private static final String INVALID_SYMBOL = "Строка должна содержать только латинские буквы, цифры или знаки подчеркивания";
    private static final String PASSWORD_NOT_MATCH = "Пароли не совпадают";

      public static boolean validateCredentials(String login,
                                          String password,
                                          String confirmPassword) {
          if (isLengthNotInRange(login, 1,20)) {
              throw new WrongLoginException();
          }
          if (isSymbolsNotValid(login)) {
              throw new WrongLoginException();
          }
          if (isLengthNotInRange(password, 1,20)) {
              throw new WrongPasswordException(INVALID_lENGTH);
          }
          if (isSymbolsNotValid(password)) {
              throw new WrongPasswordException(INVALID_SYMBOL);
          }
              if (!Objects.equals(password, confirmPassword)) {
                  throw new WrongPasswordException(PASSWORD_NOT_MATCH);
              }
          return true;
   }
    private static boolean validateCredentials(String value) {
        if (value==null|| value.isEmpty()) {
            return false;
        }
        return value.matches("^[a-zA-Z0-9_]{1,20}$");
    }
    private static boolean isLengthNotInRange(String value, int min, int max) {
        if (value == null) {
            return true;}
        int length = value.length();
        return length < min || length > max;
    }

    private static boolean isSymbolsNotValid(String value) {
        if (value==null||value.isEmpty()) {
            return true;
        }
        for (char c: value.toCharArray()) {
            boolean symbolMatches = (c >= 'a' && c <= 'z')
                    || (c >= 'A' && c <= 'Z')
                    || (Character.isDigit(c))
                    || (c == '_');
            if (!symbolMatches) {
                return true;
            }
        }
        return false;
    }
}



