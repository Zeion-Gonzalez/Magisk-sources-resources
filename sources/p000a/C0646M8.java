package p000a;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: a.M8 */
/* loaded from: classes.dex */
public final class C0646M8 extends AbstractC1021T9 implements InterfaceC0559KW {

    /* renamed from: I */
    public final /* synthetic */ Object f2082I;

    /* renamed from: R */
    public final /* synthetic */ int f2083R;

    /* renamed from: w */
    public final /* synthetic */ boolean f2084w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0646M8(Object obj, boolean z, int i) {
        super(2);
        this.f2083R = i;
        this.f2082I = obj;
        this.f2084w = z;
    }

    /* renamed from: h */
    public final C0084Bc m1450h(int i, CharSequence charSequence) {
        Object obj;
        C0084Bc c0084Bc;
        Object obj2;
        int i2 = this.f2083R;
        Object obj3 = this.f2082I;
        switch (i2) {
            case AbstractC0795Op.f2698E /* 0 */:
                int m2575M6 = AbstractC1269Xn.m2575M6(i, charSequence, this.f2084w, (char[]) obj3);
                if (m2575M6 < 0) {
                    return null;
                }
                return new C0084Bc(Integer.valueOf(m2575M6), 1);
            default:
                List list = (List) obj3;
                boolean z = this.f2084w;
                if (!z && list.size() == 1) {
                    int size = list.size();
                    if (size != 0) {
                        if (size == 1) {
                            String str = (String) list.get(0);
                            int m2576Rh = AbstractC1269Xn.m2576Rh(charSequence, str, i, false, 4);
                            if (m2576Rh >= 0) {
                                c0084Bc = new C0084Bc(Integer.valueOf(m2576Rh), str);
                            }
                            c0084Bc = null;
                        } else {
                            throw new IllegalArgumentException("List has more than one element.");
                        }
                    } else {
                        throw new NoSuchElementException("List is empty.");
                    }
                } else {
                    if (i < 0) {
                        i = 0;
                    }
                    C0325GF c0325gf = new C0325GF(i, charSequence.length());
                    boolean z2 = charSequence instanceof String;
                    int i3 = c0325gf.f2578w;
                    int i4 = c0325gf.f2576R;
                    if (z2) {
                        if ((i3 > 0 && i <= i4) || (i3 < 0 && i4 <= i)) {
                            while (true) {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        String str2 = (String) obj2;
                                        if (AbstractC1269Xn.m2574LN(0, i, str2.length(), str2, (String) charSequence, z)) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                String str3 = (String) obj2;
                                if (str3 != null) {
                                    c0084Bc = new C0084Bc(Integer.valueOf(i), str3);
                                } else if (i != i4) {
                                    i += i3;
                                }
                            }
                        }
                        c0084Bc = null;
                    } else {
                        if ((i3 > 0 && i <= i4) || (i3 < 0 && i4 <= i)) {
                            while (true) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj = it2.next();
                                        String str4 = (String) obj;
                                        if (AbstractC1269Xn.m2581W9(str4, 0, charSequence, i, str4.length(), z)) {
                                        }
                                    } else {
                                        obj = null;
                                    }
                                }
                                String str5 = (String) obj;
                                if (str5 != null) {
                                    c0084Bc = new C0084Bc(Integer.valueOf(i), str5);
                                } else if (i != i4) {
                                    i += i3;
                                }
                            }
                        }
                        c0084Bc = null;
                    }
                }
                if (c0084Bc == null) {
                    return null;
                }
                return new C0084Bc(c0084Bc.f329S, Integer.valueOf(((String) c0084Bc.f328R).length()));
        }
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        switch (this.f2083R) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m1450h(((Number) obj2).intValue(), (CharSequence) obj);
            case 1:
                return m1450h(((Number) obj2).intValue(), (CharSequence) obj);
            default:
                return ((InterfaceC1255XS) obj).mo104G((InterfaceC1088UM) obj2);
        }
    }
}
