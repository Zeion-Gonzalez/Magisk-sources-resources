package p000a;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: a.hs */
/* loaded from: classes.dex */
public final class C1799hs {

    /* renamed from: P */
    public static int f5651P;

    /* renamed from: h */
    public int f5652h = -1;

    /* renamed from: v */
    public int f5653v = -1;

    /* renamed from: z */
    public final AccessibilityNodeInfo f5654z;

    public C1799hs(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f5654z = accessibilityNodeInfo;
    }

    /* renamed from: P */
    public static String m3344P(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908382:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case 16908372:
                                        return "ACTION_IME_ENTER";
                                    case 16908373:
                                        return "ACTION_DRAG_START";
                                    case 16908374:
                                        return "ACTION_DRAG_DROP";
                                    case 16908375:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    /* renamed from: G */
    public final void m3345G(C0963S3 c0963s3) {
        this.f5654z.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c0963s3.f3274z);
    }

    /* renamed from: M */
    public final void m3346M(String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5654z;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            AbstractC2734zd.m4662v(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    /* renamed from: N */
    public final boolean m3347N(int i) {
        Bundle m4662v = AbstractC2734zd.m4662v(this.f5654z);
        if (m4662v == null || (m4662v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) != i) {
            return false;
        }
        return true;
    }

    /* renamed from: Q */
    public final void m3348Q(Rect rect) {
        this.f5654z.getBoundsInParent(rect);
    }

    /* renamed from: W */
    public final void m3349W(CharSequence charSequence) {
        this.f5654z.setClassName(charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C1799hs)) {
            return false;
        }
        C1799hs c1799hs = (C1799hs) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = c1799hs.f5654z;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.f5654z;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.f5653v == c1799hs.f5653v && this.f5652h == c1799hs.f5652h;
    }

    /* renamed from: h */
    public final void m3350h(C1862j5 c1862j5) {
        this.f5654z.addAction((AccessibilityNodeInfo.AccessibilityAction) c1862j5.f5831z);
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5654z;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: o */
    public final void m3351o(int i, boolean z) {
        Bundle m4662v = AbstractC2734zd.m4662v(this.f5654z);
        if (m4662v != null) {
            int i2 = m4662v.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            m4662v.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    public final String toString() {
        CharSequence charSequence;
        CharSequence charSequence2;
        String string;
        CharSequence charSequence3;
        boolean z;
        boolean m3347N;
        boolean m3347N2;
        ?? emptyList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        m3348Q(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5654z;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            AbstractC1184W9.m2444z(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) AbstractC2734zd.m4662v(accessibilityNodeInfo).getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(m3352u());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        if (i >= 30) {
            charSequence = AbstractC1662fH.m3138h(accessibilityNodeInfo);
        } else {
            charSequence = AbstractC2734zd.m4662v(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        sb.append(charSequence);
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; tooltipText: ");
        if (i >= 28) {
            charSequence2 = accessibilityNodeInfo.getTooltipText();
        } else {
            charSequence2 = AbstractC2734zd.m4662v(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        sb.append(charSequence2);
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        if (i >= 33) {
            string = AbstractC0607LN.m1339u(accessibilityNodeInfo);
        } else {
            string = AbstractC2734zd.m4662v(accessibilityNodeInfo).getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
        }
        sb.append(string);
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        sb.append(accessibilityNodeInfo.isChecked());
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        if (i >= 34) {
            charSequence3 = AbstractC1184W9.m2440h(accessibilityNodeInfo);
        } else {
            charSequence3 = AbstractC2734zd.m4662v(accessibilityNodeInfo).getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
        }
        sb.append(charSequence3);
        sb.append("; granularScrollingSupported: ");
        sb.append(m3347N(67108864));
        sb.append("; importantForAccessibility: ");
        if (i >= 24) {
            z = accessibilityNodeInfo.isImportantForAccessibility();
        } else {
            z = true;
        }
        sb.append(z);
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        if (i >= 33) {
            m3347N = AbstractC0607LN.m1338o(accessibilityNodeInfo);
        } else {
            m3347N = m3347N(8388608);
        }
        sb.append(m3347N);
        sb.append("; accessibilityDataSensitive: ");
        if (i >= 34) {
            m3347N2 = AbstractC1184W9.m2436N(accessibilityNodeInfo);
        } else {
            m3347N2 = m3347N(64);
        }
        sb.append(m3347N2);
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        if (actionList != null) {
            emptyList = new ArrayList();
            int size = actionList.size();
            for (int i2 = 0; i2 < size; i2++) {
                emptyList.add(new C1862j5(actionList.get(i2), 0, null, null, null));
            }
        } else {
            emptyList = Collections.emptyList();
        }
        for (int i3 = 0; i3 < emptyList.size(); i3++) {
            C1862j5 c1862j5 = (C1862j5) emptyList.get(i3);
            String m3344P = m3344P(c1862j5.m3486z());
            if (m3344P.equals("ACTION_UNKNOWN")) {
                Object obj = c1862j5.f5831z;
                if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                    m3344P = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
                }
            }
            sb.append(m3344P);
            if (i3 != emptyList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: u */
    public final CharSequence m3352u() {
        boolean z = !m3353v("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5654z;
        if (z) {
            ArrayList m3353v = m3353v("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            ArrayList m3353v2 = m3353v("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            ArrayList m3353v3 = m3353v("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            ArrayList m3353v4 = m3353v("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
            for (int i = 0; i < m3353v.size(); i++) {
                spannableString.setSpan(new C0318G5(((Integer) m3353v4.get(i)).intValue(), this, AbstractC2734zd.m4662v(accessibilityNodeInfo).getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) m3353v.get(i)).intValue(), ((Integer) m3353v2.get(i)).intValue(), ((Integer) m3353v3.get(i)).intValue());
            }
            return spannableString;
        }
        return accessibilityNodeInfo.getText();
    }

    /* renamed from: v */
    public final ArrayList m3353v(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f5654z;
        ArrayList<Integer> integerArrayList = AbstractC2734zd.m4662v(accessibilityNodeInfo).getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        AbstractC2734zd.m4662v(accessibilityNodeInfo).putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    /* renamed from: z */
    public final void m3354z(int i) {
        this.f5654z.addAction(i);
    }

    public C1799hs(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        this.f5654z = accessibilityNodeInfo;
    }
}
