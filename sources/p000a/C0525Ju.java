package p000a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.C2762z;
import java.io.IOException;
import java.io.OutputStream;
import java.security.Signature;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

/* renamed from: a.Ju */
/* loaded from: classes.dex */
public final class C0525Ju implements InterfaceC2662yD, InterfaceC1056Tn {

    /* renamed from: Q */
    public static C0525Ju f1762Q;

    /* renamed from: N */
    public Object f1763N;

    /* renamed from: P */
    public Object f1764P;

    /* renamed from: h */
    public Object f1765h;

    /* renamed from: v */
    public Object f1766v;

    /* renamed from: z */
    public final /* synthetic */ int f1767z;

    public C0525Ju(int i) {
        byte[] bArr;
        int i2;
        long j;
        this.f1767z = i;
        if (i == 2) {
            this.f1765h = new C1095UY(10, 1);
            this.f1763N = new C2698yx();
            this.f1764P = new ArrayList();
            this.f1766v = new HashSet();
            return;
        }
        if (i == 3) {
            this.f1764P = new ArrayList();
            this.f1765h = new HashMap();
            this.f1766v = new HashMap();
            return;
        }
        if (i == 4) {
            this.f1765h = new C1186WB();
            this.f1766v = new SparseArray();
            this.f1764P = new C1276Xv();
            this.f1763N = new C1186WB();
            return;
        }
        int i3 = 6;
        if (i == 5) {
            this.f1764P = new ArrayList();
            this.f1765h = null;
            this.f1766v = null;
            this.f1763N = new C2558wC(i3, this);
            return;
        }
        if (i != 6) {
            this.f1765h = new C1095UY(256, 0);
            this.f1766v = new C1095UY(256, 0);
            this.f1764P = new C1095UY(256, 0);
            this.f1763N = new C2598ww[32];
            return;
        }
        this.f1765h = new C0550KL();
        this.f1764P = new C1710g8();
        this.f1766v = new C1514cX();
        this.f1763N = new C1710g8();
        byte[] bArr2 = new byte[100];
        Random random = new Random();
        random.nextBytes(bArr2);
        int nextInt = random.nextInt();
        int mo1261R = ((AbstractC1500cH) this.f1765h).mo1261R(100, nextInt, bArr2);
        ((C1710g8) ((InterfaceC0271FA) this.f1764P)).getClass();
        C0768OK c0768ok = new C0768OK(nextInt);
        c0768ok.mo1775G(bArr2, 100);
        int mo1776z = c0768ok.mo1776z();
        long j2 = nextInt;
        long mo2936ZH = ((AbstractC2703z2) this.f1766v).mo2936ZH(j2, bArr2);
        ((C1710g8) ((InterfaceC0746Nz) this.f1763N)).getClass();
        byte[] bArr3 = new byte[32];
        EnumC2649xy.m4548z(bArr2, 0, 100);
        long j3 = 100 + 0;
        long j4 = (j2 - 7046029288634856825L) - 4417276706812531889L;
        int i4 = 0;
        long j5 = j2 - 4417276706812531889L;
        long j6 = j2 - (-7046029288634856825L);
        long j7 = j2 + 0;
        while (i4 <= 68) {
            j4 = Long.rotateLeft((EnumC2649xy.m4545P(i4, bArr2) * (-4417276706812531889L)) + j4, 31) * (-7046029288634856825L);
            int i5 = i4 + 8;
            j5 = Long.rotateLeft((EnumC2649xy.m4545P(i5, bArr2) * (-4417276706812531889L)) + j5, 31) * (-7046029288634856825L);
            int i6 = i5 + 8;
            j7 = Long.rotateLeft((EnumC2649xy.m4545P(i6, bArr2) * (-4417276706812531889L)) + j7, 31) * (-7046029288634856825L);
            int i7 = i6 + 8;
            j6 = Long.rotateLeft((EnumC2649xy.m4545P(i7, bArr2) * (-4417276706812531889L)) + j6, 31) * (-7046029288634856825L);
            i4 = i7 + 8;
        }
        if (i4 < 100) {
            i2 = 100 - i4;
            bArr = bArr3;
            System.arraycopy(bArr2, i4, bArr, 0, i2);
        } else {
            bArr = bArr3;
            i2 = 0;
        }
        if (j3 >= 32) {
            j = (((Long.rotateLeft(j6 * (-4417276706812531889L), 31) * (-7046029288634856825L)) ^ (((((((Long.rotateLeft(j5 * (-4417276706812531889L), 31) * (-7046029288634856825L)) ^ ((((Long.rotateLeft(j6, 18) + (Long.rotateLeft(j7, 12) + (Long.rotateLeft(j5, 7) + Long.rotateLeft(j4, 1)))) ^ (Long.rotateLeft(j4 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L)) * (-7046029288634856825L)) - 8796714831421723037L) ^ (Long.rotateLeft(j7 * (-4417276706812531889L), 31) * (-7046029288634856825L))) * (-7046029288634856825L)) - 8796714831421723037L)) * (-7046029288634856825L)) - 8796714831421723037L;
        } else {
            j = j2 + 2870177450012600261L;
        }
        long j8 = j + j3;
        int i8 = 0;
        while (i8 <= i2 - 8) {
            j8 = (Long.rotateLeft(j8 ^ (Long.rotateLeft(EnumC2649xy.m4545P(i8, bArr) * (-4417276706812531889L), 31) * (-7046029288634856825L)), 27) * (-7046029288634856825L)) - 8796714831421723037L;
            i8 += 8;
        }
        if (i8 <= i2 - 4) {
            j8 = (Long.rotateLeft(j8 ^ ((EnumC2649xy.m4547v(i8, bArr) & 4294967295L) * (-7046029288634856825L)), 23) * (-4417276706812531889L)) + 1609587929392839161L;
            i8 += 4;
        }
        while (i8 < i2) {
            j8 = Long.rotateLeft(j8 ^ ((bArr[i8] & 255) * 2870177450012600261L), 11) * (-7046029288634856825L);
            i8++;
        }
        long j9 = (j8 ^ (j8 >>> 33)) * (-4417276706812531889L);
        long j10 = (j9 ^ (j9 >>> 29)) * 1609587929392839161L;
        long j11 = j10 ^ (j10 >>> 32);
        if (mo1261R != mo1776z) {
            throw new AssertionError();
        }
        if (mo2936ZH != j11) {
            throw new AssertionError();
        }
    }

    /* renamed from: G */
    public final AbstractComponentCallbacksC2342s3 m1221G(String str) {
        for (C2762z c2762z : ((HashMap) this.f1765h).values()) {
            if (c2762z != null) {
                AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c2762z.f8996v;
                if (!str.equals(abstractComponentCallbacksC2342s3.f7218q)) {
                    abstractComponentCallbacksC2342s3 = abstractComponentCallbacksC2342s3.f7201Z.f1262v.m1221G(str);
                }
                if (abstractComponentCallbacksC2342s3 != null) {
                    return abstractComponentCallbacksC2342s3;
                }
            }
        }
        return null;
    }

    /* renamed from: I */
    public final Menu m1222I(C2189pE c2189pE) {
        Menu menu = (Menu) ((C2698yx) this.f1763N).getOrDefault(c2189pE, null);
        if (menu == null) {
            MenuC1552dD menuC1552dD = new MenuC1552dD((Context) this.f1766v, c2189pE);
            ((C2698yx) this.f1763N).put(c2189pE, menuC1552dD);
            return menuC1552dD;
        }
        return menu;
    }

    /* renamed from: M */
    public final C0581Kt m1223M(AbstractC0336GR abstractC0336GR) {
        int size = ((ArrayList) this.f1764P).size();
        for (int i = 0; i < size; i++) {
            C0581Kt c0581Kt = (C0581Kt) ((ArrayList) this.f1764P).get(i);
            if (c0581Kt != null && c0581Kt.f1885h == abstractC0336GR) {
                return c0581Kt;
            }
        }
        C0581Kt c0581Kt2 = new C0581Kt((Context) this.f1766v, abstractC0336GR);
        ((ArrayList) this.f1764P).add(c0581Kt2);
        return c0581Kt2;
    }

    /* renamed from: N */
    public final void m1224N(AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3) {
        if (((ArrayList) this.f1764P).contains(abstractComponentCallbacksC2342s3)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC2342s3);
        }
        synchronized (((ArrayList) this.f1764P)) {
            ((ArrayList) this.f1764P).add(abstractComponentCallbacksC2342s3);
        }
        abstractComponentCallbacksC2342s3.f7185E = true;
    }

    @Override // p000a.InterfaceC2662yD
    /* renamed from: P */
    public final boolean mo1225P(AbstractC0336GR abstractC0336GR, C2189pE c2189pE) {
        return ((ActionMode.Callback) this.f1765h).onCreateActionMode(m1223M(abstractC0336GR), m1222I(c2189pE));
    }

    /* renamed from: Q */
    public final void m1226Q(int[] iArr, ValueAnimator valueAnimator) {
        C1710g8 c1710g8 = new C1710g8(iArr, valueAnimator);
        valueAnimator.addListener((Animator.AnimatorListener) this.f1763N);
        ((ArrayList) this.f1764P).add(c1710g8);
    }

    /* renamed from: R */
    public final C2074n2 m1227R() {
        switch (this.f1767z) {
            case 7:
                return (C2074n2) this.f1764P;
            default:
                return ((C2082nD) this.f1763N).f6446v;
        }
    }

    /* renamed from: S */
    public final ArrayList m1228S() {
        ArrayList arrayList = new ArrayList();
        for (C2762z c2762z : ((HashMap) this.f1765h).values()) {
            arrayList.add(c2762z != null ? c2762z.f8996v : null);
        }
        return arrayList;
    }

    /* renamed from: V */
    public final ArrayList m1229V() {
        ArrayList arrayList = new ArrayList();
        for (C2762z c2762z : ((HashMap) this.f1765h).values()) {
            if (c2762z != null) {
                arrayList.add(c2762z);
            }
        }
        return arrayList;
    }

    /* renamed from: W */
    public final AbstractComponentCallbacksC2342s3 m1230W(String str) {
        C2762z c2762z = (C2762z) ((HashMap) this.f1765h).get(str);
        if (c2762z != null) {
            return c2762z.f8996v;
        }
        return null;
    }

    /* renamed from: g */
    public final void m1231g(C2762z c2762z) {
        boolean z;
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c2762z.f8996v;
        if (((HashMap) this.f1765h).get(abstractComponentCallbacksC2342s3.f7218q) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        ((HashMap) this.f1765h).put(abstractComponentCallbacksC2342s3.f7218q, c2762z);
        if (C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC2342s3);
        }
    }

    @Override // p000a.InterfaceC2662yD
    /* renamed from: h */
    public final void mo1232h(AbstractC0336GR abstractC0336GR) {
        ((ActionMode.Callback) this.f1765h).onDestroyActionMode(m1223M(abstractC0336GR));
    }

    /* renamed from: k */
    public final byte[] m1233k() {
        switch (this.f1767z) {
            case 7:
                try {
                    return ((Signature) this.f1766v).sign();
                } catch (SignatureException e) {
                    throw new C2611x8("exception obtaining signature: " + e.getMessage(), e);
                }
            default:
                try {
                    C2551w c2551w = new C2551w();
                    for (int i = 0; i != ((Signature[]) this.f1764P).length; i++) {
                        c2551w.m4371z(new C0781OX(((Signature[]) this.f1764P)[i].sign()));
                    }
                    return new C1802hw(c2551w).m417M();
                } catch (IOException e2) {
                    throw new C2611x8("exception encoding signature: " + e2.getMessage(), e2);
                } catch (SignatureException e3) {
                    throw new C2611x8("exception obtaining signature: " + e3.getMessage(), e3);
                }
        }
    }

    /* renamed from: o */
    public final void m1234o(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((C2698yx) this.f1763N).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    m1234o(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    /* renamed from: q */
    public final OutputStream m1235q() {
        switch (this.f1767z) {
            case 7:
                return (OutputStream) this.f1765h;
            default:
                return (OutputStream) this.f1765h;
        }
    }

    /* renamed from: s */
    public final Bundle m1236s(String str, Bundle bundle) {
        return (Bundle) (bundle != null ? ((HashMap) this.f1766v).put(str, bundle) : ((HashMap) this.f1766v).remove(str));
    }

    /* renamed from: u */
    public final void m1237u() {
        ((HashMap) this.f1765h).values().removeAll(Collections.singleton(null));
    }

    @Override // p000a.InterfaceC2662yD
    /* renamed from: v */
    public final boolean mo1238v(AbstractC0336GR abstractC0336GR, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1765h).onActionItemClicked(m1223M(abstractC0336GR), new MenuItemC0324GE((Context) this.f1766v, (InterfaceMenuItemC1409aS) menuItem));
    }

    /* renamed from: w */
    public final List m1239w() {
        ArrayList arrayList;
        if (((ArrayList) this.f1764P).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f1764P)) {
            arrayList = new ArrayList((ArrayList) this.f1764P);
        }
        return arrayList;
    }

    /* renamed from: y */
    public final void m1240y(C2762z c2762z) {
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c2762z.f8996v;
        if (abstractComponentCallbacksC2342s3.f7193O) {
            ((C0916RF) this.f1763N).m2070M(abstractComponentCallbacksC2342s3);
        }
        if (((HashMap) this.f1765h).get(abstractComponentCallbacksC2342s3.f7218q) == c2762z && ((C2762z) ((HashMap) this.f1765h).put(abstractComponentCallbacksC2342s3.f7218q, null)) != null && C0364Gx.m791p(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC2342s3);
        }
    }

    @Override // p000a.InterfaceC2662yD
    /* renamed from: z */
    public final boolean mo1241z(AbstractC0336GR abstractC0336GR, C2189pE c2189pE) {
        return ((ActionMode.Callback) this.f1765h).onPrepareActionMode(m1223M(abstractC0336GR), m1222I(c2189pE));
    }

    public C0525Ju(C2082nD c2082nD, Signature signature, C2074n2 c2074n2) {
        this.f1767z = 7;
        this.f1763N = c2082nD;
        this.f1766v = signature;
        this.f1764P = c2074n2;
        this.f1765h = new C2633xb(0, signature);
    }

    public C0525Ju(Context context, ActionMode.Callback callback) {
        this.f1767z = 0;
        this.f1766v = context;
        this.f1765h = callback;
        this.f1764P = new ArrayList();
        this.f1763N = new C2698yx();
    }
}
