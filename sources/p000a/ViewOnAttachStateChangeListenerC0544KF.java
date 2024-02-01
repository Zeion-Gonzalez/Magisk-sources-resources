package p000a;

import android.view.View;
import androidx.databinding.AbstractC2760z;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;

/* renamed from: a.KF */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0544KF implements View.OnAttachStateChangeListener {

    /* renamed from: S */
    public final /* synthetic */ int f1796S;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0544KF(int i) {
        this.f1796S = i;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AbstractC2760z abstractC2760z;
        switch (this.f1796S) {
            case AbstractC0795Op.f2698E /* 0 */:
                if (view != null) {
                    abstractC2760z = (AbstractC2760z) view.getTag(R.id.dataBinding);
                } else {
                    abstractC2760z = null;
                }
                abstractC2760z.f8977R.run();
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                view.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                AbstractC1589dw.m3064v(view);
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                view.requestApplyInsets();
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
