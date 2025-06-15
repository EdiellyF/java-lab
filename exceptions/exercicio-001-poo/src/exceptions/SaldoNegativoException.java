package exceptions;

public class SaldoNegativoException extends  RuntimeException {
    private final String message;

    public SaldoNegativoException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
