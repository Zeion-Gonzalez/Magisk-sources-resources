package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import p000a.AbstractC0667Md;
import p000a.AbstractC1090US;
import p000a.AbstractC2441tz;
import p000a.AbstractC2731zY;
import p000a.C0419Hv;
import p000a.C0496JN;
import p000a.C1100Ud;
import p000a.C1578df;
import p000a.C1624eZ;
import p000a.C1960kt;
import p000a.C2039mO;
import p000a.InterfaceC1877jM;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC0667Md implements InterfaceC1877jM {

    /* renamed from: I */
    public int f9314I;

    /* renamed from: q */
    public C2039mO f9315q;

    public CarouselLayoutManager() {
        new C1960kt();
        m1528dx();
        m5041T0(0);
    }

    /* renamed from: EQ */
    public static float m5036EQ(float f, C1624eZ c1624eZ) {
        AbstractC2731zY abstractC2731zY = (AbstractC2731zY) c1624eZ.f5013R;
        abstractC2731zY.getClass();
        AbstractC2731zY abstractC2731zY2 = (AbstractC2731zY) c1624eZ.f5015w;
        abstractC2731zY2.getClass();
        abstractC2731zY.getClass();
        abstractC2731zY2.getClass();
        return AbstractC1090US.m2263z(0.0f, 0.0f, 0.0f, 0.0f, f);
    }

    /* renamed from: Ry */
    public static C1624eZ m5037Ry(float f, List list, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((AbstractC2731zY) list.get(i5)).getClass();
            float abs = Math.abs(0.0f - f);
            if (0.0f <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (0.0f > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (0.0f <= f5) {
                i2 = i5;
                f5 = 0.0f;
            }
            if (0.0f > f3) {
                i4 = i5;
                f3 = 0.0f;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new C1624eZ((AbstractC2731zY) list.get(i), (AbstractC2731zY) list.get(i3));
    }

    /* renamed from: Fu */
    public final boolean m5038Fu() {
        return this.f9315q.f5650z == 0;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: G */
    public final int mo1494G(C0496JN c0496jn) {
        throw null;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: HL */
    public final void mo1497HL(C0496JN c0496jn) {
        if (m1513U() == 0) {
            return;
        }
        AbstractC0667Md.m1483F(m1550s(0));
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: Ha */
    public final int mo1498Ha(int i, C1578df c1578df, C0496JN c0496jn) {
        if (!mo1504N()) {
            return 0;
        }
        m5039M6(i, c1578df, c0496jn);
        return 0;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: Lq */
    public final void mo1502Lq(int i) {
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: M */
    public final int mo1503M(C0496JN c0496jn) {
        return this.f9314I;
    }

    /* renamed from: M6 */
    public final int m5039M6(int i, C1578df c1578df, C0496JN c0496jn) {
        if (m1513U() == 0 || i == 0) {
            return 0;
        }
        int i2 = this.f9314I;
        int i3 = i2 + i;
        if (i3 < 0 || i3 > 0) {
            i = 0 - i2;
        }
        this.f9314I = i2 + i;
        m5042j5();
        throw null;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: N */
    public final boolean mo1504N() {
        return !m5038Fu();
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: P */
    public final boolean mo1507P() {
        return m5038Fu();
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: R */
    public final int mo1510R(C0496JN c0496jn) {
        return this.f9314I;
    }

    /* renamed from: Rh */
    public final boolean m5040Rh() {
        return m5038Fu() && m1500J() == 1;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: S */
    public final int mo1511S(C0496JN c0496jn) {
        throw null;
    }

    /* renamed from: T0 */
    public final void m5041T0(int i) {
        C2039mO c2039mO;
        int i2 = 1;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC2441tz.m4188N("invalid orientation:", i));
        }
        mo1553v(null);
        C2039mO c2039mO2 = this.f9315q;
        if (c2039mO2 == null || i != c2039mO2.f5650z) {
            int i3 = 0;
            if (i != 0) {
                if (i == 1) {
                    c2039mO = new C2039mO(i2, this, i3);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
            } else {
                c2039mO = new C2039mO(i3, this, i2);
            }
            this.f9315q = c2039mO;
            m1528dx();
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: V */
    public final int mo1516V(C0496JN c0496jn) {
        return 0 - 0;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: ZH */
    public final int mo1521ZH(int i, C1578df c1578df, C0496JN c0496jn) {
        if (m5038Fu()) {
            m5039M6(i, c1578df, c0496jn);
            return 0;
        }
        return 0;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: d3 */
    public final void mo1526d3(RecyclerView recyclerView, int i) {
        C1100Ud c1100Ud = new C1100Ud(this, recyclerView.getContext(), 1);
        c1100Ud.f7967z = i;
        m1557yF(c1100Ud);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: he */
    public final boolean mo1533he(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    /* renamed from: j5 */
    public final void m5042j5() {
        m5040Rh();
        throw null;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: k */
    public final C0419Hv mo1535k() {
        return new C0419Hv(-2, -2);
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: qn */
    public final void mo1548qn(C1578df c1578df, C0496JN c0496jn) {
        if (c0496jn.m1190h() <= 0) {
            m1515UZ(c1578df);
        } else {
            m5040Rh();
            c1578df.m3049P(0);
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: r */
    public final void mo1549r(View view, Rect rect) {
        super.mo1549r(view, rect);
        rect.centerX();
        throw null;
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: t */
    public final void mo1551t(AccessibilityEvent accessibilityEvent) {
        super.mo1551t(accessibilityEvent);
        if (m1513U() > 0) {
            accessibilityEvent.setFromIndex(AbstractC0667Md.m1483F(m1550s(0)));
            accessibilityEvent.setToIndex(AbstractC0667Md.m1483F(m1550s(m1513U() - 1)));
        }
    }

    @Override // p000a.AbstractC0667Md
    /* renamed from: w */
    public final int mo1554w(C0496JN c0496jn) {
        return 0 - 0;
    }

    @Override // p000a.InterfaceC1877jM
    /* renamed from: z */
    public final PointF mo3494z(int i) {
        return null;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new C1960kt();
        m5041T0(AbstractC0667Md.m1485Z(context, attributeSet, i, i2).f7764z);
        m1528dx();
    }
}
