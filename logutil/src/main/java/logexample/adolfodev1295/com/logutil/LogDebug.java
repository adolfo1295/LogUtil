package logexample.adolfodev1295.com.logutil;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by user on 05/02/2018.
 */

public class LogDebug {
    public static final String TAG = "Hola";
    public static void hola(String nombre){
        Log.d(TAG,"Hola! "+nombre);
    }
    public static void saludo(Context context, String nombre){
        Toast.makeText(context, "Hola! "+nombre, Toast.LENGTH_SHORT).show();
    }
}
