package p000a;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: a.RQ */
/* loaded from: classes.dex */
public final class C0926RQ {

    /* renamed from: N */
    public int[] f3177N;

    /* renamed from: P */
    public final View f3178P;

    /* renamed from: h */
    public Object f3179h;

    /* renamed from: v */
    public ViewParent f3180v;

    /* renamed from: z */
    public boolean f3181z;

    public C0926RQ(View view) {
        this.f3178P = view;
    }

    /* renamed from: N */
    public final boolean m2075N(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent m2077Q;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.f3181z || (m2077Q = m2077Q(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f3178P;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.f3177N == null) {
                this.f3177N = new int[2];
            }
            int[] iArr4 = this.f3177N;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        if (m2077Q instanceof InterfaceC1669fO) {
            ((InterfaceC1669fO) m2077Q).mo3165P(view, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (m2077Q instanceof InterfaceC0546KH) {
                ((InterfaceC0546KH) m2077Q).mo1256N(view, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    AbstractC2352sG.m4050P(m2077Q, view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + m2077Q + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    /* renamed from: P */
    public final void m2076P(int i, int i2, int i3, int[] iArr) {
        m2075N(0, i, 0, i2, null, i3, iArr);
    }

    /* renamed from: Q */
    public final ViewParent m2077Q(int i) {
        Object obj;
        if (i == 0) {
            obj = this.f3179h;
        } else {
            if (i != 1) {
                return null;
            }
            obj = this.f3180v;
        }
        return (ViewParent) obj;
    }

    /* renamed from: h */
    public final boolean m2078h(float f, float f2) {
        ViewParent m2077Q;
        if (!this.f3181z || (m2077Q = m2077Q(0)) == null) {
            return false;
        }
        try {
            return AbstractC2352sG.m4052h(m2077Q, this.f3178P, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + m2077Q + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    /* renamed from: o */
    public final void m2079o(int i) {
        ViewParent m2077Q = m2077Q(i);
        if (m2077Q != null) {
            boolean z = m2077Q instanceof InterfaceC0546KH;
            View view = this.f3178P;
            if (z) {
                ((InterfaceC0546KH) m2077Q).mo1258h(view, i);
            } else if (i == 0) {
                try {
                    AbstractC2352sG.m4053u(m2077Q, view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + m2077Q + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i != 0) {
                if (i == 1) {
                    this.f3180v = null;
                    return;
                }
                return;
            }
            this.f3179h = null;
        }
    }

    /* renamed from: u */
    public final boolean m2080u(int i, int i2) {
        boolean z;
        boolean m4051Q;
        if (m2077Q(i2) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        if (this.f3181z) {
            View view = this.f3178P;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0546KH;
                if (z2) {
                    m4051Q = ((InterfaceC0546KH) parent).mo1257Q(view2, view, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            m4051Q = AbstractC2352sG.m4051Q(parent, view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    m4051Q = false;
                }
                if (m4051Q) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            this.f3180v = parent;
                        }
                    } else {
                        this.f3179h = parent;
                    }
                    if (z2) {
                        ((InterfaceC0546KH) parent).mo1260z(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            AbstractC2352sG.m4049N(parent, view2, view, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: v */
    public final boolean m2081v(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent m2077Q;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f3181z || (m2077Q = m2077Q(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f3178P;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f3177N == null) {
                this.f3177N = new int[2];
            }
            iArr3 = this.f3177N;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (m2077Q instanceof InterfaceC0546KH) {
            ((InterfaceC0546KH) m2077Q).mo1259v(view, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                AbstractC2352sG.m4054v(m2077Q, view, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + m2077Q + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    public final boolean m2082z(float f, float f2, boolean z) {
        ViewParent m2077Q;
        if (!this.f3181z || (m2077Q = m2077Q(0)) == null) {
            return false;
        }
        try {
            return AbstractC2352sG.m4055z(m2077Q, this.f3178P, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + m2077Q + " does not implement interface method onNestedFling", e);
            return false;
        }
    }
}
