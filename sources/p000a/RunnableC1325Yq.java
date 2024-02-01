package p000a;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: a.Yq */
/* loaded from: classes.dex */
public final class RunnableC1325Yq implements Runnable {

    /* renamed from: R */
    public final /* synthetic */ Typeface f4201R;

    /* renamed from: S */
    public final /* synthetic */ TextView f4202S;

    /* renamed from: w */
    public final /* synthetic */ int f4203w;

    public RunnableC1325Yq(TextView textView, Typeface typeface, int i) {
        this.f4202S = textView;
        this.f4201R = typeface;
        this.f4203w = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f4202S.setTypeface(this.f4201R, this.f4203w);
    }
}
