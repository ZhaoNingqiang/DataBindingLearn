package flower.databindinglearn.component;

import android.databinding.BindingAdapter;
import android.widget.TextView;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/8/下午1:44
 */

public interface MyBindingAdapter2 {
    @BindingAdapter("android:text")
    public void setText(TextView textView,String text);

    @BindingAdapter("android:textColor")
    public void setTextColor(TextView textView,int textColor);
}
