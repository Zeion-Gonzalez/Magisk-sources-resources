package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;
import p000a.C0925RP;
import p000a.C2555w7;
import p000a.EnumC2241qF;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1546d7;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC1270Xo {

    /* renamed from: R */
    public final C0925RP f9007R;

    /* renamed from: S */
    public final Object f9008S;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f9008S = obj;
        this.f9007R = C2555w7.f7802v.m4376h(obj.getClass());
    }

    @Override // p000a.InterfaceC1270Xo
    /* renamed from: Q */
    public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
        HashMap hashMap = this.f9007R.f3176z;
        List list = (List) hashMap.get(enumC2241qF);
        Object obj = this.f9008S;
        C0925RP.m2074z(list, interfaceC1546d7, enumC2241qF, obj);
        C0925RP.m2074z((List) hashMap.get(EnumC2241qF.ON_ANY), interfaceC1546d7, enumC2241qF, obj);
    }
}
