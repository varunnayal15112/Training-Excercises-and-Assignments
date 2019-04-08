package services;

import java.util.regex.Pattern;

public class FieldValidation {

    public boolean emailIDValidation( String emailID) {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (emailID == null)
            return false;
        return pat.matcher(emailID).matches();
    }
}
