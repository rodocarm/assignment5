package us.rodolfocarmen;
import org.apache.commons.codec.language.Soundex;

public class LastNameUtility {
    private Soundex soundex = new Soundex();
    public String encodeLastName(String lastName) throws MissingNameException{
        if (lastName.equals("")){
            throw new MissingNameException("lastName");
        } else{
            return soundex.encode(lastName);
        }
    }
}