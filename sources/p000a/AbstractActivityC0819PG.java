package p000a;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.databinding.AbstractC2760z;
import androidx.databinding.DataBinderMapperImpl;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: a.PG */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0819PG extends AbstractActivityC0402He implements InterfaceC2068mx {

    /* renamed from: m */
    public static final /* synthetic */ int f2781m = 0;

    /* renamed from: D */
    public AbstractC2760z f2782D;

    public AbstractActivityC0819PG() {
        C1212We c1212We = C1212We.f3969z;
        c1212We.getClass();
        int intValue = C1212We.f3967w.m1196O4(c1212We, C1212We.f3959h[9]).intValue();
        ExecutorC0571Ki executorC0571Ki = AbstractC2173oy.f6660S;
        if (intValue != -1 && intValue != 0 && intValue != 1 && intValue != 2 && intValue != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
            return;
        }
        if (AbstractC2173oy.f6659R != intValue) {
            AbstractC2173oy.f6659R = intValue;
            synchronized (AbstractC2173oy.f6666y) {
                Iterator it = AbstractC2173oy.f6661g.iterator();
                while (it.hasNext()) {
                    AbstractC2173oy abstractC2173oy = (AbstractC2173oy) ((WeakReference) it.next()).get();
                    if (abstractC2173oy != null) {
                        ((LayoutInflaterFactory2C1392a6) abstractC2173oy).m2787I(true, true);
                    }
                }
            }
        }
    }

    /* renamed from: E */
    public final void m1920E() {
        int mo1923g = mo1923g();
        DataBinderMapperImpl dataBinderMapperImpl = AbstractC2307rQ.f7124z;
        setContentView(mo1923g);
        AbstractC2760z m3966h = AbstractC2307rQ.m3966h((ViewGroup) getWindow().getDecorView().findViewById(16908290), 0, mo1923g);
        m3966h.mo19k(43, mo3692y());
        m3966h.mo2815q(this);
        this.f2782D = m3966h;
    }

    /* renamed from: U */
    public View mo1921U() {
        return m1924k().f8982k;
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: V */
    public final void mo1922V(AbstractC0231EP abstractC0231EP) {
        if (abstractC0231EP instanceof InterfaceC1275Xu) {
            ((InterfaceC1275Xu) abstractC0231EP).mo2599z(this);
        } else if (abstractC0231EP instanceof InterfaceC2030mD) {
            ((InterfaceC2030mD) abstractC0231EP).mo557h(this);
        }
    }

    /* renamed from: g */
    public abstract int mo1923g();

    /* renamed from: k */
    public final AbstractC2760z m1924k() {
        AbstractC2760z abstractC2760z = this.f2782D;
        if (abstractC2760z != null) {
            return abstractC2760z;
        }
        return null;
    }

    @Override // p000a.AbstractActivityC0402He, p000a.AbstractActivityC0502JU, androidx.activity.AbstractActivityC2754z, p000a.AbstractActivityC1187WD, android.app.Activity
    public void onCreate(Bundle bundle) {
        Window window;
        View decorView;
        LayoutInflater layoutInflater = getLayoutInflater();
        LayoutInflaterFactory2C0793On layoutInflaterFactory2C0793On = new LayoutInflaterFactory2C0793On(m1201R());
        layoutInflaterFactory2C0793On.f2697w.add(C0018AK.f109H);
        layoutInflater.setFactory2(layoutInflaterFactory2C0793On);
        super.onCreate(bundle);
        AbstractC0795Op.m1844d3(this);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(new int[]{16842836});
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        getWindow().setBackgroundDrawable(drawable);
        Window window2 = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC1763h7.m3292z(window2, false);
        } else {
            AbstractC0456Ie.m1092z(window2, false);
        }
        if (i >= 26 && (window = getWindow()) != null && (decorView = window.getDecorView()) != null) {
            decorView.post(new RunnableC0308Fs(14, this));
        }
    }

    @Override // p000a.AbstractActivityC0502JU, android.app.Activity
    public void onResume() {
        super.onResume();
        AbstractC2615xD mo3692y = mo3692y();
        if (mo3692y instanceof AbstractC2439tx) {
            ((AbstractC2439tx) mo3692y).m4181q();
        }
    }

    /* renamed from: s */
    public View mo1925s() {
        return null;
    }
}
