package p000a;

import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Handler;
import android.text.InputFilter;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Vector;

/* renamed from: a.eZ */
/* loaded from: classes.dex */
public final class C1624eZ implements InterfaceC2447u5, InterfaceC0416Hs {

    /* renamed from: R */
    public Object f5013R;

    /* renamed from: S */
    public final /* synthetic */ int f5014S;

    /* renamed from: w */
    public Object f5015w;

    public C1624eZ() {
        this.f5014S = 9;
        this.f5013R = new Rect();
        this.f5015w = new Rect();
    }

    /* renamed from: M */
    public static C1624eZ m3078M(String... strArr) {
        try {
            C1623eY[] c1623eYArr = new C1623eY[strArr.length];
            C2361sQ c2361sQ = new C2361sQ();
            for (int i = 0; i < strArr.length; i++) {
                C2279qw.m3916ZH(c2361sQ, strArr[i]);
                c2361sQ.mo1616EC();
                c1623eYArr[i] = c2361sQ.mo1631q();
            }
            return new C1624eZ((String[]) strArr.clone(), 14, C2252qQ.m3892q(c1623eYArr));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: G */
    public final ViewGroup.LayoutParams mo931G() {
        int i;
        Object obj = this.f5015w;
        if (((ExtendedFloatingActionButton) obj).f9356m == 0) {
            i = -2;
        } else {
            i = ((ExtendedFloatingActionButton) obj).f9356m;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }

    /* renamed from: I */
    public final void m3079I(int i, int i2, int i3, int i4) {
        ((AbstractC2404tI) this.f5015w).f7344I.set(i, i2, i3, i4);
        Object obj = this.f5015w;
        super/*android.widget.FrameLayout*/.setPadding(i + ((AbstractC2404tI) obj).f7348w.left, i2 + ((AbstractC2404tI) obj).f7348w.top, i3 + ((AbstractC2404tI) obj).f7348w.right, i4 + ((AbstractC2404tI) obj).f7348w.bottom);
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: N */
    public final int mo932N() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (!(((ExtendedFloatingActionButton) this.f5015w).getParent() instanceof View)) {
            return ((InterfaceC0416Hs) this.f5013R).mo932N();
        }
        View view = (View) ((ExtendedFloatingActionButton) this.f5015w).getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width == -2) {
            return ((InterfaceC0416Hs) this.f5013R).mo932N();
        }
        int i = 0;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft() + 0;
        if ((((ExtendedFloatingActionButton) this.f5015w).getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ((ExtendedFloatingActionButton) this.f5015w).getLayoutParams()) != null) {
            i = 0 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return (view.getWidth() - i) - paddingRight;
    }

    /* renamed from: P */
    public final boolean m3080P() {
        return ((AbstractC2404tI) this.f5015w).f7345R;
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: Q */
    public final int mo933Q() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Object obj = this.f5015w;
        if (((ExtendedFloatingActionButton) obj).f9356m == -1) {
            if (!(((ExtendedFloatingActionButton) obj).getParent() instanceof View)) {
                return ((InterfaceC0416Hs) this.f5013R).mo933Q();
            }
            View view = (View) ((ExtendedFloatingActionButton) this.f5015w).getParent();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height == -2) {
                return ((InterfaceC0416Hs) this.f5013R).mo933Q();
            }
            int i = 0;
            int paddingBottom = view.getPaddingBottom() + view.getPaddingTop() + 0;
            if ((((ExtendedFloatingActionButton) this.f5015w).getLayoutParams() instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) ((ExtendedFloatingActionButton) this.f5015w).getLayoutParams()) != null) {
                i = 0 + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            }
            return (view.getHeight() - i) - paddingBottom;
        }
        if (((ExtendedFloatingActionButton) obj).f9356m != 0 && ((ExtendedFloatingActionButton) obj).f9356m != -2) {
            return ((ExtendedFloatingActionButton) obj).f9356m;
        }
        return ((InterfaceC0416Hs) this.f5013R).mo933Q();
    }

    /* renamed from: R */
    public final void m3081R(boolean z) {
        ((C1665fK) ((C2196pM) this.f5015w).f6755R).mo2036s(z);
    }

    /* renamed from: S */
    public final void m3082S(C1846ik c1846ik) {
        boolean z;
        int i = c1846ik.f5767h;
        int i2 = 0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ((Handler) this.f5015w).post(new RunnableC0729Nh(i2, this, (C2196pM) this.f5013R, c1846ik.f5768z));
        } else {
            ((Handler) this.f5015w).post(new RunnableC2016lv(i, 3, this, (C2196pM) this.f5013R));
        }
    }

    /* renamed from: V */
    public final InputConnection m3083V(InputConnection inputConnection, EditorInfo editorInfo) {
        C2275qq c2275qq = (C2275qq) this.f5015w;
        if (inputConnection == null) {
            c2275qq.getClass();
            return null;
        }
        return ((C1665fK) c2275qq.f6995v).mo3156g(inputConnection, editorInfo);
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: W */
    public final int mo934W() {
        return ((ExtendedFloatingActionButton) this.f5015w).f9357n;
    }

    /* renamed from: h */
    public final InputFilter[] m3084h(InputFilter[] inputFilterArr) {
        return ((C1665fK) ((C2196pM) this.f5015w).f6755R).mo2032S(inputFilterArr);
    }

    /* renamed from: o */
    public final void m3085o(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        int[] iArr = AbstractC0483J5.f1611W;
        boolean z = true;
        switch (this.f5014S) {
            case AbstractC0795Op.f2698E /* 0 */:
                obtainStyledAttributes = ((EditText) this.f5013R).getContext().obtainStyledAttributes(attributeSet, iArr, i, 0);
                try {
                    if (obtainStyledAttributes.hasValue(14)) {
                        z = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    m3087w(z);
                    return;
                } finally {
                }
            default:
                obtainStyledAttributes = ((TextView) this.f5013R).getContext().obtainStyledAttributes(attributeSet, iArr, i, 0);
                try {
                    if (obtainStyledAttributes.hasValue(14)) {
                        z = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    m3087w(z);
                    return;
                } finally {
                }
        }
    }

    public final String toString() {
        switch (this.f5014S) {
            case 6:
                return "Bounds{lower=" + ((C2739zj) this.f5013R) + " upper=" + ((C2739zj) this.f5015w) + "}";
            default:
                return super.toString();
        }
    }

    @Override // p000a.InterfaceC0416Hs
    /* renamed from: u */
    public final int mo935u() {
        return ((ExtendedFloatingActionButton) this.f5015w).f9360x;
    }

    /* renamed from: v */
    public final KeyListener m3086v(KeyListener keyListener) {
        if ((!(keyListener instanceof NumberKeyListener)) != false) {
            return ((C1665fK) ((C2275qq) this.f5015w).f6995v).mo3155R(keyListener);
        }
        return keyListener;
    }

    /* renamed from: w */
    public final void m3087w(boolean z) {
        switch (this.f5014S) {
            case AbstractC0795Op.f2698E /* 0 */:
                ((C1665fK) ((C2275qq) this.f5015w).f6995v).mo2034f(z);
                return;
            default:
                ((C1665fK) ((C2196pM) this.f5015w).f6755R).mo2034f(z);
                return;
        }
    }

    @Override // p000a.InterfaceC2447u5
    /* renamed from: z */
    public final void mo59z() {
        ((AbstractC0614LY) this.f5013R).cancel();
    }

    public /* synthetic */ C1624eZ(int i) {
        this.f5014S = i;
    }

    public C1624eZ(int i, int i2) {
        this.f5014S = 4;
        this.f5013R = new int[]{i, i2};
        this.f5015w = new float[]{0.0f, 1.0f};
    }

    public C1624eZ(int i, int i2, int i3) {
        this.f5014S = 4;
        this.f5013R = new int[]{i, i2, i3};
        this.f5015w = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C1624eZ(C0516Jj c0516Jj) {
        this.f5014S = 16;
        this.f5015w = new Vector();
        this.f5013R = c0516Jj;
    }

    public C1624eZ(AbstractC2404tI abstractC2404tI) {
        this.f5014S = 3;
        this.f5015w = abstractC2404tI;
    }

    public C1624eZ(AbstractC2731zY abstractC2731zY, AbstractC2731zY abstractC2731zY2) {
        this.f5014S = 10;
        abstractC2731zY.getClass();
        abstractC2731zY2.getClass();
        if (!(0.0f <= 0.0f)) {
            throw new IllegalArgumentException();
        }
        this.f5013R = abstractC2731zY;
        this.f5015w = abstractC2731zY2;
    }

    public C1624eZ(AbstractC1687fj abstractC1687fj) {
        this.f5014S = 7;
        this.f5013R = abstractC1687fj;
        this.f5015w = Collections.newSetFromMap(new IdentityHashMap());
    }

    public C1624eZ(C2043mV c2043mV, BigInteger bigInteger, C2006lk c2006lk, C2006lk c2006lk2, C2043mV c2043mV2, C1133VD c1133vd) {
        this.f5014S = 17;
        C0267F6 c0267f6 = new C0267F6();
        this.f5013R = c0267f6;
        c0267f6.f942h = new C2339s(bigInteger);
        C0267F6 c0267f62 = (C0267F6) this.f5013R;
        c0267f62.f939P = c2043mV;
        c0267f62.f938N = c2006lk;
        c0267f62.f940Q = c2006lk2;
        c0267f62.f944u = c2043mV2;
        c0267f62.f943o = c1133vd;
        this.f5015w = new C1208Wa();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1624eZ(C2043mV c2043mV, BigInteger bigInteger, Date date, Date date2, Locale locale, C2043mV c2043mV2, C1133VD c1133vd) {
        this(c2043mV, bigInteger, new C2006lk(date, locale), new C2006lk(date2, locale), c2043mV2, c1133vd);
        this.f5014S = 17;
    }

    public C1624eZ(WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        this.f5014S = 6;
        lowerBound = bounds.getLowerBound();
        this.f5013R = C2739zj.m4674v(lowerBound);
        upperBound = bounds.getUpperBound();
        this.f5015w = C2739zj.m4674v(upperBound);
    }

    public C1624eZ(EditText editText) {
        this.f5014S = 0;
        this.f5013R = editText;
        this.f5015w = new C2275qq(editText);
    }

    public C1624eZ(TextView textView, int i) {
        this.f5014S = i;
        if (i != 2) {
            this.f5013R = textView;
            this.f5015w = new C2196pM(textView);
        } else {
            textView.getClass();
            this.f5013R = textView;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1624eZ(Object obj) {
        this(15);
        this.f5014S = 15;
    }

    public /* synthetic */ C1624eZ(Object obj, int i, Object obj2) {
        this.f5014S = i;
        this.f5013R = obj;
        this.f5015w = obj2;
    }

    public /* synthetic */ C1624eZ(Object obj, Object obj2, int i) {
        this.f5014S = i;
        this.f5015w = obj;
        this.f5013R = obj2;
    }

    public C1624eZ(ArrayList arrayList, ArrayList arrayList2) {
        this.f5014S = 4;
        int size = arrayList.size();
        this.f5013R = new int[size];
        this.f5015w = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f5013R)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f5015w)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }
}
