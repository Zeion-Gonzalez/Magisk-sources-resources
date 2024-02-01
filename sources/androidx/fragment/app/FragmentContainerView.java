package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p000a.AbstractC0867QE;
import p000a.AbstractC1589dw;
import p000a.AbstractC2441tz;
import p000a.AbstractC2446u3;
import p000a.AbstractComponentCallbacksC2342s3;
import p000a.C0364Gx;
import p000a.C0398HY;
import p000a.C1448bA;
import p000a.C2621xJ;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: I */
    public boolean f8989I;

    /* renamed from: R */
    public final ArrayList f8990R;

    /* renamed from: S */
    public final ArrayList f8991S;

    /* renamed from: w */
    public View.OnApplyWindowInsetsListener f8992w;

    public FragmentContainerView(Context context) {
        super(context);
        this.f8991S = new ArrayList();
        this.f8990R = new ArrayList();
        this.f8989I = true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3;
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof AbstractComponentCallbacksC2342s3) {
            abstractComponentCallbacksC2342s3 = (AbstractComponentCallbacksC2342s3) tag;
        } else {
            abstractComponentCallbacksC2342s3 = null;
        }
        if (abstractComponentCallbacksC2342s3 != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C2621xJ c2621xJ;
        C2621xJ m4514o = C2621xJ.m4514o(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f8992w;
        if (onApplyWindowInsetsListener != null) {
            c2621xJ = C2621xJ.m4514o(null, onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            WindowInsets m4518u = m4514o.m4518u();
            if (m4518u != null) {
                WindowInsets m3063h = AbstractC1589dw.m3063h(this, m4518u);
                if (!m3063h.equals(m4518u)) {
                    m4514o = C2621xJ.m4514o(this, m3063h);
                }
            }
            c2621xJ = m4514o;
        }
        if (!c2621xJ.f8107z.mo1087S()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                WeakHashMap weakHashMap2 = AbstractC2446u3.f7488z;
                WindowInsets m4518u2 = c2621xJ.m4518u();
                if (m4518u2 != null) {
                    WindowInsets m3065z = AbstractC1589dw.m3065z(childAt, m4518u2);
                    if (!m3065z.equals(m4518u2)) {
                        C2621xJ.m4514o(childAt, m3065z);
                    }
                }
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.f8989I) {
            Iterator it = this.f8991S.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.f8989I) {
            ArrayList arrayList = this.f8991S;
            if ((!arrayList.isEmpty()) != false && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        this.f8990R.remove(view);
        if (this.f8991S.remove(view)) {
            this.f8989I = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            }
            m4822z(getChildAt(childCount));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        m4822z(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        m4822z(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        m4822z(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m4822z(getChildAt(i4));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            m4822z(getChildAt(i4));
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f8992w = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            this.f8990R.add(view);
        }
        super.startViewTransition(view);
    }

    /* renamed from: z */
    public final void m4822z(View view) {
        if (this.f8990R.contains(view)) {
            this.f8991S.add(view);
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        String str;
        this.f8991S = new ArrayList();
        this.f8990R = new ArrayList();
        this.f8989I = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0867QE.f2952h, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, C0364Gx c0364Gx) {
        super(context, attributeSet);
        View view;
        this.f8991S = new ArrayList();
        this.f8990R = new ArrayList();
        this.f8989I = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0867QE.f2952h, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC2342s3 m798H = c0364Gx.m798H(id);
        if (classAttribute != null && m798H == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC2441tz.m4184G("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            C1448bA m796F = c0364Gx.m796F();
            context.getClassLoader();
            AbstractComponentCallbacksC2342s3 m2868z = m796F.m2868z(classAttribute);
            m2868z.mo4010e(context, attributeSet, null);
            C0398HY c0398hy = new C0398HY(c0364Gx);
            c0398hy.f1329I = true;
            m2868z.f7196T = this;
            c0398hy.m891N(getId(), m2868z, string, 1);
            if (!c0398hy.f1343u) {
                c0398hy.f1341o = false;
                c0398hy.f1342q.m836r(c0398hy, true);
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        Iterator it = c0364Gx.f1262v.m1229V().iterator();
        while (it.hasNext()) {
            C2762z c2762z = (C2762z) it.next();
            AbstractComponentCallbacksC2342s3 abstractComponentCallbacksC2342s3 = c2762z.f8996v;
            if (abstractComponentCallbacksC2342s3.f7209j == getId() && (view = abstractComponentCallbacksC2342s3.f7222t) != null && view.getParent() == null) {
                abstractComponentCallbacksC2342s3.f7196T = this;
                c2762z.m4833h();
            }
        }
    }
}
