package flower.databindinglearn;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import java.util.ArrayList;

import flower.databindinglearn.databinding.ActivityListBinding;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/6/下午4:57
 */

public class ListActivity extends AppCompatActivity {
    UserAdapter adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityListBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_list);
        binding.setPresenter(new Presenter());
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        adapter = new UserAdapter(this);
        binding.recyclerView.setAdapter(adapter);

        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User user = new User("HanLi", i + 10);
            users.add(user);
        }
        adapter.addAll(users);
    }

    public class Presenter {
        public void addItem(View view) {
            adapter.add(new User("WangLin", 100));
        }

        public void removeItem(View view) {
            adapter.remove();
        }
    }
}
