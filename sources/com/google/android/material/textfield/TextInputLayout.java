package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p000a.AbstractC0106C4;
import p000a.AbstractC0151Cx;
import p000a.AbstractC0235ET;
import p000a.AbstractC0293FZ;
import p000a.AbstractC0690N3;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC0865QC;
import p000a.AbstractC0990Sa;
import p000a.AbstractC1090US;
import p000a.AbstractC1285Y3;
import p000a.AbstractC1375Zj;
import p000a.AbstractC1500cH;
import p000a.AbstractC1888jY;
import p000a.AbstractC2204pW;
import p000a.AbstractC2299rI;
import p000a.AbstractC2397t8;
import p000a.AbstractC2446u3;
import p000a.AbstractC2505vA;
import p000a.AbstractC2575wW;
import p000a.C0001A1;
import p000a.C0021AO;
import p000a.C0099Bw;
import p000a.C0446IU;
import p000a.C0610LT;
import p000a.C0678Mp;
import p000a.C0970SD;
import p000a.C1012T;
import p000a.C1142VM;
import p000a.C1194WK;
import p000a.C1436ax;
import p000a.C1447b9;
import p000a.C1480br;
import p000a.C1691fn;
import p000a.C1726gW;
import p000a.C1893je;
import p000a.C1926kD;
import p000a.C1982lH;
import p000a.C1997lY;
import p000a.C2196pM;
import p000a.C2281qz;
import p000a.C2308rR;
import p000a.C2414tT;
import p000a.C2426ti;
import p000a.C2581we;
import p000a.C2709z9;
import p000a.InterfaceC1722gQ;
import p000a.RunnableC1637em;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: S3 */
    public static final int[][] f9438S3 = {new int[]{16842919}, new int[0]};

    /* renamed from: B */
    public CharSequence f9439B;

    /* renamed from: BO */
    public int f9440BO;

    /* renamed from: BX */
    public Drawable f9441BX;

    /* renamed from: C */
    public boolean f9442C;

    /* renamed from: D */
    public C2281qz f9443D;

    /* renamed from: E */
    public boolean f9444E;

    /* renamed from: EC */
    public final int f9445EC;

    /* renamed from: EQ */
    public final int f9446EQ;

    /* renamed from: F */
    public CharSequence f9447F;

    /* renamed from: Fu */
    public final int f9448Fu;

    /* renamed from: G5 */
    public int f9449G5;

    /* renamed from: H */
    public int f9450H;

    /* renamed from: HL */
    public boolean f9451HL;

    /* renamed from: Ha */
    public int f9452Ha;

    /* renamed from: I */
    public EditText f9453I;

    /* renamed from: J */
    public final C1447b9 f9454J;

    /* renamed from: K */
    public boolean f9455K;

    /* renamed from: L */
    public int f9456L;

    /* renamed from: LN */
    public boolean f9457LN;

    /* renamed from: Lq */
    public ColorDrawable f9458Lq;

    /* renamed from: M6 */
    public boolean f9459M6;

    /* renamed from: O */
    public ColorStateList f9460O;

    /* renamed from: O4 */
    public int f9461O4;

    /* renamed from: Pm */
    public final LinkedHashSet f9462Pm;

    /* renamed from: R */
    public final C1436ax f9463R;

    /* renamed from: Rh */
    public int f9464Rh;

    /* renamed from: Ry */
    public final int f9465Ry;

    /* renamed from: S */
    public final FrameLayout f9466S;

    /* renamed from: T */
    public final ColorStateList f9467T;

    /* renamed from: T0 */
    public final C0001A1 f9468T0;

    /* renamed from: U */
    public final C0446IU f9469U;

    /* renamed from: U8 */
    public int f9470U8;

    /* renamed from: UZ */
    public int f9471UZ;

    /* renamed from: W9 */
    public boolean f9472W9;

    /* renamed from: Yd */
    public C2281qz f9473Yd;

    /* renamed from: ZH */
    public final RectF f9474ZH;

    /* renamed from: b */
    public boolean f9475b;

    /* renamed from: c */
    public C0610LT f9476c;

    /* renamed from: d */
    public C1142VM f9477d;

    /* renamed from: d2 */
    public ColorStateList f9478d2;

    /* renamed from: d3 */
    public int f9479d3;

    /* renamed from: dG */
    public ColorStateList f9480dG;

    /* renamed from: dx */
    public final Rect f9481dx;

    /* renamed from: e */
    public int f9482e;

    /* renamed from: f */
    public int f9483f;

    /* renamed from: fH */
    public ValueAnimator f9484fH;

    /* renamed from: g */
    public int f9485g;

    /* renamed from: he */
    public final Rect f9486he;

    /* renamed from: i */
    public C1142VM f9487i;

    /* renamed from: j */
    public ColorStateList f9488j;

    /* renamed from: j5 */
    public final boolean f9489j5;

    /* renamed from: k */
    public int f9490k;

    /* renamed from: l */
    public StateListDrawable f9491l;

    /* renamed from: m */
    public C2281qz f9492m;

    /* renamed from: n */
    public ColorStateList f9493n;

    /* renamed from: n0 */
    public final int f9494n0;

    /* renamed from: nB */
    public int f9495nB;

    /* renamed from: nF */
    public int f9496nF;

    /* renamed from: nP */
    public C2281qz f9497nP;

    /* renamed from: oI */
    public ColorDrawable f9498oI;

    /* renamed from: od */
    public final int f9499od;

    /* renamed from: p */
    public C0610LT f9500p;

    /* renamed from: q */
    public CharSequence f9501q;

    /* renamed from: qn */
    public C0099Bw f9502qn;

    /* renamed from: r */
    public boolean f9503r;

    /* renamed from: s */
    public int f9504s;

    /* renamed from: t */
    public final boolean f9505t;

    /* renamed from: tJ */
    public final int f9506tJ;

    /* renamed from: w */
    public final C1997lY f9507w;

    /* renamed from: x */
    public final ColorStateList f9508x;

    /* renamed from: y */
    public int f9509y;

    /* renamed from: yF */
    public ColorStateList f9510yF;

    /* renamed from: zd */
    public final boolean f9511zd;

    /* renamed from: zx */
    public int f9512zx;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v108 */
    /* JADX WARN: Type inference failed for: r3v123 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37, types: [int, boolean] */
    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.textInputStyle, 2131952501), attributeSet, R.attr.textInputStyle);
        int i;
        ?? r3;
        Editable text;
        ColorStateList m4647h;
        ColorStateList m4647h2;
        ColorStateList m4647h3;
        ColorStateList m4647h4;
        boolean z;
        Editable text2;
        ColorStateList m1841c;
        int defaultColor;
        this.f9490k = -1;
        this.f9485g = -1;
        this.f9509y = -1;
        this.f9504s = -1;
        C0446IU c0446iu = new C0446IU(this);
        this.f9469U = c0446iu;
        this.f9454J = new C1447b9(1);
        this.f9486he = new Rect();
        this.f9481dx = new Rect();
        this.f9474ZH = new RectF();
        this.f9462Pm = new LinkedHashSet();
        C0001A1 c0001a1 = new C0001A1(this);
        this.f9468T0 = c0001a1;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f9466S = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC1090US.f3564z;
        c0001a1.f19T = linearInterpolator;
        c0001a1.m10o(false);
        c0001a1.f54x = linearInterpolator;
        c0001a1.m10o(false);
        if (c0001a1.f51u != 8388659) {
            c0001a1.f51u = 8388659;
            c0001a1.m10o(false);
        }
        C2709z9 m1805D = AbstractC0795Op.m1805D(context2, attributeSet, AbstractC0863Q8.f2919L, R.attr.textInputStyle, 2131952501, 22, 20, 40, 45, 49);
        C1436ax c1436ax = new C1436ax(this, m1805D);
        this.f9463R = c1436ax;
        this.f9505t = m1805D.m4652z(48, true);
        m5089R(m1805D.m4641M(4));
        this.f9511zd = m1805D.m4652z(47, true);
        this.f9489j5 = m1805D.m4652z(42, true);
        if (m1805D.m4645V(6)) {
            int m4648o = m1805D.m4648o(6, -1);
            this.f9490k = m4648o;
            EditText editText = this.f9453I;
            if (editText != null && m4648o != -1) {
                editText.setMinEms(m4648o);
            }
        } else if (m1805D.m4645V(3)) {
            int m4643P = m1805D.m4643P(3, -1);
            this.f9509y = m4643P;
            EditText editText2 = this.f9453I;
            if (editText2 != null && m4643P != -1) {
                editText2.setMinWidth(m4643P);
            }
        }
        if (m1805D.m4645V(5)) {
            int m4648o2 = m1805D.m4648o(5, -1);
            this.f9485g = m4648o2;
            EditText editText3 = this.f9453I;
            if (editText3 != null && m4648o2 != -1) {
                editText3.setMaxEms(m4648o2);
            }
        } else if (m1805D.m4645V(2)) {
            int m4643P2 = m1805D.m4643P(2, -1);
            this.f9504s = m4643P2;
            EditText editText4 = this.f9453I;
            if (editText4 != null && m4643P2 != -1) {
                editText4.setMaxWidth(m4643P2);
            }
        }
        this.f9502qn = new C0099Bw(C0099Bw.m208h(context2, attributeSet, R.attr.textInputStyle, 2131952501));
        this.f9499od = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f9512zx = m1805D.m4650v(9, 0);
        int m4643P3 = m1805D.m4643P(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f9494n0 = m4643P3;
        this.f9445EC = m1805D.m4643P(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f9471UZ = m4643P3;
        Object obj = m1805D.f8534h;
        float dimension = ((TypedArray) obj).getDimension(13, -1.0f);
        float dimension2 = ((TypedArray) obj).getDimension(12, -1.0f);
        float dimension3 = ((TypedArray) obj).getDimension(10, -1.0f);
        float dimension4 = ((TypedArray) obj).getDimension(11, -1.0f);
        C0099Bw c0099Bw = this.f9502qn;
        c0099Bw.getClass();
        C0021AO c0021ao = new C0021AO(c0099Bw);
        if (dimension >= 0.0f) {
            c0021ao.f130N = new C1012T(dimension);
        }
        if (dimension2 >= 0.0f) {
            c0021ao.f132Q = new C1012T(dimension2);
        }
        if (dimension3 >= 0.0f) {
            c0021ao.f137u = new C1012T(dimension3);
        }
        if (dimension4 >= 0.0f) {
            c0021ao.f136o = new C1012T(dimension4);
        }
        this.f9502qn = new C0099Bw(c0021ao);
        ColorStateList m1841c2 = AbstractC0795Op.m1841c(context2, m1805D, 7);
        if (m1841c2 != null) {
            int defaultColor2 = m1841c2.getDefaultColor();
            this.f9506tJ = defaultColor2;
            this.f9440BO = defaultColor2;
            if (m1841c2.isStateful()) {
                this.f9446EQ = m1841c2.getColorForState(new int[]{-16842910}, -1);
                this.f9465Ry = m1841c2.getColorForState(new int[]{16842908, 16842910}, -1);
                i = m1841c2.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f9465Ry = defaultColor2;
                ColorStateList m1999h = AbstractC0865QC.m1999h(context2, R.color.mtrl_filled_background_color);
                this.f9446EQ = m1999h.getColorForState(new int[]{-16842910}, -1);
                i = m1999h.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            i = 0;
            this.f9440BO = 0;
            this.f9506tJ = 0;
            this.f9446EQ = 0;
            this.f9465Ry = 0;
        }
        this.f9448Fu = i;
        if (m1805D.m4645V(1)) {
            ColorStateList m4647h5 = m1805D.m4647h(1);
            this.f9480dG = m4647h5;
            this.f9478d2 = m4647h5;
        }
        ColorStateList m1841c3 = AbstractC0795Op.m1841c(context2, m1805D, 14);
        this.f9479d3 = ((TypedArray) obj).getColor(14, 0);
        Object obj2 = AbstractC0865QC.f2950z;
        this.f9461O4 = AbstractC1375Zj.m2772z(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f9464Rh = AbstractC1375Zj.m2772z(context2, R.color.mtrl_textinput_disabled_color);
        this.f9495nB = AbstractC1375Zj.m2772z(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (m1841c3 != null) {
            if (m1841c3.isStateful()) {
                this.f9461O4 = m1841c3.getDefaultColor();
                this.f9464Rh = m1841c3.getColorForState(new int[]{-16842910}, -1);
                this.f9495nB = m1841c3.getColorForState(new int[]{16843623, 16842910}, -1);
                defaultColor = m1841c3.getColorForState(new int[]{16842908, 16842910}, -1);
            } else {
                defaultColor = this.f9479d3 != m1841c3.getDefaultColor() ? m1841c3.getDefaultColor() : defaultColor;
                m5095c();
            }
            this.f9479d3 = defaultColor;
            m5095c();
        }
        if (m1805D.m4645V(15) && this.f9510yF != (m1841c = AbstractC0795Op.m1841c(context2, m1805D, 15))) {
            this.f9510yF = m1841c;
            m5095c();
        }
        int i2 = 24;
        if (m1805D.m4646W(49, -1) != -1) {
            int m4646W = m1805D.m4646W(49, 0);
            View view = c0001a1.f56z;
            C1726gW c1726gW = new C1726gW(view.getContext(), m4646W);
            ColorStateList colorStateList = c1726gW.f5433G;
            if (colorStateList != null) {
                c0001a1.f12M = colorStateList;
            }
            float f = c1726gW.f5434M;
            if (f != 0.0f) {
                c0001a1.f23W = f;
            }
            ColorStateList colorStateList2 = c1726gW.f5446z;
            if (colorStateList2 != null) {
                c0001a1.f2D = colorStateList2;
            }
            c0001a1.f0B = c1726gW.f5435N;
            c0001a1.f10K = c1726gW.f5437Q;
            c0001a1.f50t = c1726gW.f5444u;
            c0001a1.f39m = c1726gW.f5441W;
            C1926kD c1926kD = c0001a1.f48r;
            if (c1926kD != null) {
                c1926kD.f5989I = true;
            }
            C2196pM c2196pM = new C2196pM(i2, c0001a1);
            c1726gW.m3263z();
            c0001a1.f48r = new C1926kD(c2196pM, c1726gW.f5438R);
            c1726gW.m3262v(view.getContext(), c0001a1.f48r);
            r3 = 0;
            r3 = 0;
            c0001a1.m10o(false);
            this.f9480dG = c0001a1.f12M;
            if (this.f9453I != null) {
                m5102r(false, false);
                m5096f();
            }
        } else {
            r3 = 0;
        }
        this.f9508x = m1805D.m4647h(24);
        this.f9467T = m1805D.m4647h(25);
        int m4646W2 = m1805D.m4646W(40, r3);
        CharSequence m4641M = m1805D.m4641M(35);
        int m4648o3 = m1805D.m4648o(34, 1);
        boolean m4652z = m1805D.m4652z(36, r3);
        int m4646W3 = m1805D.m4646W(45, r3);
        boolean m4652z2 = m1805D.m4652z(44, r3);
        CharSequence m4641M2 = m1805D.m4641M(43);
        int m4646W4 = m1805D.m4646W(57, r3);
        CharSequence m4641M3 = m1805D.m4641M(56);
        boolean m4652z3 = m1805D.m4652z(18, r3);
        int m4648o4 = m1805D.m4648o(19, -1);
        if (this.f9483f != m4648o4) {
            this.f9483f = m4648o4 <= 0 ? -1 : m4648o4;
            if (this.f9444E && this.f9476c != null) {
                EditText editText5 = this.f9453I;
                if (editText5 == null) {
                    text2 = null;
                } else {
                    text2 = editText5.getText();
                }
                m5099k(text2);
            }
        }
        this.f9482e = m1805D.m4646W(22, 0);
        this.f9450H = m1805D.m4646W(20, 0);
        int m4648o5 = m1805D.m4648o(8, 0);
        if (m4648o5 != this.f9496nF) {
            this.f9496nF = m4648o5;
            if (this.f9453I != null) {
                m5100o();
            }
        }
        c0446iu.f1504g = m4641M;
        C0610LT c0610lt = c0446iu.f1506k;
        if (c0610lt != null) {
            c0610lt.setContentDescription(m4641M);
        }
        c0446iu.f1514y = m4648o3;
        C0610LT c0610lt2 = c0446iu.f1506k;
        if (c0610lt2 != null) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC1285Y3.m2632Q(c0610lt2, m4648o3);
        }
        c0446iu.f1502Y = m4646W3;
        C0610LT c0610lt3 = c0446iu.f1509r;
        if (c0610lt3 != null) {
            c0610lt3.setTextAppearance(m4646W3);
        }
        c0446iu.f1510s = m4646W2;
        C0610LT c0610lt4 = c0446iu.f1506k;
        if (c0610lt4 != null) {
            c0446iu.f1507o.m5083I(c0610lt4, m4646W2);
        }
        if (this.f9500p == null) {
            C0610LT c0610lt5 = new C0610LT(getContext(), null);
            this.f9500p = c0610lt5;
            c0610lt5.setId(R.id.textinput_placeholder);
            AbstractC2397t8.m4123g(this.f9500p, 2);
            C1142VM m5087P = m5087P();
            this.f9487i = m5087P;
            m5087P.f2000R = 67L;
            this.f9477d = m5087P();
            int i3 = this.f9456L;
            this.f9456L = i3;
            C0610LT c0610lt6 = this.f9500p;
            if (c0610lt6 != null) {
                c0610lt6.setTextAppearance(i3);
            }
        }
        if (TextUtils.isEmpty(m4641M3)) {
            m5106w(false);
        } else {
            if (!this.f9442C) {
                m5106w(true);
            }
            this.f9447F = m4641M3;
        }
        EditText editText6 = this.f9453I;
        if (editText6 == null) {
            text = null;
        } else {
            text = editText6.getText();
        }
        m5094Y(text);
        this.f9456L = m4646W4;
        C0610LT c0610lt7 = this.f9500p;
        if (c0610lt7 != null) {
            c0610lt7.setTextAppearance(m4646W4);
        }
        if (m1805D.m4645V(41)) {
            ColorStateList m4647h6 = m1805D.m4647h(41);
            c0446iu.f1499U = m4647h6;
            C0610LT c0610lt8 = c0446iu.f1506k;
            if (c0610lt8 != null && m4647h6 != null) {
                c0610lt8.setTextColor(m4647h6);
            }
        }
        if (m1805D.m4645V(46)) {
            ColorStateList m4647h7 = m1805D.m4647h(46);
            c0446iu.f1492J = m4647h7;
            C0610LT c0610lt9 = c0446iu.f1509r;
            if (c0610lt9 != null && m4647h7 != null) {
                c0610lt9.setTextColor(m4647h7);
            }
        }
        if (m1805D.m4645V(50) && this.f9480dG != (m4647h4 = m1805D.m4647h(50))) {
            if (this.f9478d2 == null && c0001a1.f12M != m4647h4) {
                c0001a1.f12M = m4647h4;
                z = false;
                c0001a1.m10o(false);
            } else {
                z = false;
            }
            this.f9480dG = m4647h4;
            if (this.f9453I != null) {
                m5102r(z, z);
            }
        }
        if (m1805D.m4645V(23) && this.f9460O != (m4647h3 = m1805D.m4647h(23))) {
            this.f9460O = m4647h3;
            m5097g();
        }
        if (m1805D.m4645V(21) && this.f9493n != (m4647h2 = m1805D.m4647h(21))) {
            this.f9493n = m4647h2;
            m5097g();
        }
        if (m1805D.m4645V(58) && this.f9488j != (m4647h = m1805D.m4647h(58))) {
            this.f9488j = m4647h;
            C0610LT c0610lt10 = this.f9500p;
            if (c0610lt10 != null && m4647h != null) {
                c0610lt10.setTextColor(m4647h);
            }
        }
        C1997lY c1997lY = new C1997lY(this, m1805D);
        this.f9507w = c1997lY;
        boolean m4652z4 = m1805D.m4652z(0, true);
        m1805D.m4651w();
        AbstractC2397t8.m4123g(this, 2);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && i4 >= 26) {
            AbstractC2204pW.m3839S(this, 1);
        }
        frameLayout.addView(c1436ax);
        frameLayout.addView(c1997lY);
        addView(frameLayout);
        setEnabled(m4652z4);
        m5090S(m4652z2);
        m5092V(m4652z);
        if (this.f9444E != m4652z3) {
            if (m4652z3) {
                C0610LT c0610lt11 = new C0610LT(getContext(), null);
                this.f9476c = c0610lt11;
                c0610lt11.setId(R.id.textinput_counter);
                this.f9476c.setMaxLines(1);
                c0446iu.m1079z(this.f9476c, 2);
                AbstractC0293FZ.m613o((ViewGroup.MarginLayoutParams) this.f9476c.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                m5097g();
                if (this.f9476c != null) {
                    EditText editText7 = this.f9453I;
                    m5099k(editText7 != null ? editText7.getText() : null);
                }
            } else {
                c0446iu.m1077u(this.f9476c, 2);
                this.f9476c = null;
            }
            this.f9444E = m4652z3;
        }
        if (TextUtils.isEmpty(m4641M2)) {
            if (c0446iu.f1503f) {
                m5090S(false);
                return;
            }
            return;
        }
        if (!c0446iu.f1503f) {
            m5090S(true);
        }
        c0446iu.m1078v();
        c0446iu.f1489E = m4641M2;
        c0446iu.f1509r.setText(m4641M2);
        int i5 = c0446iu.f1497R;
        if (i5 != 2) {
            c0446iu.f1513w = 2;
        }
        c0446iu.m1074W(i5, c0446iu.f1513w, c0446iu.m1076o(c0446iu.f1509r, m4641M2));
    }

    /* renamed from: G */
    public static void m5081G(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m5081G((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: E */
    public final void m5082E() {
        Drawable drawable;
        boolean z;
        int i;
        EditText editText = this.f9453I;
        if (editText != null && this.f9443D != null) {
            if ((this.f9475b || editText.getBackground() == null) && this.f9496nF != 0) {
                EditText editText2 = this.f9453I;
                if (editText2 instanceof AutoCompleteTextView) {
                    if (editText2.getInputType() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        int m1816J = AbstractC0795Op.m1816J(this.f9453I, R.attr.colorControlHighlight);
                        int i2 = this.f9496nF;
                        int[][] iArr = f9438S3;
                        if (i2 == 2) {
                            Context context = getContext();
                            C2281qz c2281qz = this.f9443D;
                            TypedValue m1851he = AbstractC0795Op.m1851he(context, R.attr.colorSurface, "TextInputLayout");
                            int i3 = m1851he.resourceId;
                            if (i3 != 0) {
                                Object obj = AbstractC0865QC.f2950z;
                                i = AbstractC1375Zj.m2772z(context, i3);
                            } else {
                                i = m1851he.data;
                            }
                            C2281qz c2281qz2 = new C2281qz(c2281qz.f7021S.f4616z);
                            int m1829T = AbstractC0795Op.m1829T(m1816J, i, 0.1f);
                            c2281qz2.m3934R(new ColorStateList(iArr, new int[]{m1829T, 0}));
                            c2281qz2.setTint(i);
                            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m1829T, i});
                            C2281qz c2281qz3 = new C2281qz(c2281qz.f7021S.f4616z);
                            c2281qz3.setTint(-1);
                            drawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c2281qz2, c2281qz3), c2281qz});
                        } else if (i2 == 1) {
                            C2281qz c2281qz4 = this.f9443D;
                            int i4 = this.f9440BO;
                            drawable = new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0795Op.m1829T(m1816J, i4, 0.1f), i4}), c2281qz4, c2281qz4);
                        } else {
                            drawable = null;
                        }
                        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                        AbstractC2397t8.m4127q(editText2, drawable);
                        this.f9475b = true;
                    }
                }
                drawable = this.f9443D;
                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                AbstractC2397t8.m4127q(editText2, drawable);
                this.f9475b = true;
            }
        }
    }

    /* renamed from: I */
    public final void m5083I(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(2131952054);
            Context context = getContext();
            Object obj = AbstractC0865QC.f2950z;
            textView.setTextColor(AbstractC1375Zj.m2772z(context, R.color.design_error));
        }
    }

    /* renamed from: J */
    public final void m5084J(boolean z, boolean z2) {
        int defaultColor = this.f9510yF.getDefaultColor();
        int colorForState = this.f9510yF.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f9510yF.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f9470U8 = colorForState2;
        } else if (z2) {
            this.f9470U8 = colorForState;
        } else {
            this.f9470U8 = defaultColor;
        }
    }

    /* renamed from: M */
    public final void m5085M(CharSequence charSequence) {
        C0446IU c0446iu = this.f9469U;
        if (!c0446iu.f1508q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                m5092V(true);
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            c0446iu.m1078v();
            c0446iu.f1491I = charSequence;
            c0446iu.f1506k.setText(charSequence);
            int i = c0446iu.f1497R;
            if (i != 1) {
                c0446iu.f1513w = 1;
            }
            c0446iu.m1074W(i, c0446iu.f1513w, c0446iu.m1076o(c0446iu.f1506k, charSequence));
            return;
        }
        c0446iu.m1073Q();
    }

    /* renamed from: N */
    public final boolean m5086N() {
        return this.f9505t && !TextUtils.isEmpty(this.f9439B) && (this.f9443D instanceof AbstractC0990Sa);
    }

    /* renamed from: P */
    public final C1142VM m5087P() {
        C1142VM c1142vm = new C1142VM();
        c1142vm.f2014w = AbstractC0795Op.m1831U8(getContext(), R.attr.motionDurationShort2, 87);
        c1142vm.f1998I = AbstractC0795Op.m1802BO(getContext(), R.attr.motionEasingLinearInterpolator, AbstractC1090US.f3564z);
        return c1142vm;
    }

    /* renamed from: Q */
    public final C2281qz m5088Q(boolean z) {
        float f;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z) {
            f = dimensionPixelOffset2;
        } else {
            f = 0.0f;
        }
        EditText editText = this.f9453I;
        if (editText instanceof C1691fn) {
            dimensionPixelOffset = ((C1691fn) editText).f5304y;
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0021AO c0021ao = new C0021AO();
        c0021ao.f130N = new C1012T(f);
        c0021ao.f132Q = new C1012T(f);
        c0021ao.f136o = new C1012T(dimensionPixelOffset2);
        c0021ao.f137u = new C1012T(dimensionPixelOffset2);
        C0099Bw c0099Bw = new C0099Bw(c0021ao);
        EditText editText2 = this.f9453I;
        if (editText2 instanceof C1691fn) {
            colorStateList = ((C1691fn) editText2).f5303s;
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = C2281qz.f7013p;
            TypedValue m1851he = AbstractC0795Op.m1851he(context, R.attr.colorSurface, C2281qz.class.getSimpleName());
            int i2 = m1851he.resourceId;
            if (i2 != 0) {
                Object obj = AbstractC0865QC.f2950z;
                i = AbstractC1375Zj.m2772z(context, i2);
            } else {
                i = m1851he.data;
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        C2281qz c2281qz = new C2281qz();
        c2281qz.m3930M(context);
        c2281qz.m3934R(colorStateList);
        c2281qz.m3935S(dimensionPixelOffset);
        c2281qz.mo3137h(c0099Bw);
        C1480br c1480br = c2281qz.f7021S;
        if (c1480br.f4609o == null) {
            c1480br.f4609o = new Rect();
        }
        c2281qz.f7021S.f4609o.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        c2281qz.invalidateSelf();
        return c2281qz;
    }

    /* renamed from: R */
    public final void m5089R(CharSequence charSequence) {
        if (this.f9505t) {
            if (!TextUtils.equals(charSequence, this.f9439B)) {
                this.f9439B = charSequence;
                C0001A1 c0001a1 = this.f9468T0;
                if (charSequence == null || !TextUtils.equals(c0001a1.f9J, charSequence)) {
                    c0001a1.f9J = charSequence;
                    c0001a1.f29c = null;
                    Bitmap bitmap = c0001a1.f24X;
                    if (bitmap != null) {
                        bitmap.recycle();
                        c0001a1.f24X = null;
                    }
                    c0001a1.m10o(false);
                }
                if (!this.f9459M6) {
                    m5093W();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    /* renamed from: S */
    public final void m5090S(boolean z) {
        C0446IU c0446iu = this.f9469U;
        if (c0446iu.f1503f != z) {
            c0446iu.m1078v();
            if (z) {
                C0610LT c0610lt = new C0610LT(c0446iu.f1511u, null);
                c0446iu.f1509r = c0610lt;
                c0610lt.setId(R.id.textinput_helper_text);
                c0446iu.f1509r.setTextAlignment(5);
                c0446iu.f1509r.setVisibility(4);
                AbstractC1285Y3.m2632Q(c0446iu.f1509r, 1);
                int i = c0446iu.f1502Y;
                c0446iu.f1502Y = i;
                C0610LT c0610lt2 = c0446iu.f1509r;
                if (c0610lt2 != null) {
                    c0610lt2.setTextAppearance(i);
                }
                ColorStateList colorStateList = c0446iu.f1492J;
                c0446iu.f1492J = colorStateList;
                C0610LT c0610lt3 = c0446iu.f1509r;
                if (c0610lt3 != null && colorStateList != null) {
                    c0610lt3.setTextColor(colorStateList);
                }
                c0446iu.m1079z(c0446iu.f1509r, 1);
                c0446iu.f1509r.setAccessibilityDelegate(new C2426ti(c0446iu));
            } else {
                c0446iu.m1078v();
                int i2 = c0446iu.f1497R;
                if (i2 == 2) {
                    c0446iu.f1513w = 0;
                }
                c0446iu.m1074W(i2, c0446iu.f1513w, c0446iu.m1076o(c0446iu.f1509r, ""));
                c0446iu.m1077u(c0446iu.f1509r, 1);
                c0446iu.f1509r = null;
                TextInputLayout textInputLayout = c0446iu.f1507o;
                textInputLayout.m5091U();
                textInputLayout.m5095c();
            }
            c0446iu.f1503f = z;
        }
    }

    /* renamed from: U */
    public final void m5091U() {
        Drawable background;
        C0610LT c0610lt;
        int currentTextColor;
        EditText editText = this.f9453I;
        if (editText == null || this.f9496nF != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1888jY.f5902z;
        Drawable mutate = background.mutate();
        if (m5101q()) {
            C0610LT c0610lt2 = this.f9469U.f1506k;
            if (c0610lt2 != null) {
                currentTextColor = c0610lt2.getCurrentTextColor();
            } else {
                currentTextColor = -1;
            }
        } else if (this.f9503r && (c0610lt = this.f9476c) != null) {
            currentTextColor = c0610lt.getCurrentTextColor();
        } else {
            mutate.clearColorFilter();
            this.f9453I.refreshDrawableState();
            return;
        }
        mutate.setColorFilter(C1982lH.m3596v(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: V */
    public final void m5092V(boolean z) {
        C0446IU c0446iu = this.f9469U;
        if (c0446iu.f1508q != z) {
            c0446iu.m1078v();
            TextInputLayout textInputLayout = c0446iu.f1507o;
            if (z) {
                C0610LT c0610lt = new C0610LT(c0446iu.f1511u, null);
                c0446iu.f1506k = c0610lt;
                c0610lt.setId(R.id.textinput_error);
                c0446iu.f1506k.setTextAlignment(5);
                int i = c0446iu.f1510s;
                c0446iu.f1510s = i;
                C0610LT c0610lt2 = c0446iu.f1506k;
                if (c0610lt2 != null) {
                    textInputLayout.m5083I(c0610lt2, i);
                }
                ColorStateList colorStateList = c0446iu.f1499U;
                c0446iu.f1499U = colorStateList;
                C0610LT c0610lt3 = c0446iu.f1506k;
                if (c0610lt3 != null && colorStateList != null) {
                    c0610lt3.setTextColor(colorStateList);
                }
                CharSequence charSequence = c0446iu.f1504g;
                c0446iu.f1504g = charSequence;
                C0610LT c0610lt4 = c0446iu.f1506k;
                if (c0610lt4 != null) {
                    c0610lt4.setContentDescription(charSequence);
                }
                int i2 = c0446iu.f1514y;
                c0446iu.f1514y = i2;
                C0610LT c0610lt5 = c0446iu.f1506k;
                if (c0610lt5 != null) {
                    WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
                    AbstractC1285Y3.m2632Q(c0610lt5, i2);
                }
                c0446iu.f1506k.setVisibility(4);
                c0446iu.m1079z(c0446iu.f1506k, 0);
            } else {
                c0446iu.m1073Q();
                c0446iu.m1077u(c0446iu.f1506k, 0);
                c0446iu.f1506k = null;
                textInputLayout.m5091U();
                textInputLayout.m5095c();
            }
            c0446iu.f1508q = z;
        }
    }

    /* renamed from: W */
    public final void m5093W() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        if (!m5086N()) {
            return;
        }
        int width = this.f9453I.getWidth();
        int gravity = this.f9453I.getGravity();
        C0001A1 c0001a1 = this.f9468T0;
        boolean m9h = c0001a1.m9h(c0001a1.f9J);
        c0001a1.f6H = m9h;
        Rect rect = c0001a1.f15P;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? m9h : !m9h) {
                f3 = rect.left;
                float max = Math.max(f3, rect.left);
                rectF = this.f9474ZH;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                        if (!c0001a1.f6H) {
                            f4 = c0001a1.f26Yd + max;
                        }
                        f4 = rect.right;
                    } else {
                        if (c0001a1.f6H) {
                            f4 = c0001a1.f26Yd + max;
                        }
                        f4 = rect.right;
                    }
                } else {
                    f4 = (width / 2.0f) + (c0001a1.f26Yd / 2.0f);
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = c0001a1.m6P() + rect.top;
                if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                    float f5 = rectF.left;
                    float f6 = this.f9499od;
                    rectF.left = f5 - f6;
                    rectF.right += f6;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f9471UZ);
                    AbstractC0990Sa abstractC0990Sa = (AbstractC0990Sa) this.f9443D;
                    abstractC0990Sa.getClass();
                    abstractC0990Sa.m2164g(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
            }
            f = rect.right;
            f2 = c0001a1.f26Yd;
        } else {
            f = width / 2.0f;
            f2 = c0001a1.f26Yd / 2.0f;
        }
        f3 = f - f2;
        float max2 = Math.max(f3, rect.left);
        rectF = this.f9474ZH;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f4 = (width / 2.0f) + (c0001a1.f26Yd / 2.0f);
        rectF.right = Math.min(f4, rect.right);
        rectF.bottom = c0001a1.m6P() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    /* renamed from: Y */
    public final void m5094Y(Editable editable) {
        int i;
        this.f9454J.getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        FrameLayout frameLayout = this.f9466S;
        if (i == 0 && !this.f9459M6) {
            if (this.f9500p != null && this.f9442C && !TextUtils.isEmpty(this.f9447F)) {
                this.f9500p.setText(this.f9447F);
                AbstractC2299rI.m3956z(frameLayout, this.f9487i);
                this.f9500p.setVisibility(0);
                this.f9500p.bringToFront();
                announceForAccessibility(this.f9447F);
                return;
            }
            return;
        }
        C0610LT c0610lt = this.f9500p;
        if (c0610lt != null && this.f9442C) {
            c0610lt.setText((CharSequence) null);
            AbstractC2299rI.m3956z(frameLayout, this.f9477d);
            this.f9500p.setVisibility(4);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        boolean z;
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            FrameLayout frameLayout = this.f9466S;
            frameLayout.addView(view, layoutParams2);
            frameLayout.setLayoutParams(layoutParams);
            m5096f();
            EditText editText = (EditText) view;
            if (this.f9453I == null) {
                C1997lY c1997lY = this.f9507w;
                if (c1997lY.f6205y != 3 && !(editText instanceof TextInputEditText)) {
                    Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
                }
                this.f9453I = editText;
                int i2 = this.f9490k;
                if (i2 != -1) {
                    this.f9490k = i2;
                    if (editText != null && i2 != -1) {
                        editText.setMinEms(i2);
                    }
                } else {
                    int i3 = this.f9509y;
                    this.f9509y = i3;
                    if (editText != null && i3 != -1) {
                        editText.setMinWidth(i3);
                    }
                }
                int i4 = this.f9485g;
                if (i4 != -1) {
                    this.f9485g = i4;
                    EditText editText2 = this.f9453I;
                    if (editText2 != null && i4 != -1) {
                        editText2.setMaxEms(i4);
                    }
                } else {
                    int i5 = this.f9504s;
                    this.f9504s = i5;
                    EditText editText3 = this.f9453I;
                    if (editText3 != null && i5 != -1) {
                        editText3.setMaxWidth(i5);
                    }
                }
                this.f9475b = false;
                m5100o();
                C2414tT c2414tT = new C2414tT(this);
                EditText editText4 = this.f9453I;
                if (editText4 != null) {
                    AbstractC2446u3.m4221V(editText4, c2414tT);
                }
                Typeface typeface = this.f9453I.getTypeface();
                C0001A1 c0001a1 = this.f9468T0;
                boolean m3G = c0001a1.m3G(typeface);
                if (c0001a1.f3E != typeface) {
                    c0001a1.f3E = typeface;
                    Typeface m1870t = AbstractC0795Op.m1870t(c0001a1.f56z.getContext().getResources().getConfiguration(), typeface);
                    c0001a1.f20U = m1870t;
                    if (m1870t == null) {
                        m1870t = c0001a1.f3E;
                    }
                    c0001a1.f49s = m1870t;
                    z = true;
                } else {
                    z = false;
                }
                if (m3G || z) {
                    c0001a1.m10o(false);
                }
                float textSize = this.f9453I.getTextSize();
                if (c0001a1.f43o != textSize) {
                    c0001a1.f43o = textSize;
                    c0001a1.m10o(false);
                }
                int i6 = Build.VERSION.SDK_INT;
                float letterSpacing = this.f9453I.getLetterSpacing();
                if (c0001a1.f38l != letterSpacing) {
                    c0001a1.f38l = letterSpacing;
                    c0001a1.m10o(false);
                }
                int gravity = this.f9453I.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c0001a1.f51u != i7) {
                    c0001a1.f51u = i7;
                    c0001a1.m10o(false);
                }
                if (c0001a1.f16Q != gravity) {
                    c0001a1.f16Q = gravity;
                    c0001a1.m10o(false);
                }
                this.f9453I.addTextChangedListener(new C0970SD(this));
                if (this.f9478d2 == null) {
                    this.f9478d2 = this.f9453I.getHintTextColors();
                }
                if (this.f9505t) {
                    if (TextUtils.isEmpty(this.f9439B)) {
                        CharSequence hint = this.f9453I.getHint();
                        this.f9501q = hint;
                        m5089R(hint);
                        this.f9453I.setHint((CharSequence) null);
                    }
                    this.f9455K = true;
                }
                if (i6 >= 29) {
                    m5107y();
                }
                if (this.f9476c != null) {
                    m5099k(this.f9453I.getText());
                }
                m5091U();
                this.f9469U.m1075h();
                this.f9463R.bringToFront();
                c1997lY.bringToFront();
                Iterator it = this.f9462Pm.iterator();
                while (it.hasNext()) {
                    ((C1194WK) it.next()).m2473z(this);
                }
                c1997lY.m3616V();
                if (!isEnabled()) {
                    editText.setEnabled(false);
                }
                m5102r(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x010a  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5095c() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m5095c():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        CharSequence charSequence;
        EditText editText = this.f9453I;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f9501q != null) {
            boolean z = this.f9455K;
            this.f9455K = false;
            CharSequence hint = editText.getHint();
            this.f9453I.setHint(this.f9501q);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f9453I.setHint(hint);
                this.f9455K = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f9466S;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f9453I) {
                if (this.f9505t) {
                    charSequence = this.f9439B;
                } else {
                    charSequence = null;
                }
                newChild.setHint(charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f9472W9 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f9472W9 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C2281qz c2281qz;
        super.draw(canvas);
        boolean z = this.f9505t;
        C0001A1 c0001a1 = this.f9468T0;
        if (z) {
            c0001a1.getClass();
            int save = canvas.save();
            if (c0001a1.f29c != null) {
                RectF rectF = c0001a1.f13N;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c0001a1.f14O;
                    textPaint.setTextSize(c0001a1.f27Z);
                    float f = c0001a1.f8I;
                    float f2 = c0001a1.f46q;
                    float f3 = c0001a1.f4F;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    boolean z2 = true;
                    if (c0001a1.f41nF <= 1 || c0001a1.f6H) {
                        z2 = false;
                    }
                    if (z2) {
                        float lineStart = c0001a1.f8I - c0001a1.f42nP.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (c0001a1.f7HL * f4));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            float f5 = c0001a1.f1C;
                            float f6 = c0001a1.f45p;
                            float f7 = c0001a1.f36j;
                            int i2 = c0001a1.f11L;
                            textPaint.setShadowLayer(f5, f6, f7, AbstractC0106C4.m229v(i2, (Color.alpha(i2) * textPaint.getAlpha()) / 255));
                        }
                        c0001a1.f42nP.draw(canvas);
                        textPaint.setAlpha((int) (c0001a1.f47qn * f4));
                        if (i >= 31) {
                            float f8 = c0001a1.f1C;
                            float f9 = c0001a1.f45p;
                            float f10 = c0001a1.f36j;
                            int i3 = c0001a1.f11L;
                            textPaint.setShadowLayer(f8, f9, f10, AbstractC0106C4.m229v(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = c0001a1.f42nP.getLineBaseline(0);
                        CharSequence charSequence = c0001a1.f44od;
                        float f11 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(c0001a1.f1C, c0001a1.f45p, c0001a1.f36j, c0001a1.f11L);
                        }
                        String trim = c0001a1.f44od.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c0001a1.f42nP.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                    } else {
                        canvas.translate(f, f2);
                        c0001a1.f42nP.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f9473Yd != null && (c2281qz = this.f9497nP) != null) {
            c2281qz.draw(canvas);
            if (this.f9453I.isFocused()) {
                Rect bounds = this.f9473Yd.getBounds();
                Rect bounds2 = this.f9497nP.getBounds();
                float f12 = c0001a1.f34h;
                int centerX = bounds2.centerX();
                bounds.left = AbstractC1090US.m2262h(centerX, bounds2.left, f12);
                bounds.right = AbstractC1090US.m2262h(centerX, bounds2.right, f12);
                this.f9473Yd.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        boolean z3;
        if (this.f9457LN) {
            return;
        }
        boolean z4 = true;
        this.f9457LN = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0001A1 c0001a1 = this.f9468T0;
        if (c0001a1 != null) {
            c0001a1.f35i = drawableState;
            ColorStateList colorStateList2 = c0001a1.f12M;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c0001a1.f5G) != null && colorStateList.isStateful())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c0001a1.m10o(false);
                z3 = true;
            } else {
                z3 = false;
            }
            z = z3 | false;
        } else {
            z = false;
        }
        if (this.f9453I != null) {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (!AbstractC1285Y3.m2635v(this) || !isEnabled()) {
                z4 = false;
            }
            m5102r(z4, false);
        }
        m5091U();
        m5095c();
        if (z) {
            invalidate();
        }
        this.f9457LN = false;
    }

    /* renamed from: f */
    public final void m5096f() {
        if (this.f9496nF != 1) {
            FrameLayout frameLayout = this.f9466S;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int m5105v = m5105v();
            if (m5105v != layoutParams.topMargin) {
                layoutParams.topMargin = m5105v;
                frameLayout.requestLayout();
            }
        }
    }

    /* renamed from: g */
    public final void m5097g() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0610LT c0610lt = this.f9476c;
        if (c0610lt != null) {
            m5083I(c0610lt, this.f9503r ? this.f9450H : this.f9482e);
            if (!this.f9503r && (colorStateList2 = this.f9460O) != null) {
                this.f9476c.setTextColor(colorStateList2);
            }
            if (!this.f9503r || (colorStateList = this.f9493n) == null) {
                return;
            }
            this.f9476c.setTextColor(colorStateList);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final int getBaseline() {
        EditText editText = this.f9453I;
        if (editText == null) {
            return super.getBaseline();
        }
        return m5105v() + getPaddingTop() + editText.getBaseline();
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0081  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5098h() {
        /*
            r7 = this;
            a.qz r0 = r7.f9443D
            if (r0 != 0) goto L5
            return
        L5:
            a.br r1 = r0.f7021S
            a.Bw r1 = r1.f4616z
            a.Bw r2 = r7.f9502qn
            if (r1 == r2) goto L10
            r0.mo3137h(r2)
        L10:
            int r0 = r7.f9496nF
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r7.f9471UZ
            if (r0 <= r2) goto L22
            int r0 = r7.f9470U8
            if (r0 == 0) goto L22
            r0 = r4
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L4b
            a.qz r0 = r7.f9443D
            int r1 = r7.f9471UZ
            float r1 = (float) r1
            int r5 = r7.f9470U8
            a.br r6 = r0.f7021S
            r6.f4598M = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            a.br r5 = r0.f7021S
            android.content.res.ColorStateList r6 = r5.f4600P
            if (r6 == r1) goto L4b
            r5.f4600P = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4b:
            int r0 = r7.f9440BO
            int r1 = r7.f9496nF
            if (r1 != r4) goto L62
            android.content.Context r0 = r7.getContext()
            r1 = 2130968876(0x7f04012c, float:1.7546418E38)
            int r0 = p000a.AbstractC0795Op.m1836Y(r0, r1, r3)
            int r1 = r7.f9440BO
            int r0 = p000a.AbstractC0106C4.m228h(r1, r0)
        L62:
            r7.f9440BO = r0
            a.qz r1 = r7.f9443D
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.m3934R(r0)
            a.qz r0 = r7.f9497nP
            if (r0 == 0) goto La3
            a.qz r1 = r7.f9473Yd
            if (r1 != 0) goto L76
            goto La3
        L76:
            int r1 = r7.f9471UZ
            if (r1 <= r2) goto L7f
            int r1 = r7.f9470U8
            if (r1 == 0) goto L7f
            r3 = r4
        L7f:
            if (r3 == 0) goto La0
            android.widget.EditText r1 = r7.f9453I
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L8c
            int r1 = r7.f9461O4
            goto L8e
        L8c:
            int r1 = r7.f9470U8
        L8e:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m3934R(r1)
            a.qz r0 = r7.f9473Yd
            int r1 = r7.f9470U8
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.m3934R(r1)
        La0:
            r7.invalidate()
        La3:
            r7.m5082E()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m5098h():void");
    }

    /* renamed from: k */
    public final void m5099k(Editable editable) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        C2581we c2581we;
        boolean z3;
        C0678Mp c0678Mp;
        char c;
        C0678Mp c0678Mp2;
        String str;
        this.f9454J.getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        boolean z4 = this.f9503r;
        int i3 = this.f9483f;
        String str2 = null;
        if (i3 == -1) {
            this.f9476c.setText(String.valueOf(i));
            this.f9476c.setContentDescription(null);
            this.f9503r = false;
        } else {
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.f9503r = z;
            Context context = getContext();
            C0610LT c0610lt = this.f9476c;
            int i4 = this.f9483f;
            if (this.f9503r) {
                i2 = R.string.character_counter_overflowed_content_description;
            } else {
                i2 = R.string.character_counter_content_description;
            }
            c0610lt.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(i4)));
            if (z4 != this.f9503r) {
                m5097g();
            }
            String str3 = C2581we.f7903P;
            Locale locale = Locale.getDefault();
            int i5 = AbstractC0151Cx.f509z;
            if (AbstractC2505vA.m4351z(locale) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                c2581we = C2581we.f7905u;
            } else {
                c2581we = C2581we.f7904Q;
            }
            C0610LT c0610lt2 = this.f9476c;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f9483f));
            c2581we.getClass();
            if (string != null) {
                boolean m887h = c2581we.f7907v.m887h(string, string.length());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if ((c2581we.f7906h & 2) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String str4 = C2581we.f7902N;
                String str5 = C2581we.f7903P;
                boolean z5 = c2581we.f7908z;
                if (z3) {
                    if (m887h) {
                        c0678Mp2 = AbstractC0690N3.f2333h;
                    } else {
                        c0678Mp2 = AbstractC0690N3.f2335z;
                    }
                    boolean m887h2 = c0678Mp2.m887h(string, string.length());
                    if (!z5 && (m887h2 || C2581we.m4464z(string) == 1)) {
                        str = str5;
                    } else if (!z5 || (m887h2 && C2581we.m4464z(string) != -1)) {
                        str = "";
                    } else {
                        str = str4;
                    }
                    spannableStringBuilder.append((CharSequence) str);
                }
                if (m887h != z5) {
                    if (m887h) {
                        c = 8235;
                    } else {
                        c = 8234;
                    }
                    spannableStringBuilder.append(c);
                    spannableStringBuilder.append((CharSequence) string);
                    spannableStringBuilder.append((char) 8236);
                } else {
                    spannableStringBuilder.append((CharSequence) string);
                }
                if (m887h) {
                    c0678Mp = AbstractC0690N3.f2333h;
                } else {
                    c0678Mp = AbstractC0690N3.f2335z;
                }
                boolean m887h3 = c0678Mp.m887h(string, string.length());
                if (!z5 && (m887h3 || C2581we.m4463h(string) == 1)) {
                    str4 = str5;
                } else if (!z5 || (m887h3 && C2581we.m4463h(string) != -1)) {
                    str4 = "";
                }
                spannableStringBuilder.append((CharSequence) str4);
                str2 = spannableStringBuilder.toString();
            }
            c0610lt2.setText(str2);
        }
        if (this.f9453I != null && z4 != this.f9503r) {
            m5102r(false, false);
            m5095c();
            m5091U();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5100o() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m5100o():void");
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f9468T0.m11u(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x01a7  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        EditText editText2 = this.f9453I;
        int i3 = 1;
        C1997lY c1997lY = this.f9507w;
        if (editText2 != null && this.f9453I.getMeasuredHeight() < (max = Math.max(c1997lY.getMeasuredHeight(), this.f9463R.getMeasuredHeight()))) {
            this.f9453I.setMinimumHeight(max);
            z = true;
        } else {
            z = false;
        }
        boolean m5103s = m5103s();
        if (z || m5103s) {
            this.f9453I.post(new RunnableC1637em(this, i3));
        }
        if (this.f9500p != null && (editText = this.f9453I) != null) {
            this.f9500p.setGravity(editText.getGravity());
            this.f9500p.setPadding(this.f9453I.getCompoundPaddingLeft(), this.f9453I.getCompoundPaddingTop(), this.f9453I.getCompoundPaddingRight(), this.f9453I.getCompoundPaddingBottom());
        }
        c1997lY.m3616V();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C2308rR)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2308rR c2308rR = (C2308rR) parcelable;
        super.onRestoreInstanceState(c2308rR.f8021S);
        m5085M(c2308rR.f7126w);
        if (c2308rR.f7125I) {
            post(new RunnableC1637em(this, 0));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.f9451HL) {
            InterfaceC1722gQ interfaceC1722gQ = this.f9502qn.f372N;
            RectF rectF = this.f9474ZH;
            float mo2191z = interfaceC1722gQ.mo2191z(rectF);
            float mo2191z2 = this.f9502qn.f374Q.mo2191z(rectF);
            float mo2191z3 = this.f9502qn.f378o.mo2191z(rectF);
            float mo2191z4 = this.f9502qn.f379u.mo2191z(rectF);
            C0099Bw c0099Bw = this.f9502qn;
            AbstractC1500cH abstractC1500cH = c0099Bw.f381z;
            C0021AO c0021ao = new C0021AO();
            AbstractC1500cH abstractC1500cH2 = c0099Bw.f377h;
            c0021ao.f139z = abstractC1500cH2;
            C0021AO.m52h(abstractC1500cH2);
            c0021ao.f135h = abstractC1500cH;
            C0021AO.m52h(abstractC1500cH);
            AbstractC1500cH abstractC1500cH3 = c0099Bw.f380v;
            c0021ao.f131P = abstractC1500cH3;
            C0021AO.m52h(abstractC1500cH3);
            AbstractC1500cH abstractC1500cH4 = c0099Bw.f373P;
            c0021ao.f138v = abstractC1500cH4;
            C0021AO.m52h(abstractC1500cH4);
            c0021ao.f130N = new C1012T(mo2191z2);
            c0021ao.f132Q = new C1012T(mo2191z);
            c0021ao.f136o = new C1012T(mo2191z4);
            c0021ao.f137u = new C1012T(mo2191z3);
            C0099Bw c0099Bw2 = new C0099Bw(c0021ao);
            this.f9451HL = z;
            C2281qz c2281qz = this.f9443D;
            if (c2281qz != null && c2281qz.f7021S.f4616z != c0099Bw2) {
                this.f9502qn = c0099Bw2;
                m5098h();
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        CharSequence charSequence;
        C2308rR c2308rR = new C2308rR(super.onSaveInstanceState());
        if (m5101q()) {
            C0446IU c0446iu = this.f9469U;
            if (c0446iu.f1508q) {
                charSequence = c0446iu.f1491I;
            } else {
                charSequence = null;
            }
            c2308rR.f7126w = charSequence;
        }
        C1997lY c1997lY = this.f9507w;
        boolean z2 = true;
        if (c1997lY.f6205y != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !c1997lY.f6199k.isChecked()) {
            z2 = false;
        }
        c2308rR.f7125I = z2;
        return c2308rR;
    }

    /* renamed from: q */
    public final boolean m5101q() {
        C0446IU c0446iu = this.f9469U;
        if (c0446iu.f1513w == 1 && c0446iu.f1506k != null && !TextUtils.isEmpty(c0446iu.f1491I)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x012a  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5102r(boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m5102r(boolean, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x0091, code lost:
    
        if (r2.m3613P() != false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0095, code lost:
    
        if (r2.f6191J != null) goto L122;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x011e  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m5103s() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m5103s():boolean");
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        m5081G(this, z);
        super.setEnabled(z);
    }

    /* renamed from: u */
    public final int m5104u(int i, boolean z) {
        int compoundPaddingLeft;
        if (!z) {
            C1436ax c1436ax = this.f9463R;
            if (c1436ax.f4498w != null) {
                compoundPaddingLeft = c1436ax.m2864z();
                return compoundPaddingLeft + i;
            }
        }
        if (z) {
            C1997lY c1997lY = this.f9507w;
            if (c1997lY.f6191J != null) {
                compoundPaddingLeft = c1997lY.m3621v();
                return compoundPaddingLeft + i;
            }
        }
        compoundPaddingLeft = this.f9453I.getCompoundPaddingLeft();
        return compoundPaddingLeft + i;
    }

    /* renamed from: v */
    public final int m5105v() {
        float m6P;
        if (!this.f9505t) {
            return 0;
        }
        int i = this.f9496nF;
        C0001A1 c0001a1 = this.f9468T0;
        if (i == 0) {
            m6P = c0001a1.m6P();
        } else {
            if (i != 2) {
                return 0;
            }
            m6P = c0001a1.m6P() / 2.0f;
        }
        return (int) m6P;
    }

    /* renamed from: w */
    public final void m5106w(boolean z) {
        if (this.f9442C == z) {
            return;
        }
        if (z) {
            C0610LT c0610lt = this.f9500p;
            if (c0610lt != null) {
                this.f9466S.addView(c0610lt);
                this.f9500p.setVisibility(0);
            }
        } else {
            C0610LT c0610lt2 = this.f9500p;
            if (c0610lt2 != null) {
                c0610lt2.setVisibility(8);
            }
            this.f9500p = null;
        }
        this.f9442C = z;
    }

    /* renamed from: y */
    public final void m5107y() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f9508x;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue m1858n0 = AbstractC0795Op.m1858n0(context, R.attr.colorControlActivated);
            if (m1858n0 != null) {
                int i = m1858n0.resourceId;
                if (i != 0) {
                    colorStateList2 = AbstractC0865QC.m1999h(context, i);
                } else {
                    int i2 = m1858n0.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f9453I;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.f9453I.getTextCursorDrawable();
                if (!m5101q() && (this.f9476c == null || !this.f9503r)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (colorStateList = this.f9467T) != null) {
                    colorStateList2 = colorStateList;
                }
                AbstractC0235ET.m478o(textCursorDrawable2, colorStateList2);
            }
        }
    }

    /* renamed from: z */
    public final void m5108z(float f) {
        C0001A1 c0001a1 = this.f9468T0;
        if (c0001a1.f34h == f) {
            return;
        }
        int i = 1;
        if (this.f9484fH == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f9484fH = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0795Op.m1802BO(getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC1090US.f3562h));
            this.f9484fH.setDuration(AbstractC0795Op.m1831U8(getContext(), R.attr.motionDurationMedium4, 167));
            this.f9484fH.addUpdateListener(new C1893je(i, this));
        }
        this.f9484fH.setFloatValues(c0001a1.f34h, f);
        this.f9484fH.start();
    }
}
