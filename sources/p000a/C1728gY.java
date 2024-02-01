package p000a;

import java.security.PrivilegedAction;
import java.security.Security;

/* renamed from: a.gY */
/* loaded from: classes.dex */
public final class C1728gY implements PrivilegedAction {

    /* renamed from: h */
    public final /* synthetic */ String f5448h;

    /* renamed from: z */
    public final /* synthetic */ int f5449z;

    public /* synthetic */ C1728gY(int i, String str) {
        this.f5449z = i;
        this.f5448h = str;
    }

    @Override // java.security.PrivilegedAction
    public final Object run() {
        int i = this.f5449z;
        String str = this.f5448h;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                try {
                    return Class.forName(str);
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                try {
                    return Class.forName(str);
                } catch (Exception unused2) {
                    return null;
                }
            case 2:
                return Security.getProperty(str);
            default:
                return System.getProperty(str);
        }
    }
}
