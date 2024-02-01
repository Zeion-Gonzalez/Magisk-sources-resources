package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.topjohnwu.magisk.R;
import java.util.Locale;
import p000a.AbstractC0795Op;
import p000a.AbstractC0863Q8;
import p000a.AbstractC2575wW;
import p000a.C1672fR;

/* loaded from: classes.dex */
public class TextInputEditText extends C1672fR {

    /* renamed from: g */
    public final Rect f9436g;

    /* renamed from: y */
    public boolean f9437y;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(AbstractC2575wW.m4441nB(context, attributeSet, R.attr.editTextStyle, 0), attributeSet);
        this.f9436g = new Rect();
        TypedArray m1817K = AbstractC0795Op.m1817K(context, attributeSet, AbstractC0863Q8.f2938j, R.attr.editTextStyle, 2131952500, new int[0]);
        this.f9437y = m1817K.getBoolean(0, false);
        m1817K.recycle();
    }

    /* renamed from: P */
    public final TextInputLayout m5080P() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        boolean z;
        super.getFocusedRect(rect);
        TextInputLayout m5080P = m5080P();
        if (m5080P != null && this.f9437y) {
            z = true;
        } else {
            z = false;
        }
        if (z && rect != null) {
            Rect rect2 = this.f9436g;
            m5080P.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        boolean z;
        TextInputLayout m5080P = m5080P();
        if (m5080P != null && this.f9437y) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            boolean globalVisibleRect = m5080P.getGlobalVisibleRect(rect, point);
            if (globalVisibleRect && point != null) {
                point.offset(-getScrollX(), -getScrollY());
            }
            return globalVisibleRect;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout m5080P = m5080P();
        if (m5080P != null && m5080P.f9455K) {
            if (m5080P.f9505t) {
                return m5080P.f9439B;
            }
            return null;
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout m5080P = m5080P();
        if (m5080P != null && m5080P.f9455K && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // p000a.C1672fR, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            TextInputLayout m5080P = m5080P();
            CharSequence charSequence = null;
            if (m5080P != null && m5080P.f9505t) {
                charSequence = m5080P.f9439B;
            }
            editorInfo.hintText = charSequence;
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        m5080P();
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        boolean z;
        TextInputLayout m5080P = m5080P();
        if (m5080P != null && this.f9437y) {
            z = true;
        } else {
            z = false;
        }
        if (z && rect != null) {
            int height = m5080P.getHeight() - getHeight();
            int i = rect.left;
            int i2 = rect.top;
            int i3 = rect.right;
            int i4 = rect.bottom + height;
            Rect rect2 = this.f9436g;
            rect2.set(i, i2, i3, i4);
            return super.requestRectangleOnScreen(rect2);
        }
        return super.requestRectangleOnScreen(rect);
    }
}
