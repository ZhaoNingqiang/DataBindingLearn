package flower.databindinglearn;

import android.app.Application;
import android.databinding.DataBindingUtil;

import flower.databindinglearn.component.ReleaseComponent;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/8/下午2:09
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        DataBindingUtil.setDefaultComponent(new ReleaseComponent());
    }
}
