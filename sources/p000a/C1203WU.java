package p000a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: a.WU */
/* loaded from: classes.dex */
public final class C1203WU {

    /* renamed from: Q */
    public static C1203WU f3910Q;

    /* renamed from: N */
    public Cloneable f3911N;

    /* renamed from: P */
    public final Object f3912P;

    /* renamed from: h */
    public final Object f3913h;

    /* renamed from: v */
    public Object f3914v;

    /* renamed from: z */
    public final Object f3915z;

    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Cloneable, a.FT[]] */
    public C1203WU(int i) {
        if (i == 2) {
            this.f3912P = new ArrayList();
            this.f3915z = new ArrayList();
            this.f3913h = new ArrayList();
            this.f3914v = C1858j0.f5795I;
            return;
        }
        ?? r8 = new AbstractC0288FT[18];
        this.f3911N = r8;
        this.f3915z = new C0426I4();
        C2406tL c2406tL = new C2406tL();
        this.f3913h = c2406tL;
        this.f3914v = new C1670fP();
        this.f3912P = new C0886Qf();
        r8[9] = c2406tL;
        for (int i2 = 1; i2 <= 17; i2++) {
            if (i2 != 9) {
                ((AbstractC0288FT[]) this.f3911N)[i2] = new C2406tL(i2);
            }
        }
        byte[] bArr = {97, 98, 99, 100, 32, 32, 32, 32, 32, 32, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106};
        for (AbstractC0288FT abstractC0288FT : Arrays.asList((AbstractC0288FT) this.f3915z, (AbstractC0288FT) this.f3913h)) {
            abstractC0288FT.getClass();
            byte[] bArr2 = new byte[36];
            int mo597z = abstractC0288FT.mo597z(bArr, bArr2);
            byte[] bArr3 = new byte[20];
            ((AbstractC1500cH) this.f3914v).mo2907W(bArr2, bArr3);
            if (!Arrays.equals(bArr, bArr3)) {
                throw new AssertionError();
            }
            Arrays.fill(bArr3, (byte) 0);
            AbstractC2703z2 abstractC2703z2 = (AbstractC2703z2) this.f3912P;
            abstractC2703z2.getClass();
            if (abstractC2703z2.mo2031he(bArr2, mo597z, bArr3, 20) != 20 || !Arrays.equals(bArr, bArr3)) {
                throw new AssertionError();
            }
        }
    }

    /* renamed from: h */
    public final void m2486h() {
        Iterator it = ((List) this.f3912P).iterator();
        while (it.hasNext()) {
            int i = ((C1606eE) it.next()).f4925z;
            if (m2487z(i) == null) {
                int i2 = C1420ag.f4446U;
                throw new IllegalArgumentException("Navigation destination " + C1665fK.m3149V((Context) this.f3915z, i) + " cannot be found in the navigation graph " + ((C1951kj) this.f3914v));
            }
        }
    }

    /* renamed from: z */
    public final C1420ag m2487z(int i) {
        C1200WR c1200wr = new C1200WR();
        c1200wr.m2478N((C1951kj) this.f3914v);
        while (!c1200wr.isEmpty()) {
            C1420ag c1420ag = (C1420ag) c1200wr.m2482S();
            if (c1420ag.f4455y == i) {
                return c1420ag;
            }
            if (c1420ag instanceof C1951kj) {
                C2095nT c2095nT = new C2095nT((C1951kj) c1420ag);
                while (c2095nT.hasNext()) {
                    c1200wr.m2478N((C1420ag) c2095nT.next());
                }
            }
        }
        return null;
    }

    public C1203WU(ContextWrapper contextWrapper) {
        Intent launchIntentForPackage;
        this.f3915z = contextWrapper;
        if (contextWrapper instanceof Activity) {
            launchIntentForPackage = new Intent(contextWrapper, contextWrapper.getClass());
        } else {
            launchIntentForPackage = contextWrapper.getPackageManager().getLaunchIntentForPackage(contextWrapper.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f3913h = launchIntentForPackage;
        this.f3912P = new ArrayList();
    }
}
