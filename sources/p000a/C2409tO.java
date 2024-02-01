package p000a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.topjohnwu.magisk.R;
import java.lang.reflect.InvocationTargetException;

/* renamed from: a.tO */
/* loaded from: classes.dex */
public class C2409tO extends ListView {

    /* renamed from: E */
    public ViewOnTouchListenerC0220EB f7354E;

    /* renamed from: I */
    public int f7355I;

    /* renamed from: R */
    public int f7356R;

    /* renamed from: S */
    public final Rect f7357S;

    /* renamed from: U */
    public boolean f7358U;

    /* renamed from: f */
    public RunnableC1316Yf f7359f;

    /* renamed from: g */
    public C0866QD f7360g;

    /* renamed from: k */
    public int f7361k;

    /* renamed from: q */
    public int f7362q;

    /* renamed from: s */
    public final boolean f7363s;

    /* renamed from: w */
    public int f7364w;

    /* renamed from: y */
    public boolean f7365y;

    public C2409tO(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f7357S = new Rect();
        this.f7356R = 0;
        this.f7364w = 0;
        this.f7355I = 0;
        this.f7362q = 0;
        this.f7363s = z;
        setCacheColorHint(0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f7357S;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f7359f != null) {
            return;
        }
        super.drawableStateChanged();
        C0866QD c0866qd = this.f7360g;
        if (c0866qd != null) {
            c0866qd.f2951R = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f7358U && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:277:0x0145 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0177  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m4165h(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2409tO.m4165h(android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f7363s || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f7363s || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f7363s || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f7363s && this.f7365y) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f7359f = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 0;
        if (actionMasked == 10 && this.f7359f == null) {
            RunnableC1316Yf runnableC1316Yf = new RunnableC1316Yf(this, i2);
            this.f7359f = runnableC1316Yf;
            post(runnableC1316Yf);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
        } else {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i >= 30 && AbstractC0615LZ.f2016P) {
                        try {
                            AbstractC0615LZ.f2019z.invoke(this, Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1);
                            AbstractC0615LZ.f2017h.invoke(this, Integer.valueOf(pointToPosition));
                            AbstractC0615LZ.f2018v.invoke(this, Integer.valueOf(pointToPosition));
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f7358U && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        }
        return onHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f7361k = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC1316Yf runnableC1316Yf = this.f7359f;
        if (runnableC1316Yf != null) {
            C2409tO c2409tO = (C2409tO) runnableC1316Yf.f4178R;
            c2409tO.f7359f = null;
            c2409tO.removeCallbacks(runnableC1316Yf);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.AbsListView
    public final void setSelector(Drawable drawable) {
        C0866QD c0866qd = drawable != null ? new C0866QD(drawable) : null;
        this.f7360g = c0866qd;
        super.setSelector(c0866qd);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f7356R = rect.left;
        this.f7364w = rect.top;
        this.f7355I = rect.right;
        this.f7362q = rect.bottom;
    }

    /* renamed from: z */
    public final int m4166z(int i, int i2) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i3 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i3;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i4 = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = adapter.getItemViewType(i5);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = adapter.getView(i5, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i6 = layoutParams.height;
            view.measure(i, i6 > 0 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i5 > 0) {
                i3 += dividerHeight;
            }
            i3 += view.getMeasuredHeight();
            if (i3 >= i2) {
                return i2;
            }
        }
        return i3;
    }
}
