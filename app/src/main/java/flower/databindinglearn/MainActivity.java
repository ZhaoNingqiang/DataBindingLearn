package flower.databindinglearn;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import flower.databindinglearn.component.ReleaseComponent;
import flower.databindinglearn.component.TestComponent;
import flower.databindinglearn.databinding.ActivityMainBinding;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/6/下午4:46
 */

public class MainActivity extends AppCompatActivity {
    static boolean isTest = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setPresenter(new Presenter());

    }

    public class Presenter {
        public void startSample(View view) {
            startActivity(new Intent(MainActivity.this, SampleActivity.class));
        }

        public void startListSample(View v) {
            startActivity(new Intent(MainActivity.this, ListActivity.class));
        }

        public void startTwoWay(View v) {
            startActivity(new Intent(MainActivity.this, TwoWayActivity.class));
        }
        public void startExpression(View v) {
            startActivity(new Intent(MainActivity.this, ExpressionActivity.class));
        }

        public void startAnimation(View view){
            startActivity(new Intent(MainActivity.this, AnimationActivity.class));
        }

        public void changeComponent(View view){
            if (isTest){
                DataBindingUtil.setDefaultComponent(new ReleaseComponent());
            }else {
                DataBindingUtil.setDefaultComponent(new TestComponent());
            }
            isTest = !isTest;
            recreate();
        }

    }


}
