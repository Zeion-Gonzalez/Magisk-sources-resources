package p000a;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* renamed from: a.en */
/* loaded from: classes.dex */
public final class C1638en extends C1555dG {

    /* renamed from: N */
    public final WeakHashMap f5097N = new WeakHashMap();

    /* renamed from: P */
    public final C0469Is f5098P;

    public C1638en(C0469Is c0469Is) {
        this.f5098P = c0469Is;
    }

    @Override // p000a.C1555dG
    /* renamed from: N */
    public final void mo3024N(View view, AccessibilityEvent accessibilityEvent) {
        C1555dG c1555dG = (C1555dG) this.f5097N.get(view);
        if (c1555dG != null) {
            c1555dG.mo3024N(view, accessibilityEvent);
        } else {
            super.mo3024N(view, accessibilityEvent);
        }
    }

    @Override // p000a.C1555dG
    /* renamed from: P */
    public final void mo373P(View view, C1799hs c1799hs) {
        boolean z;
        AbstractC0667Md abstractC0667Md;
        C0469Is c0469Is = this.f5098P;
        RecyclerView recyclerView = c0469Is.f1562P;
        if (recyclerView.f9109j && !recyclerView.f9126t && !recyclerView.f9122q.m2618u()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (abstractC0667Md = c0469Is.f1562P.f9077J) != null) {
            abstractC0667Md.m1492D(view, c1799hs);
            C1555dG c1555dG = (C1555dG) this.f5097N.get(view);
            if (c1555dG != null) {
                c1555dG.mo373P(view, c1799hs);
                return;
            }
        }
        this.f4810z.onInitializeAccessibilityNodeInfo(view, c1799hs.f5654z);
    }

    @Override // p000a.C1555dG
    /* renamed from: Q */
    public final boolean mo3025Q(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C1555dG c1555dG = (C1555dG) this.f5097N.get(viewGroup);
        return c1555dG != null ? c1555dG.mo3025Q(viewGroup, view, accessibilityEvent) : super.mo3025Q(viewGroup, view, accessibilityEvent);
    }

    @Override // p000a.C1555dG
    /* renamed from: W */
    public final void mo3026W(View view, AccessibilityEvent accessibilityEvent) {
        C1555dG c1555dG = (C1555dG) this.f5097N.get(view);
        if (c1555dG != null) {
            c1555dG.mo3026W(view, accessibilityEvent);
        } else {
            super.mo3026W(view, accessibilityEvent);
        }
    }

    @Override // p000a.C1555dG
    /* renamed from: h */
    public final C0042As mo3027h(View view) {
        C1555dG c1555dG = (C1555dG) this.f5097N.get(view);
        return c1555dG != null ? c1555dG.mo3027h(view) : super.mo3027h(view);
    }

    @Override // p000a.C1555dG
    /* renamed from: o */
    public final void mo3028o(View view, int i) {
        C1555dG c1555dG = (C1555dG) this.f5097N.get(view);
        if (c1555dG != null) {
            c1555dG.mo3028o(view, i);
        } else {
            super.mo3028o(view, i);
        }
    }

    @Override // p000a.C1555dG
    /* renamed from: u */
    public final boolean mo1133u(View view, int i, Bundle bundle) {
        boolean z;
        C0469Is c0469Is = this.f5098P;
        RecyclerView recyclerView = c0469Is.f1562P;
        if (recyclerView.f9109j && !recyclerView.f9126t && !recyclerView.f9122q.m2618u()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            RecyclerView recyclerView2 = c0469Is.f1562P;
            if (recyclerView2.f9077J != null) {
                C1555dG c1555dG = (C1555dG) this.f5097N.get(view);
                if (c1555dG != null) {
                    if (c1555dG.mo1133u(view, i, bundle)) {
                        return true;
                    }
                } else if (super.mo1133u(view, i, bundle)) {
                    return true;
                }
                C1578df c1578df = recyclerView2.f9077J.f2169h.f9128w;
                return false;
            }
        }
        return super.mo1133u(view, i, bundle);
    }

    @Override // p000a.C1555dG
    /* renamed from: v */
    public final void mo1134v(View view, AccessibilityEvent accessibilityEvent) {
        C1555dG c1555dG = (C1555dG) this.f5097N.get(view);
        if (c1555dG != null) {
            c1555dG.mo1134v(view, accessibilityEvent);
        } else {
            super.mo1134v(view, accessibilityEvent);
        }
    }

    @Override // p000a.C1555dG
    /* renamed from: z */
    public final boolean mo3029z(View view, AccessibilityEvent accessibilityEvent) {
        C1555dG c1555dG = (C1555dG) this.f5097N.get(view);
        return c1555dG != null ? c1555dG.mo3029z(view, accessibilityEvent) : super.mo3029z(view, accessibilityEvent);
    }
}
