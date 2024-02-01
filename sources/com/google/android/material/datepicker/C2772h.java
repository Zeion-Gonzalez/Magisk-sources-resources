package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;
import p000a.AbstractC0249El;
import p000a.AbstractC2446u3;
import p000a.C2588wm;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: classes.dex */
public final class C2772h extends AbstractC0249El {

    /* renamed from: U */
    public final MaterialCalendarGridView f9336U;

    /* renamed from: s */
    public final TextView f9337s;

    public C2772h(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f9337s = textView;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        new C2588wm(R.id.tag_accessibility_heading, 3).m2972v(textView, Boolean.TRUE);
        this.f9336U = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}
