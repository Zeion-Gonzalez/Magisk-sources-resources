package p000a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: a.Jo */
/* loaded from: classes.dex */
public final class C0521Jo implements InterfaceC0924RO {

    /* renamed from: h */
    public final Object f1739h;

    /* renamed from: z */
    public final /* synthetic */ int f1740z;

    public C0521Jo(AbstractActivityC0402He abstractActivityC0402He) {
        this.f1740z = 0;
        this.f1739h = abstractActivityC0402He;
    }

    @Override // p000a.InterfaceC0924RO
    /* renamed from: z */
    public final Bundle mo1153z() {
        int i = this.f1740z;
        Object obj = this.f1739h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0510Jd) obj).m1201R().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((Set) obj));
                return bundle2;
        }
    }

    public C0521Jo(C1934kN c1934kN) {
        this.f1740z = 1;
        this.f1739h = new LinkedHashSet();
        c1934kN.m3554v("androidx.savedstate.Restarter", this);
    }
}
