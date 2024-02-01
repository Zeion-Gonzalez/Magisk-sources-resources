package p000a;

import android.view.View;
import java.util.ArrayList;

/* renamed from: a.Mc */
/* loaded from: classes.dex */
public final class C0666Mc implements InterfaceC2728zV {

    /* renamed from: h */
    public final /* synthetic */ ArrayList f2158h;

    /* renamed from: z */
    public final /* synthetic */ View f2159z;

    public C0666Mc(View view, ArrayList arrayList) {
        this.f2159z = view;
        this.f2158h = arrayList;
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: N */
    public final void mo1083N() {
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: P */
    public final void mo231P(AbstractC0614LY abstractC0614LY) {
        abstractC0614LY.mo1364J(this);
        this.f2159z.setVisibility(8);
        ArrayList arrayList = this.f2158h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: h */
    public final void mo1084h(AbstractC0614LY abstractC0614LY) {
        abstractC0614LY.mo1364J(this);
        abstractC0614LY.mo1385z(this);
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: v */
    public final void mo1085v() {
    }

    @Override // p000a.InterfaceC2728zV
    /* renamed from: z */
    public final void mo1086z() {
    }
}
