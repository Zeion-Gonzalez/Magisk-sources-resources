package p000a;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: a.Go */
/* loaded from: classes.dex */
public final class C0355Go extends AbstractC2703z2 {

    /* renamed from: I */
    public final /* synthetic */ WeakReference f1199I;

    /* renamed from: R */
    public final /* synthetic */ int f1200R;

    /* renamed from: q */
    public final /* synthetic */ C1791hh f1201q;

    /* renamed from: w */
    public final /* synthetic */ int f1202w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0355Go(C1791hh c1791hh, int i, int i2, WeakReference weakReference) {
        super(2);
        this.f1201q = c1791hh;
        this.f1200R = i;
        this.f1202w = i2;
        this.f1199I = weakReference;
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: Pm */
    public final void mo92Pm(int i) {
    }

    @Override // p000a.AbstractC2703z2
    /* renamed from: oI */
    public final void mo777oI(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f1200R) != -1) {
            if ((this.f1202w & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = AbstractC1842ig.m3396z(typeface, i, z);
        }
        C1791hh c1791hh = this.f1201q;
        if (c1791hh.f5637S) {
            c1791hh.f5638V = typeface;
            TextView textView = (TextView) this.f1199I.get();
            if (textView != null) {
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                if (AbstractC1285Y3.m2633h(textView)) {
                    textView.post(new RunnableC1325Yq(textView, typeface, c1791hh.f5632G));
                } else {
                    textView.setTypeface(typeface, c1791hh.f5632G);
                }
            }
        }
    }
}
