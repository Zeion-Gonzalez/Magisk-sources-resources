package p000a;

import java.io.Serializable;

/* renamed from: a.ov */
/* loaded from: classes.dex */
public abstract class AbstractC2171ov implements InterfaceC1346ZC, Serializable {

    /* renamed from: I */
    public final String f6651I;

    /* renamed from: R */
    public final Object f6652R;

    /* renamed from: S */
    public transient InterfaceC1346ZC f6653S;

    /* renamed from: k */
    public final boolean f6654k;

    /* renamed from: q */
    public final String f6655q;

    /* renamed from: w */
    public final Class f6656w;

    public AbstractC2171ov(Object obj, Class cls, String str, String str2, boolean z) {
        this.f6652R = obj;
        this.f6656w = cls;
        this.f6651I = str;
        this.f6655q = str2;
        this.f6654k = z;
    }

    /* renamed from: h */
    public abstract InterfaceC1346ZC mo854h();

    /* renamed from: v */
    public final InterfaceC0592L4 m3787v() {
        Class cls = this.f6656w;
        if (cls == null) {
            return null;
        }
        if (this.f6654k) {
            AbstractC0274FD.f956z.getClass();
            return new C2104ne(cls);
        }
        return AbstractC0274FD.m575z(cls);
    }
}
