package p000a;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: a.wS */
/* loaded from: classes.dex */
public final class C2571wS implements AdapterView.OnItemSelectedListener {

    /* renamed from: z */
    public final InterfaceC0432IC f7848z;

    public C2571wS(C0130CV c0130cv) {
        this.f7848z = c0130cv;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        InterfaceC0432IC interfaceC0432IC = this.f7848z;
        if (interfaceC0432IC != null) {
            interfaceC0432IC.mo258z();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        InterfaceC0432IC interfaceC0432IC = this.f7848z;
        if (interfaceC0432IC != null) {
            interfaceC0432IC.mo258z();
        }
    }
}
