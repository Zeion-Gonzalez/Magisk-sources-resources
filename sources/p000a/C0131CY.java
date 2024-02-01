package p000a;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: a.CY */
/* loaded from: classes.dex */
public final class C0131CY {

    /* renamed from: P */
    public float f446P;

    /* renamed from: Q */
    public WeakReference f447Q;

    /* renamed from: u */
    public C1726gW f449u;

    /* renamed from: v */
    public float f450v;

    /* renamed from: z */
    public final TextPaint f451z = new TextPaint(1);

    /* renamed from: h */
    public final C1340Z6 f448h = new C1340Z6(1, this);

    /* renamed from: N */
    public boolean f445N = true;

    public C0131CY(InterfaceC0879QU interfaceC0879QU) {
        this.f447Q = new WeakReference(null);
        this.f447Q = new WeakReference(interfaceC0879QU);
    }

    /* renamed from: h */
    public final void m259h(C1726gW c1726gW, Context context) {
        if (this.f449u != c1726gW) {
            this.f449u = c1726gW;
            TextPaint textPaint = this.f451z;
            C1340Z6 c1340z6 = this.f448h;
            c1726gW.m3259Q(context, textPaint, c1340z6);
            InterfaceC0879QU interfaceC0879QU = (InterfaceC0879QU) this.f447Q.get();
            if (interfaceC0879QU != null) {
                textPaint.drawableState = interfaceC0879QU.getState();
            }
            c1726gW.m3257N(context, textPaint, c1340z6);
            this.f445N = true;
            InterfaceC0879QU interfaceC0879QU2 = (InterfaceC0879QU) this.f447Q.get();
            if (interfaceC0879QU2 != null) {
                interfaceC0879QU2.mo2027z();
                interfaceC0879QU2.onStateChange(interfaceC0879QU2.getState());
            }
        }
    }

    /* renamed from: z */
    public final void m260z(String str) {
        float measureText;
        float f = 0.0f;
        TextPaint textPaint = this.f451z;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.f450v = measureText;
        if (str != null) {
            f = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f446P = f;
        this.f445N = false;
    }
}
