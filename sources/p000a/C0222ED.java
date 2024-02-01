package p000a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.topjohnwu.magisk.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* renamed from: a.ED */
/* loaded from: classes.dex */
public final class C0222ED<S> extends DialogInterfaceOnCancelListenerC0137Ce {

    /* renamed from: gv */
    public static final /* synthetic */ int f711gv = 0;

    /* renamed from: EQ */
    public C2421tc f712EQ;

    /* renamed from: F3 */
    public CharSequence f713F3;

    /* renamed from: Fu */
    public int f714Fu;

    /* renamed from: KM */
    public boolean f715KM;

    /* renamed from: LN */
    public CharSequence f716LN;

    /* renamed from: M6 */
    public boolean f717M6;

    /* renamed from: Rh */
    public CharSequence f718Rh;

    /* renamed from: Ry */
    public C2292rA f719Ry;

    /* renamed from: S3 */
    public CheckableImageButton f720S3;

    /* renamed from: T0 */
    public int f721T0;

    /* renamed from: W9 */
    public TextView f722W9;

    /* renamed from: d3 */
    public final LinkedHashSet f723d3;

    /* renamed from: fH */
    public int f724fH;

    /* renamed from: fc */
    public CharSequence f725fc;

    /* renamed from: hs */
    public C2281qz f726hs;

    /* renamed from: j5 */
    public int f727j5;

    /* renamed from: nB */
    public final LinkedHashSet f728nB;

    /* renamed from: tJ */
    public AbstractC0649MD f729tJ;

    /* renamed from: yF */
    public int f730yF;

    /* renamed from: zd */
    public CharSequence f731zd;

    public C0222ED() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f728nB = new LinkedHashSet();
        this.f723d3 = new LinkedHashSet();
    }

    /* renamed from: b */
    public static boolean m428b(Context context) {
        return m430nP(context, 16843277);
    }

    /* renamed from: l */
    public static int m429l(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar m4587v = AbstractC2674yV.m4587v();
        m4587v.set(5, 1);
        Calendar m4586h = AbstractC2674yV.m4586h(m4587v);
        m4586h.get(2);
        m4586h.get(1);
        int maximum = m4586h.getMaximum(7);
        m4586h.getActualMaximum(5);
        m4586h.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: nP */
    public static boolean m430nP(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0795Op.m1851he(context, R.attr.materialCalendarStyle, C2292rA.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0137Ce, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: F */
    public final void mo279F(Bundle bundle) {
        C0307Fr c0307Fr;
        C0307Fr m650P;
        super.mo279F(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f730yF);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0218E8 c0218e8 = new C0218E8(this.f712EQ);
        C2292rA c2292rA = this.f719Ry;
        if (c2292rA == null) {
            c0307Fr = null;
        } else {
            c0307Fr = c2292rA.f7077BO;
        }
        if (c0307Fr != null) {
            c0218e8.f689v = Long.valueOf(c0307Fr.f1060k);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0218e8.f686N);
        C0307Fr m650P2 = C0307Fr.m650P(c0218e8.f690z);
        C0307Fr m650P3 = C0307Fr.m650P(c0218e8.f688h);
        InterfaceC0899Qx interfaceC0899Qx = (InterfaceC0899Qx) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = c0218e8.f689v;
        if (l == null) {
            m650P = null;
        } else {
            m650P = C0307Fr.m650P(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C2421tc(m650P2, m650P3, interfaceC0899Qx, m650P, c0218e8.f687P));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f714Fu);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f718Rh);
        bundle.putInt("INPUT_MODE_KEY", this.f721T0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f727j5);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f731zd);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f724fH);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f716LN);
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0137Ce
    /* renamed from: K */
    public final Dialog mo282K() {
        Context m4004O = m4004O();
        m4004O();
        int i = this.f730yF;
        if (i != 0) {
            Dialog dialog = new Dialog(m4004O, i);
            Context context = dialog.getContext();
            this.f717M6 = m428b(context);
            this.f726hs = new C2281qz(context, null, R.attr.materialCalendarStyle, 2131952719);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0863Q8.f2939k, R.attr.materialCalendarStyle, 2131952719);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.f726hs.m3930M(context);
            this.f726hs.m3934R(ColorStateList.valueOf(color));
            C2281qz c2281qz = this.f726hs;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            c2281qz.m3935S(AbstractC1548d9.m3005W(decorView));
            return dialog;
        }
        m432m();
        throw null;
    }

    @Override // p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Y */
    public final View mo431Y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        boolean z;
        int i2;
        if (this.f717M6) {
            i = R.layout.mtrl_picker_fullscreen;
        } else {
            i = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f717M6) {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(m429l(context), -2);
        } else {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(m429l(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC1285Y3.m2632Q(textView, 1);
        this.f720S3 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f722W9 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f720S3.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f720S3;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, AbstractC1843ih.m3431X(context, R.drawable.material_ic_calendar_black_24dp));
        int i3 = 0;
        stateListDrawable.addState(new int[0], AbstractC1843ih.m3431X(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.f720S3;
        if (this.f721T0 != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton2.setChecked(z);
        AbstractC2446u3.m4221V(this.f720S3, null);
        CheckableImageButton checkableImageButton3 = this.f720S3;
        int i4 = this.f721T0;
        Context context2 = checkableImageButton3.getContext();
        if (i4 == 1) {
            i2 = R.string.mtrl_picker_toggle_to_calendar_input_mode;
        } else {
            i2 = R.string.mtrl_picker_toggle_to_text_input_mode;
        }
        this.f720S3.setContentDescription(context2.getString(i2));
        this.f720S3.setOnClickListener(new ViewOnClickListenerC0435IF(i3, this));
        Button button = (Button) inflate.findViewById(R.id.confirm_button);
        m432m();
        throw null;
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0137Ce, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: Z */
    public final void mo285Z() {
        CharSequence charSequence;
        Integer num;
        boolean z;
        int i;
        boolean z2;
        C1665fK c1160Vj;
        boolean z3;
        C1665fK c1160Vj2;
        super.mo285Z();
        Window window = m278D().getWindow();
        boolean z4 = false;
        if (this.f717M6) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f726hs);
            if (!this.f715KM) {
                View findViewById = m4013n().findViewById(R.id.fullscreen_header);
                if (findViewById.getBackground() instanceof ColorDrawable) {
                    num = Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor());
                } else {
                    num = null;
                }
                int i2 = Build.VERSION.SDK_INT;
                if (num != null && num.intValue() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                int m1836Y = AbstractC0795Op.m1836Y(window.getContext(), 16842801, -16777216);
                if (z) {
                    num = Integer.valueOf(m1836Y);
                }
                Integer valueOf = Integer.valueOf(m1836Y);
                if (i2 >= 30) {
                    AbstractC1763h7.m3292z(window, false);
                } else {
                    AbstractC0456Ie.m1092z(window, false);
                }
                window.getContext();
                Context context = window.getContext();
                if (i2 < 27) {
                    i = AbstractC0106C4.m229v(AbstractC0795Op.m1836Y(context, 16843858, -16777216), 128);
                } else {
                    i = 0;
                }
                window.setStatusBarColor(0);
                window.setNavigationBarColor(i);
                boolean m1818L = AbstractC0795Op.m1818L(num.intValue());
                if (!AbstractC0795Op.m1818L(0) && !m1818L) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C2196pM c2196pM = new C2196pM(window.getDecorView(), 10);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 30) {
                    c1160Vj = new C2725zQ(window, c2196pM);
                } else if (i3 >= 26) {
                    c1160Vj = new C0077BU(window, c2196pM);
                } else {
                    c1160Vj = new C1160Vj(window, c2196pM);
                }
                c1160Vj.mo2374E(z2);
                boolean m1818L2 = AbstractC0795Op.m1818L(valueOf.intValue());
                if (!AbstractC0795Op.m1818L(i) && (i != 0 || !m1818L2)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                C2196pM c2196pM2 = new C2196pM(window.getDecorView(), 10);
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 30) {
                    c1160Vj2 = new C2725zQ(window, c2196pM2);
                } else if (i4 >= 26) {
                    c1160Vj2 = new C0077BU(window, c2196pM2);
                } else {
                    c1160Vj2 = new C1160Vj(window, c2196pM2);
                }
                c1160Vj2.mo159U(z3);
                C1101Ue c1101Ue = new C1101Ue(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                AbstractC1548d9.m3014s(findViewById, c1101Ue);
                this.f715KM = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m4018w().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f726hs, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC0762OE(m278D(), rect));
        }
        m4004O();
        int i5 = this.f730yF;
        if (i5 != 0) {
            m432m();
            C2421tc c2421tc = this.f712EQ;
            C2292rA c2292rA = new C2292rA();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", i5);
            bundle.putParcelable("GRID_SELECTOR_KEY", null);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c2421tc);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
            bundle.putParcelable("CURRENT_MONTH_KEY", c2421tc.f7410I);
            c2292rA.m4017t(bundle);
            this.f719Ry = c2292rA;
            AbstractC0649MD abstractC0649MD = c2292rA;
            if (this.f721T0 == 1) {
                m432m();
                C2421tc c2421tc2 = this.f712EQ;
                AbstractC0649MD c2314rZ = new C2314rZ();
                Bundle bundle2 = new Bundle();
                bundle2.putInt("THEME_RES_ID_KEY", i5);
                bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c2421tc2);
                c2314rZ.m4017t(bundle2);
                abstractC0649MD = c2314rZ;
            }
            this.f729tJ = abstractC0649MD;
            TextView textView = this.f722W9;
            if (this.f721T0 == 1) {
                if (m4018w().getConfiguration().orientation == 2) {
                    z4 = true;
                }
                if (z4) {
                    charSequence = this.f713F3;
                    textView.setText(charSequence);
                    m432m();
                    m4003M();
                    throw null;
                }
            }
            charSequence = this.f725fc;
            textView.setText(charSequence);
            m432m();
            m4003M();
            throw null;
        }
        m432m();
        throw null;
    }

    /* renamed from: m */
    public final void m432m() {
        AbstractC2441tz.m4185I(this.f7210k.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0137Ce, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f728nB.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0137Ce, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f723d3.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f7222t;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0137Ce, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: p */
    public final void mo289p() {
        this.f729tJ.f2087n0.clear();
        super.mo289p();
    }

    @Override // p000a.DialogInterfaceOnCancelListenerC0137Ce, p000a.AbstractComponentCallbacksC2342s3
    /* renamed from: r */
    public final void mo290r(Bundle bundle) {
        super.mo290r(bundle);
        if (bundle == null) {
            bundle = this.f7210k;
        }
        this.f730yF = bundle.getInt("OVERRIDE_THEME_RES_ID");
        AbstractC2441tz.m4185I(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f712EQ = (C2421tc) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC2441tz.m4185I(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f714Fu = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f718Rh = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f721T0 = bundle.getInt("INPUT_MODE_KEY");
        this.f727j5 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f731zd = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f724fH = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f716LN = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f718Rh;
        if (charSequence == null) {
            charSequence = m4004O().getResources().getText(this.f714Fu);
        }
        this.f725fc = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f713F3 = charSequence;
    }
}
