package p000a;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import com.topjohnwu.magisk.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: a.wu */
/* loaded from: classes.dex */
public final class C2596wu extends C1555dG {

    /* renamed from: R */
    public static final Rect f7977R = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: G */
    public C0063BF f7978G;

    /* renamed from: S */
    public final /* synthetic */ Chip f7983S;

    /* renamed from: W */
    public final View f7985W;

    /* renamed from: o */
    public final AccessibilityManager f7986o;

    /* renamed from: P */
    public final Rect f7981P = new Rect();

    /* renamed from: N */
    public final Rect f7980N = new Rect();

    /* renamed from: Q */
    public final Rect f7982Q = new Rect();

    /* renamed from: u */
    public final int[] f7987u = new int[2];

    /* renamed from: M */
    public int f7979M = Integer.MIN_VALUE;

    /* renamed from: V */
    public int f7984V = Integer.MIN_VALUE;

    static {
        new C1665fK(10);
        new C1665fK(11);
    }

    public C2596wu(Chip chip, Chip chip2) {
        this.f7983S = chip;
        if (chip2 != null) {
            this.f7985W = chip2;
            this.f7986o = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
            chip2.setFocusable(true);
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            if (AbstractC2397t8.m4129v(chip2) == 0) {
                AbstractC2397t8.m4123g(chip2, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0111, code lost:
    
        if (r5.getWindowVisibility() != 0) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0114, code lost:
    
        r13 = r5.getParent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x011a, code lost:
    
        if ((r13 instanceof android.view.View) == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x011c, code lost:
    
        r5 = (android.view.View) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0126, code lost:
    
        if (r5.getAlpha() <= 0.0f) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x012c, code lost:
    
        if (r5.getVisibility() == 0) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x012f, code lost:
    
        if (r13 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0131, code lost:
    
        r9 = true;
     */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p000a.C1799hs m4471G(int r13) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.C2596wu.m4471G(int):a.hs");
    }

    /* renamed from: M */
    public final C1799hs m4472M(int i) {
        if (i == -1) {
            View view = this.f7985W;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            C1799hs c1799hs = new C1799hs(obtain);
            WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            arrayList.add(0);
            Rect rect = Chip.f9318p;
            this.f7983S.m5047v();
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                c1799hs.f5654z.addChild(view, ((Integer) arrayList.get(i2)).intValue());
            }
            return c1799hs;
        }
        return m4471G(i);
    }

    @Override // p000a.C1555dG
    /* renamed from: P */
    public final void mo373P(View view, C1799hs c1799hs) {
        boolean z;
        View.AccessibilityDelegate accessibilityDelegate = this.f4810z;
        AccessibilityNodeInfo accessibilityNodeInfo = c1799hs.f5654z;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.f7983S;
        C2694yr c2694yr = chip.f9330q;
        if (c2694yr != null && c2694yr.f8450HL) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c1799hs.m3349W(chip.getAccessibilityClassName());
        accessibilityNodeInfo.setText(chip.getText());
    }

    /* renamed from: R */
    public final void m4473R(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i != Integer.MIN_VALUE && this.f7986o.isEnabled() && (parent = (view = this.f7985W).getParent()) != null) {
            if (i != -1) {
                obtain = AccessibilityEvent.obtain(i2);
                C1799hs m4472M = m4472M(i);
                obtain.getText().add(m4472M.m3352u());
                AccessibilityNodeInfo accessibilityNodeInfo = m4472M.f5654z;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                AbstractC1782hW.m3308z(obtain, view, i);
                obtain.setPackageName(view.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i2);
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }

    /* renamed from: S */
    public final boolean m4474S(int i) {
        int i2;
        View view = this.f7985W;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.f7984V) == i) {
            return false;
        }
        Chip chip = this.f7983S;
        if (i2 != Integer.MIN_VALUE) {
            this.f7984V = Integer.MIN_VALUE;
            if (i2 == 1) {
                chip.f9327f = false;
                chip.refreshDrawableState();
            }
            m4473R(i2, 8);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f7984V = i;
        if (i == 1) {
            chip.f9327f = true;
            chip.refreshDrawableState();
        }
        m4473R(i, 8);
        return true;
    }

    /* renamed from: V */
    public final void m4475V(int i, C1799hs c1799hs) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1799hs.f5654z;
        String str = "";
        if (i == 1) {
            Chip chip = this.f7983S;
            C2694yr c2694yr = chip.f9330q;
            CharSequence text = chip.getText();
            Context context = chip.getContext();
            Object[] objArr = new Object[1];
            if (!TextUtils.isEmpty(text)) {
                str = text;
            }
            objArr[0] = str;
            accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, objArr).trim());
            RectF rectF = chip.f9321F;
            rectF.setEmpty();
            chip.m5047v();
            int i2 = (int) rectF.left;
            int i3 = (int) rectF.top;
            int i4 = (int) rectF.right;
            int i5 = (int) rectF.bottom;
            Rect rect = chip.f9326e;
            rect.set(i2, i3, i4, i5);
            accessibilityNodeInfo.setBoundsInParent(rect);
            c1799hs.m3350h(C1862j5.f5822N);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.f9318p);
    }

    @Override // p000a.C1555dG
    /* renamed from: h */
    public final C0042As mo3027h(View view) {
        if (this.f7978G == null) {
            this.f7978G = new C0063BF(this);
        }
        return this.f7978G;
    }

    @Override // p000a.C1555dG
    /* renamed from: v */
    public final void mo1134v(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1134v(view, accessibilityEvent);
    }
}
