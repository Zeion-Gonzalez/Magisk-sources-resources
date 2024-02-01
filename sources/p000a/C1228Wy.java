package p000a;

import android.view.ViewGroup;
import java.io.BufferedReader;
import java.util.Iterator;

/* renamed from: a.Wy */
/* loaded from: classes.dex */
public final class C1228Wy implements InterfaceC2296rE {

    /* renamed from: h */
    public final Object f3996h;

    /* renamed from: z */
    public final /* synthetic */ int f3997z;

    public /* synthetic */ C1228Wy(int i, Object obj) {
        this.f3997z = i;
        this.f3996h = obj;
    }

    @Override // p000a.InterfaceC2296rE
    public final Iterator iterator() {
        int i = this.f3997z;
        Object obj = this.f3996h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return new C2098nX(1, (ViewGroup) obj);
            case 1:
                return ((Iterable) obj).iterator();
            case 2:
                return new C1027TH(this);
            case 3:
                C1116Ut c1116Ut = new C1116Ut();
                c1116Ut.f3621I = AbstractC0438II.m1027g(c1116Ut, c1116Ut, (InterfaceC0559KW) obj);
                return c1116Ut;
            default:
                return (Iterator) obj;
        }
    }

    public C1228Wy(BufferedReader bufferedReader) {
        this.f3997z = 2;
        this.f3996h = bufferedReader;
    }
}
