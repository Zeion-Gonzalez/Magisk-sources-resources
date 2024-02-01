package p000a;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: a.xA */
/* loaded from: classes.dex */
public final class C2613xA extends AbstractC0632Lt {

    /* renamed from: N */
    public C2064mt f8082N;

    /* renamed from: P */
    public C2064mt f8083P;

    public C2613xA() {
        super(2);
    }

    /* renamed from: f */
    public static int m4494f(View view, AbstractC0265F4 abstractC0265F4) {
        return ((abstractC0265F4.mo573v(view) / 2) + abstractC0265F4.mo566P(view)) - ((abstractC0265F4.mo569W() / 2) + abstractC0265F4.mo571o());
    }

    /* renamed from: r */
    public static View m4495r(AbstractC0667Md abstractC0667Md, AbstractC0265F4 abstractC0265F4) {
        int m1513U = abstractC0667Md.m1513U();
        View view = null;
        if (m1513U == 0) {
            return null;
        }
        int mo569W = (abstractC0265F4.mo569W() / 2) + abstractC0265F4.mo571o();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < m1513U; i2++) {
            View m1550s = abstractC0667Md.m1550s(i2);
            int abs = Math.abs(((abstractC0265F4.mo573v(m1550s) / 2) + abstractC0265F4.mo566P(m1550s)) - mo569W);
            if (abs < i) {
                view = m1550s;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: J */
    public final AbstractC0265F4 m4496J(AbstractC0667Md abstractC0667Md) {
        C2064mt c2064mt = this.f8083P;
        if (c2064mt == null || c2064mt.f936z != abstractC0667Md) {
            this.f8083P = new C2064mt(abstractC0667Md, 1);
        }
        return this.f8083P;
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: P */
    public final int[] mo1408P(AbstractC0667Md abstractC0667Md, View view) {
        int[] iArr = new int[2];
        if (abstractC0667Md.mo1507P()) {
            iArr[0] = m4494f(view, m4497Y(abstractC0667Md));
        } else {
            iArr[0] = 0;
        }
        if (abstractC0667Md.mo1504N()) {
            iArr[1] = m4494f(view, m4496J(abstractC0667Md));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: Y */
    public final AbstractC0265F4 m4497Y(AbstractC0667Md abstractC0667Md) {
        C2064mt c2064mt = this.f8082N;
        if (c2064mt == null || c2064mt.f936z != abstractC0667Md) {
            this.f8082N = new C2064mt(abstractC0667Md, 0);
        }
        return this.f8082N;
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: k */
    public final int mo1415k(AbstractC0667Md abstractC0667Md, int i, int i2) {
        AbstractC0265F4 abstractC0265F4;
        boolean z;
        PointF mo3494z;
        int m1519Y = abstractC0667Md.m1519Y();
        if (m1519Y == 0) {
            return -1;
        }
        View view = null;
        if (abstractC0667Md.mo1504N()) {
            abstractC0265F4 = m4496J(abstractC0667Md);
        } else if (abstractC0667Md.mo1507P()) {
            abstractC0265F4 = m4497Y(abstractC0667Md);
        } else {
            abstractC0265F4 = null;
        }
        if (abstractC0265F4 == null) {
            return -1;
        }
        int m1513U = abstractC0667Md.m1513U();
        boolean z2 = false;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < m1513U; i5++) {
            View m1550s = abstractC0667Md.m1550s(i5);
            if (m1550s != null) {
                int m4494f = m4494f(m1550s, abstractC0265F4);
                if (m4494f <= 0 && m4494f > i4) {
                    view2 = m1550s;
                    i4 = m4494f;
                }
                if (m4494f >= 0 && m4494f < i3) {
                    view = m1550s;
                    i3 = m4494f;
                }
            }
        }
        int i6 = 1;
        if (!abstractC0667Md.mo1507P() ? i2 > 0 : i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && view != null) {
            return AbstractC0667Md.m1483F(view);
        }
        if (!z && view2 != null) {
            return AbstractC0667Md.m1483F(view2);
        }
        if (z) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int m1483F = AbstractC0667Md.m1483F(view);
        int m1519Y2 = abstractC0667Md.m1519Y();
        if ((abstractC0667Md instanceof InterfaceC1877jM) && (mo3494z = ((InterfaceC1877jM) abstractC0667Md).mo3494z(m1519Y2 - 1)) != null && (mo3494z.x < 0.0f || mo3494z.y < 0.0f)) {
            z2 = true;
        }
        if (z2 == z) {
            i6 = -1;
        }
        int i7 = m1483F + i6;
        if (i7 < 0 || i7 >= m1519Y) {
            return -1;
        }
        return i7;
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: q */
    public final View mo1417q(AbstractC0667Md abstractC0667Md) {
        AbstractC0265F4 m4497Y;
        if (abstractC0667Md.mo1504N()) {
            m4497Y = m4496J(abstractC0667Md);
        } else {
            if (!abstractC0667Md.mo1507P()) {
                return null;
            }
            m4497Y = m4497Y(abstractC0667Md);
        }
        return m4495r(abstractC0667Md, m4497Y);
    }

    @Override // p000a.AbstractC0632Lt
    /* renamed from: w */
    public final C1100Ud mo1420w(AbstractC0667Md abstractC0667Md) {
        if (abstractC0667Md instanceof InterfaceC1877jM) {
            return new C1100Ud(this, ((RecyclerView) this.f2047z).getContext(), 0);
        }
        return null;
    }
}
