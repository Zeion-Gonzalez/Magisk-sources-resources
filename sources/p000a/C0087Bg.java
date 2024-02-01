package p000a;

import android.view.View;
import java.util.WeakHashMap;

/* renamed from: a.Bg */
/* loaded from: classes.dex */
public final class C0087Bg {

    /* renamed from: P */
    public int f333P;

    /* renamed from: h */
    public int f334h;

    /* renamed from: v */
    public int f335v;

    /* renamed from: z */
    public final View f336z;

    public C0087Bg(View view) {
        this.f336z = view;
    }

    /* renamed from: z */
    public final void m193z() {
        int i = this.f333P;
        View view = this.f336z;
        int top = i - (view.getTop() - this.f334h);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f335v));
    }
}
