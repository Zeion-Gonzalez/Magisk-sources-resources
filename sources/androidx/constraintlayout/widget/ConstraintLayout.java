package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import p000a.AbstractC0487JC;
import p000a.AbstractC0917RG;
import p000a.C0457If;
import p000a.C0561KY;
import p000a.C0847Pp;
import p000a.C1535cx;
import p000a.C1628ed;
import p000a.C1655f7;
import p000a.C2009ln;
import p000a.C2085nG;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: c */
    public static final /* synthetic */ int f8876c = 0;

    /* renamed from: E */
    public int f8877E;

    /* renamed from: I */
    public int f8878I;

    /* renamed from: J */
    public final C0847Pp f8879J;

    /* renamed from: R */
    public final ArrayList f8880R;

    /* renamed from: S */
    public final SparseArray f8881S;

    /* renamed from: U */
    public C0561KY f8882U;

    /* renamed from: f */
    public HashMap f8883f;

    /* renamed from: g */
    public int f8884g;

    /* renamed from: k */
    public int f8885k;

    /* renamed from: q */
    public int f8886q;

    /* renamed from: r */
    public final SparseArray f8887r;

    /* renamed from: s */
    public int f8888s;

    /* renamed from: w */
    public final C1535cx f8889w;

    /* renamed from: y */
    public boolean f8890y;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8881S = new SparseArray();
        this.f8880R = new ArrayList(4);
        this.f8889w = new C1535cx();
        this.f8878I = 0;
        this.f8886q = 0;
        this.f8885k = Integer.MAX_VALUE;
        this.f8884g = Integer.MAX_VALUE;
        this.f8890y = true;
        this.f8888s = 257;
        this.f8882U = null;
        this.f8877E = -1;
        this.f8883f = new HashMap();
        this.f8887r = new SparseArray();
        this.f8879J = new C0847Pp(this, this);
        m4769o(attributeSet, 0);
    }

    /* renamed from: G */
    public final void m4766G(String str, Integer num) {
        if ((str instanceof String) && (num instanceof Integer)) {
            if (this.f8883f == null) {
                this.f8883f = new HashMap();
            }
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f8883f.put(str, Integer.valueOf(num.intValue()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:452:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0381  */
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4767M() {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.m4767M():boolean");
    }

    /* renamed from: W */
    public final boolean m4768W() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1655f7;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f8880R;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0487JC) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f8890y = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1655f7();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1655f7(getContext(), attributeSet);
    }

    /* renamed from: o */
    public final void m4769o(AttributeSet attributeSet, int i) {
        C1535cx c1535cx = this.f8889w;
        c1535cx.f5086zx = this;
        C0847Pp c0847Pp = this.f8879J;
        c1535cx.f4748d2 = c0847Pp;
        c1535cx.f4740G5.f5204Q = c0847Pp;
        this.f8881S.put(getId(), this);
        this.f8882U = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0917RG.f3156h, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f8878I = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8878I);
                } else if (index == 17) {
                    this.f8886q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8886q);
                } else if (index == 14) {
                    this.f8885k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8885k);
                } else if (index == 15) {
                    this.f8884g = obtainStyledAttributes.getDimensionPixelOffset(index, this.f8884g);
                } else if (index == 113) {
                    this.f8888s = obtainStyledAttributes.getInt(index, this.f8888s);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            new C2085nG(getContext(), resourceId);
                        } catch (Resources.NotFoundException unused) {
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0561KY c0561ky = new C0561KY();
                        this.f8882U = c0561ky;
                        c0561ky.m1271N(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f8882U = null;
                    }
                    this.f8877E = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c1535cx.f4739Fu = this.f8888s;
        C0457If.f1527I = c1535cx.m2978T(512);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1655f7 c1655f7 = (C1655f7) childAt.getLayoutParams();
            C1628ed c1628ed = c1655f7.f5143Pm;
            if (childAt.getVisibility() != 8 || c1655f7.f5174nF || c1655f7.f5190zx || isInEditMode) {
                int m3115w = c1628ed.m3115w();
                int m3092I = c1628ed.m3092I();
                childAt.layout(m3115w, m3092I, c1628ed.m3098R() + m3115w, c1628ed.m3101V() + m3092I);
            }
        }
        ArrayList arrayList = this.f8880R;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0487JC) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:499:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0200 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:691:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0557  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x055e  */
    /* JADX WARN: Removed duplicated region for block: B:852:0x071b  */
    /* JADX WARN: Removed duplicated region for block: B:857:0x0762  */
    /* JADX WARN: Removed duplicated region for block: B:859:0x0765  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C1628ed m4770u = m4770u(view);
        if ((view instanceof Guideline) && !(m4770u instanceof C2009ln)) {
            C1655f7 c1655f7 = (C1655f7) view.getLayoutParams();
            C2009ln c2009ln = new C2009ln();
            c1655f7.f5143Pm = c2009ln;
            c1655f7.f5174nF = true;
            c2009ln.m3637i(c1655f7.f5171m);
        }
        if (view instanceof AbstractC0487JC) {
            AbstractC0487JC abstractC0487JC = (AbstractC0487JC) view;
            abstractC0487JC.m1175V();
            ((C1655f7) view.getLayoutParams()).f5190zx = true;
            ArrayList arrayList = this.f8880R;
            if (!arrayList.contains(abstractC0487JC)) {
                arrayList.add(abstractC0487JC);
            }
        }
        this.f8881S.put(view.getId(), view);
        this.f8890y = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f8881S.remove(view.getId());
        C1628ed m4770u = m4770u(view);
        this.f8889w.f3714Pm.remove(m4770u);
        m4770u.mo2336Y();
        this.f8880R.remove(view);
        this.f8890y = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f8890y = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f8881S;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: u */
    public final C1628ed m4770u(View view) {
        if (view == this) {
            return this.f8889w;
        }
        if (view == null) {
            return null;
        }
        if (!(view.getLayoutParams() instanceof C1655f7)) {
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (!(view.getLayoutParams() instanceof C1655f7)) {
                return null;
            }
        }
        return ((C1655f7) view.getLayoutParams()).f5143Pm;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8881S = new SparseArray();
        this.f8880R = new ArrayList(4);
        this.f8889w = new C1535cx();
        this.f8878I = 0;
        this.f8886q = 0;
        this.f8885k = Integer.MAX_VALUE;
        this.f8884g = Integer.MAX_VALUE;
        this.f8890y = true;
        this.f8888s = 257;
        this.f8882U = null;
        this.f8877E = -1;
        this.f8883f = new HashMap();
        this.f8887r = new SparseArray();
        this.f8879J = new C0847Pp(this, this);
        m4769o(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C1655f7(layoutParams);
    }
}
