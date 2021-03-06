package net.sxkeji.shixinandroiddemo2.adapter;

import android.content.Context;

import net.sxkeji.shixinandroiddemo2.R;

import java.util.List;

import top.shixinzhang.sxframework.views.adapter.rvbaseadapter.BaseQuickAdapter;
import top.shixinzhang.sxframework.views.adapter.rvbaseadapter.BaseViewHolder;

/**
 * 搜索结果的 adapter
 * Created by zhangshixin on 8/30/2016.
 */
public class SearchResultAdapter extends BaseQuickAdapter<String> {
    public SearchResultAdapter(Context context, List<String> data) {
        super(context, data, R.layout.item_search_result);
    }

    @Override
    protected void convert(BaseViewHolder holder, String item) {
        holder.setText(R.id.tv_result_name, item);
    }
}
