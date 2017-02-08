package flower.databindinglearn;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import flower.databindinglearn.databinding.ActivitySampleBinding;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/6/下午1:34
 */

public class SampleActivity extends AppCompatActivity {
    ActivitySampleBinding binding;
    Book book = new Book("think in java", "78.9");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_sample);
        binding.setBook(book);
        binding.setPresenter(new Presenter());
        binding.bookPrice.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                book.price.set(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }


    public class Presenter {
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String name = s.toString();
            book.name.set(name);
        }

        public void onClick(View v) {
            Toast.makeText(SampleActivity.this, "got it", Toast.LENGTH_SHORT).show();
        }

        public void onClickShow(Book book) {
            Toast.makeText(SampleActivity.this, book.name.get() + " \r" + book.price.get(), Toast.LENGTH_SHORT).show();
        }

    }
}
