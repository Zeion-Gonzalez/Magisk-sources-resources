package p000a;

import androidx.activity.result.AbstractC2753z;

/* renamed from: a.rJ */
/* loaded from: classes.dex */
public final class C2300rJ extends AbstractC2703z2 {

    /* renamed from: I */
    public final /* synthetic */ AbstractC2575wW f7098I;

    /* renamed from: R */
    public final /* synthetic */ int f7099R;

    /* renamed from: q */
    public final /* synthetic */ AbstractC2753z f7100q;

    /* renamed from: w */
    public final /* synthetic */ String f7101w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2300rJ(AbstractC2753z abstractC2753z, String str, AbstractC2575wW abstractC2575wW, int i) {
        super(0);
        this.f7099R = i;
        this.f7100q = abstractC2753z;
        this.f7101w = str;
        this.f7098I = abstractC2575wW;
    }

    /* renamed from: O4 */
    public final void m3957O4(Object obj) {
        int i = this.f7099R;
        AbstractC2575wW abstractC2575wW = this.f7098I;
        String str = this.f7101w;
        AbstractC2753z abstractC2753z = this.f7100q;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                Integer num = (Integer) abstractC2753z.f8648h.get(str);
                if (num != null) {
                    abstractC2753z.f8646P.add(str);
                    try {
                        abstractC2753z.mo2148h(num.intValue(), abstractC2575wW, obj);
                        return;
                    } catch (Exception e) {
                        abstractC2753z.f8646P.remove(str);
                        throw e;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC2575wW + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            default:
                Integer num2 = (Integer) abstractC2753z.f8648h.get(str);
                if (num2 != null) {
                    abstractC2753z.f8646P.add(str);
                    try {
                        abstractC2753z.mo2148h(num2.intValue(), abstractC2575wW, obj);
                        return;
                    } catch (Exception e2) {
                        abstractC2753z.f8646P.remove(str);
                        throw e2;
                    }
                }
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC2575wW + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }
    }

    /* renamed from: nB */
    public final void m3958nB() {
        int i = this.f7099R;
        String str = this.f7101w;
        AbstractC2753z abstractC2753z = this.f7100q;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                abstractC2753z.m4688Q(str);
                return;
            default:
                abstractC2753z.m4688Q(str);
                return;
        }
    }
}
