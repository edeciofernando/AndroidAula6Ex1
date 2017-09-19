package br.com.edecio.appcontagem;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by edecio on 14/09/2017.
 */

public class ContagemRegressiva extends AsyncTask<Integer, Integer, Void> {

    private Button btn;
    private TextView txt;

    public ContagemRegressiva(Button btn, TextView txt) {
        this.btn = btn;
        this.txt = txt;
    }

    @Override
    protected Void doInBackground(Integer... params) {
        int num = params[0];
        for (int i=num; i>=0; i--) {
            publishProgress(i);
            SystemClock.sleep(1000);
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        btn.setEnabled(false);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        btn.setEnabled(true);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        int num = values[0];
        if (num > 0) {
            txt.setText(String.valueOf(num));
        } else {
            txt.setText("Fogo!!");
        }
    }
}
