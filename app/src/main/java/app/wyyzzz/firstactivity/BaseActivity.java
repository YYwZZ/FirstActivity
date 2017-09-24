package app.wyyzzz.firstactivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by wuyuanyang on 24/09/2017.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        Log.d("BaseActivity",getClass().getSimpleName());
        ActivityController.addActivity(this);
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        ActivityController.removeActivity(this);
    }
}
