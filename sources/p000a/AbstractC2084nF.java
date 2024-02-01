package p000a;

import java.util.AbstractList;
import java.util.List;

/* renamed from: a.nF */
/* loaded from: classes.dex */
public abstract class AbstractC2084nF extends AbstractList implements List, InterfaceC2042mU {
    /* renamed from: h */
    public abstract int mo1150h();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo1152v(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo1150h();
    }

    /* renamed from: v */
    public abstract Object mo1152v(int i);
}
