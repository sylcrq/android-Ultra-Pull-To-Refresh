package in.srain.cube.views.ptr;

import android.content.Context;
import android.util.AttributeSet;

/**
 * 上拉加载更多Footer默认实现
 * Created by Shen YunLong on 2016/05/23.
 */
public class PtrClassicDefaultFooter extends PtrClassicDefaultHeader {

    public PtrClassicDefaultFooter(Context context) {
        super(context);
    }

    public PtrClassicDefaultFooter(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PtrClassicDefaultFooter(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onUIRefreshPrepare(PtrFrameLayout frame) {
        super.onUIRefreshPrepare(frame);

        if (frame.isPullToRefresh()) {
            mTitleTextView.setText(getResources().getString(R.string.cube_ptr_pull_up_to_load));
        } else {
            mTitleTextView.setText(getResources().getString(R.string.cube_ptr_pull_up));
        }

        mRotateView.setImageDrawable(getResources().getDrawable(R.drawable.ptr_rotate_arrow_up));
    }

    @Override
    public void setLastUpdateTimeRelateObject(Object object) {
        setLastUpdateTimeKey(object.getClass().getName() + ".footer");
    }

    @Override
    protected void crossRotateLineFromTopUnderTouch(PtrFrameLayout frame) {
        if (!frame.isPullToRefresh()) {
            mTitleTextView.setVisibility(VISIBLE);
            mTitleTextView.setText(R.string.cube_ptr_release_to_load);
        }
    }
}
