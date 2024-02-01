package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* renamed from: a.Bw */
/* loaded from: classes.dex */
public final class C0099Bw {

    /* renamed from: S */
    public static final C1054Tk f369S = new C1054Tk(0.5f);

    /* renamed from: G */
    public final C1665fK f370G;

    /* renamed from: M */
    public final C1665fK f371M;

    /* renamed from: N */
    public final InterfaceC1722gQ f372N;

    /* renamed from: P */
    public final AbstractC1500cH f373P;

    /* renamed from: Q */
    public final InterfaceC1722gQ f374Q;

    /* renamed from: V */
    public final C1665fK f375V;

    /* renamed from: W */
    public final C1665fK f376W;

    /* renamed from: h */
    public final AbstractC1500cH f377h;

    /* renamed from: o */
    public final InterfaceC1722gQ f378o;

    /* renamed from: u */
    public final InterfaceC1722gQ f379u;

    /* renamed from: v */
    public final AbstractC1500cH f380v;

    /* renamed from: z */
    public final AbstractC1500cH f381z;

    public C0099Bw() {
        this.f381z = new C2073n1();
        this.f377h = new C2073n1();
        this.f380v = new C2073n1();
        this.f373P = new C2073n1();
        this.f372N = new C1012T(0.0f);
        this.f374Q = new C1012T(0.0f);
        this.f379u = new C1012T(0.0f);
        this.f378o = new C1012T(0.0f);
        this.f376W = AbstractC0795Op.m1827R();
        this.f370G = AbstractC0795Op.m1827R();
        this.f371M = AbstractC0795Op.m1827R();
        this.f375V = AbstractC0795Op.m1827R();
    }

    /* renamed from: P */
    public static InterfaceC1722gQ m207P(TypedArray typedArray, int i, InterfaceC1722gQ interfaceC1722gQ) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC1722gQ;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C1012T(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C1054Tk(peekValue.getFraction(1.0f, 1.0f)) : interfaceC1722gQ;
    }

    /* renamed from: h */
    public static C0021AO m208h(Context context, AttributeSet attributeSet, int i, int i2) {
        return m209v(context, attributeSet, i, i2, new C1012T(0));
    }

    /* renamed from: v */
    public static C0021AO m209v(Context context, AttributeSet attributeSet, int i, int i2, InterfaceC1722gQ interfaceC1722gQ) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2913E, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m210z(context, resourceId, resourceId2, interfaceC1722gQ);
    }

    /* renamed from: z */
    public static C0021AO m210z(Context context, int i, int i2, InterfaceC1722gQ interfaceC1722gQ) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0863Q8.f2929X);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            InterfaceC1722gQ m207P = m207P(obtainStyledAttributes, 5, interfaceC1722gQ);
            InterfaceC1722gQ m207P2 = m207P(obtainStyledAttributes, 8, m207P);
            InterfaceC1722gQ m207P3 = m207P(obtainStyledAttributes, 9, m207P);
            InterfaceC1722gQ m207P4 = m207P(obtainStyledAttributes, 7, m207P);
            InterfaceC1722gQ m207P5 = m207P(obtainStyledAttributes, 6, m207P);
            C0021AO c0021ao = new C0021AO();
            AbstractC1500cH m1828S = AbstractC0795Op.m1828S(i4);
            c0021ao.f139z = m1828S;
            C0021AO.m52h(m1828S);
            c0021ao.f130N = m207P2;
            AbstractC1500cH m1828S2 = AbstractC0795Op.m1828S(i5);
            c0021ao.f135h = m1828S2;
            C0021AO.m52h(m1828S2);
            c0021ao.f132Q = m207P3;
            AbstractC1500cH m1828S3 = AbstractC0795Op.m1828S(i6);
            c0021ao.f138v = m1828S3;
            C0021AO.m52h(m1828S3);
            c0021ao.f137u = m207P4;
            AbstractC1500cH m1828S4 = AbstractC0795Op.m1828S(i7);
            c0021ao.f131P = m1828S4;
            C0021AO.m52h(m1828S4);
            c0021ao.f136o = m207P5;
            return c0021ao;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: N */
    public final boolean m211N(RectF rectF) {
        boolean z = this.f375V.getClass().equals(C1665fK.class) && this.f370G.getClass().equals(C1665fK.class) && this.f376W.getClass().equals(C1665fK.class) && this.f371M.getClass().equals(C1665fK.class);
        float mo2191z = this.f372N.mo2191z(rectF);
        return z && ((this.f374Q.mo2191z(rectF) > mo2191z ? 1 : (this.f374Q.mo2191z(rectF) == mo2191z ? 0 : -1)) == 0 && (this.f378o.mo2191z(rectF) > mo2191z ? 1 : (this.f378o.mo2191z(rectF) == mo2191z ? 0 : -1)) == 0 && (this.f379u.mo2191z(rectF) > mo2191z ? 1 : (this.f379u.mo2191z(rectF) == mo2191z ? 0 : -1)) == 0) && ((this.f377h instanceof C2073n1) && (this.f381z instanceof C2073n1) && (this.f380v instanceof C2073n1) && (this.f373P instanceof C2073n1));
    }

    public C0099Bw(C0021AO c0021ao) {
        this.f381z = c0021ao.f139z;
        this.f377h = c0021ao.f135h;
        this.f380v = c0021ao.f138v;
        this.f373P = c0021ao.f131P;
        this.f372N = c0021ao.f130N;
        this.f374Q = c0021ao.f132Q;
        this.f379u = c0021ao.f137u;
        this.f378o = c0021ao.f136o;
        this.f376W = c0021ao.f134W;
        this.f370G = c0021ao.f128G;
        this.f371M = c0021ao.f129M;
        this.f375V = c0021ao.f133V;
    }
}
