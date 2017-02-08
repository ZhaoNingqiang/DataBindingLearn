package flower.databindinglearn.component;

import android.databinding.BindingAdapter;
import android.widget.TextView;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/8/下午2:26
 */

public class TestAdapter {

    @BindingAdapter("android:textSize")
    public void test(TextView view, int textSize) {

    }
}
