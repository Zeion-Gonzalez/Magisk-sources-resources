package p000a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: a.xH */
/* loaded from: classes.dex */
public final class C2619xH extends AbstractC2615xD {

    /* renamed from: E */
    public final List f8098E;

    /* renamed from: U */
    public C0536K5 f8099U;

    /* renamed from: f */
    public final C2735zf f8100f;

    /* renamed from: g */
    public final C0576Kn f8101g;

    /* renamed from: k */
    public final C1112Up f8102k;

    /* renamed from: s */
    public final C1587dt f8103s;

    /* renamed from: y */
    public boolean f8104y;

    public C2619xH() {
        C1112Up c1112Up = new C1112Up(EnumC0715NT.f2410S);
        this.f8102k = c1112Up;
        C0741Nu c0741Nu = C0741Nu.f2529X;
        C0576Kn c0576Kn = new C0576Kn();
        C1104Uh c1104Uh = new C1104Uh(0, new C1372Zg(c0576Kn, 0, c0741Nu));
        C2401tD c2401tD = new C2401tD(c1112Up, c1104Uh);
        C2401tD c2401tD2 = (C2401tD) c0576Kn.f1876V.mo2924v(c1112Up, c2401tD);
        if (c2401tD2 != null && c2401tD2.f7332R != c1104Uh) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (c2401tD2 == null) {
            if ((c0576Kn.f9022v > 0 ? 1 : 0) != 0) {
                c1112Up.m4845Q(c2401tD);
            }
        }
        this.f8101g = c0576Kn;
        this.f8104y = C1910jw.f5958R;
        this.f8103s = new C1587dt();
        ArrayList arrayList = new ArrayList();
        C1146VR c1146vr = AbstractC2631xW.f8219z;
        this.f8098E = Collections.synchronizedList(arrayList);
        this.f8100f = new C2735zf(this);
    }
}
