package flower.databindinglearn.component;

import android.databinding.DataBindingComponent;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/8/下午1:58
 */

public class TestComponent implements DataBindingComponent {
    TestBindingAdapter adapter = new TestBindingAdapter();
    @Override
    public MyBindingAdapter2 getMyBindingAdapter2() {
        return adapter;
    }

    @Override
    public TestAdapter getTestAdapter() {
        return null;
    }
}
