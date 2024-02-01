package p000a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: a.TX */
/* loaded from: classes.dex */
public abstract class AbstractC1041TX {

    /* renamed from: z */
    public static final /* synthetic */ int f3444z = 0;

    static {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        hashSet.add("DES");
        hashSet.add("DESEDE");
        hashSet.add(InterfaceC1455bJ.f4538P.f4116S);
        hashSet.add(InterfaceC0237EV.f818w.f4116S);
        hashSet.add(InterfaceC0237EV.f792H.f4116S);
        hashSet2.add(InterfaceC0800Ow.f2727G);
        hashSet2.add(InterfaceC2589wn.f7925W);
        hashSet2.add(InterfaceC2589wn.f7919G);
        hashSet2.add(InterfaceC2589wn.f7920M);
        hashSet2.add(InterfaceC2589wn.f7924V);
        hashSet3.add(InterfaceC0800Ow.f2731W);
        hashSet3.add(InterfaceC0800Ow.f2733o);
        hashSet3.add(InterfaceC2589wn.f7921N);
        hashSet3.add(InterfaceC2589wn.f7930z);
        hashSet3.add(InterfaceC2589wn.f7923Q);
        hashSet3.add(InterfaceC2589wn.f7926h);
        hashSet3.add(InterfaceC2589wn.f7928u);
        hashSet3.add(InterfaceC2589wn.f7929v);
        hashSet3.add(InterfaceC2589wn.f7927o);
        hashSet3.add(InterfaceC2589wn.f7922P);
        hashSet4.add(InterfaceC0672Mj.f2215Q);
        hashSet4.add(InterfaceC2508vD.f7682u);
        hashSet4.add(InterfaceC2508vD.f7681o);
    }

    /* renamed from: z */
    public static C0448IW m2215z(ArrayList arrayList) {
        C2551w c2551w = new C2551w();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c2551w.m4371z((InterfaceC0959S) it.next());
        }
        return new C0448IW(c2551w);
    }
}
