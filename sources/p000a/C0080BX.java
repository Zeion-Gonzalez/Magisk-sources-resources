package p000a;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.topjohnwu.magisk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: a.BX */
/* loaded from: classes.dex */
public final class C0080BX extends View.AccessibilityDelegate {

    /* renamed from: z */
    public final C1555dG f313z;

    public C0080BX(C1555dG c1555dG) {
        this.f313z = c1555dG;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f313z.mo3029z(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0042As mo3027h = this.f313z.mo3027h(view);
        if (mo3027h != null) {
            return (AccessibilityNodeProvider) mo3027h.f186z;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f313z.mo1134v(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        ClickableSpan[] clickableSpanArr;
        int i;
        C1799hs c1799hs = new C1799hs(accessibilityNodeInfo);
        WeakHashMap weakHashMap = AbstractC2446u3.f7488z;
        int i2 = 0;
        Boolean bool = (Boolean) new C2588wm(R.id.tag_screen_reader_focusable, 0).m2971h(view);
        boolean z2 = true;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            c1799hs.m3351o(1, z);
        }
        Boolean bool2 = (Boolean) new C2588wm(R.id.tag_accessibility_heading, 3).m2971h(view);
        if (bool2 == null || !bool2.booleanValue()) {
            z2 = false;
        }
        int i4 = 2;
        if (i3 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            c1799hs.m3351o(2, z2);
        }
        CharSequence m4217P = AbstractC2446u3.m4217P(view);
        if (i3 >= 28) {
            accessibilityNodeInfo.setPaneTitle(m4217P);
        } else {
            AbstractC2734zd.m4662v(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", m4217P);
        }
        CharSequence charSequence = (CharSequence) new C2588wm(R.id.tag_state_description, 64, 30, i4).m2971h(view);
        if (i3 >= 30) {
            AbstractC1662fH.m3139v(accessibilityNodeInfo, charSequence);
        } else {
            AbstractC2734zd.m4662v(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f313z.mo373P(view, c1799hs);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i3 < 26) {
            AbstractC2734zd.m4662v(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            AbstractC2734zd.m4662v(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            AbstractC2734zd.m4662v(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            AbstractC2734zd.m4662v(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i5 = 0; i5 < sparseArray.size(); i5++) {
                    if (((WeakReference) sparseArray.valueAt(i5)).get() == null) {
                        arrayList.add(Integer.valueOf(i5));
                    }
                }
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    sparseArray.remove(((Integer) arrayList.get(i6)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                AbstractC2734zd.m4662v(c1799hs.f5654z).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                int i7 = 0;
                while (i7 < clickableSpanArr.length) {
                    ClickableSpan clickableSpan = clickableSpanArr[i7];
                    int i8 = i2;
                    while (true) {
                        if (i8 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i8)).get())) {
                                i = sparseArray2.keyAt(i8);
                                break;
                            }
                            i8++;
                        } else {
                            i = C1799hs.f5651P;
                            C1799hs.f5651P = i + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i7]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i7];
                    Spanned spanned = (Spanned) text;
                    c1799hs.m3353v("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    c1799hs.m3353v("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    c1799hs.m3353v("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    c1799hs.m3353v("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    i7++;
                    i2 = 0;
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            c1799hs.m3350h((C1862j5) list.get(i9));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f313z.mo3024N(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f313z.mo3025Q(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f313z.mo1133u(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f313z.mo3028o(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f313z.mo3026W(view, accessibilityEvent);
    }
}
