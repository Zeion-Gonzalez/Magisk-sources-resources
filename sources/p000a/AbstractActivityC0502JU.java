package p000a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.AbstractActivityC2754z;

/* renamed from: a.JU */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0502JU extends AbstractActivityC2754z implements InterfaceC1348ZE {

    /* renamed from: j */
    public static final /* synthetic */ int f1675j = 0;

    /* renamed from: C */
    public boolean f1676C;

    /* renamed from: X */
    public final C2052mg f1678X;

    /* renamed from: Z */
    public boolean f1679Z;

    /* renamed from: F */
    public final C0326GG f1677F = new C0326GG(this);

    /* renamed from: p */
    public boolean f1680p = true;

    public AbstractActivityC0502JU() {
        final AbstractActivityC0510Jd abstractActivityC0510Jd = (AbstractActivityC0510Jd) this;
        this.f1678X = new C2052mg(4, new C0852Pu(abstractActivityC0510Jd));
        final int i = 1;
        this.f8664q.f4218h.m3554v("android:support:lifecycle", new C1635ek(i, this));
        final int i2 = 0;
        this.f8661f.add(new InterfaceC1617eQ() { // from class: a.gI
            @Override // p000a.InterfaceC1617eQ
            /* renamed from: z */
            public final void mo2146z(Object obj) {
                int i3 = i2;
                AbstractActivityC0502JU abstractActivityC0502JU = abstractActivityC0510Jd;
                switch (i3) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        Configuration configuration = (Configuration) obj;
                        abstractActivityC0502JU.f1678X.m3683o();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        abstractActivityC0502JU.f1678X.m3683o();
                        return;
                }
            }
        });
        this.f8658Y.add(new InterfaceC1617eQ() { // from class: a.gI
            @Override // p000a.InterfaceC1617eQ
            /* renamed from: z */
            public final void mo2146z(Object obj) {
                int i3 = i;
                AbstractActivityC0502JU abstractActivityC0502JU = abstractActivityC0510Jd;
                switch (i3) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        Configuration configuration = (Configuration) obj;
                        abstractActivityC0502JU.f1678X.m3683o();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        abstractActivityC0502JU.f1678X.m3683o();
                        return;
                }
            }
        });
        m4694o(new C2195pL(this, i));
    }

    /* renamed from: S */
    public static boolean m1193S(C0364Gx c0364Gx) {
        AbstractActivityC0502JU abstractActivityC0502JU;
        EnumC1632eh enumC1632eh = EnumC1632eh.f5092w;
        boolean z = false;
        for (AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 : c0364Gx.f1262v.m1239w()) {
            if (abstractComponentCallbacksC2342s3 != null) {
                C0852Pu c0852Pu = abstractComponentCallbacksC2342s3.f7186F;
                if (c0852Pu == null) {
                    abstractActivityC0502JU = null;
                } else {
                    abstractActivityC0502JU = c0852Pu.f2882k;
                }
                if (abstractActivityC0502JU != null) {
                    z |= m1193S(abstractComponentCallbacksC2342s3.m4008W());
                }
                C1271Xp c1271Xp = abstractComponentCallbacksC2342s3.f7219qn;
                EnumC1632eh enumC1632eh2 = EnumC1632eh.f5087I;
                if (c1271Xp != null) {
                    c1271Xp.m2597P();
                    if (c1271Xp.f4088I.f1105P.m3117z(enumC1632eh2)) {
                        abstractComponentCallbacksC2342s3.f7219qn.f4088I.m726u(enumC1632eh);
                        z = true;
                    }
                }
                if (abstractComponentCallbacksC2342s3.f7200Yd.f1105P.m3117z(enumC1632eh2)) {
                    abstractComponentCallbacksC2342s3.f7200Yd.m726u(enumC1632eh);
                    z = true;
                }
            }
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x006d, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0056, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x005d, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 29) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0064, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 33) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x006b, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 31) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0074  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void dump(java.lang.String r6, java.io.FileDescriptor r7, java.io.PrintWriter r8, java.lang.String[] r9) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractActivityC0502JU.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // androidx.activity.AbstractActivityC2754z, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f1678X.m3683o();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.AbstractActivityC2754z, p000a.AbstractActivityC1187WD, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f1677F.m721N(EnumC2241qF.ON_CREATE);
        C0364Gx c0364Gx = ((C0852Pu) this.f1678X.f6382R).f2883q;
        c0364Gx.f1228F = false;
        c0364Gx.f1246Z = false;
        c0364Gx.f1248d.f3149s = false;
        c0364Gx.m843y(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0852Pu) this.f1678X.f6382R).f2883q.f1238Q.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((C0852Pu) this.f1678X.f6382R).f2883q.m804M();
        this.f1677F.m721N(EnumC2241qF.ON_DESTROY);
    }

    @Override // androidx.activity.AbstractActivityC2754z, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0852Pu) this.f1678X.f6382R).f2883q.m815W();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f1676C = false;
        ((C0852Pu) this.f1678X.f6382R).f2883q.m843y(5);
        this.f1677F.m721N(EnumC2241qF.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.f1677F.m721N(EnumC2241qF.ON_RESUME);
        C0364Gx c0364Gx = ((C0852Pu) this.f1678X.f6382R).f2883q;
        c0364Gx.f1228F = false;
        c0364Gx.f1246Z = false;
        c0364Gx.f1248d.f3149s = false;
        c0364Gx.m843y(7);
    }

    @Override // androidx.activity.AbstractActivityC2754z, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f1678X.m3683o();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C2052mg c2052mg = this.f1678X;
        c2052mg.m3683o();
        super.onResume();
        this.f1676C = true;
        ((C0852Pu) c2052mg.f6382R).f2883q.m823f(true);
    }

    @Override // android.app.Activity
    public void onStart() {
        C2052mg c2052mg = this.f1678X;
        c2052mg.m3683o();
        super.onStart();
        this.f1680p = false;
        boolean z = this.f1679Z;
        Object obj = c2052mg.f6382R;
        if (!z) {
            this.f1679Z = true;
            C0364Gx c0364Gx = ((C0852Pu) obj).f2883q;
            c0364Gx.f1228F = false;
            c0364Gx.f1246Z = false;
            c0364Gx.f1248d.f3149s = false;
            c0364Gx.m843y(4);
        }
        ((C0852Pu) obj).f2883q.m823f(true);
        this.f1677F.m721N(EnumC2241qF.ON_START);
        C0364Gx c0364Gx2 = ((C0852Pu) obj).f2883q;
        c0364Gx2.f1228F = false;
        c0364Gx2.f1246Z = false;
        c0364Gx2.f1248d.f3149s = false;
        c0364Gx2.m843y(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f1678X.m3683o();
    }

    @Override // android.app.Activity
    public void onStop() {
        C2052mg c2052mg;
        super.onStop();
        this.f1680p = true;
        do {
            c2052mg = this.f1678X;
        } while (m1193S(((C0852Pu) c2052mg.f6382R).f2883q));
        C0364Gx c0364Gx = ((C0852Pu) c2052mg.f6382R).f2883q;
        c0364Gx.f1246Z = true;
        c0364Gx.f1248d.f3149s = true;
        c0364Gx.m843y(4);
        this.f1677F.m721N(EnumC2241qF.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0852Pu) this.f1678X.f6382R).f2883q.f1238Q.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
