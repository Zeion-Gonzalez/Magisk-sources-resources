package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;

/* renamed from: a.RA */
/* loaded from: classes.dex */
public abstract class AbstractC0911RA extends ConstraintLayout {

    /* renamed from: F */
    public C2281qz f3119F;

    /* renamed from: H */
    public final RunnableC1278Xx f3120H;

    /* renamed from: e */
    public int f3121e;

    /* JADX WARN: Type inference failed for: r7v2, types: [a.Xx] */
    public AbstractC0911RA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        C2281qz c2281qz = new C2281qz();
        this.f3119F = c2281qz;
        C1054Tk c1054Tk = new C1054Tk(0.5f);
        C0099Bw c0099Bw = c2281qz.f7021S.f4616z;
        c0099Bw.getClass();
        C0021AO c0021ao = new C0021AO(c0099Bw);
        c0021ao.f130N = c1054Tk;
        c0021ao.f132Q = c1054Tk;
        c0021ao.f137u = c1054Tk;
        c0021ao.f136o = c1054Tk;
        c2281qz.mo3137h(new C0099Bw(c0021ao));
        this.f3119F.m3934R(ColorStateList.valueOf(-1));
        C2281qz c2281qz2 = this.f3119F;
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4127q(this, c2281qz2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0863Q8.f2916H, R.attr.materialClockStyle, 0);
        this.f3121e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3120H = new Runnable() { // from class: a.Xx
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC0911RA.this.mo2065V();
            }
        };
        obtainStyledAttributes.recycle();
    }

    /* renamed from: V */
    public abstract void mo2065V();

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            view.setId(AbstractC0095Bq.m206z());
        }
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC1278Xx runnableC1278Xx = this.f3120H;
            handler.removeCallbacks(runnableC1278Xx);
            handler.post(runnableC1278Xx);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        mo2065V();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            RunnableC1278Xx runnableC1278Xx = this.f3120H;
            handler.removeCallbacks(runnableC1278Xx);
            handler.post(runnableC1278Xx);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f3119F.m3934R(ColorStateList.valueOf(i));
    }
}
