package p000a;

import java.util.Iterator;

/* renamed from: a.lx */
/* loaded from: classes.dex */
public final class C2018lx extends AbstractC1290Y9 implements InterfaceC0559KW {

    /* renamed from: I */
    public Iterator f6272I;

    /* renamed from: g */
    public int f6273g;

    /* renamed from: k */
    public int f6274k;

    /* renamed from: q */
    public int f6275q;

    /* renamed from: s */
    public final /* synthetic */ Iterable[] f6276s;

    /* renamed from: w */
    public Object[] f6277w;

    /* renamed from: y */
    public /* synthetic */ Object f6278y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2018lx(Iterable[] iterableArr, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f6276s = iterableArr;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        C2018lx c2018lx = new C2018lx(this.f6276s, interfaceC1171Vv);
        c2018lx.f6278y = obj;
        return c2018lx;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0036 -> B:34:0x003c). Please submit an issue!!! */
    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object mo50V(java.lang.Object r9) {
        /*
            r8 = this;
            a.Im r0 = p000a.EnumC0464Im.f1557S
            int r1 = r8.f6273g
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 != r2) goto L1c
            int r1 = r8.f6274k
            int r3 = r8.f6275q
            java.util.Iterator r4 = r8.f6272I
            java.lang.Object[] r5 = r8.f6277w
            java.lang.Iterable[] r5 = (java.lang.Iterable[]) r5
            java.lang.Object r6 = r8.f6278y
            a.Ut r6 = (p000a.C1116Ut) r6
            p000a.AbstractC1292YB.m2664UZ(r9)
            r9 = r8
            goto L3c
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            p000a.AbstractC1292YB.m2664UZ(r9)
            java.lang.Object r9 = r8.f6278y
            a.Ut r9 = (p000a.C1116Ut) r9
            java.lang.Iterable[] r1 = r8.f6276s
            int r3 = r1.length
            r4 = 0
            r6 = r9
            r5 = r1
            r1 = r3
            r3 = r4
            r9 = r8
        L34:
            if (r3 >= r1) goto L61
            r4 = r5[r3]
            java.util.Iterator r4 = r4.iterator()
        L3c:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L5e
            java.lang.Object r7 = r4.next()
            r9.f6278y = r6
            r9.f6277w = r5
            r9.f6272I = r4
            r9.f6275q = r3
            r9.f6274k = r1
            r9.f6273g = r2
            r6.f3622R = r7
            r7 = 3
            r6.f3623S = r7
            r6.f3621I = r9
            a.Im r7 = p000a.EnumC0464Im.f1557S
            if (r7 != r0) goto L3c
            return r0
        L5e:
            int r3 = r3 + 1
            goto L34
        L61:
            a.GJ r9 = p000a.C0329GJ.f1115z
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2018lx.mo50V(java.lang.Object):java.lang.Object");
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C2018lx) mo49G((C1116Ut) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
