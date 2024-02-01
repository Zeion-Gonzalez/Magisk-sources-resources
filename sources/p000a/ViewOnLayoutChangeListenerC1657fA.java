package p000a;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;

/* renamed from: a.fA */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1657fA implements View.OnLayoutChangeListener {

    /* renamed from: h */
    public final /* synthetic */ Object f5193h;

    /* renamed from: z */
    public final /* synthetic */ int f5194z;

    public /* synthetic */ ViewOnLayoutChangeListenerC1657fA(int i, Object obj) {
        this.f5194z = i;
        this.f5193h = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        int i9 = this.f5194z;
        Object obj = this.f5193h;
        switch (i9) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((BottomAppBar$Behavior) obj).getClass();
                throw null;
            default:
                C0065BH c0065bh = (C0065BH) obj;
                if (c0065bh.f268J.getVisibility() == 0) {
                    C1773hL c1773hL = c0065bh.f269K;
                    if (c1773hL != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Rect rect = new Rect();
                        ImageView imageView = c0065bh.f268J;
                        imageView.getDrawingRect(rect);
                        c1773hL.setBounds(rect);
                        c1773hL.m3303o(imageView, null);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
