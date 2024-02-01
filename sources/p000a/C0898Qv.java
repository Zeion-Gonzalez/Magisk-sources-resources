package p000a;

import android.os.Looper;
import java.util.List;

/* renamed from: a.Qv */
/* loaded from: classes.dex */
public final class C0898Qv implements InterfaceC1072U6 {
    @Override // p000a.InterfaceC1072U6
    /* renamed from: h */
    public String mo2050h() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // p000a.InterfaceC1072U6
    /* renamed from: v */
    public AbstractC1577de mo2051v(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C1557dI(AbstractC2013ls.m3653z(mainLooper));
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // p000a.InterfaceC1072U6
    /* renamed from: z */
    public int mo2052z() {
        return 1073741823;
    }
}
