package p000a;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: a.dG */
/* loaded from: classes.dex */
public class C1555dG {

    /* renamed from: v */
    public static final View.AccessibilityDelegate f4808v = new View.AccessibilityDelegate();

    /* renamed from: h */
    public final C0080BX f4809h;

    /* renamed from: z */
    public final View.AccessibilityDelegate f4810z;

    public C1555dG() {
        this(f4808v);
    }

    /* renamed from: N */
    public void mo3024N(View view, AccessibilityEvent accessibilityEvent) {
        this.f4810z.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: P */
    public void mo373P(View view, C1799hs c1799hs) {
        this.f4810z.onInitializeAccessibilityNodeInfo(view, c1799hs.f5654z);
    }

    /* renamed from: Q */
    public boolean mo3025Q(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f4810z.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: W */
    public void mo3026W(View view, AccessibilityEvent accessibilityEvent) {
        this.f4810z.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    /* renamed from: h */
    public C0042As mo3027h(View view) {
        AccessibilityNodeProvider m2989z = AbstractC1541d2.m2989z(this.f4810z, view);
        if (m2989z != null) {
            return new C0042As(m2989z);
        }
        return null;
    }

    /* renamed from: o */
    public void mo3028o(View view, int i) {
        this.f4810z.sendAccessibilityEvent(view, i);
    }

    /* renamed from: u */
    public boolean mo1133u(View view, int i, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z;
        WeakReference weakReference;
        boolean z2;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i2 >= list.size()) {
                break;
            }
            C1862j5 c1862j5 = (C1862j5) list.get(i2);
            if (c1862j5.m3486z() == i) {
                InterfaceC0491JG interfaceC0491JG = c1862j5.f5828P;
                if (interfaceC0491JG != null) {
                    Class cls = c1862j5.f5830v;
                    if (cls != null) {
                        try {
                            AbstractC2441tz.m4202q(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    z = interfaceC0491JG.mo155h(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = AbstractC1541d2.m2988h(this.f4810z, view, i, bundle);
        }
        if (!z && i == R.id.accessibility_action_clickable_span && bundle != null) {
            int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    }
                    for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                        if (clickableSpan.equals(clickableSpanArr[i4])) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    clickableSpan.onClick(view);
                    z3 = true;
                }
            }
            return z3;
        }
        return z;
    }

    /* renamed from: v */
    public void mo1134v(View view, AccessibilityEvent accessibilityEvent) {
        this.f4810z.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: z */
    public boolean mo3029z(View view, AccessibilityEvent accessibilityEvent) {
        return this.f4810z.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public C1555dG(View.AccessibilityDelegate accessibilityDelegate) {
        this.f4810z = accessibilityDelegate;
        this.f4809h = new C0080BX(this);
    }
}
