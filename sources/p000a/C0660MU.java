package p000a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: a.MU */
/* loaded from: classes.dex */
public class C0660MU implements InterfaceC2298rH {

    /* renamed from: O */
    public static final Method f2118O;

    /* renamed from: d */
    public static final Method f2119d;

    /* renamed from: n */
    public static final Method f2120n;

    /* renamed from: C */
    public final Handler f2121C;

    /* renamed from: E */
    public boolean f2122E;

    /* renamed from: H */
    public AdapterView.OnItemSelectedListener f2124H;

    /* renamed from: J */
    public View f2126J;

    /* renamed from: L */
    public boolean f2127L;

    /* renamed from: R */
    public ListAdapter f2128R;

    /* renamed from: S */
    public final Context f2129S;

    /* renamed from: U */
    public boolean f2130U;

    /* renamed from: Y */
    public C2549vy f2132Y;

    /* renamed from: c */
    public AdapterView.OnItemClickListener f2134c;

    /* renamed from: g */
    public int f2137g;

    /* renamed from: i */
    public final C1630ef f2138i;

    /* renamed from: j */
    public Rect f2139j;

    /* renamed from: k */
    public int f2140k;

    /* renamed from: s */
    public boolean f2144s;

    /* renamed from: w */
    public C2409tO f2145w;

    /* renamed from: I */
    public final int f2125I = -2;

    /* renamed from: q */
    public int f2142q = -2;

    /* renamed from: y */
    public final int f2146y = 1002;

    /* renamed from: f */
    public int f2136f = 0;

    /* renamed from: r */
    public final int f2143r = Integer.MAX_VALUE;

    /* renamed from: e */
    public final RunnableC0572Kj f2135e = new RunnableC0572Kj(this, 2);

    /* renamed from: X */
    public final ViewOnTouchListenerC2320rf f2131X = new ViewOnTouchListenerC2320rf(this);

    /* renamed from: F */
    public final C1785hZ f2123F = new C1785hZ(this);

    /* renamed from: Z */
    public final RunnableC0572Kj f2133Z = new RunnableC0572Kj(this, 1);

    /* renamed from: p */
    public final Rect f2141p = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2119d = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2120n = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f2118O = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C0660MU(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f2129S = context;
        this.f2121C = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0483J5.f1624w, i, i2);
        this.f2140k = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2137g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2144s = true;
        }
        obtainStyledAttributes.recycle();
        C1630ef c1630ef = new C1630ef(context, attributeSet, i, i2);
        this.f2138i = c1630ef;
        c1630ef.setInputMethodMode(1);
    }

    /* renamed from: I */
    public void mo1462I(ListAdapter listAdapter) {
        C2549vy c2549vy = this.f2132Y;
        if (c2549vy == null) {
            this.f2132Y = new C2549vy(this);
        } else {
            ListAdapter listAdapter2 = this.f2128R;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c2549vy);
            }
        }
        this.f2128R = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2132Y);
        }
        C2409tO c2409tO = this.f2145w;
        if (c2409tO != null) {
            c2409tO.setAdapter(this.f2128R);
        }
    }

    @Override // p000a.InterfaceC2298rH
    /* renamed from: M */
    public final C2409tO mo395M() {
        return this.f2145w;
    }

    /* renamed from: P */
    public final int m1463P() {
        return this.f2140k;
    }

    @Override // p000a.InterfaceC2298rH
    /* renamed from: Q */
    public final void mo396Q() {
        int i;
        boolean z;
        int m3583z;
        int makeMeasureSpec;
        int i2;
        int i3;
        boolean z2;
        C2409tO c2409tO;
        int i4;
        int i5;
        C2409tO c2409tO2 = this.f2145w;
        C1630ef c1630ef = this.f2138i;
        int i6 = 0;
        Context context = this.f2129S;
        if (c2409tO2 == null) {
            C2409tO mo1470z = mo1470z(context, !this.f2127L);
            this.f2145w = mo1470z;
            mo1470z.setAdapter(this.f2128R);
            this.f2145w.setOnItemClickListener(this.f2134c);
            this.f2145w.setFocusable(true);
            this.f2145w.setFocusableInTouchMode(true);
            this.f2145w.setOnItemSelectedListener(new C2518vN(i6, this));
            this.f2145w.setOnScrollListener(this.f2123F);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f2124H;
            if (onItemSelectedListener != null) {
                this.f2145w.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1630ef.setContentView(this.f2145w);
        } else {
            ViewGroup viewGroup = (ViewGroup) c1630ef.getContentView();
        }
        Drawable background = c1630ef.getBackground();
        Rect rect = this.f2141p;
        if (background != null) {
            background.getPadding(rect);
            int i7 = rect.top;
            i = rect.bottom + i7;
            if (!this.f2144s) {
                this.f2137g = -i7;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        if (c1630ef.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f2126J;
        int i8 = this.f2137g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f2118O;
            if (method != null) {
                try {
                    m3583z = ((Integer) method.invoke(c1630ef, view, Integer.valueOf(i8), Boolean.valueOf(z))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            m3583z = c1630ef.getMaxAvailableHeight(view, i8);
        } else {
            m3583z = AbstractC1962kv.m3583z(c1630ef, view, i8, z);
        }
        int i9 = this.f2125I;
        if (i9 == -1) {
            i3 = m3583z + i;
        } else {
            int i10 = this.f2142q;
            if (i10 != -2) {
                if (i10 != -1) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                } else {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
                }
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int m4166z = this.f2145w.m4166z(makeMeasureSpec, m3583z + 0);
            if (m4166z > 0) {
                i2 = this.f2145w.getPaddingBottom() + this.f2145w.getPaddingTop() + i + 0;
            } else {
                i2 = 0;
            }
            i3 = m4166z + i2;
        }
        if (c1630ef.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        AbstractC1259Xb.m2559P(c1630ef, this.f2146y);
        if (c1630ef.isShowing()) {
            View view2 = this.f2126J;
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (!AbstractC1285Y3.m2633h(view2)) {
                return;
            }
            int i11 = this.f2142q;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.f2126J.getWidth();
            }
            if (i9 == -1) {
                if (z2) {
                    i9 = i3;
                } else {
                    i9 = -1;
                }
                int i12 = this.f2142q;
                if (z2) {
                    if (i12 == -1) {
                        i5 = -1;
                    } else {
                        i5 = 0;
                    }
                    c1630ef.setWidth(i5);
                    c1630ef.setHeight(0);
                } else {
                    if (i12 == -1) {
                        i6 = -1;
                    }
                    c1630ef.setWidth(i6);
                    c1630ef.setHeight(-1);
                }
            } else if (i9 == -2) {
                i9 = i3;
            }
            c1630ef.setOutsideTouchable(true);
            View view3 = this.f2126J;
            int i13 = this.f2140k;
            int i14 = this.f2137g;
            if (i11 < 0) {
                i11 = -1;
            }
            if (i9 < 0) {
                i4 = -1;
            } else {
                i4 = i9;
            }
            c1630ef.update(view3, i13, i14, i11, i4);
            return;
        }
        int i15 = this.f2142q;
        if (i15 == -1) {
            i15 = -1;
        } else if (i15 == -2) {
            i15 = this.f2126J.getWidth();
        }
        if (i9 == -1) {
            i9 = -1;
        } else if (i9 == -2) {
            i9 = i3;
        }
        c1630ef.setWidth(i15);
        c1630ef.setHeight(i9);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2119d;
            if (method2 != null) {
                try {
                    method2.invoke(c1630ef, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0136Cd.m275h(c1630ef, true);
        }
        c1630ef.setOutsideTouchable(true);
        c1630ef.setTouchInterceptor(this.f2131X);
        if (this.f2122E) {
            AbstractC1259Xb.m2561v(c1630ef, this.f2130U);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f2120n;
            if (method3 != null) {
                try {
                    method3.invoke(c1630ef, this.f2139j);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC0136Cd.m276z(c1630ef, this.f2139j);
        }
        AbstractC0589L0.m1317z(c1630ef, this.f2126J, this.f2140k, this.f2137g, this.f2136f);
        this.f2145w.setSelection(-1);
        if ((!this.f2127L || this.f2145w.isInTouchMode()) && (c2409tO = this.f2145w) != null) {
            c2409tO.f7365y = true;
            c2409tO.requestLayout();
        }
        if (!this.f2127L) {
            this.f2121C.post(this.f2133Z);
        }
    }

    /* renamed from: R */
    public final void m1464R(Drawable drawable) {
        this.f2138i.setBackgroundDrawable(drawable);
    }

    /* renamed from: W */
    public final Drawable m1465W() {
        return this.f2138i.getBackground();
    }

    @Override // p000a.InterfaceC2298rH
    public final void dismiss() {
        C1630ef c1630ef = this.f2138i;
        c1630ef.dismiss();
        c1630ef.setContentView(null);
        this.f2145w = null;
        this.f2121C.removeCallbacks(this.f2135e);
    }

    @Override // p000a.InterfaceC2298rH
    /* renamed from: h */
    public final boolean mo399h() {
        return this.f2138i.isShowing();
    }

    /* renamed from: k */
    public final void m1466k(int i) {
        Drawable background = this.f2138i.getBackground();
        if (background != null) {
            Rect rect = this.f2141p;
            background.getPadding(rect);
            this.f2142q = rect.left + rect.right + i;
            return;
        }
        this.f2142q = i;
    }

    /* renamed from: u */
    public final int m1467u() {
        if (this.f2144s) {
            return this.f2137g;
        }
        return 0;
    }

    /* renamed from: v */
    public final void m1468v(int i) {
        this.f2140k = i;
    }

    /* renamed from: w */
    public final void m1469w(int i) {
        this.f2137g = i;
        this.f2144s = true;
    }

    /* renamed from: z */
    public C2409tO mo1470z(Context context, boolean z) {
        return new C2409tO(context, z);
    }
}
