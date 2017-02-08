package flower.databindinglearn;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import flower.databindinglearn.BR;

/**
 * @author 赵凝强
 * @version 1.0.0
 * @Time 17/2/6/下午5:46
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.BindingViewHolder> {
    public static final int ITEM_VIEW_TYPE_1 = 1;
    public static final int ITEM_VIEW_TYPE_2 = 2;

    LayoutInflater mInflater;
    List<User> users;

    public UserAdapter(Context context) {
        this.mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.users = new ArrayList<>();
    }

    @Override
    public BindingViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding;
        if (viewType == ITEM_VIEW_TYPE_1){
            binding = DataBindingUtil.inflate(mInflater,R.layout.list_item_type_1,parent,false);
        }else {
            binding = DataBindingUtil.inflate(mInflater,R.layout.list_item_type_2,parent,false);
        }
        return new BindingViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(BindingViewHolder holder, int position) {
        User user = users.get(position);
        holder.binding.setVariable(BR.user,user);
        holder.binding.executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return users == null ? 0 :users.size();
    }


    public void addAll(List<User> users){
        this.users.addAll(users);
    }

    Random mRandom = new Random(System.currentTimeMillis());
    public void add(User user){
        int position = mRandom.nextInt(users.size());
        users.add(position,user);
        notifyItemInserted(position);
    }

    public void remove(){
        if (users.size() == 0){
            return;
        }
        int postion = mRandom.nextInt(users.size());
        users.remove(postion);
        notifyItemRemoved(postion);

    }



    static class BindingViewHolder<T extends ViewDataBinding> extends RecyclerView.ViewHolder {

        public T binding;

        public BindingViewHolder(T binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
