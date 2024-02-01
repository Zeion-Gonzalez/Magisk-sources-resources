package p000a;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: a.lf */
/* loaded from: classes.dex */
public final class CallableC2002lf implements Callable {

    /* renamed from: I */
    public final /* synthetic */ C2226py f6215I;

    /* renamed from: R */
    public final /* synthetic */ String f6216R;

    /* renamed from: S */
    public final /* synthetic */ int f6217S;

    /* renamed from: q */
    public final /* synthetic */ int f6218q;

    /* renamed from: w */
    public final /* synthetic */ Context f6219w;

    public /* synthetic */ CallableC2002lf(String str, Context context, C2226py c2226py, int i, int i2) {
        this.f6217S = i2;
        this.f6216R = str;
        this.f6219w = context;
        this.f6215I = c2226py;
        this.f6218q = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        switch (this.f6217S) {
            case AbstractC0795Op.f2698E /* 0 */:
                return m3626z();
            default:
                return m3626z();
        }
    }

    /* renamed from: z */
    public final C1846ik m3626z() {
        int i = this.f6217S;
        Context context = this.f6219w;
        String str = this.f6216R;
        int i2 = this.f6218q;
        C2226py c2226py = this.f6215I;
        switch (i) {
            case AbstractC0795Op.f2698E /* 0 */:
                return AbstractC2159oj.m3771z(str, context, c2226py, i2);
            default:
                try {
                    return AbstractC2159oj.m3771z(str, context, c2226py, i2);
                } catch (Throwable unused) {
                    return new C1846ik(-3);
                }
        }
    }
}
