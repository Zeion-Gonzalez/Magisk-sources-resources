package p000a;

import java.util.Iterator;

/* renamed from: a.CL */
/* loaded from: classes.dex */
public abstract class AbstractC0122CL implements Iterable, InterfaceC1564dP {

    /* renamed from: R */
    public final char f423R;

    /* renamed from: S */
    public final char f424S;

    /* renamed from: w */
    public final int f425w = 1;

    public AbstractC0122CL(char c, char c2) {
        this.f424S = c;
        this.f423R = (char) AbstractC1292YB.m2679j(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C2001ld(this.f424S, this.f423R, this.f425w);
    }
}
