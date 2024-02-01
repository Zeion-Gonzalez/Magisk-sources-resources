package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;
import com.topjohnwu.magisk.R;

/* renamed from: a.u1 */
/* loaded from: classes.dex */
public final class C2444u1 {

    /* renamed from: G */
    public CharSequence f7468G;

    /* renamed from: M */
    public Window.Callback f7469M;

    /* renamed from: N */
    public Drawable f7470N;

    /* renamed from: P */
    public Drawable f7471P;

    /* renamed from: Q */
    public Drawable f7472Q;

    /* renamed from: R */
    public int f7473R;

    /* renamed from: S */
    public C2192pI f7474S;

    /* renamed from: V */
    public boolean f7475V;

    /* renamed from: W */
    public CharSequence f7476W;

    /* renamed from: h */
    public int f7477h;

    /* renamed from: o */
    public CharSequence f7478o;

    /* renamed from: u */
    public boolean f7479u;

    /* renamed from: v */
    public View f7480v;

    /* renamed from: w */
    public Drawable f7481w;

    /* renamed from: z */
    public final Toolbar f7482z;

    public C2444u1(Toolbar toolbar, boolean z) {
        boolean z2;
        CharSequence charSequence;
        String string;
        Drawable drawable;
        this.f7473R = 0;
        this.f7482z = toolbar;
        CharSequence charSequence2 = toolbar.f8840d;
        this.f7478o = charSequence2;
        this.f7476W = toolbar.f8830O;
        if (charSequence2 != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f7479u = z2;
        this.f7472Q = toolbar.m4742V();
        C2709z9 m4639S = C2709z9.m4639S(toolbar.getContext(), null, AbstractC0483J5.f1626z, R.attr.actionBarStyle);
        int i = 15;
        this.f7481w = m4639S.m4642N(15);
        if (z) {
            CharSequence m4641M = m4639S.m4641M(27);
            if (!TextUtils.isEmpty(m4641M)) {
                this.f7479u = true;
                this.f7478o = m4641M;
                if ((this.f7477h & 8) != 0) {
                    toolbar.m4744Y(m4641M);
                    if (this.f7479u) {
                        AbstractC2446u3.m4220S(toolbar.getRootView(), m4641M);
                    }
                }
            }
            CharSequence m4641M2 = m4639S.m4641M(25);
            if (!TextUtils.isEmpty(m4641M2)) {
                m4211h(m4641M2);
            }
            Drawable m4642N = m4639S.m4642N(20);
            if (m4642N != null) {
                this.f7470N = m4642N;
                m4210P();
            }
            Drawable m4642N2 = m4639S.m4642N(17);
            if (m4642N2 != null) {
                this.f7471P = m4642N2;
                m4210P();
            }
            if (this.f7472Q == null && (drawable = this.f7481w) != null) {
                this.f7472Q = drawable;
                toolbar.mo4746f((this.f7477h & 4) == 0 ? null : drawable);
            }
            m4213z(m4639S.m4648o(10, 0));
            int m4646W = m4639S.m4646W(9, 0);
            if (m4646W != 0) {
                View inflate = LayoutInflater.from(toolbar.getContext()).inflate(m4646W, (ViewGroup) toolbar, false);
                View view = this.f7480v;
                if (view != null && (this.f7477h & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.f7480v = inflate;
                if (inflate != null && (this.f7477h & 16) != 0) {
                    toolbar.addView(inflate);
                }
                m4213z(this.f7477h | 16);
            }
            int layoutDimension = ((TypedArray) m4639S.f8534h).getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int m4650v = m4639S.m4650v(7, -1);
            int m4650v2 = m4639S.m4650v(3, -1);
            if (m4650v >= 0 || m4650v2 >= 0) {
                int max = Math.max(m4650v, 0);
                int max2 = Math.max(m4650v2, 0);
                if (toolbar.f8854p == null) {
                    toolbar.f8854p = new C1972l5();
                }
                toolbar.f8854p.m3585z(max, max2);
            }
            int m4646W2 = m4639S.m4646W(28, 0);
            if (m4646W2 != 0) {
                Context context = toolbar.getContext();
                toolbar.f8842f = m4646W2;
                C0610LT c0610lt = toolbar.f8831R;
                if (c0610lt != null) {
                    c0610lt.setTextAppearance(context, m4646W2);
                }
            }
            int m4646W3 = m4639S.m4646W(26, 0);
            if (m4646W3 != 0) {
                Context context2 = toolbar.getContext();
                toolbar.f8857r = m4646W3;
                C0610LT c0610lt2 = toolbar.f8860w;
                if (c0610lt2 != null) {
                    c0610lt2.setTextAppearance(context2, m4646W3);
                }
            }
            int m4646W4 = m4639S.m4646W(22, 0);
            if (m4646W4 != 0 && toolbar.f8821E != m4646W4) {
                toolbar.f8821E = m4646W4;
                if (m4646W4 == 0) {
                    toolbar.f8834U = toolbar.getContext();
                } else {
                    toolbar.f8834U = new ContextThemeWrapper(toolbar.getContext(), m4646W4);
                }
            }
        } else {
            if (toolbar.m4742V() != null) {
                this.f7481w = toolbar.m4742V();
            } else {
                i = 11;
            }
            this.f7477h = i;
        }
        m4639S.m4651w();
        if (R.string.abc_action_bar_up_description != this.f7473R) {
            this.f7473R = R.string.abc_action_bar_up_description;
            C2543vs c2543vs = toolbar.f8826I;
            if (c2543vs != null) {
                charSequence = c2543vs.getContentDescription();
            } else {
                charSequence = null;
            }
            if (TextUtils.isEmpty(charSequence)) {
                int i2 = this.f7473R;
                if (i2 == 0) {
                    string = null;
                } else {
                    string = toolbar.getContext().getString(i2);
                }
                this.f7468G = string;
                m4212v();
            }
        }
        C2543vs c2543vs2 = toolbar.f8826I;
        this.f7468G = c2543vs2 != null ? c2543vs2.getContentDescription() : null;
        ViewOnClickListenerC0580Ks viewOnClickListenerC0580Ks = new ViewOnClickListenerC0580Ks(this);
        toolbar.m4738P();
        toolbar.f8826I.setOnClickListener(viewOnClickListenerC0580Ks);
    }

    /* renamed from: P */
    public final void m4210P() {
        Drawable drawable;
        int i = this.f7477h;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.f7470N) == null) {
            drawable = this.f7471P;
        }
        this.f7482z.m4741U(drawable);
    }

    /* renamed from: h */
    public final void m4211h(CharSequence charSequence) {
        this.f7476W = charSequence;
        if ((this.f7477h & 8) != 0) {
            this.f7482z.m4752r(charSequence);
        }
    }

    /* renamed from: v */
    public final void m4212v() {
        CharSequence charSequence;
        if ((this.f7477h & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f7468G);
            Toolbar toolbar = this.f7482z;
            if (isEmpty) {
                int i = this.f7473R;
                if (i != 0) {
                    charSequence = toolbar.getContext().getText(i);
                } else {
                    charSequence = null;
                }
                toolbar.m4734E(charSequence);
                return;
            }
            toolbar.m4734E(this.f7468G);
        }
    }

    /* renamed from: z */
    public final void m4213z(int i) {
        View view;
        Drawable drawable;
        int i2 = this.f7477h ^ i;
        this.f7477h = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            CharSequence charSequence = null;
            Toolbar toolbar = this.f7482z;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    m4212v();
                }
                if ((this.f7477h & 4) != 0) {
                    drawable = this.f7472Q;
                    if (drawable == null) {
                        drawable = this.f7481w;
                    }
                } else {
                    drawable = null;
                }
                toolbar.mo4746f(drawable);
            }
            if ((i2 & 3) != 0) {
                m4210P();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.m4744Y(this.f7478o);
                    charSequence = this.f7476W;
                } else {
                    toolbar.m4744Y(null);
                }
                toolbar.m4752r(charSequence);
            }
            if ((i2 & 16) != 0 && (view = this.f7480v) != null) {
                if ((i & 16) != 0) {
                    toolbar.addView(view);
                } else {
                    toolbar.removeView(view);
                }
            }
        }
    }
}
