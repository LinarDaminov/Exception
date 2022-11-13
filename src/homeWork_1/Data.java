package homeWork_1;//Создан статический метод , принимающий три параметра: login, password и confirmPassword.

public class Data {

public static void main(String[] args) {
    System.out.println(checkCredentials("hgkgk", "55555555", "GG125355"));
    }

    public static boolean checkCredentials(String login, String password, String confirmPassword) {
        try {
            return CredentialValidator.validateCredentials(login, password, confirmPassword);
        } catch (WrongLoginException e) {
            System.out.println("Ошибка при валидации логина " + e.getMessage());
            return false;
        } catch (WrongPasswordException e) {
            System.out.println("Ошибка при валидации пароля " + e.getMessage());
            return false;
        }
   }
}

