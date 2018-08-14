package ndk.vlottery;

import android.support.v4.util.Pair;

import ndk.utils.activities.Splash_Base_URL;

public class Activity_Splash extends Splash_Base_URL {

    @Override
    protected String configure_GET_CONFIGURATION_URL() {
        return null;
    }

    @Override
    protected String configure_UPDATE_URL() {
        return null;
    }

    @Override
    protected String configure_APPLICATION_NAME() {
        return Application_Specification.APPLICATION_NAME;
    }

    @Override
    protected Class configure_NEXT_ACTIVITY_CLASS() {
        return null;
    }

    @Override
    protected Pair[] configure_NEXT_ACTIVITY_CLASS_EXTRAS() {
        return new Pair[0];
    }
}
