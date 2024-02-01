package p000a;

import java.util.zip.ZipEntry;

/* renamed from: a.gr */
/* loaded from: classes.dex */
public final class C1747gr extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f5515R;

    /* renamed from: w */
    public final /* synthetic */ String f5516w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1747gr(int i, String str) {
        super(1);
        this.f5515R = i;
        this.f5516w = str;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final Object mo85W(Object obj) {
        int i = this.f5515R;
        String str = this.f5516w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return Boolean.valueOf(AbstractC1292YB.m2695u((String) obj, str));
            case 1:
                return Boolean.valueOf(AbstractC1292YB.m2695u(((C0084Bc) obj).f329S, str));
            case 2:
                ((InterfaceC1136VG) obj).mo1948s(str);
                return null;
            case 3:
                return Boolean.valueOf(AbstractC1292YB.m2695u(((ZipEntry) obj).getName(), "lib/" + str + "/libmagisk32.so"));
            default:
                return AbstractC2441tz.m4195W(str, (String) obj);
        }
    }
}
