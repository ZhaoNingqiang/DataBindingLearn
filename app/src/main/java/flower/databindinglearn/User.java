package flower.databindinglearn;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableBoolean;

import flower.databindinglearn.BR;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/6/下午5:13
 */

public class User extends BaseObservable {
    private String name;
    private int age;
    private String avatar;
    private ObservableBoolean isFire = new ObservableBoolean();

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
        //notifyPropertyChanged(BR.avatar);
    }

    @Bindable
    public boolean isFire() {
        return isFire.get();
    }

    public void setFire(boolean fire) {
        isFire.set(fire);
        notifyPropertyChanged(BR.fire);
    }

    @Bindable
    public String getName() {
        return name;
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(flower.databindinglearn.BR.age);
    }
}
