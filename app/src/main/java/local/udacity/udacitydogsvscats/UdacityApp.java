package local.udacity.udacitydogsvscats;

import android.app.Application;
import org.xutils.x;

public class UdacityApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(false);
    }
}
