package databinding.example.demo.databinding;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

import databinding.example.demo.databinding.databinding.RvRowBinding;


/**
 * Created by suheb on 18/10/16.
 */

public class AdapterRv extends RecyclerView.Adapter<AdapterRv.ViewHolder> {
    Context context;
    ArrayList<UserClass> al;

    public AdapterRv(Context context, ArrayList<UserClass> al) {
        this.context = context;
        this.al = al;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        ListItemBinding binding = ListItemBinding.inflate(layoutInflater, viewGroup, false);
        RvRowBinding binding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.rv_row, parent, false);

        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        RvRowBinding viewDataBinding = holder.getViewDataBinding();
        viewDataBinding.setUser(al.get(position));
    }

    @Override
    public int getItemCount() {
        return al.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private RvRowBinding mViewDataBinding;

        public ViewHolder(RvRowBinding viewDataBinding) {
            super(viewDataBinding.getRoot());
            mViewDataBinding = viewDataBinding;
            mViewDataBinding.executePendingBindings();
        }

        public RvRowBinding getViewDataBinding() {
            return mViewDataBinding;
        }
    }

    public class MyHandlers {
        public void onClickFriend(View view) {
            Toast.makeText(context, "click", Toast.LENGTH_SHORT).show();


        }
    }
}
