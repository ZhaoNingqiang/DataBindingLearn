package flower.databindinglearn.component;

import android.widget.TextView;

import flower.databindinglearn.R;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/8/下午1:47
 */

public class TestBindingAdapter implements MyBindingAdapter2 {
    @Override
    public void setText(TextView textView, String text) {
        textView.setText("Test " + text);
    }

    @Override
    public void setTextColor(TextView textView, int textColor) {
        textView.setTextColor(textView.getContext().getResources().getColor(R.color.textColorNight));
    }
}
