package p000a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.Field;

/* renamed from: a.He */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0402He extends AbstractActivityC0510Jd {

    /* renamed from: B */
    public final C2300rJ f1354B;

    /* renamed from: K */
    public final InterfaceC1841if f1355K;

    /* renamed from: O */
    public InterfaceC2364sT f1356O;

    /* renamed from: T */
    public final C2300rJ f1357T;

    /* renamed from: d */
    public final C2300rJ f1358d;

    /* renamed from: i */
    public InterfaceC2364sT f1359i;

    /* renamed from: n */
    public final C2300rJ f1360n;

    /* renamed from: t */
    public InterfaceC2711zB f1361t;

    /* renamed from: x */
    public InterfaceC2364sT f1362x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [a.mj] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a.mj] */
    /* JADX WARN: Type inference failed for: r2v3, types: [a.mj] */
    /* JADX WARN: Type inference failed for: r2v4, types: [a.mj] */
    public AbstractActivityC0402He() {
        final int i = 1;
        final AbstractActivityC0819PG abstractActivityC0819PG = (AbstractActivityC0819PG) this;
        final int i2 = 0;
        this.f1358d = m4692M(new InterfaceC1468bb() { // from class: a.mj
            @Override // p000a.InterfaceC1468bb
            /* renamed from: h */
            public final void mo2259h(Object obj) {
                InterfaceC2711zB interfaceC2711zB;
                int i32 = i2;
                AbstractActivityC0402He abstractActivityC0402He = abstractActivityC0819PG;
                switch (i32) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        Boolean bool = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT = abstractActivityC0402He.f1359i;
                        if (interfaceC2364sT != null) {
                            interfaceC2364sT.mo85W(bool);
                        }
                        abstractActivityC0402He.f1359i = null;
                        return;
                    case 1:
                        Boolean bool2 = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT2 = abstractActivityC0402He.f1356O;
                        if (interfaceC2364sT2 != null) {
                            interfaceC2364sT2.mo85W(bool2);
                        }
                        abstractActivityC0402He.f1356O = null;
                        return;
                    case 2:
                        Boolean bool3 = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT3 = abstractActivityC0402He.f1362x;
                        if (interfaceC2364sT3 != null) {
                            interfaceC2364sT3.mo85W(bool3);
                        }
                        abstractActivityC0402He.f1362x = null;
                        return;
                    default:
                        Uri uri = (Uri) obj;
                        if (uri != null && (interfaceC2711zB = abstractActivityC0402He.f1361t) != null) {
                            interfaceC2711zB.mo2259h(uri);
                        }
                        abstractActivityC0402He.f1361t = null;
                        return;
                }
            }
        }, new C0693N6(i));
        this.f1360n = m4692M(new InterfaceC1468bb() { // from class: a.mj
            @Override // p000a.InterfaceC1468bb
            /* renamed from: h */
            public final void mo2259h(Object obj) {
                InterfaceC2711zB interfaceC2711zB;
                int i32 = i;
                AbstractActivityC0402He abstractActivityC0402He = abstractActivityC0819PG;
                switch (i32) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        Boolean bool = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT = abstractActivityC0402He.f1359i;
                        if (interfaceC2364sT != null) {
                            interfaceC2364sT.mo85W(bool);
                        }
                        abstractActivityC0402He.f1359i = null;
                        return;
                    case 1:
                        Boolean bool2 = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT2 = abstractActivityC0402He.f1356O;
                        if (interfaceC2364sT2 != null) {
                            interfaceC2364sT2.mo85W(bool2);
                        }
                        abstractActivityC0402He.f1356O = null;
                        return;
                    case 2:
                        Boolean bool3 = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT3 = abstractActivityC0402He.f1362x;
                        if (interfaceC2364sT3 != null) {
                            interfaceC2364sT3.mo85W(bool3);
                        }
                        abstractActivityC0402He.f1362x = null;
                        return;
                    default:
                        Uri uri = (Uri) obj;
                        if (uri != null && (interfaceC2711zB = abstractActivityC0402He.f1361t) != null) {
                            interfaceC2711zB.mo2259h(uri);
                        }
                        abstractActivityC0402He.f1361t = null;
                        return;
                }
            }
        }, new C0693N6(4));
        final int i3 = 3;
        final int i4 = 2;
        this.f1357T = m4692M(new InterfaceC1468bb() { // from class: a.mj
            @Override // p000a.InterfaceC1468bb
            /* renamed from: h */
            public final void mo2259h(Object obj) {
                InterfaceC2711zB interfaceC2711zB;
                int i32 = i4;
                AbstractActivityC0402He abstractActivityC0402He = abstractActivityC0819PG;
                switch (i32) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        Boolean bool = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT = abstractActivityC0402He.f1359i;
                        if (interfaceC2364sT != null) {
                            interfaceC2364sT.mo85W(bool);
                        }
                        abstractActivityC0402He.f1359i = null;
                        return;
                    case 1:
                        Boolean bool2 = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT2 = abstractActivityC0402He.f1356O;
                        if (interfaceC2364sT2 != null) {
                            interfaceC2364sT2.mo85W(bool2);
                        }
                        abstractActivityC0402He.f1356O = null;
                        return;
                    case 2:
                        Boolean bool3 = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT3 = abstractActivityC0402He.f1362x;
                        if (interfaceC2364sT3 != null) {
                            interfaceC2364sT3.mo85W(bool3);
                        }
                        abstractActivityC0402He.f1362x = null;
                        return;
                    default:
                        Uri uri = (Uri) obj;
                        if (uri != null && (interfaceC2711zB = abstractActivityC0402He.f1361t) != null) {
                            interfaceC2711zB.mo2259h(uri);
                        }
                        abstractActivityC0402He.f1361t = null;
                        return;
                }
            }
        }, new C0693N6(i3));
        this.f1354B = m4692M(new InterfaceC1468bb() { // from class: a.mj
            @Override // p000a.InterfaceC1468bb
            /* renamed from: h */
            public final void mo2259h(Object obj) {
                InterfaceC2711zB interfaceC2711zB;
                int i32 = i3;
                AbstractActivityC0402He abstractActivityC0402He = abstractActivityC0819PG;
                switch (i32) {
                    case AbstractC0795Op.f2698E /* 0 */:
                        Boolean bool = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT = abstractActivityC0402He.f1359i;
                        if (interfaceC2364sT != null) {
                            interfaceC2364sT.mo85W(bool);
                        }
                        abstractActivityC0402He.f1359i = null;
                        return;
                    case 1:
                        Boolean bool2 = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT2 = abstractActivityC0402He.f1356O;
                        if (interfaceC2364sT2 != null) {
                            interfaceC2364sT2.mo85W(bool2);
                        }
                        abstractActivityC0402He.f1356O = null;
                        return;
                    case 2:
                        Boolean bool3 = (Boolean) obj;
                        InterfaceC2364sT interfaceC2364sT3 = abstractActivityC0402He.f1362x;
                        if (interfaceC2364sT3 != null) {
                            interfaceC2364sT3.mo85W(bool3);
                        }
                        abstractActivityC0402He.f1362x = null;
                        return;
                    default:
                        Uri uri = (Uri) obj;
                        if (uri != null && (interfaceC2711zB = abstractActivityC0402He.f1361t) != null) {
                            interfaceC2711zB.mo2259h(uri);
                        }
                        abstractActivityC0402He.f1361t = null;
                        return;
                }
            }
        }, new C0693N6(i2));
        int i5 = EnumC0511Je.f1697S;
        this.f1355K = AbstractC0438II.m1020Z(C0731Nj.f2465I);
    }

    @Override // p000a.AbstractActivityC0510Jd, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        AbstractC0756O8.m1729v(context);
        super.attachBaseContext(new C1518cc(context));
    }

    @Override // p000a.AbstractActivityC0502JU, androidx.activity.AbstractActivityC2754z, p000a.AbstractActivityC1187WD, android.app.Activity
    public void onCreate(Bundle bundle) {
        InterfaceC2711zB interfaceC2711zB;
        if (AbstractC0795Op.m1857n()) {
            AbstractC2173oy m1201R = m1201R();
            Class<?> cls = m1201R.getClass();
            C1146VR c1146vr = AbstractC2631xW.f8219z;
            Field declaredField = cls.getDeclaredField("mActivityHandlesConfigFlagsChecked");
            declaredField.setAccessible(true);
            declaredField.set(m1201R, Boolean.TRUE);
            Field declaredField2 = cls.getDeclaredField("mActivityHandlesConfigFlags");
            declaredField2.setAccessible(true);
            declaredField2.set(m1201R, 0);
        }
        if (bundle != null) {
            interfaceC2711zB = (InterfaceC2711zB) bundle.getParcelable("content_callback");
        } else {
            interfaceC2711zB = null;
        }
        this.f1361t = interfaceC2711zB;
        super.onCreate(bundle);
    }

    @Override // androidx.activity.AbstractActivityC2754z, p000a.AbstractActivityC1187WD, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC2711zB interfaceC2711zB = this.f1361t;
        if (interfaceC2711zB != null) {
            bundle.putParcelable("content_callback", interfaceC2711zB);
        }
    }

    /* renamed from: q */
    public final void m899q(String str, InterfaceC2364sT interfaceC2364sT) {
        C2300rJ c2300rJ;
        Object obj;
        int i = Build.VERSION.SDK_INT;
        if ((i >= 30 && AbstractC1292YB.m2695u(str, "android.permission.WRITE_EXTERNAL_STORAGE")) || (i < 33 && AbstractC1292YB.m2695u(str, "android.permission.POST_NOTIFICATIONS"))) {
            interfaceC2364sT.mo85W(Boolean.TRUE);
            return;
        }
        if (AbstractC1292YB.m2695u(str, "android.permission.REQUEST_INSTALL_PACKAGES")) {
            this.f1356O = interfaceC2364sT;
            obj = C0329GJ.f1115z;
            c2300rJ = this.f1360n;
        } else {
            this.f1359i = interfaceC2364sT;
            obj = str;
            c2300rJ = this.f1358d;
        }
        c2300rJ.m3957O4(obj);
    }

    @Override // android.app.Activity
    public final void recreate() {
        startActivity(new Intent().setComponent(getIntent().getComponent()));
        finish();
    }
}
