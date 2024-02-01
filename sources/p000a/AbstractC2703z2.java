package p000a;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.concurrent.Executor;

/* renamed from: a.z2 */
/* loaded from: classes.dex */
public abstract class AbstractC2703z2 {

    /* renamed from: S */
    public final /* synthetic */ int f8525S;

    public /* synthetic */ AbstractC2703z2(int i) {
        this.f8525S = i;
    }

    /* renamed from: BO */
    public final void m4629BO(Typeface typeface) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1547d8(this, 1, typeface));
    }

    /* renamed from: BX */
    public abstract boolean mo1965BX();

    /* renamed from: G5 */
    public abstract void mo91G5(Typeface typeface, boolean z);

    /* renamed from: Ha */
    public abstract View mo1968Ha(int i);

    /* renamed from: Lq */
    public abstract Object mo3375Lq();

    /* renamed from: Pm */
    public abstract void mo92Pm(int i);

    /* renamed from: U8 */
    public final void m4630U8(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1287Y6(i, 0, this));
    }

    /* renamed from: ZH */
    public abstract long mo2936ZH(long j, byte[] bArr);

    /* renamed from: d2 */
    public final void m4631d2(InterfaceC2487ut interfaceC2487ut) {
        mo780dG(AbstractC1110Un.f3613h, interfaceC2487ut);
    }

    /* renamed from: dG */
    public abstract void mo780dG(Executor executor, InterfaceC2487ut interfaceC2487ut);

    /* renamed from: dx */
    public abstract AbstractC1823iK mo781dx();

    /* renamed from: he */
    public abstract int mo2031he(byte[] bArr, int i, byte[] bArr2, int i2);

    /* renamed from: oI */
    public abstract void mo777oI(Typeface typeface);

    public String toString() {
        switch (this.f8525S) {
            case 10:
                return getClass().getSimpleName();
            case 11:
                return getClass().getSimpleName();
            default:
                return super.toString();
        }
    }
}
