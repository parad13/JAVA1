package ExceptionHandling.iDesign_3;

public class ContactDetailBO {
    static void validate(String mobile, String alternateMobile) throws DuplicateMobileNumberException {
        if (mobile.equals(alternateMobile))
            throw new DuplicateMobileNumberException();
    }
}
