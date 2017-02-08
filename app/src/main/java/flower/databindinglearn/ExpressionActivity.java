package flower.databindinglearn;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.Random;

import flower.databindinglearn.databinding.ActivityExpressionBinding;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/7/下午2:01
 */

public class ExpressionActivity extends AppCompatActivity {
    Random mRandom = new Random(System.currentTimeMillis());
    ActivityExpressionBinding binding;
    User user;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_expression);
        user = new User("David", 18);
        user.setFire(false);
        user.setAvatar("https://avatars2.githubusercontent.com/u/1106500?v=3&s=460");


    }

    @Override
    protected void onResume() {
        super.onResume();
        getWindow().getDecorView().postDelayed(new Runnable() {
            @Override
            public void run() {
                binding.setUser(user);
            }
        }, 2000);

    }
}
