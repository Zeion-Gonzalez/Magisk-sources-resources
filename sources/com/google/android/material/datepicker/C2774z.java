package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import p000a.C2143oQ;
import p000a.C2196pM;
import p000a.C2292rA;

/* renamed from: com.google.android.material.datepicker.z */
/* loaded from: classes.dex */
public final class C2774z implements AdapterView.OnItemClickListener {

    /* renamed from: R */
    public final /* synthetic */ C2773v f9341R;

    /* renamed from: S */
    public final /* synthetic */ MaterialCalendarGridView f9342S;

    public C2774z(C2773v c2773v, MaterialCalendarGridView materialCalendarGridView) {
        this.f9341R = c2773v;
        this.f9342S = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        boolean z;
        MaterialCalendarGridView materialCalendarGridView = this.f9342S;
        boolean z2 = true;
        if (i >= materialCalendarGridView.getAdapter().m3674z() && i <= (r5.m3674z() + r5.f6352z.f1061q) - 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2196pM c2196pM = this.f9341R.f9338N;
            long longValue = materialCalendarGridView.getAdapter().getItem(i).longValue();
            Object obj = c2196pM.f6755R;
            if (longValue < ((C2143oQ) ((C2292rA) obj).f7083U8.f7416w).f6593S) {
                z2 = false;
            }
            if (z2) {
                ((C2292rA) obj).getClass();
                throw null;
            }
        }
    }
}
