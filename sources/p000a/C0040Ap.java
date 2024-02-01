package p000a;

import android.widget.RadioGroup;

/* renamed from: a.Ap */
/* loaded from: classes.dex */
public final class C0040Ap implements RadioGroup.OnCheckedChangeListener {

    /* renamed from: h */
    public final /* synthetic */ InterfaceC0432IC f181h;

    /* renamed from: z */
    public final /* synthetic */ RadioGroup.OnCheckedChangeListener f182z = null;

    public C0040Ap(C0478J0 c0478j0) {
        this.f181h = c0478j0;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = this.f182z;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(radioGroup, i);
        }
        this.f181h.mo258z();
    }
}
