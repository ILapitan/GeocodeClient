package by.aboutme.geocode.constant;

/**
 * Available status values for the response.
 */
public enum GeoCodeResponseCode {
    OK("OK"),
    ZERO_RESULTS("ZERO_RESULTS"),
    OVER_QUERY_LIMIT("OVER_QUERY_LIMIT"),
    REQUEST_DENIED("REQUEST_DENIED"),
    INVALID_REQUEST("INVALID_REQUEST"),
    UNKNOWN_ERROR("UNKNOWN_ERROR");

    private String code;

    GeoCodeResponseCode(String code) {
        this.code = code;
    }

    /**
     * Get string value for status code.
     * @return String
     */
    public String code(){
        return code;
    }
}
