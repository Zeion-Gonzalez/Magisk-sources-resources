package p000a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.Is */
/* loaded from: classes.dex */
public final class C0469Is extends C1555dG {

    /* renamed from: N */
    public final C1638en f1561N;

    /* renamed from: P */
    public final RecyclerView f1562P;

    public C0469Is(RecyclerView recyclerView) {
        this.f1562P = recyclerView;
        C1638en c1638en = this.f1561N;
        this.f1561N = c1638en == null ? new C1638en(this) : c1638en;
    }

    @Override // p000a.C1555dG
    /* renamed from: P */
    public final void mo373P(View view, C1799hs c1799hs) {
        boolean z;
        AbstractC0667Md abstractC0667Md;
        this.f4810z.onInitializeAccessibilityNodeInfo(view, c1799hs.f5654z);
        RecyclerView recyclerView = this.f1562P;
        if (recyclerView.f9109j && !recyclerView.f9126t && !recyclerView.f9122q.m2618u()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (abstractC0667Md = recyclerView.f9077J) != null) {
            RecyclerView recyclerView2 = abstractC0667Md.f2169h;
            abstractC0667Md.mo1488B(recyclerView2.f9128w, recyclerView2.f9064BX, c1799hs);
        }
    }

    @Override // p000a.C1555dG
    /* renamed from: u */
    public final boolean mo1133u(View view, int i, Bundle bundle) {
        boolean z;
        AbstractC0667Md abstractC0667Md;
        int i2;
        int m1496H;
        if (super.mo1133u(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1562P;
        if (recyclerView.f9109j && !recyclerView.f9126t && !recyclerView.f9122q.m2618u()) {
            z = false;
        } else {
            z = true;
        }
        if (z || (abstractC0667Md = recyclerView.f9077J) == null) {
            return false;
        }
        C1578df c1578df = abstractC0667Md.f2169h.f9128w;
        int i3 = abstractC0667Md.f2173w;
        int i4 = abstractC0667Md.f2165R;
        Rect rect = new Rect();
        if (abstractC0667Md.f2169h.getMatrix().isIdentity() && abstractC0667Md.f2169h.getGlobalVisibleRect(rect)) {
            i3 = rect.height();
            i4 = rect.width();
        }
        if (i != 4096) {
            if (i != 8192) {
                i2 = 0;
                m1496H = 0;
            } else {
                if (abstractC0667Md.f2169h.canScrollVertically(-1)) {
                    i2 = -((i3 - abstractC0667Md.m1518X()) - abstractC0667Md.m1523c());
                } else {
                    i2 = 0;
                }
                if (abstractC0667Md.f2169h.canScrollHorizontally(-1)) {
                    m1496H = -((i4 - abstractC0667Md.m1496H()) - abstractC0667Md.m1529e());
                }
                m1496H = 0;
            }
        } else {
            if (abstractC0667Md.f2169h.canScrollVertically(1)) {
                i2 = (i3 - abstractC0667Md.m1518X()) - abstractC0667Md.m1523c();
            } else {
                i2 = 0;
            }
            if (abstractC0667Md.f2169h.canScrollHorizontally(1)) {
                m1496H = (i4 - abstractC0667Md.m1496H()) - abstractC0667Md.m1529e();
            }
            m1496H = 0;
        }
        if (i2 == 0 && m1496H == 0) {
            return false;
        }
        abstractC0667Md.f2169h.m4934he(m1496H, i2, true);
        return true;
    }

    @Override // p000a.C1555dG
    /* renamed from: v */
    public final void mo1134v(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        AbstractC0667Md abstractC0667Md;
        super.mo1134v(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f1562P;
            if (recyclerView.f9109j && !recyclerView.f9126t && !recyclerView.f9122q.m2618u()) {
                z = false;
            } else {
                z = true;
            }
            if (!z && (abstractC0667Md = ((RecyclerView) view).f9077J) != null) {
                abstractC0667Md.mo1551t(accessibilityEvent);
            }
        }
    }
}
