package p000a;

import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: a.ER */
/* loaded from: classes.dex */
public abstract class AbstractViewOnTouchListenerC0233ER implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: I */
    public final View f749I;

    /* renamed from: R */
    public final int f750R;

    /* renamed from: S */
    public final float f751S;

    /* renamed from: g */
    public boolean f752g;

    /* renamed from: k */
    public RunnableC2151oZ f753k;

    /* renamed from: q */
    public RunnableC2151oZ f754q;

    /* renamed from: s */
    public final int[] f755s = new int[2];

    /* renamed from: w */
    public final int f756w;

    /* renamed from: y */
    public int f757y;

    public AbstractViewOnTouchListenerC0233ER(View view) {
        this.f749I = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f751S = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f750R = tapTimeout;
        this.f756w = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    /* renamed from: P */
    public boolean mo469P() {
        InterfaceC2298rH mo470h = mo470h();
        if (mo470h == null || !mo470h.mo399h()) {
            return true;
        }
        mo470h.dismiss();
        return true;
    }

    /* renamed from: h */
    public abstract InterfaceC2298rH mo470h();

    /* JADX WARN: Code restructure failed: missing block: B:191:0x0080, code lost:
    
        if (r4 != 3) goto L215;
     */
    /* JADX WARN: Removed duplicated region for block: B:222:0x010c  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractViewOnTouchListenerC0233ER.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f752g = false;
        this.f757y = -1;
        RunnableC2151oZ runnableC2151oZ = this.f754q;
        if (runnableC2151oZ != null) {
            this.f749I.removeCallbacks(runnableC2151oZ);
        }
    }

    /* renamed from: v */
    public abstract boolean mo471v();

    /* renamed from: z */
    public final void m472z() {
        RunnableC2151oZ runnableC2151oZ = this.f753k;
        View view = this.f749I;
        if (runnableC2151oZ != null) {
            view.removeCallbacks(runnableC2151oZ);
        }
        RunnableC2151oZ runnableC2151oZ2 = this.f754q;
        if (runnableC2151oZ2 != null) {
            view.removeCallbacks(runnableC2151oZ2);
        }
    }
}
