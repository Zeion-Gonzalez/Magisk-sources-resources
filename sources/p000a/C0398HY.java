package p000a;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: a.HY */
/* loaded from: classes.dex */
public final class C0398HY implements InterfaceC0675Mm {

    /* renamed from: G */
    public int f1328G;

    /* renamed from: I */
    public boolean f1329I;

    /* renamed from: M */
    public CharSequence f1330M;

    /* renamed from: N */
    public int f1331N;

    /* renamed from: P */
    public int f1332P;

    /* renamed from: Q */
    public int f1333Q;

    /* renamed from: R */
    public ArrayList f1334R;

    /* renamed from: S */
    public CharSequence f1335S;

    /* renamed from: V */
    public int f1336V;

    /* renamed from: W */
    public String f1337W;

    /* renamed from: g */
    public int f1338g;

    /* renamed from: h */
    public int f1339h;

    /* renamed from: k */
    public boolean f1340k;

    /* renamed from: o */
    public boolean f1341o;

    /* renamed from: q */
    public final C0364Gx f1342q;

    /* renamed from: u */
    public boolean f1343u;

    /* renamed from: v */
    public int f1344v;

    /* renamed from: w */
    public ArrayList f1345w;

    /* renamed from: y */
    public boolean f1346y;

    /* renamed from: z */
    public final ArrayList f1347z;

    public C0398HY(C0398HY c0398hy) {
        c0398hy.f1342q.m796F();
        C0852Pu c0852Pu = c0398hy.f1342q.f1260s;
        if (c0852Pu != null) {
            c0852Pu.f2884w.getClassLoader();
        }
        this.f1347z = new ArrayList();
        this.f1341o = true;
        this.f1329I = false;
        Iterator it = c0398hy.f1347z.iterator();
        while (it.hasNext()) {
            this.f1347z.add(new C0547KI((C0547KI) it.next()));
        }
        this.f1339h = c0398hy.f1339h;
        this.f1344v = c0398hy.f1344v;
        this.f1332P = c0398hy.f1332P;
        this.f1331N = c0398hy.f1331N;
        this.f1333Q = c0398hy.f1333Q;
        this.f1343u = c0398hy.f1343u;
        this.f1341o = c0398hy.f1341o;
        this.f1337W = c0398hy.f1337W;
        this.f1336V = c0398hy.f1336V;
        this.f1335S = c0398hy.f1335S;
        this.f1328G = c0398hy.f1328G;
        this.f1330M = c0398hy.f1330M;
        if (c0398hy.f1334R != null) {
            ArrayList arrayList = new ArrayList();
            this.f1334R = arrayList;
            arrayList.addAll(c0398hy.f1334R);
        }
        if (c0398hy.f1345w != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f1345w = arrayList2;
            arrayList2.addAll(c0398hy.f1345w);
        }
        this.f1329I = c0398hy.f1329I;
        this.f1338g = -1;
        this.f1346y = false;
        this.f1342q = c0398hy.f1342q;
        this.f1340k = c0398hy.f1340k;
        this.f1338g = c0398hy.f1338g;
        this.f1346y = c0398hy.f1346y;
    }

    /* renamed from: N */
    public final void m891N(int i, AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3, String str, int i2) {
        String str2 = abstractComponentCallbacksC2342s3.f7202b;
        if (str2 != null) {
            C1471be c1471be = AbstractC2465uS.f7563z;
            AbstractC2465uS.m4244h(new C1721gO(abstractComponentCallbacksC2342s3, str2));
            AbstractC2465uS.m4245z(abstractComponentCallbacksC2342s3).getClass();
            EnumC0345Gb enumC0345Gb = EnumC0345Gb.f1160S;
            if (enumC0345Gb instanceof Void) {
                Void r0 = (Void) enumC0345Gb;
            }
        }
        Class<?> cls = abstractComponentCallbacksC2342s3.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                String str3 = abstractComponentCallbacksC2342s3.f7192L;
                if (str3 != null && !str.equals(str3)) {
                    throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC2342s3 + ": was " + abstractComponentCallbacksC2342s3.f7192L + " now " + str);
                }
                abstractComponentCallbacksC2342s3.f7192L = str;
            }
            if (i != 0) {
                if (i != -1) {
                    int i3 = abstractComponentCallbacksC2342s3.f7217p;
                    if (i3 != 0 && i3 != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC2342s3 + ": was " + abstractComponentCallbacksC2342s3.f7217p + " now " + i);
                    }
                    abstractComponentCallbacksC2342s3.f7217p = i;
                    abstractComponentCallbacksC2342s3.f7209j = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC2342s3 + " with tag " + str + " to container view with no id");
                }
            }
            m894h(new C0547KI(i2, abstractComponentCallbacksC2342s3));
            abstractComponentCallbacksC2342s3.f7198X = this.f1342q;
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }

    /* renamed from: P */
    public final int m892P(boolean z) {
        int i;
        if (!this.f1340k) {
            if (C0364Gx.m791p(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new C0989SZ());
                m893Q("  ", printWriter, true);
                printWriter.close();
            }
            this.f1340k = true;
            boolean z2 = this.f1343u;
            C0364Gx c0364Gx = this.f1342q;
            if (z2) {
                i = c0364Gx.f1243W.getAndIncrement();
            } else {
                i = -1;
            }
            this.f1338g = i;
            c0364Gx.m812U(this, z);
            return this.f1338g;
        }
        throw new IllegalStateException("commit already called");
    }

    /* renamed from: Q */
    public final void m893Q(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1337W);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1338g);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1340k);
            if (this.f1333Q != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1333Q));
            }
            if (this.f1339h != 0 || this.f1344v != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1339h));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1344v));
            }
            if (this.f1332P != 0 || this.f1331N != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1332P));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1331N));
            }
            if (this.f1328G != 0 || this.f1330M != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1328G));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1330M);
            }
            if (this.f1336V != 0 || this.f1335S != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1336V));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1335S);
            }
        }
        ArrayList arrayList = this.f1347z;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0547KI c0547ki = (C0547KI) arrayList.get(i);
            switch (c0547ki.f1807z) {
                case AbstractC0795Op.f2698E /* 0 */:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0547ki.f1807z;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0547ki.f1803h);
            if (z) {
                if (c0547ki.f1800P != 0 || c0547ki.f1799N != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0547ki.f1800P));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0547ki.f1799N));
                }
                if (c0547ki.f1801Q != 0 || c0547ki.f1805u != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0547ki.f1801Q));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0547ki.f1805u));
                }
            }
        }
    }

    /* renamed from: h */
    public final void m894h(C0547KI c0547ki) {
        this.f1347z.add(c0547ki);
        c0547ki.f1800P = this.f1339h;
        c0547ki.f1799N = this.f1344v;
        c0547ki.f1801Q = this.f1332P;
        c0547ki.f1805u = this.f1331N;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1338g >= 0) {
            sb.append(" #");
            sb.append(this.f1338g);
        }
        if (this.f1337W != null) {
            sb.append(" ");
            sb.append(this.f1337W);
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m895u(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        C0364Gx c0364Gx;
        if (abstractComponentCallbacksC2342s3 != null && (c0364Gx = abstractComponentCallbacksC2342s3.f7198X) != null && c0364Gx != this.f1342q) {
            throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC2342s3.toString() + " is already attached to a FragmentManager.");
        }
        m894h(new C0547KI(8, abstractComponentCallbacksC2342s3));
    }

    /* renamed from: v */
    public final void m896v(int i) {
        if (this.f1343u) {
            if (C0364Gx.m791p(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1347z;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0547KI c0547ki = (C0547KI) arrayList.get(i2);
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c0547ki.f1803h;
                if (abstractComponentCallbacksC2342s3 != null) {
                    abstractComponentCallbacksC2342s3.f7205e += i;
                    if (C0364Gx.m791p(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0547ki.f1803h + " to " + c0547ki.f1803h.f7205e);
                    }
                }
            }
        }
    }

    @Override // p000a.InterfaceC0675Mm
    /* renamed from: z */
    public final boolean mo303z(ArrayList arrayList, ArrayList arrayList2) {
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.f1343u) {
            C0364Gx c0364Gx = this.f1342q;
            if (c0364Gx.f1237P == null) {
                c0364Gx.f1237P = new ArrayList();
            }
            c0364Gx.f1237P.add(this);
            return true;
        }
        return true;
    }

    public C0398HY(C0364Gx c0364Gx) {
        c0364Gx.m796F();
        C0852Pu c0852Pu = c0364Gx.f1260s;
        if (c0852Pu != null) {
            c0852Pu.f2884w.getClassLoader();
        }
        this.f1347z = new ArrayList();
        this.f1341o = true;
        this.f1329I = false;
        this.f1338g = -1;
        this.f1346y = false;
        this.f1342q = c0364Gx;
    }
}
