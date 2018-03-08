package webview.rea.com.webview;

import android.app.Application;

/**
 * Created by wiki on 2018/3/8.
 */

public class WebViewLibrary {
    private static Application application;
    public static void init(Application application){
        WebViewLibrary.application = application;
    }

    public static Application get(){
        return application;
    }
}
