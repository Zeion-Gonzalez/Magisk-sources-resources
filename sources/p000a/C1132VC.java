package p000a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.topjohnwu.magisk.R;
import java.util.WeakHashMap;

/* renamed from: a.VC */
/* loaded from: classes.dex */
public final class C1132VC extends AbstractC0663MY {

    /* renamed from: G */
    public final ViewOnFocusChangeListenerC1157Vf f3681G;

    /* renamed from: I */
    public AccessibilityManager f3682I;

    /* renamed from: M */
    public final C0024AR f3683M;

    /* renamed from: N */
    public final int f3684N;

    /* renamed from: Q */
    public final int f3685Q;

    /* renamed from: R */
    public boolean f3686R;

    /* renamed from: S */
    public boolean f3687S;

    /* renamed from: V */
    public boolean f3688V;

    /* renamed from: W */
    public final ViewOnClickListenerC0435IF f3689W;

    /* renamed from: k */
    public ValueAnimator f3690k;

    /* renamed from: o */
    public AutoCompleteTextView f3691o;

    /* renamed from: q */
    public ValueAnimator f3692q;

    /* renamed from: u */
    public final TimeInterpolator f3693u;

    /* renamed from: w */
    public long f3694w;

    public C1132VC(C1997lY c1997lY) {
        super(c1997lY);
        int i = 2;
        this.f3689W = new ViewOnClickListenerC0435IF(i, this);
        this.f3681G = new ViewOnFocusChangeListenerC1157Vf(this, 1);
        this.f3683M = new C0024AR(i, this);
        this.f3694w = Long.MAX_VALUE;
        this.f3685Q = AbstractC0795Op.m1831U8(c1997lY.getContext(), R.attr.motionDurationShort3, 67);
        this.f3684N = AbstractC0795Op.m1831U8(c1997lY.getContext(), R.attr.motionDurationShort3, 50);
        this.f3693u = AbstractC0795Op.m1802BO(c1997lY.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1090US.f3564z);
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: G */
    public final boolean mo1471G() {
        return this.f3688V;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: N */
    public final View.OnFocusChangeListener mo1473N() {
        return this.f3681G;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: P */
    public final int mo618P() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: Q */
    public final View.OnClickListener mo619Q() {
        return this.f3689W;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: R */
    public final void mo1474R(C1799hs c1799hs) {
        boolean z;
        boolean m3347N;
        if (this.f3691o.getInputType() != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            c1799hs.m3349W(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            m3347N = c1799hs.f5654z.isShowingHintText();
        } else {
            m3347N = c1799hs.m3347N(4);
        }
        if (m3347N) {
            c1799hs.m3346M(null);
        }
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: S */
    public final void mo620S(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f3691o = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: a.qm
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z;
                    C1132VC c1132vc = C1132VC.this;
                    c1132vc.getClass();
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - c1132vc.f3694w;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            c1132vc.f3687S = false;
                        }
                        c1132vc.m2329s();
                        c1132vc.f3687S = true;
                        c1132vc.f3694w = System.currentTimeMillis();
                    }
                    return false;
                }
            });
            this.f3691o.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: a.K2
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    C1132VC c1132vc = C1132VC.this;
                    c1132vc.f3687S = true;
                    c1132vc.f3694w = System.currentTimeMillis();
                    c1132vc.m2330y(false);
                }
            });
            boolean z = false;
            this.f3691o.setThreshold(0);
            TextInputLayout textInputLayout = this.f2152z;
            C1997lY c1997lY = textInputLayout.f9507w;
            CheckableImageButton checkableImageButton = c1997lY.f6204w;
            checkableImageButton.setImageDrawable(null);
            c1997lY.m3611M();
            AbstractC0795Op.m1850h(c1997lY.f6193S, checkableImageButton, c1997lY.f6190I, c1997lY.f6201q);
            if (editText.getInputType() != 0) {
                z = true;
            }
            if (!z && this.f3682I.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                AbstractC2397t8.m4123g(this.f2149P, 2);
            }
            textInputLayout.f9507w.m3619o(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: V */
    public final boolean mo621V() {
        return this.f3686R;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: W */
    public final boolean mo1475W(int i) {
        return i != 0;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: g */
    public final void mo622g() {
        AutoCompleteTextView autoCompleteTextView = this.f3691o;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f3691o.setOnDismissListener(null);
        }
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: k */
    public final void mo415k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f3693u;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f3685Q);
        int i = 1;
        ofFloat.addUpdateListener(new C2079n7(i, this));
        this.f3690k = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f3684N);
        ofFloat2.addUpdateListener(new C2079n7(i, this));
        this.f3692q = ofFloat2;
        ofFloat2.addListener(new C2558wC(7, this));
        this.f3682I = (AccessibilityManager) this.f2151v.getSystemService("accessibility");
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: o */
    public final InterfaceC1542d3 mo1476o() {
        return this.f3683M;
    }

    /* renamed from: s */
    public final void m2329s() {
        boolean z;
        if (this.f3691o == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f3694w;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f3687S = false;
        }
        if (!this.f3687S) {
            m2330y(!this.f3686R);
            if (this.f3686R) {
                this.f3691o.requestFocus();
                this.f3691o.showDropDown();
                return;
            } else {
                this.f3691o.dismissDropDown();
                return;
            }
        }
        this.f3687S = false;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: v */
    public final int mo624v() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: w */
    public final void mo1479w(AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (this.f3682I.isEnabled()) {
            boolean z2 = false;
            if (this.f3691o.getInputType() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (accessibilityEvent.getEventType() == 32768 && this.f3686R && !this.f3691o.isPopupShowing()) {
                    z2 = true;
                }
                if (accessibilityEvent.getEventType() == 1 || z2) {
                    m2329s();
                    this.f3687S = true;
                    this.f3694w = System.currentTimeMillis();
                }
            }
        }
    }

    /* renamed from: y */
    public final void m2330y(boolean z) {
        if (this.f3686R != z) {
            this.f3686R = z;
            this.f3690k.cancel();
            this.f3692q.start();
        }
    }

    @Override // p000a.AbstractC0663MY
    /* renamed from: z */
    public final void mo1480z() {
        boolean z;
        if (this.f3682I.isTouchExplorationEnabled()) {
            if (this.f3691o.getInputType() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && !this.f2149P.hasFocus()) {
                this.f3691o.dismissDropDown();
            }
        }
        this.f3691o.post(new RunnableC0308Fs(13, this));
    }
}
