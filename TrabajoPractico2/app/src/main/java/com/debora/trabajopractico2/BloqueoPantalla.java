package com.debora.trabajopractico2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import android.widget.Toast;

public class BloqueoPantalla extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Pantalla desbloqueada detectada", Toast.LENGTH_SHORT).show();
        Log.d("mensaje","Se produjo un evento de desbloqueo");
        llamar(context);
    }
    public void llamar(Context ctx){
        Intent intentLlamada = new Intent(Intent.ACTION_CALL);
        intentLlamada.setData(Uri.parse("tel:2664553747"));
        intentLlamada.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        ctx.startActivity(intentLlamada);
    }
}