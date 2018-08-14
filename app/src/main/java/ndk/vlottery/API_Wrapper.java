package ndk.vlottery;

import ndk.utils.API_Utils;

/**
 * Created on 13-08-2018 09:27 under VLottery.
 */

public class API_Wrapper{

    public static String get_http_API(String method_name) {

        return API_Utils.get_http_API(method_name, Server_Endpoint.SERVER_IP_ADDRESS, Server_Endpoint.HTTP_API_FOLDER, Server_Endpoint.FILE_EXTENSION);
    }

}
