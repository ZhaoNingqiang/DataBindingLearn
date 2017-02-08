package flower.databindinglearn.component;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/8/下午1:43
 */

public class ReleaseComponent implements android.databinding.DataBindingComponent {
    ReleaseBindingAdapter adapter = new ReleaseBindingAdapter();


    @Override
    public MyBindingAdapter2 getMyBindingAdapter2() {
        return adapter;
    }

    @Override
    public TestAdapter getTestAdapter() {
        return null;
    }
}
