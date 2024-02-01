package p000a;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.AbstractC2760z;
import com.topjohnwu.magisk.R;

/* renamed from: a.cS */
/* loaded from: classes.dex */
public final class C1510cS extends AbstractC0627Ln implements InterfaceC1221Wo {

    /* renamed from: O */
    public long f4666O;

    /* renamed from: d */
    public final ViewOnClickListenerC0574Kl f4667d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1510cS(View view) {
        super(null, view, 0, (TextView) AbstractC2760z.m4814S(view, 1, null, null)[0]);
        int i = 1;
        this.f4666O = -1L;
        this.f2039j.setTag(null);
        view.setTag(R.id.dataBinding, this);
        this.f4667d = new ViewOnClickListenerC0574Kl(i, i, this);
        mo14M();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: G */
    public final boolean mo13G() {
        synchronized (this) {
            return this.f4666O != 0;
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: M */
    public final void mo14M() {
        synchronized (this) {
            this.f4666O = 4L;
        }
        m4816I();
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: N */
    public final void mo15N() {
        long j;
        CharSequence charSequence;
        synchronized (this) {
            j = this.f4666O;
            this.f4666O = 0L;
        }
        C1950ki c1950ki = (C1950ki) this.f2037L;
        long j2 = 5 & j;
        if (j2 != 0 && c1950ki != null) {
            charSequence = c1950ki.f6042S;
        } else {
            charSequence = null;
        }
        if ((j & 4) != 0) {
            this.f2039j.setOnClickListener(this.f4667d);
        }
        if (j2 != 0) {
            AbstractC1843ih.m3398BO(this.f2039j, charSequence);
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: R */
    public final boolean mo16R(int i, int i2, Object obj) {
        return false;
    }

    @Override // p000a.InterfaceC1221Wo
    /* renamed from: h */
    public final void mo18h(View view, int i) {
        boolean z;
        C1950ki c1950ki = (C1950ki) this.f2037L;
        InterfaceC1814iB interfaceC1814iB = (InterfaceC1814iB) this.f2038i;
        boolean z2 = true;
        if (interfaceC1814iB != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (c1950ki == null) {
                z2 = false;
            }
            if (z2) {
                interfaceC1814iB.mo1964z(c1950ki.f6041R);
            }
        }
    }

    @Override // androidx.databinding.AbstractC2760z
    /* renamed from: k */
    public final boolean mo19k(int i, Object obj) {
        if (20 == i) {
            this.f2037L = (C1950ki) obj;
            synchronized (this) {
                this.f4666O |= 1;
            }
            m2861Q(20);
            m4816I();
        } else if (21 == i) {
            m2928s((InterfaceC1814iB) obj);
        } else {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    public final void m2928s(InterfaceC1814iB interfaceC1814iB) {
        this.f2038i = interfaceC1814iB;
        synchronized (this) {
            this.f4666O |= 2;
        }
        m2861Q(21);
        m4816I();
    }
}
