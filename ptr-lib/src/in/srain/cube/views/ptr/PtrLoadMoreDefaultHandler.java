package in.srain.cube.views.ptr;


import android.os.Build;
import android.view.View;
import android.widget.AbsListView;

/**
 * Created by Shen YunLong on 2016/05/24.
 */
public abstract class PtrLoadMoreDefaultHandler extends PtrDefaultHandler implements PtrLoadMoreHandler {

    public static boolean canChildScrollDown(View view) {
        if (Build.VERSION.SDK_INT < 14) {
            if (view instanceof AbsListView) {
                AbsListView absListView = (AbsListView) view;

                return !(absListView.getChildCount() > 0 &&
                        absListView.getLastVisiblePosition() == absListView.getAdapter().getCount() - 1);
            } else {
                return true;
            }
        } else {
            return view.canScrollVertically(1);
        }
    }

    public static boolean checkContentCanBePulledUp(PtrFrameLayout frame, View content, View footer) {
        return !canChildScrollDown(content);
    }

    @Override
    public boolean checkCanLoadMore(PtrFrameLayout frame, View content, View footer) {
        return checkContentCanBePulledUp(frame, content, footer);
    }

}
