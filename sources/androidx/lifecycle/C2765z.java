package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.List;
import p000a.AbstractC0470It;
import p000a.EnumC1632eh;
import p000a.EnumC2241qF;
import p000a.InterfaceC0630Lr;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1546d7;
import p000a.InterfaceC2630xV;
import p000a.InterfaceC2746zt;

/* renamed from: androidx.lifecycle.z */
/* loaded from: classes.dex */
public final class C2765z {

    /* renamed from: h */
    public final InterfaceC1270Xo f9024h;

    /* renamed from: z */
    public EnumC1632eh f9025z;

    public C2765z(InterfaceC2630xV interfaceC2630xV, EnumC1632eh enumC1632eh) {
        InterfaceC1270Xo reflectiveGenericLifecycleObserver;
        HashMap hashMap = AbstractC0470It.f1564z;
        boolean z = interfaceC2630xV instanceof InterfaceC1270Xo;
        boolean z2 = interfaceC2630xV instanceof InterfaceC0630Lr;
        if (z && z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0630Lr) interfaceC2630xV, (InterfaceC1270Xo) interfaceC2630xV);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0630Lr) interfaceC2630xV, null);
        } else if (z) {
            reflectiveGenericLifecycleObserver = (InterfaceC1270Xo) interfaceC2630xV;
        } else {
            Class<?> cls = interfaceC2630xV.getClass();
            if (AbstractC0470It.m1135h(cls) == 2) {
                List list = (List) AbstractC0470It.f1563h.get(cls);
                if (list.size() != 1) {
                    int size = list.size();
                    InterfaceC2746zt[] interfaceC2746ztArr = new InterfaceC2746zt[size];
                    if (size <= 0) {
                        reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC2746ztArr);
                    } else {
                        AbstractC0470It.m1136z((Constructor) list.get(0), interfaceC2630xV);
                        throw null;
                    }
                } else {
                    AbstractC0470It.m1136z((Constructor) list.get(0), interfaceC2630xV);
                    throw null;
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(interfaceC2630xV);
            }
        }
        this.f9024h = reflectiveGenericLifecycleObserver;
        this.f9025z = enumC1632eh;
    }

    /* renamed from: z */
    public final void m4849z(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
        EnumC1632eh m3881z = enumC2241qF.m3881z();
        EnumC1632eh enumC1632eh = this.f9025z;
        if (m3881z.compareTo(enumC1632eh) < 0) {
            enumC1632eh = m3881z;
        }
        this.f9025z = enumC1632eh;
        this.f9024h.mo2596Q(interfaceC1546d7, enumC2241qF);
        this.f9025z = m3881z;
    }
}
