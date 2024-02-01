package p000a;

import java.io.Serializable;

/* renamed from: a.Qu */
/* loaded from: classes.dex */
public final class C0897Qu extends AbstractC0386HL implements Serializable {

    /* renamed from: S */
    public final Enum[] f3083S;

    public C0897Qu(Enum[] enumArr) {
        this.f3083S = enumArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x001b A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // p000a.AbstractC0530K, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean contains(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r0 = r5.ordinal()
            if (r0 < 0) goto L18
            java.lang.Enum[] r2 = r4.f3083S
            int r3 = r2.length
            int r3 = r3 + (-1)
            if (r0 > r3) goto L18
            r0 = r2[r0]
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 != r5) goto L1c
            r1 = 1
        L1c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0897Qu.contains(java.lang.Object):boolean");
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f3083S;
        C0054B3.m101z(i, enumArr.length);
        return enumArr[i];
    }

    @Override // p000a.AbstractC0530K
    /* renamed from: h */
    public final int mo26h() {
        return this.f3083S.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // p000a.AbstractC0386HL, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int indexOf(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r5 = (java.lang.Enum) r5
            int r0 = r5.ordinal()
            if (r0 < 0) goto L17
            java.lang.Enum[] r2 = r4.f3083S
            int r3 = r2.length
            int r3 = r3 + r1
            if (r0 > r3) goto L17
            r2 = r2[r0]
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 != r5) goto L1b
            r1 = r0
        L1b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C0897Qu.indexOf(java.lang.Object):int");
    }

    @Override // p000a.AbstractC0386HL, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return indexOf((Enum) obj);
    }
}
