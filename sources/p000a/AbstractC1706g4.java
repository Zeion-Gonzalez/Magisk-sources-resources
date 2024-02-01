package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.util.HashSet;
import java.util.WeakHashMap;

/* renamed from: a.g4 */
/* loaded from: classes.dex */
public abstract class AbstractC1706g4 extends ViewGroup implements InterfaceC0108C6 {

    /* renamed from: B */
    public static final int[] f5337B = {16842912};

    /* renamed from: K */
    public static final int[] f5338K = {-16842910};

    /* renamed from: C */
    public int f5339C;

    /* renamed from: E */
    public ColorStateList f5340E;

    /* renamed from: F */
    public final SparseArray f5341F;

    /* renamed from: H */
    public ColorStateList f5342H;

    /* renamed from: I */
    public final SparseArray f5343I;

    /* renamed from: J */
    public int f5344J;

    /* renamed from: L */
    public boolean f5345L;

    /* renamed from: O */
    public int f5346O;

    /* renamed from: R */
    public final ViewOnClickListenerC2660yB f5347R;

    /* renamed from: S */
    public final C0597LB f5348S;

    /* renamed from: T */
    public C2684yg f5349T;

    /* renamed from: U */
    public int f5350U;

    /* renamed from: c */
    public boolean f5351c;

    /* renamed from: d */
    public int f5352d;

    /* renamed from: e */
    public int f5353e;

    /* renamed from: f */
    public final ColorStateList f5354f;

    /* renamed from: g */
    public int f5355g;

    /* renamed from: i */
    public int f5356i;

    /* renamed from: j */
    public int f5357j;

    /* renamed from: k */
    public C0065BH[] f5358k;

    /* renamed from: n */
    public C0099Bw f5359n;

    /* renamed from: p */
    public int f5360p;

    /* renamed from: q */
    public int f5361q;

    /* renamed from: r */
    public int f5362r;

    /* renamed from: s */
    public ColorStateList f5363s;

    /* renamed from: t */
    public C2189pE f5364t;

    /* renamed from: w */
    public final C0759OB f5365w;

    /* renamed from: x */
    public ColorStateList f5366x;

    /* renamed from: y */
    public int f5367y;

    public AbstractC1706g4(Context context) {
        super(context);
        this.f5365w = new C0759OB(5);
        this.f5343I = new SparseArray(5);
        this.f5355g = 0;
        this.f5367y = 0;
        this.f5341F = new SparseArray(5);
        this.f5339C = -1;
        this.f5360p = -1;
        this.f5357j = -1;
        this.f5354f = m3213h();
        if (isInEditMode()) {
            this.f5348S = null;
        } else {
            C0597LB c0597lb = new C0597LB();
            this.f5348S = c0597lb;
            c0597lb.m4360x(0);
            c0597lb.mo1371X(AbstractC0795Op.m1831U8(getContext(), R.attr.motionDurationMedium4, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            c0597lb.mo1373Z(AbstractC0795Op.m1802BO(getContext(), R.attr.motionEasingStandard, AbstractC1090US.f3562h));
            c0597lb.m4358d(new C2186pB());
        }
        this.f5347R = new ViewOnClickListenerC2660yB(2, this);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        AbstractC2397t8.m4123g(this, 1);
    }

    @Override // p000a.InterfaceC0108C6
    /* renamed from: N */
    public final void mo232N(C2189pE c2189pE) {
        this.f5364t = c2189pE;
    }

    /* renamed from: P */
    public final void m3212P(ColorStateList colorStateList) {
        Drawable drawable;
        this.f5363s = colorStateList;
        C0065BH[] c0065bhArr = this.f5358k;
        if (c0065bhArr != null) {
            for (C0065BH c0065bh : c0065bhArr) {
                c0065bh.f285p = colorStateList;
                if (c0065bh.f263C != null && (drawable = c0065bh.f270L) != null) {
                    AbstractC0235ET.m478o(drawable, colorStateList);
                    c0065bh.f270L.invalidateSelf();
                }
            }
        }
    }

    /* renamed from: h */
    public final ColorStateList m3213h() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList m1999h = AbstractC0865QC.m1999h(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = m1999h.getDefaultColor();
        int[] iArr = f5338K;
        return new ColorStateList(new int[][]{iArr, f5337B, ViewGroup.EMPTY_STATE_SET}, new int[]{m1999h.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f5364t.m3795V().size(), false, 1));
    }

    /* renamed from: v */
    public final C2281qz m3214v() {
        if (this.f5359n == null || this.f5366x == null) {
            return null;
        }
        C2281qz c2281qz = new C2281qz(this.f5359n);
        c2281qz.m3934R(this.f5366x);
        return c2281qz;
    }

    /* renamed from: z */
    public final void m3215z() {
        SparseArray sparseArray;
        boolean z;
        Drawable m2878h;
        byte b;
        C1773hL c1773hL;
        int i;
        Drawable drawable;
        removeAllViews();
        C0065BH[] c0065bhArr = this.f5358k;
        C0759OB c0759ob = this.f5365w;
        if (c0065bhArr != null) {
            for (C0065BH c0065bh : c0065bhArr) {
                if (c0065bh != null) {
                    c0759ob.mo1756h(c0065bh);
                    c0065bh.m120U(c0065bh.f268J);
                    c0065bh.f263C = null;
                    c0065bh.f271O = 0.0f;
                    c0065bh.f273S = false;
                }
            }
        }
        if (this.f5364t.size() == 0) {
            this.f5355g = 0;
            this.f5367y = 0;
            this.f5358k = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.f5364t.size(); i2++) {
            hashSet.add(Integer.valueOf(this.f5364t.getItem(i2).getItemId()));
        }
        int i3 = 0;
        while (true) {
            sparseArray = this.f5341F;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                sparseArray.delete(keyAt);
            }
            i3++;
        }
        this.f5358k = new C0065BH[this.f5364t.size()];
        int i4 = this.f5361q;
        int size = this.f5364t.m3795V().size();
        if (i4 != -1 ? i4 == 0 : size > 3) {
            z = true;
        } else {
            z = false;
        }
        for (int i5 = 0; i5 < this.f5364t.size(); i5++) {
            this.f5349T.f8366R = true;
            this.f5364t.getItem(i5).setCheckable(true);
            this.f5349T.f8366R = false;
            C0065BH c0065bh2 = (C0065BH) c0759ob.mo1757z();
            if (c0065bh2 == null) {
                c0065bh2 = new C0065BH(getContext());
            }
            this.f5358k[i5] = c0065bh2;
            ColorStateList colorStateList = this.f5363s;
            c0065bh2.f285p = colorStateList;
            if (c0065bh2.f263C != null && (drawable = c0065bh2.f270L) != null) {
                AbstractC0235ET.m478o(drawable, colorStateList);
                c0065bh2.f270L.invalidateSelf();
            }
            int i6 = this.f5350U;
            ImageView imageView = c0065bh2.f268J;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.width = i6;
            layoutParams.height = i6;
            imageView.setLayoutParams(layoutParams);
            c0065bh2.m130y(this.f5354f);
            int i7 = this.f5362r;
            TextView textView = c0065bh2.f266H;
            C0065BH.m109g(textView, i7);
            float textSize = textView.getTextSize();
            TextView textView2 = c0065bh2.f278e;
            c0065bh2.m123h(textSize, textView2.getTextSize());
            c0065bh2.m124k(this.f5344J);
            boolean z2 = this.f5351c;
            c0065bh2.m124k(c0065bh2.f265F);
            textView2.setTypeface(textView2.getTypeface(), z2 ? 1 : 0);
            c0065bh2.m130y(this.f5340E);
            int i8 = this.f5339C;
            if (i8 != -1 && c0065bh2.f267I != i8) {
                c0065bh2.f267I = i8;
                c0065bh2.m114M();
            }
            int i9 = this.f5360p;
            if (i9 != -1 && c0065bh2.f286q != i9) {
                c0065bh2.f286q = i9;
                c0065bh2.m114M();
            }
            int i10 = this.f5357j;
            if (i10 != -1 && c0065bh2.f283k != i10) {
                c0065bh2.f283k = i10;
                c0065bh2.m114M();
            }
            c0065bh2.f291x = this.f5356i;
            c0065bh2.m111E(c0065bh2.getWidth());
            c0065bh2.f274T = this.f5352d;
            c0065bh2.m111E(c0065bh2.getWidth());
            c0065bh2.f262B = this.f5346O;
            c0065bh2.m111E(c0065bh2.getWidth());
            C2281qz m3214v = m3214v();
            View view = c0065bh2.f287r;
            if (view != null) {
                view.setBackgroundDrawable(m3214v);
                c0065bh2.m121V();
            }
            c0065bh2.f289t = false;
            boolean z3 = this.f5345L;
            c0065bh2.f284n = z3;
            c0065bh2.m121V();
            if (view != null) {
                if (z3) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
                c0065bh2.requestLayout();
            }
            int i11 = this.f5353e;
            if (i11 == 0) {
                m2878h = null;
            } else {
                Context context = c0065bh2.getContext();
                Object obj = AbstractC0865QC.f2950z;
                m2878h = AbstractC1470bd.m2878h(context, i11);
            }
            if (m2878h != null && m2878h.getConstantState() != null) {
                m2878h = m2878h.getConstantState().newDrawable().mutate();
            }
            c0065bh2.f290w = m2878h;
            c0065bh2.m121V();
            c0065bh2.f272R = this.f5342H;
            c0065bh2.m121V();
            if (c0065bh2.f264E != z) {
                c0065bh2.f264E = z;
                c0065bh2.m114M();
            }
            c0065bh2.m126q(this.f5361q);
            C1117Uu c1117Uu = (C1117Uu) this.f5364t.getItem(i5);
            c0065bh2.mo131z(c1117Uu);
            SparseArray sparseArray2 = this.f5343I;
            int i12 = c1117Uu.f3653z;
            c0065bh2.setOnTouchListener((View.OnTouchListener) sparseArray2.get(i12));
            c0065bh2.setOnClickListener(this.f5347R);
            int i13 = this.f5355g;
            if (i13 != 0 && i12 == i13) {
                this.f5367y = i5;
            }
            int id = c0065bh2.getId();
            if (id != -1) {
                b = 1;
            } else {
                b = 0;
            }
            if (b != 0 && (c1773hL = (C1773hL) sparseArray.get(id)) != null) {
                c0065bh2.m118R(c1773hL);
            }
            addView(c0065bh2);
        }
        int min = Math.min(this.f5364t.size() - 1, this.f5367y);
        this.f5367y = min;
        this.f5364t.getItem(min).setChecked(true);
    }
}
