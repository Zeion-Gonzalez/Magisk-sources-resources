package p000a;

import android.database.Cursor;
import com.topjohnwu.magisk.core.data.SuLogDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: a.b8 */
/* loaded from: classes.dex */
public final class CallableC1446b8 implements Callable {

    /* renamed from: R */
    public final /* synthetic */ C1999lb f4526R;

    /* renamed from: S */
    public final /* synthetic */ int f4527S;

    /* renamed from: w */
    public final /* synthetic */ Object f4528w;

    public /* synthetic */ CallableC1446b8(C1999lb c1999lb, Object obj, int i) {
        this.f4527S = i;
        this.f4526R = c1999lb;
        this.f4528w = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        InterfaceC0771ON interfaceC0771ON = null;
        int i = this.f4527S;
        Object obj = this.f4528w;
        C1999lb c1999lb = this.f4526R;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                SuLogDatabase suLogDatabase = c1999lb.f6210v;
                suLogDatabase.m3192z();
                suLogDatabase.m3180G();
                try {
                    C0291FX c0291fx = c1999lb.f6209P;
                    C0790Oi c0790Oi = (C0790Oi) obj;
                    InterfaceC2721zM m1419v = c0291fx.m1419v();
                    try {
                        C0291FX.m605f(m1419v, c0790Oi);
                        m1419v.mo4349nP();
                        c0291fx.m1421y(m1419v);
                        InterfaceC0771ON interfaceC0771ON2 = suLogDatabase.f5278P;
                        if (interfaceC0771ON2 != null) {
                            interfaceC0771ON = interfaceC0771ON2;
                        }
                        interfaceC0771ON.mo1790l().mo1943e();
                        suLogDatabase.m3181M();
                        return C0329GJ.f1115z;
                    } catch (Throwable th) {
                        c0291fx.m1421y(m1419v);
                        throw th;
                    }
                } catch (Throwable th2) {
                    suLogDatabase.m3181M();
                    throw th2;
                }
            default:
                C1544d5 c1544d5 = (C1544d5) obj;
                Cursor m3185S = c1999lb.f6210v.m3185S(c1544d5, null);
                try {
                    int m3413J = AbstractC1843ih.m3413J(m3185S, "fromUid");
                    int m3413J2 = AbstractC1843ih.m3413J(m3185S, "toUid");
                    int m3413J3 = AbstractC1843ih.m3413J(m3185S, "fromPid");
                    int m3413J4 = AbstractC1843ih.m3413J(m3185S, "packageName");
                    int m3413J5 = AbstractC1843ih.m3413J(m3185S, "appName");
                    int m3413J6 = AbstractC1843ih.m3413J(m3185S, "command");
                    int m3413J7 = AbstractC1843ih.m3413J(m3185S, "action");
                    int m3413J8 = AbstractC1843ih.m3413J(m3185S, "target");
                    int m3413J9 = AbstractC1843ih.m3413J(m3185S, "context");
                    int m3413J10 = AbstractC1843ih.m3413J(m3185S, "gids");
                    int m3413J11 = AbstractC1843ih.m3413J(m3185S, "time");
                    int m3413J12 = AbstractC1843ih.m3413J(m3185S, "id");
                    ArrayList arrayList = new ArrayList(m3185S.getCount());
                    while (m3185S.moveToNext()) {
                        int i2 = m3185S.getInt(m3413J);
                        int i3 = m3185S.getInt(m3413J2);
                        int i4 = m3185S.getInt(m3413J3);
                        if (m3185S.isNull(m3413J4)) {
                            string = null;
                        } else {
                            string = m3185S.getString(m3413J4);
                        }
                        if (m3185S.isNull(m3413J5)) {
                            string2 = null;
                        } else {
                            string2 = m3185S.getString(m3413J5);
                        }
                        if (m3185S.isNull(m3413J6)) {
                            string3 = null;
                        } else {
                            string3 = m3185S.getString(m3413J6);
                        }
                        int i5 = m3185S.getInt(m3413J7);
                        int i6 = m3185S.getInt(m3413J8);
                        if (m3185S.isNull(m3413J9)) {
                            string4 = null;
                        } else {
                            string4 = m3185S.getString(m3413J9);
                        }
                        if (m3185S.isNull(m3413J10)) {
                            string5 = null;
                        } else {
                            string5 = m3185S.getString(m3413J10);
                        }
                        C0790Oi c0790Oi2 = new C0790Oi(i2, i3, i4, string, string2, string3, i5, i6, string4, string5, m3185S.getLong(m3413J11));
                        int i7 = m3413J;
                        c0790Oi2.f2685V = m3185S.getInt(m3413J12);
                        arrayList.add(c0790Oi2);
                        m3413J = i7;
                    }
                    return arrayList;
                } finally {
                    m3185S.close();
                    c1544d5.m2993z();
                }
        }
    }
}
