package in.srain.cube.views.ptr;

import android.view.View;

/**
 * Created by Shen YunLong on 2016/05/24.
 */
public interface PtrLoadMoreHandler extends PtrHandler {

    boolean checkCanLoadMore(final PtrFrameLayout frame, final View content, final View footer);

    void onLoadMoreBegin(final PtrFrameLayout frame);
}
