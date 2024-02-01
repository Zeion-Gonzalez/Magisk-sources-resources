package p000a;

import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: a.Eu */
/* loaded from: classes.dex */
public final class C0256Eu extends AbstractC2467uU implements InterfaceC0645M7, Comparable {

    /* renamed from: g */
    public static final C0823PM f912g = AbstractC1292YB.m2650I(C0741Nu.f2523H, C0741Nu.f2534e);

    /* renamed from: I */
    public boolean f913I;

    /* renamed from: R */
    public final C0826PP f914R;

    /* renamed from: k */
    public Boolean f915k;

    /* renamed from: q */
    public int f916q;

    /* renamed from: w */
    public final ArrayList f917w;

    public C0256Eu(C0826PP c0826pp) {
        this.f914R = c0826pp;
        Collection collection = c0826pp.f2803q;
        ArrayList arrayList = new ArrayList(AbstractC1658fB.m3134dx(collection));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(new C2318rd((C1071U5) it.next()));
        }
        this.f917w = arrayList;
        this.f915k = Boolean.FALSE;
        Iterator it2 = arrayList.iterator();
        while (true) {
            int i = 0;
            if (it2.hasNext()) {
                C2318rd c2318rd = (C2318rd) it2.next();
                c2318rd.mo579z(new C2403tG(9, c2318rd, new C2188pD(this, i), false));
            } else {
                mo579z(new C2403tG(11, this, new C2188pD(this, 1), false));
                m554M();
                return;
            }
        }
    }

    @Override // p000a.AbstractC0769OL
    /* renamed from: G */
    public final int mo553G() {
        return R.layout.item_hide_md2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x004b, code lost:
    
        if (r1 == r0.size()) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00b4, code lost:
    
        if (r3 == r1.size()) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x00b6, code lost:
    
        r0 = java.lang.Boolean.TRUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x00b9, code lost:
    
        r0 = null;
     */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m554M() {
        /*
            r7 = this;
            java.util.ArrayList r0 = r7.f917w
            boolean r1 = r0 instanceof java.util.Collection
            java.lang.String r2 = "Count overflow has happened."
            r3 = 0
            if (r1 == 0) goto L11
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L11
            r4 = r3
            goto L33
        L11:
            java.util.Iterator r1 = r0.iterator()
            r4 = r3
        L16:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L33
            java.lang.Object r5 = r1.next()
            a.rd r5 = (p000a.C2318rd) r5
            a.U5 r5 = r5.f7144R
            boolean r5 = r5.f3538v
            if (r5 == 0) goto L16
            int r4 = r4 + 1
            if (r4 < 0) goto L2d
            goto L16
        L2d:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r2)
            throw r0
        L33:
            int r1 = r7.f916q
            if (r1 == r4) goto L3d
            r7.f916q = r4
            r1 = 5
            p000a.AbstractC0795Op.m1801B(r7, r1)
        L3d:
            boolean r1 = r7.f913I
            if (r1 == 0) goto L4f
            int r1 = r7.f916q
            if (r1 != 0) goto L47
            goto Lad
        L47:
            int r0 = r0.size()
            if (r1 != r0) goto Lb9
            goto Lb6
        L4f:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L58:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r0.next()
            r5 = r4
            a.rd r5 = (p000a.C2318rd) r5
            a.U5 r5 = r5.f7144R
            boolean r6 = r5.f3536P
            if (r6 != 0) goto L7c
            boolean r6 = r5.f3535N
            if (r6 != 0) goto L7c
            java.lang.String r6 = r5.f3539z
            java.lang.String r5 = r5.f3537h
            boolean r5 = p000a.AbstractC1292YB.m2695u(r6, r5)
            if (r5 == 0) goto L7a
            goto L7c
        L7a:
            r5 = r3
            goto L7d
        L7c:
            r5 = 1
        L7d:
            if (r5 == 0) goto L58
            r1.add(r4)
            goto L58
        L83:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8a
            goto Lab
        L8a:
            java.util.Iterator r0 = r1.iterator()
        L8e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto Lab
            java.lang.Object r4 = r0.next()
            a.rd r4 = (p000a.C2318rd) r4
            a.U5 r4 = r4.f7144R
            boolean r4 = r4.f3538v
            if (r4 == 0) goto L8e
            int r3 = r3 + 1
            if (r3 < 0) goto La5
            goto L8e
        La5:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            r0.<init>(r2)
            throw r0
        Lab:
            if (r3 != 0) goto Lb0
        Lad:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto Lba
        Lb0:
            int r0 = r1.size()
            if (r3 != r0) goto Lb9
        Lb6:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            goto Lba
        Lb9:
            r0 = 0
        Lba:
            java.lang.Boolean r1 = r7.f915k
            boolean r1 = p000a.AbstractC1292YB.m2695u(r1, r0)
            if (r1 != 0) goto Lc9
            r7.f915k = r0
            r0 = 36
            r7.mo1709Q(r0)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0256Eu.m554M():void");
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: N */
    public final boolean mo555N(InterfaceC0645M7 interfaceC0645M7) {
        return AbstractC0795Op.m1875x(this, (C0256Eu) interfaceC0645M7);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return f912g.compare(this, (C0256Eu) obj);
    }

    @Override // p000a.InterfaceC0645M7
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ boolean mo556h(InterfaceC0645M7 interfaceC0645M7) {
        C0256Eu c0256Eu = (C0256Eu) interfaceC0645M7;
        return true;
    }
}
