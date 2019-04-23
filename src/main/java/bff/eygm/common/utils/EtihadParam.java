package bff.eygm.common.utils;

/**
 * @author Nimesha on 10/26/2018 1:12 PM
 */
public class EtihadParam {

    /**
     * Response error codes from etihad
     */
    public static final String EC_SUCCESS =                         "0000";
    public static final String EC_INTERNAL_SERVER_ERROR =           "0100";
    public static final String EC_BAD_REQUEST =                     "0005";
    public static final String EC_UNAUTHORIZED =                    "E0000004";


    /**
     * BFF Error codes
     */
    ////////////////////
    // Auth Server
    ////////////////////
    public static final String BFF_EC_INVALID_PRIVATE =             "BF_AU0001";
    public static final String BFF_EC_REFRESH_TOKEN_EXPIRED =       "BF_AU0002";
    public static final String BFF_EC_ACCESS_TOKEN_EXPIRED =        "BF_AU0003";
    public static final String BFF_EC_INVALID_LOYL_CLIENT_ID =      "BF_AU0004";

    /**
     * Sever key used to validate internal service call
     */
    public static final String SERVER_SECRET = "67a1098d2537443991c89c202be6df262fead13d110d401a9658e1a42d15ce21";

}
