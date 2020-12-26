package level5and6;

public class ValidationException extends Exception {

    private String ruleName;

   @Override
   public String toString() {
       return "ValidationException{" +
               "ruleName='" + ruleName + '\'' +
               '}';
   }
    public String getRuleName() {
        return ruleName;
    }

    public ValidationException(String ruleName) {
        this.ruleName = ruleName;
    }
}
