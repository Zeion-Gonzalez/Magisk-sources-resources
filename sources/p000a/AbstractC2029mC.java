package p000a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: a.mC */
/* loaded from: classes.dex */
public abstract class AbstractC2029mC extends FrameLayout {

    /* renamed from: I */
    public C0290FV f6313I;

    /* renamed from: R */
    public final C1106Uj f6314R;

    /* renamed from: S */
    public final C0869QH f6315S;

    /* renamed from: k */
    public C1447b9 f6316k;

    /* renamed from: q */
    public C0024AR f6317q;

    /* renamed from: w */
    public final C2684yg f6318w;

    public AbstractC2029mC(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.bottomNavigationStyle, 2131952492), attributeSet, R.attr.bottomNavigationStyle);
        ColorStateList m3213h;
        Drawable m2878h;
        C2684yg c2684yg = new C2684yg();
        this.f6318w = c2684yg;
        Context context2 = getContext();
        C2709z9 m1805D = AbstractC0795Op.m1805D(context2, attributeSet, AbstractC0863Q8.f2932c, R.attr.bottomNavigationStyle, 2131952492, 12, 10);
        C0869QH c0869qh = new C0869QH(context2, getClass());
        this.f6315S = c0869qh;
        C1106Uj c1106Uj = new C1106Uj(context2);
        this.f6314R = c1106Uj;
        c2684yg.f8367S = c1106Uj;
        c2684yg.f8368w = 1;
        c1106Uj.f5349T = c2684yg;
        c0869qh.m3798h(c2684yg, c0869qh.f6724z);
        getContext();
        c2684yg.f8367S.f5364t = c0869qh;
        if (m1805D.m4645V(6)) {
            m3213h = m1805D.m4647h(6);
        } else {
            m3213h = c1106Uj.m3213h();
        }
        c1106Uj.m3212P(m3213h);
        int m4643P = m1805D.m4643P(5, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size));
        c1106Uj.f5350U = m4643P;
        C0065BH[] c0065bhArr = c1106Uj.f5358k;
        if (c0065bhArr != null) {
            for (C0065BH c0065bh : c0065bhArr) {
                ImageView imageView = c0065bh.f268J;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
                layoutParams.width = m4643P;
                layoutParams.height = m4643P;
                imageView.setLayoutParams(layoutParams);
            }
        }
        if (m1805D.m4645V(12)) {
            int m4646W = m1805D.m4646W(12, 0);
            C1106Uj c1106Uj2 = this.f6314R;
            c1106Uj2.f5362r = m4646W;
            C0065BH[] c0065bhArr2 = c1106Uj2.f5358k;
            if (c0065bhArr2 != null) {
                for (C0065BH c0065bh2 : c0065bhArr2) {
                    TextView textView = c0065bh2.f266H;
                    C0065BH.m109g(textView, m4646W);
                    c0065bh2.m123h(textView.getTextSize(), c0065bh2.f278e.getTextSize());
                    ColorStateList colorStateList = c1106Uj2.f5340E;
                    if (colorStateList != null) {
                        c0065bh2.m130y(colorStateList);
                    }
                }
            }
        }
        if (m1805D.m4645V(10)) {
            int m4646W2 = m1805D.m4646W(10, 0);
            C1106Uj c1106Uj3 = this.f6314R;
            c1106Uj3.f5344J = m4646W2;
            C0065BH[] c0065bhArr3 = c1106Uj3.f5358k;
            if (c0065bhArr3 != null) {
                for (C0065BH c0065bh3 : c0065bhArr3) {
                    c0065bh3.m124k(m4646W2);
                    ColorStateList colorStateList2 = c1106Uj3.f5340E;
                    if (colorStateList2 != null) {
                        c0065bh3.m130y(colorStateList2);
                    }
                }
            }
        }
        boolean m4652z = m1805D.m4652z(11, true);
        C1106Uj c1106Uj4 = this.f6314R;
        c1106Uj4.f5351c = m4652z;
        C0065BH[] c0065bhArr4 = c1106Uj4.f5358k;
        if (c0065bhArr4 != null) {
            for (C0065BH c0065bh4 : c0065bhArr4) {
                c0065bh4.m124k(c0065bh4.f265F);
                TextView textView2 = c0065bh4.f278e;
                textView2.setTypeface(textView2.getTypeface(), m4652z ? 1 : 0);
            }
        }
        if (m1805D.m4645V(13)) {
            ColorStateList m4647h = m1805D.m4647h(13);
            C1106Uj c1106Uj5 = this.f6314R;
            c1106Uj5.f5340E = m4647h;
            C0065BH[] c0065bhArr5 = c1106Uj5.f5358k;
            if (c0065bhArr5 != null) {
                for (C0065BH c0065bh5 : c0065bhArr5) {
                    c0065bh5.m130y(m4647h);
                }
            }
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            C0099Bw c0099Bw = new C0099Bw(C0099Bw.m208h(context2, attributeSet, R.attr.bottomNavigationStyle, 2131952492));
            C2281qz c2281qz = new C2281qz();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                c2281qz.m3934R(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            c2281qz.m3930M(context2);
            c2281qz.mo3137h(c0099Bw);
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            AbstractC2397t8.m4127q(this, c2281qz);
        }
        if (m1805D.m4645V(8)) {
            int m4643P2 = m1805D.m4643P(8, 0);
            C1106Uj c1106Uj6 = this.f6314R;
            c1106Uj6.f5339C = m4643P2;
            C0065BH[] c0065bhArr6 = c1106Uj6.f5358k;
            if (c0065bhArr6 != null) {
                for (C0065BH c0065bh6 : c0065bhArr6) {
                    if (c0065bh6.f267I != m4643P2) {
                        c0065bh6.f267I = m4643P2;
                        c0065bh6.m114M();
                    }
                }
            }
        }
        if (m1805D.m4645V(7)) {
            int m4643P3 = m1805D.m4643P(7, 0);
            C1106Uj c1106Uj7 = this.f6314R;
            c1106Uj7.f5360p = m4643P3;
            C0065BH[] c0065bhArr7 = c1106Uj7.f5358k;
            if (c0065bhArr7 != null) {
                for (C0065BH c0065bh7 : c0065bhArr7) {
                    if (c0065bh7.f286q != m4643P3) {
                        c0065bh7.f286q = m4643P3;
                        c0065bh7.m114M();
                    }
                }
            }
        }
        if (m1805D.m4645V(0)) {
            int m4643P4 = m1805D.m4643P(0, 0);
            C1106Uj c1106Uj8 = this.f6314R;
            c1106Uj8.f5357j = m4643P4;
            C0065BH[] c0065bhArr8 = c1106Uj8.f5358k;
            if (c0065bhArr8 != null) {
                for (C0065BH c0065bh8 : c0065bhArr8) {
                    if (c0065bh8.f283k != m4643P4) {
                        c0065bh8.f283k = m4643P4;
                        c0065bh8.m114M();
                    }
                }
            }
        }
        if (m1805D.m4645V(2)) {
            setElevation(m1805D.m4643P(2, 0));
        }
        AbstractC0235ET.m478o(getBackground().mutate(), AbstractC0795Op.m1841c(context2, m1805D, 1));
        int integer = ((TypedArray) m1805D.f8534h).getInteger(14, -1);
        C1106Uj c1106Uj9 = this.f6314R;
        if (c1106Uj9.f5361q != integer) {
            c1106Uj9.f5361q = integer;
            this.f6318w.mo221S(false);
        }
        int m4646W3 = m1805D.m4646W(4, 0);
        if (m4646W3 != 0) {
            C1106Uj c1106Uj10 = this.f6314R;
            c1106Uj10.f5353e = m4646W3;
            C0065BH[] c0065bhArr9 = c1106Uj10.f5358k;
            if (c0065bhArr9 != null) {
                for (C0065BH c0065bh9 : c0065bhArr9) {
                    if (m4646W3 == 0) {
                        m2878h = null;
                    } else {
                        Context context3 = c0065bh9.getContext();
                        Object obj = AbstractC0865QC.f2950z;
                        m2878h = AbstractC1470bd.m2878h(context3, m4646W3);
                    }
                    if (m2878h != null) {
                        c0065bh9.getClass();
                        if (m2878h.getConstantState() != null) {
                            m2878h = m2878h.getConstantState().newDrawable().mutate();
                        }
                    }
                    c0065bh9.f290w = m2878h;
                    c0065bh9.m121V();
                }
            }
        } else {
            ColorStateList m1841c = AbstractC0795Op.m1841c(context2, m1805D, 9);
            C1106Uj c1106Uj11 = this.f6314R;
            c1106Uj11.f5342H = m1841c;
            C0065BH[] c0065bhArr10 = c1106Uj11.f5358k;
            if (c0065bhArr10 != null) {
                for (C0065BH c0065bh10 : c0065bhArr10) {
                    c0065bh10.f272R = m1841c;
                    c0065bh10.m121V();
                }
            }
        }
        int m4646W4 = m1805D.m4646W(3, 0);
        if (m4646W4 != 0) {
            C1106Uj c1106Uj12 = this.f6314R;
            c1106Uj12.f5345L = true;
            C0065BH[] c0065bhArr11 = c1106Uj12.f5358k;
            if (c0065bhArr11 != null) {
                for (C0065BH c0065bh11 : c0065bhArr11) {
                    c0065bh11.f284n = true;
                    c0065bh11.m121V();
                    View view = c0065bh11.f287r;
                    if (view != null) {
                        view.setVisibility(0);
                        c0065bh11.requestLayout();
                    }
                }
            }
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(m4646W4, AbstractC0863Q8.f2918J);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            C1106Uj c1106Uj13 = this.f6314R;
            c1106Uj13.f5356i = dimensionPixelSize;
            C0065BH[] c0065bhArr12 = c1106Uj13.f5358k;
            if (c0065bhArr12 != null) {
                for (C0065BH c0065bh12 : c0065bhArr12) {
                    c0065bh12.f291x = dimensionPixelSize;
                    c0065bh12.m111E(c0065bh12.getWidth());
                }
            }
            int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            C1106Uj c1106Uj14 = this.f6314R;
            c1106Uj14.f5352d = dimensionPixelSize2;
            C0065BH[] c0065bhArr13 = c1106Uj14.f5358k;
            if (c0065bhArr13 != null) {
                for (C0065BH c0065bh13 : c0065bhArr13) {
                    c0065bh13.f274T = dimensionPixelSize2;
                    c0065bh13.m111E(c0065bh13.getWidth());
                }
            }
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
            C1106Uj c1106Uj15 = this.f6314R;
            c1106Uj15.f5346O = dimensionPixelOffset;
            C0065BH[] c0065bhArr14 = c1106Uj15.f5358k;
            if (c0065bhArr14 != null) {
                for (C0065BH c0065bh14 : c0065bhArr14) {
                    c0065bh14.f262B = dimensionPixelOffset;
                    c0065bh14.m111E(c0065bh14.getWidth());
                }
            }
            ColorStateList m1812H = AbstractC0795Op.m1812H(context2, obtainStyledAttributes, 2);
            C1106Uj c1106Uj16 = this.f6314R;
            c1106Uj16.f5366x = m1812H;
            C0065BH[] c0065bhArr15 = c1106Uj16.f5358k;
            if (c0065bhArr15 != null) {
                for (C0065BH c0065bh15 : c0065bhArr15) {
                    C2281qz m3214v = c1106Uj16.m3214v();
                    View view2 = c0065bh15.f287r;
                    if (view2 != null) {
                        view2.setBackgroundDrawable(m3214v);
                        c0065bh15.m121V();
                    }
                }
            }
            C0099Bw c0099Bw2 = new C0099Bw(C0099Bw.m210z(context2, obtainStyledAttributes.getResourceId(4, 0), 0, new C1012T(0)));
            C1106Uj c1106Uj17 = this.f6314R;
            c1106Uj17.f5359n = c0099Bw2;
            C0065BH[] c0065bhArr16 = c1106Uj17.f5358k;
            if (c0065bhArr16 != null) {
                for (C0065BH c0065bh16 : c0065bhArr16) {
                    C2281qz m3214v2 = c1106Uj17.m3214v();
                    View view3 = c0065bh16.f287r;
                    if (view3 != null) {
                        view3.setBackgroundDrawable(m3214v2);
                        c0065bh16.m121V();
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (m1805D.m4645V(15)) {
            int m4646W5 = m1805D.m4646W(15, 0);
            C2684yg c2684yg2 = this.f6318w;
            c2684yg2.f8366R = true;
            if (this.f6313I == null) {
                this.f6313I = new C0290FV(getContext());
            }
            this.f6313I.inflate(m4646W5, this.f6315S);
            c2684yg2.f8366R = false;
            c2684yg2.mo221S(true);
        }
        m1805D.m4651w();
        addView(this.f6314R);
        this.f6315S.f6705N = new C2196pM(25, this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C2281qz) {
            AbstractC0795Op.m1811G5(this, (C2281qz) background);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof C2576wX)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C2576wX c2576wX = (C2576wX) parcelable;
        super.onRestoreInstanceState(c2576wX.f8021S);
        Bundle bundle = c2576wX.f7896w;
        C0869QH c0869qh = this.f6315S;
        c0869qh.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList copyOnWriteArrayList = c0869qh.f6719s;
            if (!copyOnWriteArrayList.isEmpty()) {
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    InterfaceC2687yj interfaceC2687yj = (InterfaceC2687yj) weakReference.get();
                    if (interfaceC2687yj == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        int mo226v = interfaceC2687yj.mo226v();
                        if (mo226v > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(mo226v)) != null) {
                            interfaceC2687yj.mo224o(parcelable2);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable mo225u;
        C2576wX c2576wX = new C2576wX(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        c2576wX.f7896w = bundle;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f6315S.f6719s;
        if (!copyOnWriteArrayList.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC2687yj interfaceC2687yj = (InterfaceC2687yj) weakReference.get();
                if (interfaceC2687yj == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int mo226v = interfaceC2687yj.mo226v();
                    if (mo226v > 0 && (mo225u = interfaceC2687yj.mo225u()) != null) {
                        sparseArray.put(mo226v, mo225u);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return c2576wX;
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof C2281qz) {
            ((C2281qz) background).m3935S(f);
        }
    }
}
