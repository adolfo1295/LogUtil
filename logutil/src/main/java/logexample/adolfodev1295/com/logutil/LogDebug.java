package logexample.adolfodev1295.com.logutil;

import android.util.Log;

/**
 * Created by user on 05/02/2018.
 */

public class LogDebug {
    public static final String TAG = "Hola";
    public static void hola(String nombre){
        Log.d(TAG,"Hola! "+nombre);
    }
}
