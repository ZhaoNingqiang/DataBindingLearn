package flower.databindinglearn;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import flower.databindinglearn.BR;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/7/下午12:07
 */

public class FormModel extends BaseObservable {
    private String name;
    private String password;

    public FormModel(String name, String password) {
        this.name = name;
        this.password = password;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }
}
