package flower.databindinglearn.component;

import android.databinding.adapters.TextViewBindingAdapter;
import android.widget.TextView;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/8/下午1:48
 */

public class ReleaseBindingAdapter implements MyBindingAdapter2 {
    @Override
    public void setText(TextView textView, String text) {
        TextViewBindingAdapter.setText(textView,text);
    }

    @Override
    public void setTextColor(TextView textView, int textColor) {
        textView.setTextColor(textColor);
    }
}
