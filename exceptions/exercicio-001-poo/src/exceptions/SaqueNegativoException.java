package exceptions;

public class SaqueNegativoException extends RuntimeException {

    public SaqueNegativoException(String message) {
        super(message);
    }


    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
