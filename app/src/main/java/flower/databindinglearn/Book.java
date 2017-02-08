package flower.databindinglearn;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/6/下午2:45
 */

public class Book{
    public ObservableField<String> name = new ObservableField<>();

    public ObservableField<String> price = new ObservableField<>();

    public Book(String name, String price) {
        this.name.set(name);
        this.price.set(price);;
    }
}
