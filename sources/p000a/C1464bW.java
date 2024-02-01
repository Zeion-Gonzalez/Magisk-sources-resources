package p000a;

import android.os.Build;
import java.util.zip.ZipEntry;

/* renamed from: a.bW */
/* loaded from: classes.dex */
public final class C1464bW extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f4558R;

    /* renamed from: w */
    public final /* synthetic */ InterfaceC2364sT f4559w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1464bW(int i, InterfaceC2364sT interfaceC2364sT) {
        super(1);
        this.f4558R = i;
        this.f4559w = interfaceC2364sT;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        Object obj2;
        int i = this.f4558R;
        InterfaceC2364sT interfaceC2364sT = this.f4559w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                ZipEntry zipEntry = (ZipEntry) obj;
                boolean z = false;
                if (!zipEntry.isDirectory()) {
                    String name = zipEntry.getName();
                    String str = AbstractC0598LC.f1921z;
                    if (name.startsWith("lib/" + Build.SUPPORTED_ABIS[0] + "/") || ((Boolean) interfaceC2364sT.mo85W(zipEntry)).booleanValue()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                Throwable th = (Throwable) obj;
                Object obj3 = null;
                try {
                    Throwable th2 = (Throwable) interfaceC2364sT.mo85W(th);
                    boolean m2695u = AbstractC1292YB.m2695u(th.getMessage(), th2.getMessage());
                    obj2 = th2;
                    if (!m2695u) {
                        boolean m2695u2 = AbstractC1292YB.m2695u(th2.getMessage(), th.toString());
                        obj2 = th2;
                        if (!m2695u2) {
                            obj2 = null;
                        }
                    }
                } catch (Throwable th3) {
                    obj2 = new C1019T6(th3);
                }
                if (!(obj2 instanceof C1019T6)) {
                    obj3 = obj2;
                }
                return (Throwable) obj3;
        }
    }
}
