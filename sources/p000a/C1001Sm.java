package p000a;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: a.Sm */
/* loaded from: classes.dex */
public final class C1001Sm extends AbstractC2328ro implements InterfaceC0559KW {

    /* renamed from: g */
    public final /* synthetic */ Intent f3360g;

    /* renamed from: k */
    public final /* synthetic */ C1885jV f3361k;

    /* renamed from: q */
    public int f3362q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1001Sm(C1885jV c1885jV, Intent intent, InterfaceC1171Vv interfaceC1171Vv) {
        super(interfaceC1171Vv);
        this.f3361k = c1885jV;
        this.f3360g = intent;
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: G */
    public final InterfaceC1171Vv mo49G(Object obj, InterfaceC1171Vv interfaceC1171Vv) {
        return new C1001Sm(this.f3361k, this.f3360g, interfaceC1171Vv);
    }

    @Override // p000a.AbstractC2097nW
    /* renamed from: V */
    public final Object mo50V(Object obj) {
        String str;
        EnumC0464Im enumC0464Im = EnumC0464Im.f1557S;
        int i = this.f3362q;
        C1885jV c1885jV = this.f3361k;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC1292YB.m2664UZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1292YB.m2664UZ(obj);
            C0895Qs c0895Qs = c1885jV.f5890Y;
            this.f3362q = 1;
            obj = c0895Qs.m2047v(this.f3360g, this);
            if (obj == enumC0464Im) {
                return enumC0464Im;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            C0895Qs c0895Qs2 = c1885jV.f5890Y;
            PackageManager packageManager = c0895Qs2.f3082z;
            PackageInfo packageInfo = c0895Qs2.f3078N;
            C0859Q1 c0859q1 = null;
            if (packageInfo == null) {
                packageInfo = null;
            }
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            String str2 = "[SharedUID] ";
            if (applicationInfo == null) {
                c1885jV.f5893g = packageManager.getDefaultActivityIcon();
                c1885jV.f5897y = AbstractC2441tz.m4200k("[SharedUID] ", packageInfo.sharedUserId);
                str = packageInfo.sharedUserId;
            } else {
                if (packageInfo.sharedUserId == null) {
                    str2 = "";
                }
                c1885jV.f5893g = applicationInfo.loadIcon(packageManager);
                c1885jV.f5897y = AbstractC2441tz.m4195W(str2, AbstractC0795Op.m1835X(applicationInfo, packageManager));
                str = packageInfo.packageName;
            }
            c1885jV.f5896s = str;
            if (str == null) {
                str = null;
            }
            int i3 = c1885jV.f5894k.getInt(str, 0);
            if (c1885jV.f5887E != i3) {
                c1885jV.f5887E = i3;
                c1885jV.mo1709Q(31);
            }
            c1885jV.f5888J.start();
            if (C1212We.f3969z.m2497P()) {
                c0859q1 = C0859Q1.f2904z;
            }
            c1885jV.m4500S(new C0259Ey(c0859q1));
            c1885jV.f5891c = true;
        } else {
            c1885jV.m4500S(new C1366ZZ(i2));
        }
        return C0329GJ.f1115z;
    }

    @Override // p000a.InterfaceC0559KW
    /* renamed from: o */
    public final Object mo51o(Object obj, Object obj2) {
        return ((C1001Sm) mo49G((InterfaceC1725gU) obj, (InterfaceC1171Vv) obj2)).mo50V(C0329GJ.f1115z);
    }
}
