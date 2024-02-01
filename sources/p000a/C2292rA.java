package p000a;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.C2773v;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* renamed from: a.rA */
/* loaded from: classes.dex */
public final class C2292rA<S> extends AbstractC0649MD {

    /* renamed from: BX */
    public static final /* synthetic */ int f7076BX = 0;

    /* renamed from: BO */
    public C0307Fr f7077BO;

    /* renamed from: EC */
    public int f7078EC;

    /* renamed from: G5 */
    public View f7079G5;

    /* renamed from: Ha */
    public View f7080Ha;

    /* renamed from: Lq */
    public RecyclerView f7081Lq;

    /* renamed from: Pm */
    public View f7082Pm;

    /* renamed from: U8 */
    public C2421tc f7083U8;

    /* renamed from: ZH */
    public RecyclerView f7084ZH;

    /* renamed from: dx */
    public C0407Hj f7085dx;

    /* renamed from: he */
    public int f7086he;

    /* renamed from: oI */
    public View f7087oI;

    /* renamed from: B */
    public final void m3947B(int i) {
        this.f7081Lq.post(new RunnableC2278qv(i, 0, this));
    }

    /* renamed from: D */
    public final void m3948D(int i) {
        this.f7086he = i;
        if (i == 2) {
            RecyclerView recyclerView = this.f7084ZH;
            recyclerView.f9077J.mo1502Lq(this.f7077BO.f1062w - ((C1165Vo) recyclerView.f9124r).f3793P.f7083U8.f7412S.f1062w);
            this.f7087oI.setVisibility(0);
            this.f7079G5.setVisibility(8);
            this.f7080Ha.setVisibility(8);
            this.f7082Pm.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f7087oI.setVisibility(8);
            this.f7079G5.setVisibility(0);
            this.f7080Ha.setVisibility(0);
            this.f7082Pm.setVisibility(0);
            m3949K(this.f7077BO);
        }
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: F */
    public final void mo279F(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f7078EC);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7083U8);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f7077BO);
    }

    /* renamed from: K */
    public final void m3949K(C0307Fr c0307Fr) {
        boolean z;
        RecyclerView recyclerView;
        int i;
        C0307Fr c0307Fr2 = ((C2773v) this.f7081Lq.f9124r).f9339P.f7412S;
        Calendar calendar = c0307Fr2.f1058S;
        if (calendar instanceof GregorianCalendar) {
            int i2 = c0307Fr.f1062w;
            int i3 = c0307Fr2.f1062w;
            int i4 = c0307Fr.f1057R;
            int i5 = c0307Fr2.f1057R;
            int i6 = (i4 - i5) + ((i2 - i3) * 12);
            C0307Fr c0307Fr3 = this.f7077BO;
            if (calendar instanceof GregorianCalendar) {
                int i7 = i6 - ((c0307Fr3.f1057R - i5) + ((c0307Fr3.f1062w - i3) * 12));
                boolean z2 = true;
                if (Math.abs(i7) > 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (i7 <= 0) {
                    z2 = false;
                }
                this.f7077BO = c0307Fr;
                if (z && z2) {
                    recyclerView = this.f7081Lq;
                    i = i6 - 3;
                } else {
                    if (z) {
                        recyclerView = this.f7081Lq;
                        i = i6 + 3;
                    }
                    m3947B(i6);
                    return;
                }
                recyclerView.m4921UZ(i);
                m3947B(i6);
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Y */
    public final View mo431Y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        C2675yW c2675yW;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(m4003M(), this.f7078EC);
        this.f7085dx = new C0407Hj(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C0307Fr c0307Fr = this.f7083U8.f7412S;
        int i3 = 1;
        int i4 = 0;
        if (C0222ED.m428b(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = m4004O().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i5 = C2035mJ.f6349P;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i5 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i5) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        AbstractC2446u3.m4221V(gridView, new C0187Dc(i4, this));
        int i6 = this.f7083U8.f7415q;
        if (i6 > 0) {
            c2675yW = new C2675yW(i6);
        } else {
            c2675yW = new C2675yW();
        }
        gridView.setAdapter((ListAdapter) c2675yW);
        gridView.setNumColumns(c0307Fr.f1056I);
        gridView.setEnabled(false);
        this.f7081Lq = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        m4003M();
        this.f7081Lq.m4905EC(new C2086nH(this, i2, i2));
        this.f7081Lq.setTag("MONTHS_VIEW_GROUP_TAG");
        C2773v c2773v = new C2773v(contextThemeWrapper, this.f7083U8, new C2196pM(21, this));
        this.f7081Lq.m4939n0(c2773v);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f7084ZH = recyclerView;
        if (recyclerView != null) {
            recyclerView.f9121p = true;
            recyclerView.m4905EC(new GridLayoutManager(integer));
            this.f7084ZH.m4939n0(new C1165Vo(this));
            this.f7084ZH.m4922W(new C1274Xs(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            AbstractC2446u3.m4221V(materialButton, new C0187Dc(2, this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f7080Ha = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.f7082Pm = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f7087oI = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f7079G5 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            m3948D(1);
            materialButton.setText(this.f7077BO.m652N());
            this.f7081Lq.m4907G(new C0202Dr(this, c2773v, materialButton));
            materialButton.setOnClickListener(new ViewOnClickListenerC2660yB(i3, this));
            this.f7082Pm.setOnClickListener(new ViewOnClickListenerC0909R8(this, c2773v, i3));
            this.f7080Ha.setOnClickListener(new ViewOnClickListenerC0909R8(this, c2773v, i4));
        }
        if (!C0222ED.m428b(contextThemeWrapper)) {
            C2613xA c2613xA = new C2613xA();
            RecyclerView recyclerView2 = this.f7081Lq;
            RecyclerView recyclerView3 = (RecyclerView) c2613xA.f2047z;
            if (recyclerView3 != recyclerView2) {
                if (recyclerView3 != null) {
                    AbstractC1467ba abstractC1467ba = (AbstractC1467ba) c2613xA.f2046v;
                    ArrayList arrayList = recyclerView3.f9099d2;
                    if (arrayList != null) {
                        arrayList.remove(abstractC1467ba);
                    }
                    ((RecyclerView) c2613xA.f2047z).f9063BO = null;
                }
                c2613xA.f2047z = recyclerView2;
                if (recyclerView2 != null) {
                    if (recyclerView2.f9063BO == null) {
                        recyclerView2.m4907G((AbstractC1467ba) c2613xA.f2046v);
                        ((RecyclerView) c2613xA.f2047z).f9063BO = c2613xA;
                        c2613xA.f2045h = new Scroller(((RecyclerView) c2613xA.f2047z).getContext(), new DecelerateInterpolator());
                        c2613xA.m1411U();
                    } else {
                        throw new IllegalStateException("An instance of OnFlingListener already set.");
                    }
                }
            }
        }
        RecyclerView recyclerView4 = this.f7081Lq;
        C0307Fr c0307Fr2 = this.f7077BO;
        C0307Fr c0307Fr3 = c2773v.f9339P.f7412S;
        if (c0307Fr3.f1058S instanceof GregorianCalendar) {
            recyclerView4.m4921UZ((c0307Fr2.f1057R - c0307Fr3.f1057R) + ((c0307Fr2.f1062w - c0307Fr3.f1062w) * 12));
            AbstractC2446u3.m4221V(this.f7081Lq, new C0187Dc(i3, this));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: r */
    public final void mo290r(Bundle bundle) {
        super.mo290r(bundle);
        if (bundle == null) {
            bundle = this.f7210k;
        }
        this.f7078EC = bundle.getInt("THEME_RES_ID_KEY");
        AbstractC2441tz.m4185I(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f7083U8 = (C2421tc) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC2441tz.m4185I(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f7077BO = (C0307Fr) bundle.getParcelable("CURRENT_MONTH_KEY");
    }
}
