package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p000a.C0278FI;
import p000a.C0528Jy;
import p000a.C0831PV;
import p000a.C2189pE;
import p000a.C2192pI;
import p000a.InterfaceC0848Pq;
import p000a.LayoutInflaterFactory2C1392a6;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: I */
    public TypedValue f8773I;

    /* renamed from: R */
    public TypedValue f8774R;

    /* renamed from: S */
    public TypedValue f8775S;

    /* renamed from: g */
    public final Rect f8776g;

    /* renamed from: k */
    public TypedValue f8777k;

    /* renamed from: q */
    public TypedValue f8778q;

    /* renamed from: w */
    public TypedValue f8779w;

    /* renamed from: y */
    public C0528Jy f8780y;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f8776g = new Rect();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0528Jy c0528Jy = this.f8780y;
        if (c0528Jy != null) {
            c0528Jy.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2192pI c2192pI;
        super.onDetachedFromWindow();
        C0528Jy c0528Jy = this.f8780y;
        if (c0528Jy != null) {
            LayoutInflaterFactory2C1392a6 layoutInflaterFactory2C1392a6 = c0528Jy.f1772R;
            InterfaceC0848Pq interfaceC0848Pq = layoutInflaterFactory2C1392a6.f4367e;
            if (interfaceC0848Pq != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0848Pq;
                actionBarOverlayLayout.m4714M();
                ActionMenuView actionMenuView = actionBarOverlayLayout.f8751q.f7482z.f8832S;
                if (actionMenuView != null && (c2192pI = actionMenuView.f8767p) != null) {
                    c2192pI.m3807Q();
                    C0278FI c0278fi = c2192pI.f6736X;
                    if (c0278fi != null && c0278fi.m1773h()) {
                        c0278fi.f2605G.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C1392a6.f4380p != null) {
                layoutInflaterFactory2C1392a6.f4368f.getDecorView().removeCallbacks(layoutInflaterFactory2C1392a6.f4371j);
                if (layoutInflaterFactory2C1392a6.f4380p.isShowing()) {
                    try {
                        layoutInflaterFactory2C1392a6.f4380p.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C1392a6.f4380p = null;
            }
            C0831PV c0831pv = layoutInflaterFactory2C1392a6.f4350L;
            if (c0831pv != null) {
                c0831pv.m1935h();
            }
            C2189pE c2189pE = layoutInflaterFactory2C1392a6.m2786H(0).f5261o;
            if (c2189pE != null) {
                c2189pE.m3804v(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }
}
