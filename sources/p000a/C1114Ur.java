package p000a;

import android.os.Bundle;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@InterfaceC2240qD("navigation")
/* renamed from: a.Ur */
/* loaded from: classes.dex */
public class C1114Ur extends AbstractC2719zK {

    /* renamed from: v */
    public final C1931kK f3617v;

    public C1114Ur(C1931kK c1931kK) {
        this.f3617v = c1931kK;
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: P */
    public final void mo2294P(List list, C0815PB c0815pb) {
        boolean z;
        String str;
        C1420ag m3572V;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1553dE c1553dE = (C1553dE) it.next();
            C1951kj c1951kj = (C1951kj) c1553dE.f4790R;
            Bundle m3023v = c1553dE.m3023v();
            int i = c1951kj.f6046f;
            String str2 = c1951kj.f6045Y;
            if (i == 0 && str2 == null) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder("no start destination defined via app:startDestination for ");
                int i2 = c1951kj.f4455y;
                if (i2 != 0) {
                    str = c1951kj.f4454w;
                    if (str == null) {
                        str = String.valueOf(i2);
                    }
                } else {
                    str = "the root navigation";
                }
                sb.append(str);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (str2 != null) {
                m3572V = c1951kj.m3571S(str2, false);
            } else {
                m3572V = c1951kj.m3572V(i, false);
            }
            if (m3572V == null) {
                if (c1951kj.f6047r == null) {
                    String str3 = c1951kj.f6045Y;
                    if (str3 == null) {
                        str3 = String.valueOf(c1951kj.f6046f);
                    }
                    c1951kj.f6047r = str3;
                }
                throw new IllegalArgumentException(AbstractC2441tz.m4184G("navigation destination ", c1951kj.f6047r, " is not a direct child of this NavGraph"));
            }
            AbstractC2719zK mo2533h = this.f3617v.mo2533h(m3572V.f4449S);
            C0904R3 m4654h = m4654h();
            Bundle m2852v = m3572V.m2852v(m3023v);
            int i3 = C1553dE.f4787f;
            AbstractC2499v4 abstractC2499v4 = m4654h.f3095o;
            mo2533h.mo2294P(Collections.singletonList(C1665fK.m3153u(abstractC2499v4.f7665z, m3572V, m2852v, abstractC2499v4.m4345u(), abstractC2499v4.f7663w)), c0815pb);
        }
    }

    @Override // p000a.AbstractC2719zK
    /* renamed from: z */
    public final C1420ag mo636z() {
        return new C1951kj(this);
    }
}
