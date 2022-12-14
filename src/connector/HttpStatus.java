package connector;

/**
 * @author pious
 */

public enum HttpStatus {

    /**
     * Enum.
     */
    SC_OK(200, "OK"),
    SC_NOT_FOUND(404, "File Not Found");

    private final int statusCode;
    private final String reason;

    HttpStatus(int code, String reason) {
        this.statusCode = code;
        this.reason = reason;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getReason() {
        return reason;
    }
}
