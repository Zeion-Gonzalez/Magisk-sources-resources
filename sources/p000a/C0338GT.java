package p000a;

import android.widget.CompoundButton;

/* renamed from: a.GT */
/* loaded from: classes.dex */
public final class C0338GT implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: h */
    public final /* synthetic */ InterfaceC0432IC f1144h;

    /* renamed from: z */
    public final /* synthetic */ CompoundButton.OnCheckedChangeListener f1145z;

    public C0338GT(C0590L1 c0590l1, InterfaceC0432IC interfaceC0432IC) {
        this.f1145z = c0590l1;
        this.f1144h = interfaceC0432IC;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f1145z;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
        }
        this.f1144h.mo258z();
    }
}
