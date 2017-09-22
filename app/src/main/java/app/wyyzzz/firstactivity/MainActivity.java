package app.wyyzzz.firstactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
    }

    //在layout的xml文件button中注册android：onlick 可以省略一些代码
    public void button1(View view){
        Intent intent = new Intent("app.wyyzzz.firstactivity.ACTION_START");
        //intent.addCategory("app.wyyzzz.firstactivity.MY_CATEGORY");
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

}



