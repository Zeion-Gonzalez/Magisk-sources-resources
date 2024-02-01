package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: a.ag */
/* loaded from: classes.dex */
public class C1420ag {

    /* renamed from: U */
    public static final /* synthetic */ int f4446U = 0;

    /* renamed from: I */
    public CharSequence f4447I;

    /* renamed from: R */
    public C1951kj f4448R;

    /* renamed from: S */
    public final String f4449S;

    /* renamed from: g */
    public final LinkedHashMap f4450g;

    /* renamed from: k */
    public final C2616xE f4451k;

    /* renamed from: q */
    public final ArrayList f4452q;

    /* renamed from: s */
    public String f4453s;

    /* renamed from: w */
    public String f4454w;

    /* renamed from: y */
    public int f4455y;

    static {
        new LinkedHashMap();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1420ag(AbstractC2719zK abstractC2719zK) {
        this(C1665fK.m3154w(abstractC2719zK.getClass()));
        LinkedHashMap linkedHashMap = C1931kK.f5996h;
    }

    /* renamed from: G */
    public void mo86G(Context context, AttributeSet attributeSet) {
        Object obj;
        String str;
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, AbstractC2516vL.f7706N);
        String string = obtainAttributes.getString(2);
        if (string == null) {
            this.f4455y = 0;
            this.f4454w = null;
        } else if ((!AbstractC1269Xn.m2579T0(string)) != false) {
            String concat = "android-app://androidx.navigation/".concat(string);
            this.f4455y = concat.hashCode();
            this.f4454w = null;
            m2850h(new C2127o8(concat, null, null));
        } else {
            throw new IllegalArgumentException("Cannot have an empty route".toString());
        }
        ArrayList arrayList = this.f4452q;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String str2 = ((C2127o8) obj).f6555z;
                String str3 = this.f4453s;
                if (str3 != null) {
                    str = "android-app://androidx.navigation/".concat(str3);
                } else {
                    str = "";
                }
                if (AbstractC1292YB.m2695u(str2, str)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        AbstractC0438II.m1038o(arrayList);
        arrayList.remove(obj);
        this.f4453s = string;
        if (obtainAttributes.hasValue(1)) {
            int resourceId = obtainAttributes.getResourceId(1, 0);
            this.f4455y = resourceId;
            this.f4454w = null;
            this.f4454w = C1665fK.m3149V(context, resourceId);
        }
        this.f4447I = obtainAttributes.getText(0);
        obtainAttributes.recycle();
    }

    /* renamed from: N */
    public final C2060mp m2846N(int i) {
        boolean z;
        C2060mp c2060mp;
        C2616xE c2616xE = this.f4451k;
        if (c2616xE.m4506o() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c2060mp = null;
        } else {
            c2060mp = (C2060mp) c2616xE.m4502N(i, null);
        }
        if (c2060mp == null) {
            C1951kj c1951kj = this.f4448R;
            if (c1951kj == null) {
                return null;
            }
            return c1951kj.m2846N(i);
        }
        return c2060mp;
    }

    /* renamed from: P */
    public final int[] m2847P(C1420ag c1420ag) {
        C1951kj c1951kj;
        C1200WR c1200wr = new C1200WR();
        C1951kj c1951kj2 = this;
        while (true) {
            C1951kj c1951kj3 = c1951kj2.f4448R;
            if (c1420ag != null) {
                c1951kj = c1420ag.f4448R;
            } else {
                c1951kj = null;
            }
            if (c1951kj != null && c1420ag.f4448R.m3572V(c1951kj2.f4455y, true) == c1951kj2) {
                c1200wr.m2479P(c1951kj2);
                break;
            }
            if (c1951kj3 == null || c1951kj3.f6046f != c1951kj2.f4455y) {
                c1200wr.m2479P(c1951kj2);
            }
            if (AbstractC1292YB.m2695u(c1951kj3, c1420ag) || c1951kj3 == null) {
                break;
            }
            c1951kj2 = c1951kj3;
        }
        List m4284S3 = AbstractC2486us.m4284S3(c1200wr);
        ArrayList arrayList = new ArrayList(AbstractC1658fB.m3134dx(m4284S3));
        Iterator it = m4284S3.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C1420ag) it.next()).f4455y));
        }
        return AbstractC2486us.m4286W9(arrayList);
    }

    /* renamed from: Q */
    public final Map m2848Q() {
        return AbstractC0873QM.m2013dG(this.f4450g);
    }

    /* renamed from: W */
    public final C0952Rt m2849W(String str) {
        String str2;
        if (str != null) {
            str2 = "android-app://androidx.navigation/".concat(str);
        } else {
            str2 = "";
        }
        Object obj = null;
        C1174Vy c1174Vy = new C1174Vy(Uri.parse(str2), obj, obj, 8);
        if (this instanceof C1951kj) {
            return ((C1951kj) this).m3570R(c1174Vy);
        }
        return mo2851o(c1174Vy);
    }

    /* JADX WARN: Removed duplicated region for block: B:202:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:264:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1420ag.equals(java.lang.Object):boolean");
    }

    /* renamed from: h */
    public final void m2850h(C2127o8 c2127o8) {
        ArrayList m4438m = AbstractC2575wW.m4438m(m2848Q(), new C2670yQ(1, c2127o8));
        if (m4438m.isEmpty()) {
            this.f4452q.add(c2127o8);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + c2127o8.f6555z + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + m4438m).toString());
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        Set<String> keySet;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f4455y * 31;
        String str = this.f4453s;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i9 = i8 + i;
        Iterator it = this.f4452q.iterator();
        while (it.hasNext()) {
            C2127o8 c2127o8 = (C2127o8) it.next();
            int i10 = i9 * 31;
            String str2 = c2127o8.f6555z;
            if (str2 != null) {
                i5 = str2.hashCode();
            } else {
                i5 = 0;
            }
            int i11 = (i10 + i5) * 31;
            String str3 = c2127o8.f6550h;
            if (str3 != null) {
                i6 = str3.hashCode();
            } else {
                i6 = 0;
            }
            int i12 = (i11 + i6) * 31;
            String str4 = c2127o8.f6553v;
            if (str4 != null) {
                i7 = str4.hashCode();
            } else {
                i7 = 0;
            }
            i9 = i12 + i7;
        }
        C2098nX m3424Ry = AbstractC1843ih.m3424Ry(this.f4451k);
        while (m3424Ry.hasNext()) {
            C2060mp c2060mp = (C2060mp) m3424Ry.next();
            int i13 = ((i9 * 31) + c2060mp.f6404z) * 31;
            C0815PB c0815pb = c2060mp.f6402h;
            if (c0815pb != null) {
                i3 = c0815pb.hashCode();
            } else {
                i3 = 0;
            }
            i9 = i13 + i3;
            Bundle bundle = c2060mp.f6403v;
            if (bundle != null && (keySet = bundle.keySet()) != null) {
                Iterator<T> it2 = keySet.iterator();
                while (it2.hasNext()) {
                    int i14 = i9 * 31;
                    Object obj = c2060mp.f6403v.get((String) it2.next());
                    if (obj != null) {
                        i4 = obj.hashCode();
                    } else {
                        i4 = 0;
                    }
                    i9 = i14 + i4;
                }
            }
        }
        for (String str5 : m2848Q().keySet()) {
            int hashCode = (str5.hashCode() + (i9 * 31)) * 31;
            Object obj2 = m2848Q().get(str5);
            if (obj2 != null) {
                i2 = obj2.hashCode();
            } else {
                i2 = 0;
            }
            i9 = i2 + hashCode;
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x00de, code lost:
    
        if (r2 != false) goto L206;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x01fe  */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p000a.C0952Rt mo2851o(p000a.C1174Vy r19) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1420ag.mo2851o(a.Vy):a.Rt");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.f4454w;
        if (str == null) {
            sb.append("0x");
            str = Integer.toHexString(this.f4455y);
        }
        sb.append(str);
        sb.append(")");
        String str2 = this.f4453s;
        if (!(str2 == null || AbstractC1269Xn.m2579T0(str2))) {
            sb.append(" route=");
            sb.append(this.f4453s);
        }
        if (this.f4447I != null) {
            sb.append(" label=");
            sb.append(this.f4447I);
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[LOOP:1: B:72:0x0054->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0088 A[SYNTHETIC] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m2852v(android.os.Bundle r9) {
        /*
            r8 = this;
            java.util.LinkedHashMap r0 = r8.f4450g
            r1 = 0
            r2 = 1
            if (r9 != 0) goto L16
            if (r0 == 0) goto L11
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto Lf
            goto L11
        Lf:
            r3 = r1
            goto L12
        L11:
            r3 = r2
        L12:
            if (r3 == 0) goto L16
            r9 = 0
            return r9
        L16:
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.util.Set r4 = r0.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L23:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L47
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            a.tZ r5 = (p000a.C2419tZ) r5
            boolean r7 = r5.f7407v
            if (r7 == 0) goto L23
            a.RT r7 = r5.f7408z
            java.lang.Object r5 = r5.f7405P
            r7.mo1953N(r3, r6, r5)
            goto L23
        L47:
            if (r9 == 0) goto Lb1
            r3.putAll(r9)
            java.util.Set r9 = r0.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L54:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r0 = r9.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r4 = r0.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r0 = r0.getValue()
            a.tZ r0 = (p000a.C2419tZ) r0
            boolean r5 = r0.f7406h
            a.RT r0 = r0.f7408z
            if (r5 != 0) goto L7f
            boolean r5 = r3.containsKey(r4)
            if (r5 == 0) goto L7f
            java.lang.Object r5 = r3.get(r4)
            if (r5 != 0) goto L7f
            goto L84
        L7f:
            r0.mo1956z(r4, r3)     // Catch: java.lang.ClassCastException -> L84
            r5 = r2
            goto L85
        L84:
            r5 = r1
        L85:
            if (r5 == 0) goto L88
            goto L54
        L88:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Wrong argument type for '"
            r9.<init>(r1)
            r9.append(r4)
            java.lang.String r1 = "' in argument bundle. "
            r9.append(r1)
            java.lang.String r0 = r0.mo1954h()
            r9.append(r0)
            java.lang.String r0 = " expected."
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        Lb1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C1420ag.m2852v(android.os.Bundle):android.os.Bundle");
    }

    public C1420ag(String str) {
        this.f4449S = str;
        this.f4452q = new ArrayList();
        this.f4451k = new C2616xE();
        this.f4450g = new LinkedHashMap();
    }
}
