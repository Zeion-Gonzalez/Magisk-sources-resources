package p000a;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: a.Ja */
/* loaded from: classes.dex */
public final class C0507Ja extends AbstractC1290Y9 implements InterfaceC0559KW {

    /* renamed from: I */
    public AbstractC0226EI f1687I;

    /* renamed from: g */
    public /* synthetic */ Object f1688g;

    /* renamed from: k */
    public int f1689k;

    /* renamed from: q */
    public List f1690q;

    /* renamed from: w */
    public SecureRandom f1691w;

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C0507Ja c0507Ja = new C0507Ja(interfaceC1171Vv);
        c0507Ja.f1688g = obj;
        return c0507Ja;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        C1116Ut c1116Ut;
        List list;
        SecureRandom secureRandom;
        AbstractC0226EI abstractC0226EI;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f1689k;
        int i2 = 3;
        if (i != 0) {
            if (i == 1) {
                list = this.f1690q;
                abstractC0226EI = this.f1687I;
                secureRandom = this.f1691w;
                c1116Ut = (C1116Ut) this.f1688g;
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            c1116Ut = (C1116Ut) this.f1688g;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            SecureRandom secureRandom2 = new SecureRandom();
            C2429tl c2429tl = new C2429tl(secureRandom2);
            char c = 'a';
            char c2 = 'z';
            char c3 = 'A';
            char c4 = 'Z';
            Iterator it = new C1228Wy(i2, new C2018lx(new Iterable[]{new C2301rK('a', 'z'), new C2301rK('A', 'Z')}, null)).iterator();
            while (it.hasNext()) {
                char charValue = ((Character) it.next()).charValue();
                if (charValue != c && charValue != c3) {
                    arrayList.add(String.valueOf(charValue));
                }
                Iterable[] iterableArr = new Iterable[i2];
                iterableArr[0] = new C2301rK(c, c2);
                iterableArr[1] = new C2301rK(c3, c4);
                iterableArr[2] = new C2301rK('0', '9');
                Iterator it2 = new C1228Wy(3, new C2018lx(iterableArr, null)).iterator();
                while (it2.hasNext()) {
                    char c5 = charValue;
                    char charValue2 = ((Character) it2.next()).charValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(c5);
                    sb.append(charValue2);
                    arrayList2.add(sb.toString());
                    Iterator it3 = it2;
                    Iterator it4 = new C1228Wy(3, new C2018lx(new Iterable[]{new C2301rK(c, c2), new C2301rK('A', 'Z'), new C2301rK('0', '9')}, null)).iterator();
                    while (it4.hasNext()) {
                        char charValue3 = ((Character) it4.next()).charValue();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(c5);
                        sb2.append(charValue2);
                        sb2.append(charValue3);
                        arrayList3.add(sb2.toString());
                    }
                    it2 = it3;
                    c = 'a';
                    c2 = 'z';
                }
                i2 = 3;
                c3 = 'A';
                c4 = 'Z';
            }
            Collections.shuffle(arrayList, secureRandom2);
            Collections.shuffle(arrayList2, secureRandom2);
            Collections.shuffle(arrayList3, secureRandom2);
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(arrayList);
            Iterator it5 = AbstractC2239qC.m3878O4(new C2211pf(new C1228Wy(1, arrayList2), true, C1780hU.f5602s)).iterator();
            while (it5.hasNext()) {
                arrayList4.add(it5.next());
            }
            Iterator it6 = AbstractC2239qC.m3878O4(new C2211pf(new C1228Wy(1, arrayList3), true, C1780hU.f5602s)).iterator();
            while (it6.hasNext()) {
                arrayList4.add(it6.next());
            }
            list = arrayList4;
            secureRandom = secureRandom2;
            abstractC0226EI = c2429tl;
        }
        int nextInt = secureRandom.nextInt(4) + 2;
        StringBuilder sb3 = new StringBuilder();
        for (int i3 = 0; i3 < nextInt; i3++) {
            if (!list.isEmpty()) {
                sb3.append((String) list.get(abstractC0226EI.mo435z(list.size())));
                if (i3 != nextInt - 1) {
                    sb3.append('.');
                }
            } else {
                throw new NoSuchElementException("Collection is empty.");
            }
        }
        sb3.setCharAt(0, Character.toLowerCase(sb3.charAt(0)));
        String sb4 = sb3.toString();
        this.f1688g = c1116Ut;
        this.f1691w = secureRandom;
        this.f1687I = abstractC0226EI;
        this.f1690q = list;
        this.f1689k = 1;
        c1116Ut.f3622R = sb4;
        c1116Ut.f3623S = 3;
        c1116Ut.f3621I = this;
        EnumC0464Im enumC0464Im2 = EnumC0464Im.f1557S;
        return enumC0464Im;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C0507Ja) mo49G((C1116Ut) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
