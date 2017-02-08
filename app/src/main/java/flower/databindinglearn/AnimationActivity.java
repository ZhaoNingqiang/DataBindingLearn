package flower.databindinglearn;

import android.databinding.DataBindingUtil;
import android.databinding.OnRebindCallback;
import android.databinding.ViewDataBinding;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import flower.databindinglearn.databinding.ActivityAnimationBinding;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/7/下午6:02
 */

public class AnimationActivity extends AppCompatActivity {
    ActivityAnimationBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_animation);
        binding.setPresenter(new Presenter());
        binding.addOnRebindCallback(new OnRebindCallback() {
            @Override
            public boolean onPreBind(ViewDataBinding binding) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                    ViewGroup root = (ViewGroup) binding.getRoot();
                    TransitionManager.beginDelayedTransition(root);
                }
                return true;
            }
        });


    }

    public class Presenter {

        public void onCheckedChanged(View buttonView, boolean isChecked) {
            binding.setShow(isChecked);
        }
    }
}
