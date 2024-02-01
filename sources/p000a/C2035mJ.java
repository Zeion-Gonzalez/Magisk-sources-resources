package p000a;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* renamed from: a.mJ */
/* loaded from: classes.dex */
public final class C2035mJ extends BaseAdapter {

    /* renamed from: h */
    public C0407Hj f6350h;

    /* renamed from: v */
    public final C2421tc f6351v;

    /* renamed from: z */
    public final C0307Fr f6352z;

    /* renamed from: P */
    public static final int f6349P = AbstractC2674yV.m4585P(null).getMaximum(4);

    /* renamed from: N */
    public static final int f6348N = (AbstractC2674yV.m4585P(null).getMaximum(7) + AbstractC2674yV.m4585P(null).getMaximum(5)) - 1;

    public C2035mJ(C0307Fr c0307Fr, C2421tc c2421tc) {
        this.f6352z = c0307Fr;
        this.f6351v = c2421tc;
        throw null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f6348N;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f6352z.f1056I;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            a.Hj r1 = r4.f6350h
            if (r1 != 0) goto Lf
            a.Hj r1 = new a.Hj
            r1.<init>(r0)
            r4.f6350h = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131492975(0x7f0c006f, float:1.8609417E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.m3674z()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            a.Fr r7 = r4.f6352z
            int r2 = r7.f1061q
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r3[r1] = r6
            java.lang.String r6 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r6, r3)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L71
        L6c:
            r5.longValue()
            if (r0 != 0) goto L72
        L71:
            return r0
        L72:
            r0.getContext()
            java.util.Calendar r5 = p000a.AbstractC2674yV.m4587v()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2035mJ.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.Adapter
    /* renamed from: h */
    public final Long getItem(int i) {
        if (i >= m3674z()) {
            int m3674z = m3674z();
            C0307Fr c0307Fr = this.f6352z;
            if (i <= (m3674z + c0307Fr.f1061q) - 1) {
                int m3674z2 = (i - m3674z()) + 1;
                Calendar m4586h = AbstractC2674yV.m4586h(c0307Fr.f1058S);
                m4586h.set(5, m3674z2);
                return Long.valueOf(m4586h.getTimeInMillis());
            }
            return null;
        }
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }

    /* renamed from: z */
    public final int m3674z() {
        int i = this.f6351v.f7415q;
        C0307Fr c0307Fr = this.f6352z;
        Calendar calendar = c0307Fr.f1058S;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + c0307Fr.f1056I;
        }
        return i3;
    }
}
