package p000a;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.AbstractC2760z;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: a.ja */
/* loaded from: classes.dex */
public abstract class AbstractC1890ja<Binding extends AbstractC2760z> extends AbstractComponentCallbacksC2342s3 implements InterfaceC2068mx {

    /* renamed from: n0 */
    public AbstractC2760z f5912n0;

    /* renamed from: B */
    public final AbstractActivityC1957kp m3511B() {
        AbstractActivityC0502JU abstractActivityC0502JU;
        C0852Pu c0852Pu = this.f7186F;
        if (c0852Pu == null) {
            abstractActivityC0502JU = null;
        } else {
            abstractActivityC0502JU = (AbstractActivityC0502JU) c0852Pu.f2881R;
        }
        if (!(abstractActivityC0502JU instanceof AbstractActivityC1957kp)) {
            return null;
        }
        return (AbstractActivityC1957kp) abstractActivityC0502JU;
    }

    /* renamed from: D */
    public abstract int mo3512D();

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: F */
    public final void mo279F(Bundle bundle) {
        mo3692y().mo3123V(bundle);
    }

    /* renamed from: K */
    public final AbstractC2760z m3513K() {
        AbstractC2760z abstractC2760z = this.f5912n0;
        if (abstractC2760z != null) {
            return abstractC2760z;
        }
        return null;
    }

    @Override // p000a.InterfaceC2068mx
    /* renamed from: V */
    public final void mo1922V(AbstractC0231EP abstractC0231EP) {
        AbstractActivityC1957kp m3511B;
        if (abstractC0231EP instanceof InterfaceC1275Xu) {
            ((InterfaceC1275Xu) abstractC0231EP).mo2599z(m4004O());
        } else {
            if (!(abstractC0231EP instanceof InterfaceC2030mD) || (m3511B = m3511B()) == null) {
                return;
            }
            ((InterfaceC2030mD) abstractC0231EP).mo557h(m3511B);
        }
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: X */
    public void mo3514X() {
        this.f7224x = true;
        AbstractC2615xD mo3692y = mo3692y();
        if (mo3692y instanceof AbstractC2439tx) {
            ((AbstractC2439tx) mo3692y).m4181q();
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [a.jj] */
    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Y */
    public View mo431Y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractActivityC1957kp m3511B;
        AbstractC2760z m3967v = AbstractC2307rQ.m3967v(layoutInflater, mo3512D(), viewGroup, false);
        m3967v.mo19k(43, mo3692y());
        m3967v.mo2815q(m4002I());
        this.f5912n0 = m3967v;
        if ((this instanceof InterfaceC1503cL) && (m3511B = m3511B()) != null) {
            final InterfaceC1503cL interfaceC1503cL = (InterfaceC1503cL) this;
            C1271Xp m4002I = m4002I();
            final C1174Vy c1174Vy = m3511B.f8667w;
            c1174Vy.getClass();
            m4002I.m2597P();
            C0326GG c0326gg = m4002I.f4088I;
            C1267Xl c1267Xl = (C1267Xl) ((Map) c1174Vy.f3827I).remove(interfaceC1503cL);
            if (c1267Xl != null) {
                c1267Xl.f4086z.mo724h(c1267Xl.f4085h);
                c1267Xl.f4085h = null;
            }
            ((Map) c1174Vy.f3827I).put(interfaceC1503cL, new C1267Xl(c0326gg, new InterfaceC1270Xo() { // from class: a.jj

                /* renamed from: R */
                public final /* synthetic */ EnumC1632eh f5931R = EnumC1632eh.f5087I;

                @Override // p000a.InterfaceC1270Xo
                /* renamed from: Q */
                public final void mo2596Q(InterfaceC1546d7 interfaceC1546d7, EnumC2241qF enumC2241qF) {
                    EnumC2241qF enumC2241qF2;
                    C1174Vy c1174Vy2 = C1174Vy.this;
                    c1174Vy2.getClass();
                    EnumC2241qF.Companion.getClass();
                    EnumC1632eh enumC1632eh = this.f5931R;
                    int ordinal = enumC1632eh.ordinal();
                    EnumC2241qF enumC2241qF3 = null;
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                enumC2241qF2 = null;
                            } else {
                                enumC2241qF2 = EnumC2241qF.ON_RESUME;
                            }
                        } else {
                            enumC2241qF2 = EnumC2241qF.ON_START;
                        }
                    } else {
                        enumC2241qF2 = EnumC2241qF.ON_CREATE;
                    }
                    InterfaceC1503cL interfaceC1503cL2 = interfaceC1503cL;
                    if (enumC2241qF == enumC2241qF2) {
                        ((CopyOnWriteArrayList) c1174Vy2.f3830w).add(interfaceC1503cL2);
                        ((Runnable) c1174Vy2.f3828R).run();
                        return;
                    }
                    EnumC2241qF enumC2241qF4 = EnumC2241qF.ON_DESTROY;
                    if (enumC2241qF == enumC2241qF4) {
                        c1174Vy2.m2399k(interfaceC1503cL2);
                        return;
                    }
                    int ordinal2 = enumC1632eh.ordinal();
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            if (ordinal2 == 4) {
                                enumC2241qF3 = EnumC2241qF.ON_PAUSE;
                            }
                        } else {
                            enumC2241qF3 = EnumC2241qF.ON_STOP;
                        }
                    } else {
                        enumC2241qF3 = enumC2241qF4;
                    }
                    if (enumC2241qF == enumC2241qF3) {
                        ((CopyOnWriteArrayList) c1174Vy2.f3830w).remove(interfaceC1503cL2);
                        ((Runnable) c1174Vy2.f3828R).run();
                    }
                }
            }));
        }
        if (bundle != null) {
            mo3692y().mo3122M(bundle);
        }
        return m3513K().f8982k;
    }

    /* renamed from: Yd */
    public void mo3515Yd(AbstractC2760z abstractC2760z) {
        View view = abstractC2760z.f8982k;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            AbstractC0795Op.m1859nB(viewGroup);
        }
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public void mo285Z() {
        AbstractC1500cH abstractC1500cH;
        this.f7224x = true;
        AbstractActivityC1957kp m3511B = m3511B();
        if (m3511B != null) {
            abstractC1500cH = m3511B.m1203w();
        } else {
            abstractC1500cH = null;
        }
        if (abstractC1500cH != null) {
            abstractC1500cH.mo2910c(null);
        }
    }

    /* renamed from: b */
    public boolean mo3516b() {
        return false;
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: j */
    public void mo3517j(View view, Bundle bundle) {
        AbstractC2760z m3513K = m3513K();
        C1197WN c1197wn = new C1197WN(this);
        if (m3513K.f8981g == null) {
            m3513K.f8981g = new C0409Hl(AbstractC2760z.f8970Z);
        }
        m3513K.f8981g.m925z(c1197wn);
    }

    /* renamed from: l */
    public View mo3518l() {
        return null;
    }

    /* renamed from: m */
    public View mo3519m() {
        return null;
    }

    /* renamed from: nP */
    public boolean mo3520nP(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: r */
    public void mo290r(Bundle bundle) {
        super.mo290r(bundle);
        AbstractC0795Op.m1844d3(this);
    }
}
