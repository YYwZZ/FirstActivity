package app.wyyzzz.firstactivity;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","Task id is"+getTaskId());
        setContentView(R.layout.main_layout);
    }

    //在layout的xml文件button中注册android：onlick 可以省略一些代码
    public void button1(View view){

        //指定打电话的协议
        /*Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:10086"));
        intent.addCategory("app.wyyzzz.firstactivity.MY_CATEGORY");

        //用intent向下一个活动传递数据
        String data = "hello SecondActivity";
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("extra_data",data);
        startActivity(intent);

        //2.3.5返回数据给上一个活动
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivityForResult(intent ,1);*/

        //2.5.1standard启动模式
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }

    //Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode , int resultCode , Intent data){
        switch (requestCode){
            case 1:
                if(resultCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("MainActivity",returnedData);
                }
                break;
            default:
        }
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

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("MainActivity","onRestart");
    }

}



