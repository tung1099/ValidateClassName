import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {

    public static final String NAME_REGEX = "^[C|A|P]+[0-9]{4}+[G|H|I|K|L|M]";

    public ClassName() {
    }

    public boolean validate(String inputClassName){
        Pattern pattern = Pattern.compile(NAME_REGEX);
        Matcher matcher = pattern.matcher(inputClassName);
        return matcher.matches();
    }
}
