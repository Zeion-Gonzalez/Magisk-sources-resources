package p000a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: a.JC */
/* loaded from: classes.dex */
public abstract class AbstractC0487JC extends View {

    /* renamed from: I */
    public AbstractC1389a2 f1633I;

    /* renamed from: R */
    public int f1634R;

    /* renamed from: S */
    public int[] f1635S;

    /* renamed from: g */
    public final HashMap f1636g;

    /* renamed from: k */
    public String f1637k;

    /* renamed from: q */
    public String f1638q;

    /* renamed from: w */
    public final Context f1639w;

    public AbstractC0487JC(Context context) {
        super(context);
        this.f1635S = new int[32];
        this.f1636g = new HashMap();
        this.f1639w = context;
        mo1179u(null);
    }

    /* renamed from: G */
    public final void m1170G(String str) {
        this.f1637k = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f1634R = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m1180v(str.substring(i));
                return;
            } else {
                m1180v(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    /* renamed from: M */
    public final void m1171M(int[] iArr) {
        this.f1638q = null;
        this.f1634R = 0;
        for (int i : iArr) {
            m1177h(i);
        }
    }

    /* renamed from: N */
    public void mo1172N(ConstraintLayout constraintLayout) {
    }

    /* renamed from: P */
    public final void m1173P(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f1634R; i++) {
            View view = (View) constraintLayout.f8881S.get(this.f1635S[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: Q */
    public final int m1174Q(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f1639w.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: V */
    public final void m1175V() {
        if (this.f1633I == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C1655f7) {
            ((C1655f7) layoutParams).f5143Pm = this.f1633I;
        }
    }

    /* renamed from: W */
    public final void m1176W(String str) {
        this.f1638q = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f1634R = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                m1181z(str.substring(i));
                return;
            } else {
                m1181z(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    /* renamed from: h */
    public final void m1177h(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f1634R + 1;
        int[] iArr = this.f1635S;
        if (i2 > iArr.length) {
            this.f1635S = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1635S;
        int i3 = this.f1634R;
        iArr2[i3] = i;
        this.f1634R = i3 + 1;
    }

    /* renamed from: o */
    public abstract void mo1178o(C1628ed c1628ed, boolean z);

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1638q;
        if (str != null) {
            m1176W(str);
        }
        String str2 = this.f1637k;
        if (str2 != null) {
            m1170G(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f1638q == null) {
            m1177h(i);
        }
    }

    /* renamed from: u */
    public void mo1179u(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0917RG.f3156h);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1638q = string;
                    m1176W(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1637k = string2;
                    m1170G(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: v */
    public final void m1180v(String str) {
        if (str == null || str.length() == 0 || this.f1639w == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C1655f7) && trim.equals(((C1655f7) layoutParams).f5175nP)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m1177h(childAt.getId());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1181z(java.lang.String r6) {
        /*
            r5 = this;
            if (r6 == 0) goto La7
            int r0 = r6.length()
            if (r0 != 0) goto La
            goto La7
        La:
            android.content.Context r0 = r5.f1639w
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r6 = r6.trim()
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L21
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
        L21:
            android.view.ViewParent r1 = r5.getParent()
            boolean r1 = r1 instanceof androidx.constraintlayout.widget.ConstraintLayout
            r2 = 0
            if (r1 == 0) goto L31
            android.view.ViewParent r1 = r5.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r1 = (androidx.constraintlayout.widget.ConstraintLayout) r1
            goto L32
        L31:
            r1 = r2
        L32:
            boolean r3 = r5.isInEditMode()
            if (r3 == 0) goto L5b
            if (r1 == 0) goto L5b
            boolean r3 = r6 instanceof java.lang.String
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f8883f
            if (r3 == 0) goto L4f
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L4f
            java.util.HashMap r3 = r1.f8883f
            java.lang.Object r3 = r3.get(r6)
            goto L50
        L4f:
            r3 = r2
        L50:
            boolean r4 = r3 instanceof java.lang.Integer
            if (r4 == 0) goto L5b
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            goto L5c
        L5b:
            r3 = 0
        L5c:
            if (r3 != 0) goto L64
            if (r1 == 0) goto L64
            int r3 = r5.m1174Q(r1, r6)
        L64:
            if (r3 != 0) goto L70
            java.lang.Class<a.yG> r1 = p000a.AbstractC2665yG.class
            java.lang.reflect.Field r1 = r1.getField(r6)     // Catch: java.lang.Exception -> L70
            int r3 = r1.getInt(r2)     // Catch: java.lang.Exception -> L70
        L70:
            if (r3 != 0) goto L80
            android.content.res.Resources r1 = r0.getResources()
            java.lang.String r2 = "id"
            java.lang.String r0 = r0.getPackageName()
            int r3 = r1.getIdentifier(r6, r2, r0)
        L80:
            if (r3 == 0) goto L8f
            java.util.HashMap r0 = r5.f1636g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.put(r1, r6)
            r5.m1177h(r3)
            goto La7
        L8f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find id of \""
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = "\""
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "ConstraintHelper"
            android.util.Log.w(r0, r6)
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.AbstractC0487JC.m1181z(java.lang.String):void");
    }

    public AbstractC0487JC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1635S = new int[32];
        this.f1636g = new HashMap();
        this.f1639w = context;
        mo1179u(attributeSet);
    }
}
