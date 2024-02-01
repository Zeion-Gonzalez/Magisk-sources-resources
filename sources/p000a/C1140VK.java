package p000a;

import android.app.Activity;

/* renamed from: a.VK */
/* loaded from: classes.dex */
public final class C1140VK extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ Runnable f3715g;

    /* renamed from: k */
    public final /* synthetic */ String f3716k;

    /* renamed from: q */
    public final /* synthetic */ Activity f3717q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1140VK(Activity activity, String str, Runnable runnable, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f3717q = activity;
        this.f3716k = str;
        this.f3715g = runnable;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1140VK(this.f3717q, this.f3716k, this.f3715g, interfaceC1171Vv);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e3, code lost:
    
        if (r10 == null) goto L34;
     */
    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo50V(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1140VK.mo50V(java.lang.Object):java.lang.Object");
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1140VK) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
