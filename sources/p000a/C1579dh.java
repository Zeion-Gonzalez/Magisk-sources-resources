package p000a;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: a.dh */
/* loaded from: classes.dex */
public final class C1579dh extends ContentFrameLayout {

    /* renamed from: s */
    public final /* synthetic */ LayoutInflaterFactory2C1392a6 f4859s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1579dh(LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6, C1143VN c1143vn) {
        super(c1143vn, null);
        this.f4859s = layoutInflaterFactory2C1392a6;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f4859s.m2784E(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x >= -5 && y >= -5 && x <= getWidth() + 5 && y <= getHeight() + 5) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = this.f4859s;
                layoutInflaterFactory2C1392a6.m2809s(layoutInflaterFactory2C1392a6.m2786H(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC1843ih.m3431X(getContext(), i));
    }
}
