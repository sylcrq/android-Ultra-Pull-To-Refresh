package in.srain.cube.views.ptr;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by Shen YunLong on 2016/05/23.
 */
public class PtrLoadMoreFrameLayout extends PtrClassicFrameLayout {

    private PtrClassicDefaultFooter mPtrClassicFooter;

    public PtrLoadMoreFrameLayout(Context context) {
        super(context);
    }

    public PtrLoadMoreFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public PtrLoadMoreFrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void initViews() {
        super.initViews();

        mPtrClassicFooter = new PtrClassicDefaultFooter(getContext());
        setFooterView(mPtrClassicFooter);
        addPtrUIHandler(mPtrClassicFooter);
    }

    public PtrClassicDefaultFooter getFooter() {
        return mPtrClassicFooter;
    }

    public void setHeaderLastUpdateTimeKey(String key) {
        if (mPtrClassicHeader != null) {
            mPtrClassicHeader.setLastUpdateTimeKey(key);
        }
    }

    public void setFooterLastUpdateTimeKey(String key) {
        if (mPtrClassicFooter != null) {
            mPtrClassicFooter.setLastUpdateTimeKey(key);
        }
    }

    public void setHeaderLastUpdateTimeRelateObject(Object object) {
        if (mPtrClassicHeader != null) {
            mPtrClassicHeader.setLastUpdateTimeRelateObject(object);
        }
    }

    public void setFooterLastUpdateTimeRelateObject(Object object) {
        if (mPtrClassicFooter != null) {
            mPtrClassicFooter.setLastUpdateTimeRelateObject(object);
        }
    }

    @Override
    public void setLastUpdateTimeKey(String key) {
        setHeaderLastUpdateTimeKey(key);
        setFooterLastUpdateTimeKey(key + ".footer");
    }

    @Override
    public void setLastUpdateTimeRelateObject(Object object) {
        setHeaderLastUpdateTimeRelateObject(object);
        setFooterLastUpdateTimeRelateObject(object);
    }
}
