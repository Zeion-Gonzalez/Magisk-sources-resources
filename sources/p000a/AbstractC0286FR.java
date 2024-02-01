package p000a;

import android.view.View;

/* renamed from: a.FR */
/* loaded from: classes.dex */
public abstract class AbstractC0286FR extends AbstractC2100na {

    /* renamed from: Q */
    public static boolean f991Q = true;

    /* renamed from: R */
    public void mo584R(View view, int i, int i2, int i3, int i4) {
        if (f991Q) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f991Q = false;
            }
        }
    }
}
