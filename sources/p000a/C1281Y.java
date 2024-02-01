package p000a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: a.Y */
/* loaded from: classes.dex */
public final class C1281Y extends AbstractC1593e {

    /* renamed from: R */
    public byte[] f4115R;

    /* renamed from: S */
    public final String f4116S;

    /* renamed from: w */
    public static final C2120o f4114w = new C2120o(6, 13, C1281Y.class);

    /* renamed from: I */
    public static final ConcurrentHashMap f4113I = new ConcurrentHashMap();

    public C1281Y(C1281Y c1281y, String str) {
        if (C1230X.m2528s(0, str)) {
            this.f4116S = c1281y.f4116S + "." + str;
            return;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4184G("string ", str, " not a valid OID branch"));
    }

    /* renamed from: U */
    public static C1281Y m2621U(Object obj) {
        if (obj == null || (obj instanceof C1281Y)) {
            return (C1281Y) obj;
        }
        if (obj instanceof InterfaceC0959S) {
            AbstractC1593e mo302N = ((InterfaceC0959S) obj).mo302N();
            if (mo302N instanceof C1281Y) {
                return (C1281Y) mo302N;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (C1281Y) f4114w.m438N((byte[]) obj);
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct object identifier from byte[]: " + e.getMessage());
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: ".concat(obj.getClass().getName()));
    }

    /* renamed from: E */
    public final C1281Y m2622E() {
        C2282r c2282r = new C2282r(m2623s());
        ConcurrentHashMap concurrentHashMap = f4113I;
        C1281Y c1281y = (C1281Y) concurrentHashMap.get(c2282r);
        if (c1281y != null) {
            return c1281y;
        }
        synchronized (concurrentHashMap) {
            if (concurrentHashMap.containsKey(c2282r)) {
                return (C1281Y) concurrentHashMap.get(c2282r);
            }
            concurrentHashMap.put(c2282r, this);
            return this;
        }
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: R */
    public final boolean mo215R() {
        return false;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: S */
    public final void mo144S(C0175DP c0175dp, boolean z) {
        c0175dp.m336M(6, z, m2623s());
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: V */
    public final boolean mo216V(AbstractC1593e abstractC1593e) {
        if (abstractC1593e == this) {
            return true;
        }
        if (!(abstractC1593e instanceof C1281Y)) {
            return false;
        }
        return this.f4116S.equals(((C1281Y) abstractC1593e).f4116S);
    }

    @Override // p000a.AbstractC1593e, p000a.AbstractC0209E
    public final int hashCode() {
        return this.f4116S.hashCode();
    }

    /* renamed from: s */
    public final synchronized byte[] m2623s() {
        if (this.f4115R == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            m2624y(byteArrayOutputStream);
            this.f4115R = byteArrayOutputStream.toByteArray();
        }
        return this.f4115R;
    }

    public final String toString() {
        return this.f4116S;
    }

    @Override // p000a.AbstractC1593e
    /* renamed from: w */
    public final int mo151w(boolean z) {
        return C0175DP.m334Q(m2623s().length, z);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:48:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0049 -> B:54:0x004d). Please submit an issue!!! */
    /* renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m2624y(java.io.ByteArrayOutputStream r8) {
        /*
            r7 = this;
            a.Bd r0 = new a.Bd
            java.lang.String r1 = r7.f4116S
            r0.<init>(r1)
            java.lang.String r1 = r0.m191z()
            int r1 = java.lang.Integer.parseInt(r1)
            int r1 = r1 * 40
            java.lang.String r2 = r0.m191z()
            int r3 = r2.length()
            r4 = 18
            if (r3 > r4) goto L24
            long r5 = (long) r1
            long r1 = java.lang.Long.parseLong(r2)
            long r1 = r1 + r5
            goto L4d
        L24:
            java.math.BigInteger r3 = new java.math.BigInteger
            r3.<init>(r2)
            long r1 = (long) r1
            java.math.BigInteger r1 = java.math.BigInteger.valueOf(r1)
            java.math.BigInteger r1 = r3.add(r1)
            p000a.C1230X.m2526E(r8, r1)
        L35:
            int r1 = r0.f330h
            r2 = -1
            if (r1 == r2) goto L3c
            r1 = 1
            goto L3d
        L3c:
            r1 = 0
        L3d:
            if (r1 == 0) goto L5a
            java.lang.String r1 = r0.m191z()
            int r2 = r1.length()
            if (r2 > r4) goto L51
            long r1 = java.lang.Long.parseLong(r1)
        L4d:
            p000a.C1230X.m2527U(r8, r1)
            goto L35
        L51:
            java.math.BigInteger r2 = new java.math.BigInteger
            r2.<init>(r1)
            p000a.C1230X.m2526E(r8, r2)
            goto L35
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1281Y.m2624y(java.io.ByteArrayOutputStream):void");
    }

    public C1281Y(String str) {
        char charAt;
        if (str == null) {
            throw new NullPointerException("'identifier' cannot be null");
        }
        boolean z = false;
        if (str.length() >= 3 && str.charAt(1) == '.' && (charAt = str.charAt(0)) >= '0' && charAt <= '2') {
            z = C1230X.m2528s(2, str);
        }
        if (z) {
            this.f4116S = str;
            return;
        }
        throw new IllegalArgumentException(AbstractC2441tz.m4184G("string ", str, " not an OID"));
    }

    public C1281Y(byte[] bArr, boolean z) {
        int i;
        byte[] bArr2 = bArr;
        StringBuffer stringBuffer = new StringBuffer();
        boolean z2 = true;
        BigInteger bigInteger = null;
        int i2 = 0;
        long j = 0;
        while (i2 != bArr2.length) {
            int i3 = bArr2[i2] & 255;
            if (j <= 72057594037927808L) {
                i = i2;
                long j2 = j + (i3 & 127);
                if ((i3 & 128) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append('0');
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    j = 0;
                    i2 = i + 1;
                } else {
                    j = j2 << 7;
                    i2 = i + 1;
                }
            } else {
                i = i2;
                BigInteger or = (bigInteger == null ? BigInteger.valueOf(j) : bigInteger).or(BigInteger.valueOf(i3 & 127));
                if ((i3 & 128) == 0) {
                    if (z2) {
                        stringBuffer.append('2');
                        or = or.subtract(BigInteger.valueOf(80L));
                        z2 = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                    i2 = i + 1;
                } else {
                    bigInteger = or.shiftLeft(7);
                    i2 = i + 1;
                }
            }
        }
        this.f4116S = stringBuffer.toString();
        this.f4115R = z ? AbstractC0438II.m1049w(bArr) : bArr2;
    }
}
