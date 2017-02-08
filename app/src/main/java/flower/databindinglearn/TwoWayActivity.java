package flower.databindinglearn;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import flower.databindinglearn.databinding.ActivityTwoWayBinding;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/7/下午12:02
 */

public class TwoWayActivity extends AppCompatActivity {
    ActivityTwoWayBinding binding;
    FormModel model = new FormModel("Jack","12345");
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_two_way);
        binding.setModel(model);
        model.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int i) {

                if (i == flower.databindinglearn.BR.name){
                    Toast.makeText(TwoWayActivity.this, model.getName(), Toast.LENGTH_SHORT).show();

                }else if (i == flower.databindinglearn.BR.password){
                    Toast.makeText(TwoWayActivity.this, model.getPassword(), Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
