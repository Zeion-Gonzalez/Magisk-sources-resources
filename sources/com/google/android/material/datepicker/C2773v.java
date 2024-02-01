package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.topjohnwu.magisk.R;
import java.util.Calendar;
import p000a.AbstractC0249El;
import p000a.AbstractC0408Hk;
import p000a.AbstractC2674yV;
import p000a.C0222ED;
import p000a.C0307Fr;
import p000a.C0419Hv;
import p000a.C2035mJ;
import p000a.C2196pM;
import p000a.C2292rA;
import p000a.C2421tc;

/* renamed from: com.google.android.material.datepicker.v */
/* loaded from: classes.dex */
public final class C2773v extends AbstractC0408Hk {

    /* renamed from: N */
    public final C2196pM f9338N;

    /* renamed from: P */
    public final C2421tc f9339P;

    /* renamed from: Q */
    public final int f9340Q;

    public C2773v(ContextThemeWrapper contextThemeWrapper, C2421tc c2421tc, C2196pM c2196pM) {
        int i;
        Calendar calendar = c2421tc.f7412S.f1058S;
        C0307Fr c0307Fr = c2421tc.f7410I;
        if (calendar.compareTo(c0307Fr.f1058S) <= 0) {
            if (c0307Fr.f1058S.compareTo(c2421tc.f7411R.f1058S) <= 0) {
                int i2 = C2035mJ.f6349P;
                int i3 = C2292rA.f7076BX;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i2;
                if (C0222ED.m428b(contextThemeWrapper)) {
                    i = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i = 0;
                }
                this.f9340Q = dimensionPixelSize + i;
                this.f9339P = c2421tc;
                this.f9338N = c2196pM;
                if (!this.f1376z.m772z()) {
                    this.f1374h = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: N */
    public final void mo912N(AbstractC0249El abstractC0249El, int i) {
        C2772h c2772h = (C2772h) abstractC0249El;
        C2421tc c2421tc = this.f9339P;
        Calendar m4586h = AbstractC2674yV.m4586h(c2421tc.f7412S.f1058S);
        m4586h.add(2, i);
        C0307Fr c0307Fr = new C0307Fr(m4586h);
        c2772h.f9337s.setText(c0307Fr.m652N());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) c2772h.f9336U.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() != null && c0307Fr.equals(materialCalendarGridView.getAdapter().f6352z)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().getClass();
            throw null;
        }
        new C2035mJ(c0307Fr, c2421tc);
        throw null;
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: Q */
    public final AbstractC0249El mo914Q(RecyclerView recyclerView, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (C0222ED.m428b(recyclerView.getContext())) {
            linearLayout.setLayoutParams(new C0419Hv(-1, this.f9340Q));
            return new C2772h(linearLayout, true);
        }
        return new C2772h(linearLayout, false);
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: h */
    public final long mo915h(int i) {
        Calendar m4586h = AbstractC2674yV.m4586h(this.f9339P.f7412S.f1058S);
        m4586h.add(2, i);
        return new C0307Fr(m4586h).f1058S.getTimeInMillis();
    }

    @Override // p000a.AbstractC0408Hk
    /* renamed from: z */
    public final int mo918z() {
        return this.f9339P.f7413g;
    }
}
