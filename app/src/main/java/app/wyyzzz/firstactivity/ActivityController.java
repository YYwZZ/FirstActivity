package app.wyyzzz.firstactivity;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wuyuanyang on 24/09/2017.
 */

public class ActivityController {

    //Field
    public static List<Activity> activities = new ArrayList<>();

    //Constructor
    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for(Activity activity : activities){
            if(!activity.isFinishing());
            activity.finish();
        }
        activities.clear();
    }
}
