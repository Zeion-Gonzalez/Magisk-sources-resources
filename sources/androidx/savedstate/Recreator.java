package androidx.savedstate;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p000a.AbstractC1843ih;
import p000a.AbstractC1952kk;
import p000a.AbstractC2441tz;
import p000a.C1934kN;
import p000a.C2145oS;
import p000a.EnumC2241qF;
import p000a.InterfaceC0277FG;
import p000a.InterfaceC0670Mg;
import p000a.InterfaceC1270Xo;
import p000a.InterfaceC1546d7;
import p000a.InterfaceC2027mA;

/* loaded from: classes.dex */
public final class Recreator implements InterfaceC1270Xo {

    /* renamed from: S */
    public final InterfaceC0277FG f9156S;

    public Recreator(InterfaceC0277FG interfaceC0277FG) {
        this.f9156S = interfaceC0277FG;
    }

    @Override // p000a.InterfaceC1270Xo
    /* renamed from: Q */
    public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
        LinkedHashMap linkedHashMap;
        if (enumC2241qF == EnumC2241qF.ON_CREATE) {
            interfaceC1546d7.mo1354C().mo724h(this);
            InterfaceC0277FG interfaceC0277FG = this.f9156S;
            Bundle m3555z = interfaceC0277FG.mo576h().m3555z("androidx.savedstate.Restarter");
            if (m3555z == null) {
                return;
            }
            ArrayList<String> stringArrayList = m3555z.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(InterfaceC2027mA.class);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                            declaredConstructor.setAccessible(true);
                            try {
                                InterfaceC2027mA interfaceC2027mA = (InterfaceC2027mA) declaredConstructor.newInstance(new Object[0]);
                                if (interfaceC0277FG instanceof InterfaceC0670Mg) {
                                    C2145oS mo1569G = ((InterfaceC0670Mg) interfaceC0277FG).mo1569G();
                                    C1934kN mo576h = interfaceC0277FG.mo576h();
                                    mo1569G.getClass();
                                    Iterator it = new HashSet(mo1569G.f6600z.keySet()).iterator();
                                    while (true) {
                                        boolean hasNext = it.hasNext();
                                        linkedHashMap = mo1569G.f6600z;
                                        if (!hasNext) {
                                            break;
                                        } else {
                                            AbstractC1843ih.m3418N((AbstractC1952kk) linkedHashMap.get((String) it.next()), mo576h, interfaceC0277FG.mo1354C());
                                        }
                                    }
                                    if ((!new HashSet(linkedHashMap.keySet()).isEmpty()) != false) {
                                        mo576h.m3552P();
                                    }
                                } else {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
                                }
                            } catch (Exception e) {
                                throw new RuntimeException(AbstractC2441tz.m4200k("Failed to instantiate ", str), e);
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        throw new RuntimeException(AbstractC2441tz.m4184G("Class ", str, " wasn't found"), e3);
                    }
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
