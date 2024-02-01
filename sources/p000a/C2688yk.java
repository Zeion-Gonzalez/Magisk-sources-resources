package p000a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.yk */
/* loaded from: classes.dex */
public final class C2688yk extends AbstractC0620Lf implements InterfaceC2445u2 {

    /* renamed from: I */
    public final InterfaceC2445u2 f8375I;

    /* renamed from: g */
    public InterfaceC1255XS f8376g;

    /* renamed from: k */
    public final int f8377k;

    /* renamed from: q */
    public final InterfaceC1255XS f8378q;

    /* renamed from: y */
    public InterfaceC1171Vv f8379y;

    public C2688yk(InterfaceC2445u2 interfaceC2445u2, InterfaceC1255XS interfaceC1255XS) {
        super(C0736Np.f2488S, C0070BN.f302S);
        this.f8375I = interfaceC2445u2;
        this.f8378q = interfaceC1255XS;
        this.f8377k = ((Number) interfaceC1255XS.mo106x(0, C0582Ku.f1895y)).intValue();
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: M */
    public final void mo3723M() {
    }

    @Override // p000a.AbstractC0620Lf, p000a.InterfaceC1171Vv
    /* renamed from: N */
    public final InterfaceC1255XS mo315N() {
        InterfaceC1255XS interfaceC1255XS = this.f8376g;
        return interfaceC1255XS == null ? C0070BN.f302S : interfaceC1255XS;
    }

    /* renamed from: R */
    public final Object m4592R(InterfaceC1171Vv interfaceC1171Vv, Object obj) {
        Comparable comparable;
        int i;
        boolean z;
        InterfaceC1255XS mo315N = interfaceC1171Vv.mo315N();
        InterfaceC1265Xh interfaceC1265Xh = (InterfaceC1265Xh) mo315N.mo107y(C1710g8.f5381k);
        if (interfaceC1265Xh != null) {
            AbstractC1843ih.m3442f(interfaceC1265Xh);
        }
        InterfaceC1255XS interfaceC1255XS = this.f8376g;
        if (interfaceC1255XS != mo315N) {
            if (interfaceC1255XS instanceof C2393t1) {
                String str = "\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C2393t1) interfaceC1255XS).f7325S + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ";
                List m2595zd = AbstractC1269Xn.m2595zd(str);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : m2595zd) {
                    if (true ^ AbstractC1269Xn.m2579T0((String) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC1658fB.m3134dx(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    int length = str2.length();
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if ((!AbstractC1292YB.m2697x(str2.charAt(i2))) == true) {
                                break;
                            }
                            i2++;
                        } else {
                            i2 = -1;
                            break;
                        }
                    }
                    if (i2 == -1) {
                        i2 = str2.length();
                    }
                    arrayList2.add(Integer.valueOf(i2));
                }
                Iterator it2 = arrayList2.iterator();
                if (!it2.hasNext()) {
                    comparable = null;
                } else {
                    comparable = (Comparable) it2.next();
                    while (it2.hasNext()) {
                        Comparable comparable2 = (Comparable) it2.next();
                        if (comparable.compareTo(comparable2) > 0) {
                            comparable = comparable2;
                        }
                    }
                }
                Integer num = (Integer) comparable;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                int size = (m2595zd.size() * 0) + str.length();
                C0741Nu c0741Nu = C0741Nu.f2533d;
                int m2642C = AbstractC1292YB.m2642C(m2595zd);
                ArrayList arrayList3 = new ArrayList();
                int i3 = 0;
                for (Object obj3 : m2595zd) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        String str3 = (String) obj3;
                        if ((i3 == 0 || i3 == m2642C) && AbstractC1269Xn.m2579T0(str3)) {
                            str3 = null;
                        } else {
                            if (i >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                int length2 = str3.length();
                                if (i <= length2) {
                                    length2 = i;
                                }
                                String str4 = (String) c0741Nu.mo85W(str3.substring(length2));
                                if (str4 != null) {
                                    str3 = str4;
                                }
                            } else {
                                throw new IllegalArgumentException(AbstractC2441tz.m4190Q("Requested character count ", i, " is less than zero.").toString());
                            }
                        }
                        if (str3 != null) {
                            arrayList3.add(str3);
                        }
                        i3 = i4;
                    } else {
                        AbstractC1292YB.m2699zx();
                        throw null;
                    }
                }
                StringBuilder sb = new StringBuilder(size);
                AbstractC2486us.m4295yF(arrayList3, sb, "\n", "", "", -1, "...", null);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (((Number) mo315N.mo106x(0, new C2355sJ(this))).intValue() == this.f8377k) {
                this.f8376g = mo315N;
            } else {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f8378q + ",\n\t\tbut emission happened in " + mo315N + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
        }
        this.f8379y = interfaceC1171Vv;
        ((C2291r9) AbstractC2466uT.f7564z).getClass();
        Object mo237h = this.f8375I.mo237h(obj, this);
        if (!AbstractC1292YB.m2695u(mo237h, EnumC0464Im.f1557S)) {
            this.f8379y = null;
        }
        return mo237h;
    }

    @Override // p000a.AbstractC0620Lf, p000a.AbstractC2097nW
    /* renamed from: S */
    public final void mo1387S() {
        super.mo1387S();
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        Throwable m4677z = AbstractC2740zk.m4677z(obj);
        if (m4677z != null) {
            this.f8376g = new C2393t1(mo315N(), m4677z);
        }
        InterfaceC1171Vv interfaceC1171Vv = this.f8379y;
        if (interfaceC1171Vv != null) {
            interfaceC1171Vv.mo320u(obj);
        }
        return EnumC0464Im.f1557S;
    }

    @Override // p000a.InterfaceC2445u2
    /* renamed from: h */
    public final Object mo237h(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        try {
            Object m4592R = m4592R(interfaceC1171Vv, obj);
            return m4592R == EnumC0464Im.f1557S ? m4592R : C0329GJ.f1115z;
        } catch (Throwable th) {
            this.f8376g = new C2393t1(interfaceC1171Vv.mo315N(), th);
            throw th;
        }
    }

    @Override // p000a.AbstractC2097nW, p000a.InterfaceC2683yf
    /* renamed from: v */
    public final InterfaceC2683yf mo2966v() {
        InterfaceC1171Vv interfaceC1171Vv = this.f8379y;
        if (interfaceC1171Vv instanceof InterfaceC2683yf) {
            return (InterfaceC2683yf) interfaceC1171Vv;
        }
        return null;
    }
}
