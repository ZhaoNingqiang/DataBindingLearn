package flower.databindinglearn.component;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/7/下午3:17
 */

public class DemoBindingAdapter {
    @BindingAdapter({"imageUrl", "placeholder"})
    public static void loadImage(ImageView view, String url, Drawable drawable) {
        Glide.with(view.getContext())
                .load(url)
                .placeholder(drawable)
                .into(view);
    }
}
