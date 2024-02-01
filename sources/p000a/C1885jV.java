package p000a;

import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import java.util.concurrent.TimeUnit;

/* renamed from: a.jV */
/* loaded from: classes.dex */
public final class C1885jV extends AbstractC2615xD {

    /* renamed from: E */
    public int f5887E;

    /* renamed from: J */
    public final CountDownTimerC1813iA f5888J;

    /* renamed from: Y */
    public final C0895Qs f5890Y;

    /* renamed from: c */
    public boolean f5891c;

    /* renamed from: f */
    public boolean f5892f;

    /* renamed from: g */
    public Drawable f5893g;

    /* renamed from: k */
    public final SharedPreferences f5894k;

    /* renamed from: s */
    public String f5896s;

    /* renamed from: y */
    public String f5897y;

    /* renamed from: U */
    public final C2521vQ f5889U = new C2521vQ(this);

    /* renamed from: r */
    public final ViewOnTouchListenerC0534K3 f5895r = new ViewOnTouchListenerC0534K3();

    public C1885jV(C0468Ir c0468Ir, SharedPreferences sharedPreferences) {
        this.f5894k = sharedPreferences;
        this.f5890Y = new C0895Qs(AbstractC1743gn.m3275z().getPackageManager(), c0468Ir);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C1212We.f3969z.getClass();
        this.f5888J = new CountDownTimerC1813iA(this, timeUnit.toMillis(((Number) C1212We.f3941G.m2368h(r4, C1212We.f3959h[4])).intValue()));
    }

    /* renamed from: I */
    public final void m3506I(int i) {
        if (!this.f5891c) {
            return;
        }
        this.f5888J.cancel();
        int i2 = this.f5887E;
        SharedPreferences.Editor edit = this.f5894k.edit();
        String str = this.f5896s;
        if (str == null) {
            str = null;
        }
        edit.putInt(str, i2).apply();
        AbstractC0438II.m994F(AbstractC2575wW.m4424d(this), null, new C1741gl(this, i, i2, null), 3);
    }
}
