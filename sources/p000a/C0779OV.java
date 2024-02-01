package p000a;

import android.view.View;
import android.widget.Button;
import androidx.databinding.AbstractC2760z;
import com.topjohnwu.magisk.R;

/* renamed from: a.OV */
/* loaded from: classes.dex */
public final class C0779OV extends AbstractC0527Jw implements InterfaceC1221Wo {

    /* renamed from: L */
    public final Button f2636L;

    /* renamed from: d */
    public long f2637d;

    /* renamed from: i */
    public final ViewOnClickListenerC0574Kl f2638i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0779OV(View view) {
        super(view, null);
        int i = 1;
        Object[] m4814S = AbstractC2760z.m4814S(view, 1, null, null);
        this.f2637d = -1L;
        Button button = (Button) m4814S[0];
        this.f2636L = button;
        button.setTag(null);
        view.setTag(R.id.dataBinding, this);
        this.f2638i = new ViewOnClickListenerC0574Kl(i, i, this);
        mo14M();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f2637d != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f2637d = 4L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        synchronized (this) {
            j = this.f2637d;
            this.f2637d = 0L;
        }
        if ((j & 4) != 0) {
            this.f2636L.setOnClickListener(this.f2638i);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        C2744zq c2744zq = (C2744zq) obj;
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.f2637d |= 1;
        }
        return true;
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        boolean z;
        C2744zq c2744zq = this.f1771j;
        if (c2744zq != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            c2744zq.getClass();
            c2744zq.m4501w("android.permission.WRITE_EXTERNAL_STORAGE", new C1372Zg(c2744zq, 8, c2744zq));
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 == i) {
            C1977lA c1977lA = (C1977lA) obj;
        } else {
            if (43 != i) {
                return false;
            }
            C2744zq c2744zq = (C2744zq) obj;
            m4818g(0, c2744zq);
            this.f1771j = c2744zq;
            synchronized (this) {
                this.f2637d |= 1;
            }
            m2861Q(43);
            m4816I();
        }
        return true;
    }
}
