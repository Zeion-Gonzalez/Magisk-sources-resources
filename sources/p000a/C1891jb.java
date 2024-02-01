package p000a;

import android.os.Bundle;

/* renamed from: a.jb */
/* loaded from: classes.dex */
public final class C1891jb extends AbstractC1021T9 implements InterfaceC2364sT {

    /* renamed from: R */
    public final /* synthetic */ int f5913R;

    /* renamed from: w */
    public final /* synthetic */ Bundle f5914w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1891jb(int i, Bundle bundle) {
        super(1);
        this.f5913R = i;
        this.f5914w = bundle;
    }

    @Override // p000a.InterfaceC2364sT
    /* renamed from: W */
    public final /* bridge */ /* synthetic */ Object mo85W(Object obj) {
        switch (this.f5913R) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m3521h((String) obj);
            default:
                return m3521h((String) obj);
        }
    }

    /* renamed from: h */
    public final Boolean m3521h(String str) {
        int i = this.f5913R;
        Bundle bundle = this.f5914w;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return Boolean.valueOf(!bundle.containsKey(str));
            default:
                return Boolean.valueOf(!bundle.containsKey(str));
        }
    }
}
