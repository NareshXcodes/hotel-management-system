import java.util.regex.Pattern ;
import java.util.regex.Matcher ;

public class Customer {
    private String name ;
    private String Id ;
    private String phone ;
    private String email ;
    private final String emailPattern = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private final String phonePattern = "\\d{10}";
    boolean validation(String emailId , String phoneNo){
        boolean answer = false;
        if(emailId.matches(this.emailPattern) || phoneNo.matches(this.phonePattern)){
            if(phoneNo.matches(this.phonePattern) && emailId.matches(this.emailPattern) ){
                answer = true ;
            }
            else{
                answer =  false;
            }
        }
        return answer ;
    }
}
