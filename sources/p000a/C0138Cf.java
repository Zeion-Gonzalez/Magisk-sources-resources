package p000a;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import java.util.HashMap;
import java.util.WeakHashMap;

/* renamed from: a.Cf */
/* loaded from: classes.dex */
public final class C0138Cf extends AbstractC0614LY {

    /* renamed from: L */
    public static final String[] f476L = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: O */
    public static final C0414Hq f477O;

    /* renamed from: d */
    public static final C0414Hq f478d;

    /* renamed from: i */
    public static final C0414Hq f479i;

    /* renamed from: n */
    public static final C0414Hq f480n;

    /* renamed from: x */
    public static final C0414Hq f481x;

    static {
        new C0083Bb(0);
        Class<PointF> cls = PointF.class;
        String str = "topLeft";
        f479i = new C0414Hq(cls, str, 1);
        String str2 = "bottomRight";
        f478d = new C0414Hq(cls, str2, 2);
        f477O = new C0414Hq(cls, str2, 3);
        f480n = new C0414Hq(cls, str, 4);
        f481x = new C0414Hq(cls, "position", 5);
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: N */
    public final void mo292N(C2495v0 c2495v0) {
        m294d(c2495v0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011d  */
    @Override // p000a.AbstractC0614LY
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator mo293R(android.view.ViewGroup r19, p000a.C2495v0 r20, p000a.C2495v0 r21) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0138Cf.mo293R(android.view.ViewGroup, a.v0, a.v0):android.animation.Animator");
    }

    /* renamed from: d */
    public final void m294d(C2495v0 c2495v0) {
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        View view = c2495v0.f7630h;
        if (AbstractC1285Y3.m2635v(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = c2495v0.f7632z;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: o */
    public final void mo295o(C2495v0 c2495v0) {
        m294d(c2495v0);
    }

    @Override // p000a.AbstractC0614LY
    /* renamed from: s */
    public final String[] mo296s() {
        return f476L;
    }
}
