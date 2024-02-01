package p000a;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.topjohnwu.magisk.R;

/* renamed from: a.Fb */
/* loaded from: classes.dex */
public final class C0294Fb extends AbstractC0663MY {

    /* renamed from: N */
    public final int f1022N;

    /* renamed from: Q */
    public EditText f1023Q;

    /* renamed from: u */
    public final ViewOnClickListenerC0435IF f1024u;

    public C0294Fb(C1997lY c1997lY, int i) {
        super(c1997lY);
        this.f1022N = R.drawable.design_password_eye;
        this.f1024u = new ViewOnClickListenerC0435IF(3, this);
        if (i != 0) {
            this.f1022N = i;
        }
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: M */
    public final boolean mo617M() {
        return true;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: P */
    public final int mo618P() {
        return this.f1022N;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: Q */
    public final View.OnClickListener mo619Q() {
        return this.f1024u;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: S */
    public final void mo620S(EditText editText) {
        this.f1023Q = editText;
        m1477q();
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: V */
    public final boolean mo621V() {
        boolean z;
        EditText editText = this.f1023Q;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: g */
    public final void mo622g() {
        EditText editText = this.f1023Q;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: h */
    public final void mo623h() {
        m1477q();
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: k */
    public final void mo415k() {
        boolean z;
        EditText editText = this.f1023Q;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f1023Q.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: v */
    public final int mo624v() {
        return R.string.password_toggle_content_description;
    }
}
